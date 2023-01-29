public class Search {

    int a;
    int b;

    public Search() {

    }

    public Search(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer SearchRoot(Search search){
        int counter = 0;

        for (int i = 1; i*i <= search.getB(); i++){
            if (i*i >= search.getA() && i*i <= search.getB())
            {
                counter++;
            }
        }
            return  counter;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
