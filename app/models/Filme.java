package models;

import play.data.*;
import javax.persistence.*;
import io.ebean.*;
import java.util.Date;
import java.text.SimpleDateFormat;



@Entity
public class Filme extends Model {
    
    @Id
    public long id;
    public String nome, genero;
    public Date data_lancamento;

    public static final Finder<Long, Filme> find = new Finder<>(Filme.class);

    public String dataLancamentoFormat(Date dataLancamento){
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy"); //  fmt.parse("17/12/2007 19:30:20");
        String dataf = fmt.format(dataLancamento);

        return dataf;
    }
}