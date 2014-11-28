
public class ISSStudent implements Comparable {
    private String name;
    private String address;
    private int id;
    
    public ISSStudent(String n, String a, int id){
        name = n;
        address =a;
        id=id;
    }
    
    public int getID()
    {
        return id; 
    }

    public String toString(){
        String str = "Name\t" + name;
        str+="\nAddres:\t"+address;
        str+="\nID Number:\t"+id;
        return str;
    }
    @Override
    public int compareTo(Object o) {
        int difference = id - ((ISSStudent).o).getID();
        return difference;
    }
    
}

}
