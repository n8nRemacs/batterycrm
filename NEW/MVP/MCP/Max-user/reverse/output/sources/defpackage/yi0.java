package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public abstract class yi0 extends oj0 {
    @Override // defpackage.oj0
    public final void f(r0 r0Var) {
        if (r0Var.g()) {
            vc3 vc3Var = (vc3) r0Var.d();
            try {
                g((vc3Var == null || !(vc3Var.Z() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) vc3Var.Z()).getUnderlyingBitmap());
            } finally {
                vc3.P(vc3Var);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
