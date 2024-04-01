/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author LENOVO_ITL6
 */

public class Product implements Serializable {
    private transient String id;
    private static String nama;
    private Integer Qty;
    private final String Keaslian = "Original";
    private List<ProductItem> items;

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setQty(Integer qty) {
        this.Qty = qty;
    }
    
    public void setItems(List<ProductItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id=" + id + "\r\n"
                + "Nama=" + nama + "\r\n"
                + "=======================\r\n"
                + "Jumlah Item=" + Qty +"\r\n"
                + "Product:"+Keaslian+"\r\n";
        item = items.stream().map((obj) ->
                obj.toString()).reduce(item, String::concat);
        return produk + item;
    }
}
