package sample.vo;

import java.util.Date;

/**
 * <pre>
 * EMP Table�� Column ����
 * - EMPNO   Long(4)
 * - ENAME   VARCHAR2(10)
 * - JOB VARCHAR2(9)
 * - MGR Long(4)
 * - HIREDATE    DATE
 * - SAL Long(7,2)
 * - COMM    Long(7,2)
 * - DEPTNO  Long(2)
 * 
 * BeanPropertyRowMapper ���� ���ǻ���.
 * 1. QueryEditor�� resultType�� ������ Ŭ������ ����.
 * 2. getter, setter ���� ������ ������ �����Ѵ�.
 *   - DB �÷�ID�� ù���ڸ� �빮�ڷ� �ϰ� �������� �ҹ��ڷ� �����Ѵ�. 
 *     ex) getEmpno(), setEmpno
 *   - DB �÷�ID�� UnderBar(_)�� �����Ѵ�. 
 *     ex) getPhone_Long(), setPhone_Long()
 * </pre>
 */
public class EmpVO
{
    private Long empno;
    private String ename;
    private String job;
    private Long mgr;
    private Date hiredate;
    private Long sal;
    private Long comm;
    private Long deptno;

    public Long getEmpno()
    {
        return empno;
    }

    public void setEmpno( Long empno )
    {
        this.empno = empno;
    }

    public String getEname()
    {
        return ename;
    }

    public void setEname( String ename )
    {
        this.ename = ename;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob( String job )
    {
        this.job = job;
    }

    public Long getMgr()
    {
        return mgr;
    }

    public void setMgr( Long mgr )
    {
        this.mgr = mgr;
    }

    public Date getHiredate()
    {
        return hiredate;
    }

    public void setHiredate( Date hiredate )
    {
        this.hiredate = hiredate;
    }

    public Long getSal()
    {
        return sal;
    }

    public void setSal( Long sal )
    {
        this.sal = sal;
    }

    public Long getComm()
    {
        return comm;
    }

    public void setComm( Long comm )
    {
        this.comm = comm;
    }

    public Long getDeptno()
    {
        return deptno;
    }

    public void setDeptno( Long deptno )
    {
        this.deptno = deptno;
    }
}
