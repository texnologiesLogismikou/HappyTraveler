package ctrlcctrlv.happytraveller.model;


/*
*<b>This class is a model for Place Photos API.
*This class create,initialize & prepare the proper
* url to be used in order to make call for each places photos.
*
*@param width  A private String variable that will hold the  width attribute that will need the imgUrl.
*@param photoReference A private String variable that will hold the  photoReference attribute that will need the imgUrl.
*@param imgUrl A private String variable that will hold the url link.
*
* @since 26 Nov 2018
 */
public class PlacePhoto
{


    private String width;
    private String photoReference;
    private String imgUrl;

    /*
     * The main constructor <b>public PlacePhoto()</b>.
     * Initialize the url with the starter url link
     * & the other variables with null value.
     */
    public PlacePhoto()
    {
        this.width="";
        this.photoReference="";
        this.imgUrl="https://maps.googleapis.com/maps/api/place/photo?" +
                "maxwidth=146" +//this.width
                "&photoreference=" +this.photoReference+
                "&key=AIzaSyDI0zKd22JBJEGco2k9Thg2CZWLLsWfq7k";
    }

    /*
     *A second constructor <b>public PlacePhoto(String imgReference)</b>.
     * Initialize the url with the starter url link with the param value
     * & the other variables with null value.
     *
     * @param imgReference A String variable that will set the variable photoReference with proper value.
     */
    public PlacePhoto(String imgReference)
    {
        this.width="";
        this.photoReference=imgReference;
        this.imgUrl="https://maps.googleapis.com/maps/api/place/photo?" +
                "maxwidth=146" +//this.width
                "&photoreference=" +this.photoReference+
                "&key=AIzaSyDI0zKd22JBJEGco2k9Thg2CZWLLsWfq7k";
    }
    /*
     *A Method that return the width variable.
     * A public String method.
     * @return width This variable is used to pass attribute on imgUrl variable.
     */
    public String getWidth()
    {
        return width;
    }
    /*
     *A Method that pass a value to width variable.
     * A public void method that pass the proper value on width attribute.
     * @param width This variable is used pass a value to this.width variable.
     */
    public void setWidth(String width)
    {
        this.width = width;
    }
    /*
     *A Method that return the photoReference variable.
     * A public String method.
     * @return photoReference This variable is used to pass attribute on imgUrl variable.
     */
    public String getPhotoReference()
    {
        return photoReference;
    }
    /*
     *A Method that pass a value to photoReference variable.
     * A public void method that pass the proper value on photoReference attribute.
     * @param photoReference This variable is used pass a value to this.photoReference variable.
     */
    public void setPhotoReference(String photoReference)
    {
        this.photoReference = photoReference;
    }
    /*
     *A Method that return the imgUrl variable.
     * A public String method that returns the whole url for the image.
     * @return imgUrl This variable is used in other method to  make calls for images via api.
     */
    public String getImgUrl()
    {
        return imgUrl;
    }

}
