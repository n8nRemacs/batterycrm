package e11;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import e11.C39924z;

/* loaded from: classes7.dex */
public class C0 {
    public static Bitmap a(int i12, String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = i12;
        int i13 = C39924z.f394913b;
        options.inTargetDensity = C39924z.a.f394916b;
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
    }
}
