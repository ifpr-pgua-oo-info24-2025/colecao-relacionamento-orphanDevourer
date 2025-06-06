class livro {
    private String title;
    private String yearPublic;
    private autor autor;

    public String getTitle() {
        return title;
    }

    public livro(String title, String yearPublic, autor autor) {
        this.title = title;
        this.yearPublic = yearPublic;
        this.autor = autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getYearP() {
        return yearPublic;
    }
    public void setYearP(String yearPublic) {
        this.yearPublic = yearPublic;
    }
    public autor getAutor() {
        return autor;
    }
    public void setAutor(autor autor) {
        this.autor = autor;
    }

    public String show() {
        return "title: " + title + 
               "\npublished in: " + yearPublic + 
               "\nauthor: " + (autor != null ? autor.getName() : "[JOHN DOE]");
    }
}



class livroFis extends livro {
    private Integer pageNum;

    public Integer getPageN() {
        return pageNum;
    }
    public void setPageN(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String show() {
        return super.show() + 
               "\npages: " + pageNum;
    }
    
    public livroFis(String title, String yearPublic, autor autor) {
    super(title, yearPublic, autor);
    }
}



class livroDig extends livro {

    private Double tamFileMB;

    public Double getTamFileMB() {
        return tamFileMB;
    }

    public void setTamFileMB(Double tamFileMB) {
        this.tamFileMB = tamFileMB;
    }
    @Override
    public String show() {
        return super.show() + "\nMB/s size: " + tamFileMB;
    }

    public livroDig(String title, String yearPublic, autor autor) {
        super(title, yearPublic, autor);
    }
}