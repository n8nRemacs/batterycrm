package defpackage;

import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z6c extends ws4 {
    public final rac c;
    public final oac d;
    public final y6c e;
    public boolean f;
    public vc3 g;
    public int h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ px4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6c(px4 px4Var, hj0 hj0Var, rac racVar, y6c y6cVar, oac oacVar) {
        super(hj0Var);
        this.k = px4Var;
        this.g = null;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.c = racVar;
        this.e = y6cVar;
        this.d = oacVar;
        ((mk0) oacVar).a(new hh4(6, this));
    }

    public static void m(z6c z6cVar, vc3 vc3Var, int i) throws Throwable {
        y6c y6cVar = z6cVar.e;
        oac oacVar = z6cVar.d;
        rac racVar = z6cVar.c;
        if (!vc3.i0(vc3Var)) {
            throw new IllegalArgumentException();
        }
        if (!(((sc3) vc3Var.Z()) instanceof CloseableStaticBitmap)) {
            z6cVar.o(i, vc3Var);
            return;
        }
        racVar.j(oacVar, "PostprocessorProducer");
        qk4 qk4Var = null;
        Map mapA = null;
        try {
            try {
                qk4 qk4VarP = z6cVar.p((sc3) vc3Var.Z());
                try {
                    if (racVar.i(oacVar, "PostprocessorProducer")) {
                        mapA = bh7.a("Postprocessor", y6cVar.getName());
                    }
                    racVar.a(oacVar, "PostprocessorProducer", mapA);
                    z6cVar.o(i, qk4VarP);
                    vc3.P(qk4VarP);
                } catch (Throwable th) {
                    th = th;
                    qk4Var = qk4VarP;
                    vc3.P(qk4Var);
                    throw th;
                }
            } catch (Exception e) {
                racVar.d(oacVar, "PostprocessorProducer", e, !racVar.i(oacVar, "PostprocessorProducer") ? null : bh7.a("Postprocessor", y6cVar.getName()));
                if (z6cVar.n()) {
                    z6cVar.b.e(e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void d() {
        if (n()) {
            this.b.c();
        }
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void f(Throwable th) {
        if (n()) {
            this.b.e(th);
        }
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) {
        vc3 vc3Var = (vc3) obj;
        if (!vc3.i0(vc3Var)) {
            if (hj0.a(i)) {
                o(i, null);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                vc3 vc3Var2 = this.g;
                this.g = vc3.y(vc3Var);
                this.h = i;
                this.i = true;
                boolean zQ = q();
                vc3.P(vc3Var2);
                if (zQ) {
                    ((Executor) this.k.d).execute(new r98(15, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                vc3 vc3Var = this.g;
                this.g = null;
                this.f = true;
                vc3.P(vc3Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r3, defpackage.vc3 r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.hj0.a(r3)
            if (r0 != 0) goto L10
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            if (r1 == 0) goto L18
            goto L10
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            if (r0 == 0) goto L1d
            boolean r0 = r2.n()
            if (r0 == 0) goto L1d
        L18:
            hj0 r0 = r2.b
            r0.g(r3, r4)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6c.o(int, vc3):void");
    }

    public final qk4 p(sc3 sc3Var) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) sc3Var;
        vc3 vc3VarA = this.e.a(closeableStaticBitmap.getUnderlyingBitmap(), (r2c) this.k.c);
        try {
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(vc3VarA, sc3Var.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            closeableStaticBitmapOf.putExtras(closeableStaticBitmap.getExtras());
            return vc3.j0(closeableStaticBitmapOf);
        } finally {
            vc3.P(vc3VarA);
        }
    }

    public final synchronized boolean q() {
        if (this.f || !this.i || this.j || !vc3.i0(this.g)) {
            return false;
        }
        this.j = true;
        return true;
    }
}
