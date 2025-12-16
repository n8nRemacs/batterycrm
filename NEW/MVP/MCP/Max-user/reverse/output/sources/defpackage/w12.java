package defpackage;

import android.content.Context;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class w12 {
    public static final u12 G = new u12();
    public final mc5 A;
    public final mc5 B;
    public final mc5 C;
    public final HashSet D;
    public final Context E;
    public final HashMap F;
    public f32 a;
    public int b;
    public r8c c;
    public aod d;
    public ee7 e;
    public ExecutorService f;
    public yc7 g;
    public dd7 h;
    public s1h i;
    public dhd j;
    public final HashMap k;
    public wib l;
    public final u75 m;
    public final u75 n;
    public final Range o;
    public n38 p;
    public x9c q;
    public chh r;
    public q8c s;
    public final sa9 t;
    public final xtd u;
    public final boolean v;
    public boolean w;
    public final qh6 x;
    public final qh6 y;
    public final j8a z;

    /* JADX WARN: Multi-variable type inference failed */
    public w12(Context context) {
        w9c w9cVar = w9c.f;
        q72 q72VarC = a6j.c(context);
        lz1 lz1Var = new lz1(5);
        int i = 19;
        q72 q72VarL = wsf.l(q72VarC, new usd(i, lz1Var), ayi.a());
        this.a = f32.c;
        this.b = 3;
        this.j = null;
        this.k = new HashMap();
        this.l = bhd.i0;
        u75 u75Var = u75.c;
        this.m = u75Var;
        this.n = u75Var;
        this.o = ob0.f;
        this.v = true;
        this.w = true;
        this.x = new qh6();
        this.y = new qh6();
        this.z = new j8a(0);
        int i2 = 25;
        this.A = new mc5(i2, false);
        this.B = new mc5(i2, (boolean) (null == true ? 1 : 0));
        this.C = new mc5(i2, (boolean) (null == true ? 1 : 0));
        this.D = new HashSet();
        this.F = new HashMap();
        Context contextA = i6j.a(context);
        this.E = contextA;
        ad7 ad7Var = new ad7(2);
        c(ad7Var, this.d);
        ad7Var.b.n(re7.y, this.n);
        this.c = ad7Var.b();
        ad7 ad7Var2 = new ad7(1);
        c(ad7Var2, null);
        this.e = ad7Var2.a();
        this.h = d(null, null, null);
        this.i = e();
        o38 o38Var = (o38) this;
        t12 t12Var = new t12(null == true ? 1 : 0, o38Var);
        wsf.l(q72VarL, new usd(i, t12Var), ayi.d());
        this.t = new sa9(contextA, 13);
        this.u = new xtd(28, o38Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.q8c r7, defpackage.chh r8) {
        /*
            r6 = this;
            defpackage.jei.b()
            q8c r0 = r6.s
            if (r0 == r7) goto Le
            r6.s = r7
            r8c r0 = r6.c
            r0.G(r7)
        Le:
            chh r7 = r6.r
            r0 = 0
            if (r7 == 0) goto L37
            int r7 = r6.h(r8)
            r1 = -1
            if (r7 == r1) goto L21
            l16 r2 = new l16
            r3 = 1
            r2.<init>(r7, r3)
            goto L22
        L21:
            r2 = r0
        L22:
            chh r7 = r6.r
            int r7 = r6.h(r7)
            if (r7 == r1) goto L31
            l16 r1 = new l16
            r3 = 1
            r1.<init>(r7, r3)
            goto L32
        L31:
            r1 = r0
        L32:
            if (r2 == r1) goto L35
            goto L37
        L35:
            r7 = 0
            goto L38
        L37:
            r7 = 1
        L38:
            r6.r = r8
            sa9 r8 = r6.t
            a07 r1 = defpackage.ayi.d()
            xtd r2 = r6.u
            java.lang.Object r3 = r8.a
            monitor-enter(r3)
            java.lang.Object r4 = r8.b     // Catch: java.lang.Throwable -> L51
            zsd r4 = (defpackage.zsd) r4     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.canDetectOrientation()     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L53
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            goto L67
        L51:
            r7 = move-exception
            goto L70
        L53:
            java.lang.Object r4 = r8.c     // Catch: java.lang.Throwable -> L51
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L51
            atd r5 = new atd     // Catch: java.lang.Throwable -> L51
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L51
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L51
            zsd r8 = (defpackage.zsd) r8     // Catch: java.lang.Throwable -> L51
            r8.enable()     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
        L67:
            if (r7 == 0) goto L6c
            r6.s()
        L6c:
            r6.r(r0)
            return
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w12.a(q8c, chh):void");
    }

    public final void b() {
        jei.b();
        x9c x9cVar = this.q;
        if (x9cVar != null) {
            x9cVar.a(this.c, this.e, this.h, this.i);
        }
        this.c.G(null);
        this.p = null;
        this.s = null;
        this.r = null;
        sa9 sa9Var = this.t;
        xtd xtdVar = this.u;
        synchronized (sa9Var.a) {
            try {
                atd atdVar = (atd) ((HashMap) sa9Var.c).get(xtdVar);
                if (atdVar != null) {
                    atdVar.c.set(false);
                    ((HashMap) sa9Var.c).remove(xtdVar);
                }
                if (((HashMap) sa9Var.c).isEmpty()) {
                    ((zsd) sa9Var.b).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ad7 ad7Var, aod aodVar) {
        if (aodVar != null) {
            ad7Var.d(aodVar);
            return;
        }
        chh chhVar = this.r;
        if (chhVar != null) {
            int iH = h(chhVar);
            l16 l16Var = iH != -1 ? new l16(iH, 1) : null;
            if (l16Var != null) {
                ad7Var.d(new aod(l16Var, null, null));
            }
        }
    }

    public final dd7 d(Integer num, Integer num2, Integer num3) {
        ad7 ad7Var = new ad7(0);
        x8a x8aVar = ad7Var.b;
        if (num != null) {
            x8aVar.n(id7.b, num);
        }
        if (num2 != null) {
            x8aVar.n(id7.c, num2);
        }
        if (num3 != null) {
            x8aVar.n(id7.o, num3);
        }
        c(ad7Var, null);
        id7 id7Var = new id7(fjb.a(x8aVar));
        bf7.F(id7Var);
        return new dd7(id7Var);
    }

    public final s1h e() {
        int iH;
        ycd ycdVar = bhd.m0;
        hc8 hc8VarA = sa0.a();
        wib wibVar = this.l;
        z5j.e(wibVar, "The specified quality selector can't be null.");
        fc0 fc0Var = (fc0) hc8VarA.b;
        if (fc0Var == null) {
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }
        ec0 ec0Var = new ec0();
        ec0Var.a = fc0Var.a;
        ec0Var.b = fc0Var.b;
        ec0Var.c = fc0Var.c;
        ec0Var.d = Integer.valueOf(fc0Var.d);
        ec0Var.a = wibVar;
        hc8VarA.b = ec0Var.a();
        chh chhVar = this.r;
        if (chhVar != null && this.l == bhd.i0 && (iH = h(chhVar)) != -1) {
            fc0 fc0Var2 = (fc0) hc8VarA.b;
            if (fc0Var2 == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            ec0 ec0Var2 = new ec0();
            ec0Var2.a = fc0Var2.a;
            ec0Var2.b = fc0Var2.b;
            ec0Var2.c = fc0Var2.c;
            ec0Var2.d = Integer.valueOf(fc0Var2.d);
            ec0Var2.d = Integer.valueOf(iH);
            hc8VarA.b = ec0Var2.a();
        }
        ad7 ad7Var = new ad7(new bhd(null, hc8VarA.t(), ycdVar, ycdVar));
        Range range = this.o;
        s90 s90Var = xwg.m0;
        x8a x8aVar = ad7Var.b;
        x8aVar.n(s90Var, range);
        x8aVar.n(bf7.C, 0);
        x8aVar.n(re7.y, this.m);
        return new s1h(new t1h(fjb.a(x8aVar)));
    }

    public final ha8 f(boolean z) {
        jei.b();
        if (i()) {
            return ((s12) this.p.c.A0.d).k(z);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        mc5 mc5Var = this.A;
        mc5Var.getClass();
        jei.b();
        return ixi.a(new z9a(mc5Var, 4, boolValueOf));
    }

    public final m1e g() {
        HashMap map = this.F;
        l1e l1eVar = l1e.b;
        if (map.get(l1eVar) != null) {
            return (m1e) map.get(l1eVar);
        }
        l1e l1eVar2 = l1e.a;
        if (map.get(l1eVar2) != null) {
            return (m1e) map.get(l1eVar2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.chh r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L5
            r1 = r0
            goto Lb
        L5:
            int r1 = r7.c
            int r1 = defpackage.sxi.b(r1)
        Lb:
            x9c r2 = r6.q
            if (r2 != 0) goto L11
            r2 = r0
            goto L1f
        L11:
            f32 r3 = r6.a
            w9c r2 = r2.a
            yod r2 = r2.e(r3)
            l22 r2 = r2.a
            int r2 = r2.b()
        L1f:
            x9c r3 = r6.q
            r4 = 1
            if (r3 != 0) goto L26
        L24:
            r3 = r4
            goto L38
        L26:
            f32 r5 = r6.a
            w9c r3 = r3.a
            yod r3 = r3.e(r5)
            l22 r3 = r3.a
            int r3 = r3.h()
            if (r3 != r4) goto L37
            goto L24
        L37:
            r3 = r0
        L38:
            int r1 = defpackage.sxi.a(r1, r2, r3)
            android.util.Rational r7 = r7.b
            r2 = 90
            if (r1 == r2) goto L46
            r2 = 270(0x10e, float:3.78E-43)
            if (r1 != r2) goto L54
        L46:
            android.util.Rational r1 = new android.util.Rational
            int r2 = r7.getDenominator()
            int r7 = r7.getNumerator()
            r1.<init>(r2, r7)
            r7 = r1
        L54:
            android.util.Rational r1 = new android.util.Rational
            r2 = 4
            r3 = 3
            r1.<init>(r2, r3)
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L62
            return r0
        L62:
            android.util.Rational r0 = new android.util.Rational
            r1 = 16
            r2 = 9
            r0.<init>(r1, r2)
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L72
            return r4
        L72:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w12.h(chh):int");
    }

    public final boolean i() {
        return this.p != null;
    }

    public final boolean j() {
        return this.q != null;
    }

    public final void k(yc7 yc7Var, yc7 yc7Var2) {
        if (Objects.equals(yc7Var == null ? null : yc7Var.g(), yc7Var2 == null ? null : yc7Var2.g())) {
            return;
        }
        Integer num = (Integer) ((id7) this.h.f).d(id7.b, 0);
        num.intValue();
        t(num, Integer.valueOf(this.h.G()), Integer.valueOf(this.h.H()));
        r(null);
    }

    public final void l(f32 f32Var) {
        jei.b();
        if (this.a == f32Var) {
            return;
        }
        Integer numB = f32Var.b();
        if (this.e.H() == 3 && numB != null && numB.intValue() != 0) {
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
        f32 f32Var2 = this.a;
        this.a = f32Var;
        x9c x9cVar = this.q;
        if (x9cVar == null) {
            return;
        }
        x9cVar.a(this.c, this.e, this.h, this.i);
        r(new my1((o38) this, 7, f32Var2));
    }

    public final void m(int i) {
        jei.b();
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        this.b = i;
        jei.b();
        if ((this.b & 4) == 0) {
            jei.b();
            dhd dhdVar = this.j;
            if (dhdVar != null && !dhdVar.a.get()) {
                jei.b();
                dhd dhdVar2 = this.j;
                if (dhdVar2 != null) {
                    dhdVar2.close();
                    this.j = null;
                }
            }
        }
        r(new l30((o38) this, i2, 5));
    }

    public final void n(int i) {
        jei.b();
        if (i == 3) {
            Integer numB = this.a.b();
            if (numB != null && numB.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            v();
        }
        ee7 ee7Var = this.e;
        ee7Var.getClass();
        gri.a("ImageCapture", "setFlashMode: flashMode = " + i);
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(ho7.f(i, "Invalid flash mode: "));
            }
            if (ee7Var.u.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (ee7Var.c() != null) {
                n22 n22VarC = ee7Var.c();
                if ((n22VarC != null ? n22VarC.n().h() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (ee7Var.q) {
            ee7Var.s = i;
            ee7Var.K();
        }
    }

    public final void o(wib wibVar) {
        jei.b();
        this.l = wibVar;
        if (j()) {
            this.q.a(this.i);
        }
        this.i = e();
        r(null);
    }

    public final ha8 p(float f) {
        jei.b();
        if (i()) {
            return ((s12) this.p.c.A0.d).d(f);
        }
        Float fValueOf = Float.valueOf(f);
        mc5 mc5Var = this.C;
        mc5Var.getClass();
        jei.b();
        return ixi.a(new z9a(mc5Var, 4, fValueOf));
    }

    public abstract n38 q();

    public final void r(Runnable runnable) {
        ha8 ha8VarB;
        bc9 bc9Var;
        bc9 bc9Var2;
        try {
            this.p = q();
            if (!i()) {
                gri.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            cb8 cb8VarQ = this.p.c.B0.b.q();
            qh6 qh6Var = this.x;
            cb8 cb8Var = qh6Var.m;
            if (cb8Var != null && (bc9Var2 = (bc9) qh6Var.l.c(cb8Var)) != null) {
                bc9Var2.a.j(bc9Var2);
            }
            qh6Var.m = cb8VarQ;
            qh6Var.l(cb8VarQ, new fz1(2, qh6Var));
            cb8 cb8VarE = this.p.c.B0.b.e();
            qh6 qh6Var2 = this.y;
            cb8 cb8Var2 = qh6Var2.m;
            if (cb8Var2 != null && (bc9Var = (bc9) qh6Var2.l.c(cb8Var2)) != null) {
                bc9Var.a.j(bc9Var);
            }
            qh6Var2.m = cb8VarE;
            qh6Var2.l(cb8VarE, new fz1(2, qh6Var2));
            mc5 mc5Var = this.A;
            mc5Var.getClass();
            jei.b();
            kmb kmbVar = (kmb) mc5Var.b;
            if (kmbVar != null) {
                ha8 ha8VarF = f(((Boolean) kmbVar.b).booleanValue());
                tu1 tu1Var = (tu1) ((kmb) mc5Var.b).a;
                Objects.requireNonNull(tu1Var);
                wsf.h(ha8VarF, tu1Var);
                mc5Var.b = null;
            }
            mc5 mc5Var2 = this.B;
            mc5Var2.getClass();
            jei.b();
            kmb kmbVar2 = (kmb) mc5Var2.b;
            if (kmbVar2 != null) {
                Float f = (Float) kmbVar2.b;
                float fFloatValue = f.floatValue();
                jei.b();
                if (i()) {
                    ha8VarB = ((s12) this.p.c.A0.d).b(fFloatValue);
                } else {
                    jei.b();
                    ha8VarB = ixi.a(new z9a(mc5Var2, 4, f));
                }
                tu1 tu1Var2 = (tu1) ((kmb) mc5Var2.b).a;
                Objects.requireNonNull(tu1Var2);
                wsf.h(ha8VarB, tu1Var2);
                mc5Var2.b = null;
            }
            mc5 mc5Var3 = this.C;
            mc5Var3.getClass();
            jei.b();
            kmb kmbVar3 = (kmb) mc5Var3.b;
            if (kmbVar3 != null) {
                ha8 ha8VarP = p(((Float) kmbVar3.b).floatValue());
                tu1 tu1Var3 = (tu1) ((kmb) mc5Var3.b).a;
                Objects.requireNonNull(tu1Var3);
                wsf.h(ha8VarP, tu1Var3);
                mc5Var3.b = null;
            }
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void s() {
        u();
        jei.b();
        Integer numValueOf = Integer.valueOf(this.e.p);
        if (j()) {
            this.q.a(this.e);
        }
        int iH = this.e.H();
        ad7 ad7Var = new ad7(1);
        ad7Var.b.n(fe7.b, numValueOf);
        c(ad7Var, null);
        this.e = ad7Var.a();
        n(iH);
        Integer num = (Integer) ((id7) this.h.f).d(id7.b, 0);
        num.intValue();
        t(num, Integer.valueOf(this.h.G()), Integer.valueOf(this.h.H()));
        if (j()) {
            this.q.a(this.i);
        }
        this.i = e();
    }

    public final void t(Integer num, Integer num2, Integer num3) {
        yc7 yc7Var;
        jei.b();
        if (j()) {
            this.q.a(this.h);
        }
        dd7 dd7VarD = d(num, num2, num3);
        this.h = dd7VarD;
        ExecutorService executorService = this.f;
        if (executorService == null || (yc7Var = this.g) == null) {
            return;
        }
        dd7VarD.I(executorService, yc7Var);
    }

    public final void u() {
        if (j()) {
            this.q.a(this.c);
        }
        ad7 ad7Var = new ad7(2);
        c(ad7Var, this.d);
        ad7Var.b.n(re7.y, this.n);
        r8c r8cVarB = ad7Var.b();
        this.c = r8cVarB;
        q8c q8cVar = this.s;
        if (q8cVar != null) {
            r8cVarB.G(q8cVar);
        }
    }

    public final void v() {
        m1e m1eVarG = g();
        if (m1eVarG == null) {
            gri.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            ee7 ee7Var = this.e;
            ee7Var.getClass();
            p1e p1eVar = new p1e(G);
            ee7Var.u = p1eVar;
            ee7Var.d().g(p1eVar);
            return;
        }
        ee7 ee7Var2 = this.e;
        de7 de7Var = m1eVarG.b;
        ee7Var2.getClass();
        p1e p1eVar2 = new p1e(de7Var);
        ee7Var2.u = p1eVar2;
        ee7Var2.d().g(p1eVar2);
        gri.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + m1eVarG.a.name());
    }
}
