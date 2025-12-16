package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class jch implements sx6 {
    public final t4h a;
    public final int b;
    public final long c;
    public final AtomicLong d = new AtomicLong();

    public jch(t4h t4hVar, int i, long j) {
        this.a = t4hVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.qva
    public final void a(g95 g95Var, long j, hf6 hf6Var, boolean z) {
        String scheme;
        int i;
        a09 a09Var = g95Var.a.b;
        boolean zEquals = (a09Var == null || (scheme = a09Var.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long jB = g95Var.b(j);
        AtomicLong atomicLong = this.d;
        if (hf6Var != null) {
            if (hf6Var.z % 180 != 0) {
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.t = hf6Var.v;
                ff6VarA.u = hf6Var.u;
                ff6VarA.y = 0;
                hf6Var = new hf6(ff6VarA);
            }
            hf6 hf6Var2 = hf6Var;
            if (zEquals) {
                i = 4;
            } else {
                String str = hf6Var2.n;
                str.getClass();
                if (xz9.k(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else {
                    if (!xz9.m(str)) {
                        throw new IllegalArgumentException("MIME type not supported ".concat(str));
                    }
                    i = 1;
                }
            }
            this.a.l(this.b, i, hf6Var2, g95Var.f.b, atomicLong.get() + this.c);
        }
        atomicLong.addAndGet(jB);
    }

    @Override // defpackage.zwd
    public final Surface b() {
        return this.a.j(this.b);
    }

    @Override // defpackage.zwd
    public final int c() {
        return this.a.g(this.b);
    }

    @Override // defpackage.zwd
    public final int d(Bitmap bitmap, ct3 ct3Var) {
        return this.a.m(this.b, bitmap, ct3Var) ? 1 : 2;
    }

    @Override // defpackage.zwd
    public final void f() {
        this.a.q(this.b);
    }

    @Override // defpackage.zwd
    public final boolean h(long j) {
        return this.a.f(this.b);
    }
}
