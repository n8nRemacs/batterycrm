package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class kkd extends yi0 {
    public final /* synthetic */ rr8 a;

    public kkd(rr8 rr8Var) {
        this.a = rr8Var;
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        rr8 rr8Var = this.a;
        if (rr8Var.e()) {
            return;
        }
        Throwable thB = ((r0) pe4Var).b();
        if (rr8Var.d(thB)) {
            return;
        }
        t8j.a(thB);
    }

    @Override // defpackage.yi0
    public final void g(Bitmap bitmap) {
        rr8 rr8Var = this.a;
        if (rr8Var.e()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap == null) {
            rr8Var.b();
        } else {
            rr8Var.a(bitmap);
        }
    }
}
