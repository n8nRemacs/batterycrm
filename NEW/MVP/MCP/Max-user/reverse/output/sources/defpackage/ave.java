package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ave implements le5 {
    public static final mw7 c = new mw7(2);
    public static final String d = "ave";
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ ave(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    public static Bitmap a(String str, Rect rect, int i) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        String str2 = d;
        if (bitmapDecodeFile == null) {
            wqi.e(str2, "cropImage: failed, no file at path ".concat(str), null);
            return null;
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        StringBuilder sbK = wy1.k("cropImage: sourceWidth=", width, ", sourceHeight=", height, ", x=");
        hf3.g(sbK, i2, ", y=", i3, ", width=");
        sbK.append(iWidth);
        sbK.append(", height=");
        sbK.append(iHeight);
        wqi.c(str2, sbK.toString(), new Object[0]);
        if (i2 + iWidth > width || i3 + iHeight > height) {
            wqi.e(str2, "wrong image crop params", null);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, i2, i3, iWidth, iHeight);
        if (bitmapCreateBitmap != bitmapDecodeFile) {
            bitmapDecodeFile.recycle();
        }
        if (bitmapCreateBitmap.getWidth() >= i && bitmapCreateBitmap.getHeight() >= i) {
            return bitmapCreateBitmap;
        }
        StringBuilder sbK2 = wy1.k("Crop width: ", bitmapCreateBitmap.getWidth(), " and height: ", bitmapCreateBitmap.getHeight(), " must be >= ");
        sbK2.append(i);
        sbK2.append(". Crop rect: ");
        sbK2.append(rect);
        wqi.e(str2, sbK2.toString(), null);
        double d2 = i;
        int iMax = Math.max((int) Math.ceil(d2 / bitmapCreateBitmap.getWidth()), (int) Math.ceil(d2 / bitmapCreateBitmap.getHeight()));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapCreateBitmap.getWidth() * iMax, bitmapCreateBitmap.getHeight() * iMax, false);
        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static final void c(String str, Bitmap bitmap, int i) throws IOException {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        String str2 = d;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream);
                wqi.c(str2, "save bitmap success! %s", str);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            wqi.e(str2, "save bitmap failure!", e);
            throw e;
        }
    }
}
