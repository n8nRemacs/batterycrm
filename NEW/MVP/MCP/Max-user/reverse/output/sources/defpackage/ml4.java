package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public final class ml4 implements v35 {
    public final Resources a;
    public final v35 b;

    public ml4(Resources resources, v35 v35Var) {
        this.a = resources;
        this.b = v35Var;
    }

    @Override // defpackage.v35
    public final Drawable a(sc3 sc3Var) {
        try {
            ml6.i();
            if (!(sc3Var instanceof CloseableStaticBitmap)) {
                v35 v35Var = this.b;
                if (v35Var != null && v35Var.b(sc3Var)) {
                    return v35Var.a(sc3Var);
                }
                ml6.i();
                return null;
            }
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) sc3Var;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
            if ((closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) && (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0)) {
                return bitmapDrawable;
            }
            return new pjb(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
        } finally {
            ml6.i();
        }
    }

    @Override // defpackage.v35
    public final boolean b(sc3 sc3Var) {
        return true;
    }
}
