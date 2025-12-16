package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;

/* loaded from: classes2.dex */
public final class rxd extends yi0 {
    public final /* synthetic */ pe4 a;
    public final /* synthetic */ l42 b;
    public final /* synthetic */ sxd c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public rxd(pe4 pe4Var, l42 l42Var, sxd sxdVar, boolean z, boolean z2) {
        this.a = pe4Var;
        this.b = l42Var;
        this.c = sxdVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.oj0, defpackage.af4
    public final void c() {
        l42 l42Var = this.b;
        if (l42Var.r()) {
            l42Var.h(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        this.b.resumeWith(null);
    }

    @Override // defpackage.yi0
    public final void g(Bitmap bitmap) {
        boolean zG = ((r0) this.a).g();
        l42 l42Var = this.b;
        if (!zG) {
            l42Var.resumeWith(null);
            return;
        }
        if (bitmap == null) {
            l42Var.resumeWith(null);
            return;
        }
        boolean z = this.d;
        sxd sxdVar = this.c;
        vp0 vp0Var = new vp0(z ? az1.i(sxdVar.c.a.getCacheDir().getPath(), vob.b) : Environment.DIRECTORY_PICTURES, bitmap);
        d1e d1eVar = sxdVar.a;
        boolean z2 = this.e;
        l42Var.resumeWith(z ? d1eVar.b(vp0Var, d1eVar.f(z2)) : d1eVar.a(vp0Var, d1eVar.f(z2)));
    }
}
