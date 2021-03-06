package com.blastbeatsandcode.seefood.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.Image;
import android.text.Html;

import java.nio.ByteBuffer;

public class SFImage {
    private Image _image;
    private float _foodConfidence;
    private float _notFoodConfidence;
    private String _sender;
    private String _fileType;
    private String _imagePath;
    private Bitmap _bitmap;


    // Constructor with bitmap
    public SFImage (float foodConfidence, float notFoodConfidence, String sender,
                    String fileType, String imagePath, Bitmap bitmap)
    {
        this._foodConfidence = foodConfidence;
        this._notFoodConfidence = notFoodConfidence;
        this._sender = sender;
        _imagePath = imagePath;
        _fileType = fileType;
        _bitmap = bitmap;
        if (bitmap == null){
            System.out.println("WHY IS THIS NULL?????????????????????????????????????????????????????????????????????????????????????");
        }
    }




    // Constructor for SFImage with only image given
    SFImage(Image image)
    {
        this._image = image;
    }

    public String getImagePath() { return _imagePath; }

    // Returns the sender of the SFImage
    public String getSender()
    {
        return _sender;
    }

    public void setSender(String sender)
    {
        this._sender = sender;
    }

    // Returns the food confidence of the SFImage
    public float getFoodConfidence()
    {
        return _foodConfidence;
    }

    public void setFoodConfidence(float foodConfidence)
    {
        this._foodConfidence = foodConfidence;
    }

    // Returns the not food confidence of SFImage
    public float getNotFoodConfidence()
    {
        return _notFoodConfidence;
    }

    public void setNotFoodConfidence(float notFoodConfidence)
    {
        this._notFoodConfidence = notFoodConfidence;
    }

    public String getFileType() {return _fileType;}

    // Returns the image component of the SFImage
    public Image getImage()
    {
        return _image;
    }

    // Returns the bitmap version of the image
    public Bitmap getImageBitmap() {
        return _bitmap;
//        try {
//            ByteBuffer buffer = _image.getPlanes()[0].getBuffer();
//            byte[] bytes = new byte[buffer.remaining()];
//            buffer.get(bytes);
//            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, null);
//        } catch (NullPointerException e) {
//            System.out.println("Null pointer exception; the image is null.");
//            int w = 500, h = 500;
//
//            Bitmap.Config conf = Bitmap.Config.ARGB_8888; // see other conf types
//            return Bitmap.createBitmap(w, h, conf); // this creates a MUTABLE bitmap
//        }
    }

    public void setImage(Image image) {
        _image = image;
    }

    // Generates a confidence graphic based on the food confidence and not food confidence values
    public void generateConfidenceGraphic() {
        // Ensure that the confidences are set
        try {
            System.out.println("Create confidence graphic");
            // TODO: Implement this
        } catch(Exception e) {
            System.out.println("Values for food confidence have not been set!");
        }
    }
}
