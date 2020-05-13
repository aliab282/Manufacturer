package com.example.manufacturerutils;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class ManufacturerUtils {
    /**
     * @param context      needed to interact with drawables from resource id
     * @param manufacturer short format name of the manufacturer.
     * @return drawable of the manufacturer, or null if cannot find any.
     */
    public static Drawable getLogoDrawable(Context context, String manufacturer) {
        Integer resId;
        switch (manufacturer) {
            case "Samsung":
                resId = R.drawable.logo_samsung;
                break;
            case "Sony":
                resId = R.drawable.logo_sony;
                break;
            case "Acer":
                resId = R.drawable.logo_acer;
                break;
            case "Asus":
                resId = R.drawable.logo_asus;
                break;
            case "Google":
                resId = R.drawable.logo_google;
                break;
            case "HTC":
                resId = R.drawable.logo_htc;
                break;
            case "Huawei":
                resId = R.drawable.logo_huawei;
                break;
            case "LG":
                resId = R.drawable.logo_lg;
                break;
            case "Motorola":
                resId = R.drawable.logo_motorola;
                break;
            case "Xiaomi":
                resId = R.drawable.logo_xiaomi;
                break;
            default:
                resId = null;
        }

        if (resId == null) {
            return null;
        } else {
            return context.getResources().getDrawable(resId);
        }
    }
}
