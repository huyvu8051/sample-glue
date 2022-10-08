package sample.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sample.vo.EmpVO;

import com.poscoict.glueframework.biz.activity.GlueActivity;
import com.poscoict.glueframework.biz.control.GlueBizControlConstants;
import com.poscoict.glueframework.context.GlueContext;
import com.poscoict.glueframework.dao.GlueGenericDao;
import com.poscoict.glueframework.dao.vo.GlueParameter;

public class SearchEmp extends GlueActivity<GlueContext>
{
    // Do not define the Class Member Variable!!
    public String runActivity( GlueContext ctx )
    {
        // 1. dao ��������.
        GlueGenericDao dao = this.getDao( "test-dao" );

        // 2. normal query �� GlueParamter ����
        List<String> list = new ArrayList<String>();
        list.add( "10" );
        GlueParameter<List<String>> listParam = new GlueParameter<List<String>>();
        listParam.setParameter( list );

        // 2. named query �� GlueParamter ����
        Map<String, Object> map = new HashMap<String, Object>();
        map.put( "deptno", "10" );
        GlueParameter<Map<String, Object>> mapParam = new GlueParameter<Map<String, Object>>();
        mapParam.setParameter( map );

        // 3. ���� ( normal query )
        List<Map<String, Object>> result1 = dao.find( "sample.emp.select", listParam );
        // 3. ���� ( normal query + resultType )
        List<EmpVO> result2 = dao.find( "sample.emp.select.vo", listParam );
        // 3. ���� ( named query )
        List<Map<String, Object>> result3 = dao.find( "sample.emp.select.named", mapParam );
        // 3. ���� ( named query + resultType )
        List<EmpVO> result4 = dao.find( "sample.emp.select.named.vo", mapParam );

        // 4. ��� ����
        ctx.put( "EmpList", result1 );
        ctx.put( "EmpListUsingVO", result2 );
        ctx.put( "EmpList_named", result3 );
        ctx.put( "EmpList_namedUsingVO", result4 );

        return GlueBizControlConstants.SUCCESS;
    }
}
