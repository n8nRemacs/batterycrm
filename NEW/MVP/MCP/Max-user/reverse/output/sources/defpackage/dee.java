package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class dee implements zwd {
    public final zwd a;
    public final int b;
    public long c;
    public final /* synthetic */ eee d;

    public dee(eee eeeVar, zwd zwdVar, int i) {
        this.d = eeeVar;
        this.a = zwdVar;
        this.b = i;
    }

    @Override // defpackage.zwd
    public final Surface b() {
        return this.a.b();
    }

    @Override // defpackage.zwd
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.zwd
    public final int d(Bitmap bitmap, ct3 ct3Var) {
        return this.a.d(bitmap, ct3Var.a());
    }

    @Override // defpackage.zwd
    public final ph4 e() {
        return this.a.e();
    }

    @Override // defpackage.zwd
    public final void f() {
        eee eeeVar = this.d;
        AtomicInteger atomicInteger = eeeVar.t0;
        atomicInteger.decrementAndGet();
        if (eeeVar.i()) {
            this.a.f();
        } else if (atomicInteger.get() == 0) {
            eeeVar.o.d(new bee(1, this));
        }
    }

    @Override // defpackage.zwd
    public final boolean g() {
        zwd zwdVar = this.a;
        ph4 ph4VarE = zwdVar.e();
        hsi.h(ph4VarE);
        if (ph4VarE.j(4)) {
            eee eeeVar = this.d;
            eeeVar.t0.decrementAndGet();
            if (!eeeVar.i()) {
                if (this.b == 1 && eeeVar.y0) {
                    hsi.g(zwdVar.g());
                } else {
                    ph4VarE.w();
                    ph4VarE.Y = 0L;
                }
                if (eeeVar.t0.get() == 0) {
                    eeeVar.o.d(new bee(1, this));
                }
                return true;
            }
        }
        hsi.g(zwdVar.g());
        return true;
    }

    @Override // defpackage.zwd
    public final boolean h(long j) {
        return this.a.h(j);
    }
}
