package com.facebook.imageutils;

import android.media.ExifInterface;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.InterfaceC36428e;
import java.io.IOException;
import java.io.InputStream;
import uW0.C48986a;
import uW0.C48987b;

@Nullsafe
/* loaded from: classes15.dex */
public class HeifExifUtil {
    public static final String TAG = "HeifExifUtil";

    @InterfaceC36428e
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }
    }

    public static int getOrientation(InputStream inputStream) {
        try {
            return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        } catch (IOException e12) {
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(3)) {
                c48987b.c(3, TAG, "Failed reading Heif Exif orientation -> ignoring", e12);
            }
            return 0;
        }
    }
}
