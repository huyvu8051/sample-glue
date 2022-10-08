package sample.vo;

import java.util.Date;

/**
 * <pre>
 * EMP Table의 Column 정의
 * - EMPNO   Long(4)
 * - ENAME   VARCHAR2(10)
 * - JOB VARCHAR2(9)
 * - MGR Long(4)
 * - HIREDATE    DATE
 * - SAL Long(7,2)
 * - COMM    Long(7,2)
 * - DEPTNO  Long(2)
 * 
 * BeanPropertyRowMapper 사용시 주의사항.
 * 1. QueryEditor의 resultType에 지정된 클래스로 생성.
 * 2. getter, setter 변수 생성시 다음에 주의한다.
 *   - DB 컬럼ID의 첫글자만 대문자로 하고 나머지는 소문자로 생성한다. 
 *     ex) getEmpno(), setEmpno
 *   - DB 컬럼ID에 UnderBar(_)를 유지한다. 
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
