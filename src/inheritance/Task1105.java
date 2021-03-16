package inheritance;

/*
Write the following nine classes: Employee, Clerk, ITSpecialist, Programmer,
ProjectManager, CTO, Recruiter, OfficeManager, and Custodian.
Make the Programmer, ProjectManager, CTO classes inherit the ITSpecialist class.
Make the Recruiter, Custodian, and OfficeManager classes inherit the Clerk class.
Make the Clerk and ITSpecialist classes inherit the Employee class.
 */

public class Task1105 {
    public static void main(String[] args) {
    }

    public class Employee {
    }

    public class Clerk extends Employee {
    }

    public class ITSpecialist extends Employee {
    }

    public class Programmer extends ITSpecialist {
    }

    public class ProjectManager extends  ITSpecialist {
    }

    public class CTO extends ITSpecialist {
    }

    public class Recruiter extends Clerk {
    }

    public class OfficeManager extends Clerk {
    }

    public class Custodian extends Clerk {
    }
}
