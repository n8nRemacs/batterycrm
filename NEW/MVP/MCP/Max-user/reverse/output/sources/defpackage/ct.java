package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ct extends r2c {
    public final np0 a;
    public final x6i b;

    public ct(np0 np0Var, x6i x6iVar) {
        this.a = np0Var;
        this.b = x6iVar;
    }

    @Override // defpackage.r2c
    public final vc3 c(int i, int i2, Bitmap.Config config) {
        int iC = xp0.c(i, i2, config);
        np0 np0Var = this.a;
        Bitmap bitmap = (Bitmap) np0Var.get(iC);
        if (bitmap.getAllocationByteCount() < xp0.b(config) * i * i2) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i, i2, config);
        return vc3.k0(bitmap, np0Var, (t9f) this.b.b);
    }
}
