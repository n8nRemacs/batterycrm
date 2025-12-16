package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class tka implements qf9 {
    public final k18 a;
    public final int b = kti.d(104 * vw4.d().getDisplayMetrics().density);
    public final hp0 c = new hp0(100, 1);
    public final fj2 d;

    public tka(k18 k18Var, Context context) {
        this.a = k18Var;
        this.d = new fj2(context);
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        this.c.i(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.df7 r9, defpackage.rf7 r10, defpackage.q44 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.pka
            if (r0 == 0) goto L14
            r0 = r11
            pka r0 = (defpackage.pka) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            pka r0 = new pka
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.o
            int r0 = r5.Y
            java.lang.String r7 = "fail to fetch bitmap"
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L34
            df7 r9 = r5.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L31
            goto L53
        L2b:
            r0 = move-exception
        L2c:
            r10 = r0
            goto L6c
        L2e:
            r0 = move-exception
            r9 = r0
            goto L78
        L31:
            r0 = move-exception
        L32:
            r10 = r0
            goto L79
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            defpackage.g8j.b(r11)
            r5.d = r9     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L66 kotlinx.coroutines.TimeoutCancellationException -> L69
            r5.Y = r1     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L66 kotlinx.coroutines.TimeoutCancellationException -> L69
            r3 = 200(0xc8, double:9.9E-322)
            r6 = 28
            r1 = r9
            r2 = r10
            java.lang.Object r11 = defpackage.ebj.b(r1, r2, r3, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L2e java.lang.Throwable -> L5e kotlinx.coroutines.TimeoutCancellationException -> L62
            g84 r9 = defpackage.g84.a
            if (r11 != r9) goto L52
            return r9
        L52:
            r9 = r1
        L53:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r11 == 0) goto L8b
            boolean r9 = r11.isRecycled()     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L31
            if (r9 != 0) goto L8b
            return r11
        L5e:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto L6c
        L62:
            r0 = move-exception
            r10 = r0
            r9 = r1
            goto L79
        L66:
            r0 = move-exception
            r1 = r9
            goto L2c
        L69:
            r0 = move-exception
            r1 = r9
            goto L32
        L6c:
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            defpackage.wqi.e(r9, r7, r10)
            goto L8b
        L78:
            throw r9
        L79:
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "fetch bitmap has timed out"
            r11.<init>(r0, r10)
            defpackage.wqi.p(r9, r7, r11)
        L8b:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tka.e(df7, rf7, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.pb2 r5, defpackage.q44 r6) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qka
            if (r0 == 0) goto L13
            r0 = r6
            qka r0 = (defpackage.qka) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qka r0 = new qka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            pb2 r5 = r0.o
            tka r0 = r0.d
            defpackage.g8j.b(r6)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r6)
            il0 r6 = defpackage.il0.b
            hl0 r2 = defpackage.hl0.a
            java.lang.String r6 = r5.i(r6, r2)
            r0.d = r4
            r0.o = r5
            r0.Z = r3
            java.lang.Object r6 = r4.h(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L64
            r0.getClass()
            r5.p0()
            r5.q0()
            java.lang.CharSequence r6 = r5.w0
            long r1 = r5.h()
            android.graphics.Bitmap r5 = r0.i(r6, r1)
            return r5
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tka.f(pb2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ku3 r5, defpackage.q44 r6) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rka
            if (r0 == 0) goto L13
            r0 = r6
            rka r0 = (defpackage.rka) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            rka r0 = new rka
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ku3 r5 = r0.o
            tka r0 = r0.d
            defpackage.g8j.b(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            il0 r6 = defpackage.il0.b
            java.lang.String r6 = r5.r(r6)
            r0.d = r4
            r0.o = r5
            r0.Z = r2
            java.lang.Object r6 = r4.h(r6, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L49
            return r0
        L49:
            r0 = r4
        L4a:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L5e
            r0.getClass()
            java.lang.CharSequence r6 = r5.o()
            long r1 = r5.p()
            android.graphics.Bitmap r5 = r0.i(r6, r1)
            return r5
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tka.g(ku3, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r7, defpackage.q44 r8) throws java.lang.NumberFormatException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ska
            if (r0 == 0) goto L13
            r0 = r8
            ska r0 = (defpackage.ska) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ska r0 = new ska
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            int r1 = r0.Z
            java.lang.String r2 = "fail to copy bitmap"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L2d
            java.lang.String r7 = r0.o
            tka r0 = r0.d
            defpackage.g8j.b(r8)
            goto L97
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.g8j.b(r8)
            if (r7 == 0) goto Lb6
            int r8 = r7.length()
            if (r8 != 0) goto L42
            goto Lb6
        L42:
            hp0 r8 = r6.c
            java.lang.Object r8 = r8.c(r7)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L65
            boolean r1 = r8.isRecycled()
            if (r1 != 0) goto L65
            android.graphics.Bitmap$Config r1 = r8.getConfig()     // Catch: java.lang.Throwable -> L5b
            android.graphics.Bitmap r7 = r8.copy(r1, r3)     // Catch: java.lang.Throwable -> L5b
            return r7
        L5b:
            r8 = move-exception
            java.lang.Class<tka> r1 = defpackage.tka.class
            java.lang.String r1 = r1.getName()
            defpackage.wqi.e(r1, r2, r8)
        L65:
            nc0 r8 = defpackage.hxa.a
            android.net.Uri r8 = defpackage.rz3.c(r7)
            sf7 r8 = defpackage.sf7.d(r8)
            pf7 r1 = defpackage.pf7.a
            r8.g = r1
            kxa r1 = defpackage.kxa.a
            lk0 r1 = defpackage.hxa.a(r1)
            r8.k = r1
            rf7 r8 = r8.a()
            k18 r1 = r6.a
            java.lang.Object r1 = r1.getValue()
            df7 r1 = (defpackage.df7) r1
            r0.d = r6
            r0.o = r7
            r0.Z = r5
            java.lang.Object r8 = r6.e(r1, r8, r0)
            g84 r0 = defpackage.g84.a
            if (r8 != r0) goto L96
            return r0
        L96:
            r0 = r6
        L97:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto Lb6
            hp0 r1 = r0.c     // Catch: java.lang.Throwable -> La9
            android.graphics.Bitmap$Config r4 = r8.getConfig()     // Catch: java.lang.Throwable -> La9
            android.graphics.Bitmap r3 = r8.copy(r4, r3)     // Catch: java.lang.Throwable -> La9
            r1.d(r7, r3)     // Catch: java.lang.Throwable -> La9
            goto Lb5
        La9:
            r7 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            defpackage.wqi.e(r0, r2, r7)
        Lb5:
            r4 = r8
        Lb6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tka.h(java.lang.String, q44):java.lang.Object");
    }

    public final Bitmap i(CharSequence charSequence, long j) {
        lc0 lc0Var = (lc0) this.d.c(new imb(charSequence, Long.valueOf(j)));
        if (lc0Var == null) {
            return null;
        }
        int i = this.b;
        return q9j.b(lc0Var, i, i);
    }
}
