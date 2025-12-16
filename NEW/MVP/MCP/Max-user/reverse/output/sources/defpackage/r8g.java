package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public abstract class r8g {
    public static final bwf a = new bwf(new q8g(0));
    public static final bwf b = new bwf(new q8g(1));

    public static final ByteArrayOutputStream a(String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(Color.parseColor(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmapCreateBitmap.getAllocationByteCount());
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
