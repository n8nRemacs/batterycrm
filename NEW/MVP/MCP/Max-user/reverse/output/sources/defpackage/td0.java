package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* loaded from: classes2.dex */
public final class td0 extends lk0 {
    public final /* synthetic */ vd0 c;

    public td0(vd0 vd0Var) {
        this.c = vd0Var;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        Bitmap.Config config = bitmap.getConfig();
        int height = this.c.s0 ? bitmap.getHeight() : bitmap.getWidth();
        int width = this.c.s0 ? bitmap.getWidth() : bitmap.getHeight();
        if (config == null) {
            config = lk0.a;
        }
        vc3 vc3VarC = r2cVar.c(height, width, config);
        try {
            d((Bitmap) vc3VarC.Z(), bitmap);
            vc3 vc3VarClone = vc3VarC.clone();
            vc3VarC.close();
            return vc3VarClone;
        } finally {
        }
    }

    @Override // defpackage.lk0
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        if (this.c.s0) {
            float f = 2;
            this.c.X.postTranslate((bitmap2.getHeight() - bitmap2.getWidth()) / f, (bitmap2.getWidth() - bitmap2.getHeight()) / f);
        }
        ((Canvas) this.c.Y.getValue()).setBitmap(bitmap);
        ((Canvas) this.c.Y.getValue()).drawBitmap(bitmap2, this.c.X, null);
    }
}
