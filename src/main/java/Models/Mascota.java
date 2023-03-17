package Models;

public class Mascota {

    String idMascotas;
    String idCategoria;
    String nameCategoria;
    String nombreMascota;
    String photoUrlMascota;
    String idTags;
    String nombreTags;
    String statusMascota;

    public Mascota(String idMascotas, String idCategoria, String nameCategoria, String nombreMascota, String photoUrlMascota, String idTags, String nombreTags, String statusMascota) {
        this.idMascotas = idMascotas;
        this.idCategoria = idCategoria;
        this.nameCategoria = nameCategoria;
        this.nombreMascota = nombreMascota;
        this.photoUrlMascota = photoUrlMascota;
        this.idTags = idTags;
        this.nombreTags = nombreTags;
        this.statusMascota = statusMascota;
    }

    public String getIdMascotas() {
        return idMascotas;
    }

    public void setIdMascotas(String idMascotas) {
        this.idMascotas = idMascotas;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNameCategoria() {
        return nameCategoria;
    }

    public void setNameCategoria(String nameCategoria) {
        this.nameCategoria = nameCategoria;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getPhotoUrlMascota() {
        return photoUrlMascota;
    }

    public void setPhotoUrlMascota(String photoUrlMascota) {
        this.photoUrlMascota = photoUrlMascota;
    }

    public String getIdTags() {
        return idTags;
    }

    public void setIdTags(String idTags) {
        this.idTags = idTags;
    }

    public String getNombreTags() {
        return nombreTags;
    }

    public void setNombreTags(String nombreTags) {
        this.nombreTags = nombreTags;
    }

    public String getStatusMascota() {
        return statusMascota;
    }

    public void setStatusMascota(String statusMascota) {
        this.statusMascota = statusMascota;
    }
}
