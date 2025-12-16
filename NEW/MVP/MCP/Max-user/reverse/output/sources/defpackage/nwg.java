package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class nwg extends Drawable implements hgh {
    public rf7 X;
    public final int Y;
    public String Z;
    public final m45 a;
    public final rpd b;
    public ia c;
    public final md0 d;
    public rf7 o;

    public nwg(Context context) {
        hr6 hr6Var = new hr6(context.getResources());
        hr6Var.b = 0;
        m45 m45Var = new m45(hr6Var.a());
        qsd qsdVarD = m45Var.d();
        if (qsdVarD != null) {
            qsdVarD.setCallback(new sf(7, this));
        }
        this.a = m45Var;
        this.b = new rpd();
        this.d = new md0(4, this);
        this.Y = kti.d(12 * vw4.d().getDisplayMetrics().density);
        f();
    }

    public static rf7 d(rf7 rf7Var, int i, int i2) {
        sf7 sf7VarB = sf7.b(rf7Var);
        sf7VarB.d = (i <= 0 || i2 <= 0) ? null : new ynd(i, i2);
        return sf7VarB.a();
    }

    @Override // defpackage.hgh
    public final void a() {
        this.a.g();
    }

    @Override // defpackage.hgh
    public final void b() {
        this.a.f();
        c(this.o, this.X);
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.rf7 r9, defpackage.rf7 r10) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwg.c(rf7, rf7):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        qsd qsdVarD = this.a.d();
        if (qsdVarD != null) {
            qsdVarD.draw(canvas);
        }
    }

    public final void e(Uri uri, String str) {
        Uri uriC;
        if (fni.a(this.Z, str)) {
            return;
        }
        this.Z = str;
        this.o = (str == null || (uriC = rz3.c(str)) == null) ? null : sf7.d(uriC).a();
        rf7 rf7VarA = uri != null ? sf7.d(uri).a() : null;
        this.X = rf7VarA;
        c(this.o, rf7VarA);
        invalidateSelf();
    }

    public final void f() {
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = this.b;
        c2cVarA.e = this.d;
        m45 m45Var = this.a;
        c2cVarA.i = m45Var.e;
        c2cVarA.h = true;
        m45Var.i(c2cVarA.a());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        qsd qsdVarD = this.a.d();
        if (qsdVarD != null) {
            return qsdVarD.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r7) {
        /*
            r6 = this;
            super.onBoundsChange(r7)
            int r0 = r7.width()
            r1 = 0
            if (r0 >= 0) goto Lb
            r0 = r1
        Lb:
            int r2 = r7.height()
            if (r2 >= 0) goto L12
            r2 = r1
        L12:
            int r3 = r6.Y
            if (r0 != 0) goto L1a
            if (r2 != 0) goto L1a
        L18:
            r2 = r3
            goto L51
        L1a:
            if (r0 != 0) goto L1f
            if (r2 >= r3) goto L51
            goto L18
        L1f:
            if (r2 != 0) goto L27
            if (r0 >= r3) goto L24
            r0 = r3
        L24:
            r2 = r3
            r3 = r0
            goto L51
        L27:
            if (r0 >= r2) goto L3e
            if (r0 >= r3) goto L2d
            r4 = r3
            goto L2e
        L2d:
            r4 = r0
        L2e:
            float r5 = (float) r4
            float r0 = (float) r0
            float r5 = r5 / r0
            float r0 = (float) r2
            float r5 = r5 * r0
            int r0 = defpackage.kti.d(r5)
            if (r0 >= r3) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r2 = r3
            r3 = r4
            goto L51
        L3e:
            if (r2 >= r3) goto L42
            r4 = r3
            goto L43
        L42:
            r4 = r2
        L43:
            float r5 = (float) r4
            float r2 = (float) r2
            float r5 = r5 / r2
            float r0 = (float) r0
            float r5 = r5 * r0
            int r0 = defpackage.kti.d(r5)
            if (r0 >= r3) goto L4f
            goto L50
        L4f:
            r3 = r0
        L50:
            r2 = r4
        L51:
            int r0 = r7.left
            if (r0 >= 0) goto L56
            r0 = r1
        L56:
            int r7 = r7.top
            if (r7 >= 0) goto L5b
            goto L5c
        L5b:
            r1 = r7
        L5c:
            m45 r7 = r6.a
            qsd r7 = r7.d()
            if (r7 == 0) goto L69
            int r3 = r3 + r0
            int r2 = r2 + r1
            r7.setBounds(r0, r1, r3, r2)
        L69:
            rf7 r7 = r6.o
            rf7 r0 = r6.X
            r6.c(r7, r0)
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwg.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        qsd qsdVarD = this.a.d();
        if (qsdVarD != null) {
            qsdVarD.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        qsd qsdVarD = this.a.d();
        if (qsdVarD != null) {
            qsdVarD.setColorFilter(colorFilter);
        }
    }

    public nwg(Context context, String str) {
        this(context);
        e(null, str);
    }

    public nwg(Context context, Uri uri, String str) {
        this(context);
        e(uri, str);
    }
}
