package Ba1;

import android.graphics.Bitmap;
import com.google.android.renderscript.Toolkit;

/* loaded from: classes9.dex */
public abstract class i {
    public static final Bitmap a(Bitmap bitmap) {
        Toolkit toolkit = Toolkit.f358945a;
        return Toolkit.a(toolkit, Toolkit.d(toolkit, bitmap, bitmap.getWidth() / 4, bitmap.getHeight() / 4), 24);
    }
}
