package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v89 implements t69 {
    public final ya7 a;
    public final int b;

    public v89(ya7 ya7Var, int i) {
        this.a = ya7Var;
        this.b = i;
    }

    @Override // defpackage.t69
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // defpackage.t69
    public final void c(int i, PendingIntent pendingIntent) {
        this.a.c(i, pendingIntent);
    }

    @Override // defpackage.t69
    public final void d(int i, aie aieVar) {
        this.a.v(i, aieVar.b(), Bundle.EMPTY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.t69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r10, defpackage.b38 r11) {
        /*
            r9 = this;
            java.lang.String r0 = defpackage.b38.j
            java.lang.Object r1 = r11.c
            int r2 = r11.d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = defpackage.b38.g
            int r5 = r11.a
            r3.putInt(r4, r5)
            java.lang.String r4 = defpackage.b38.h
            long r5 = r11.b
            r3.putLong(r4, r5)
            f19 r4 = r11.e
            if (r4 == 0) goto L43
            java.lang.String r5 = defpackage.b38.i
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = defpackage.f19.e
            android.os.Bundle r8 = r4.a
            r6.putBundle(r7, r8)
            java.lang.String r7 = defpackage.f19.f
            boolean r8 = r4.b
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.f19.g
            boolean r8 = r4.c
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.f19.h
            boolean r4 = r4.d
            r6.putBoolean(r7, r4)
            r3.putBundle(r5, r6)
        L43:
            mie r11 = r11.f
            if (r11 == 0) goto L50
            java.lang.String r4 = defpackage.b38.l
            android.os.Bundle r11 = r11.b()
            r3.putBundle(r4, r11)
        L50:
            java.lang.String r11 = defpackage.b38.k
            r3.putInt(r11, r2)
            if (r1 != 0) goto L58
            goto L99
        L58:
            r11 = 1
            if (r2 == r11) goto L9f
            r11 = 2
            r4 = 0
            if (r2 == r11) goto L90
            r11 = 3
            if (r2 == r11) goto L66
            r11 = 4
            if (r2 == r11) goto L9f
            goto L99
        L66:
            iw0 r11 = new iw0
            wg7 r1 = (defpackage.wg7) r1
            tg7 r2 = defpackage.wg7.i()
            r5 = r4
        L6f:
            int r6 = r1.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r1.get(r5)
            k09 r6 = (defpackage.k09) r6
            android.os.Bundle r6 = r6.d(r4)
            r2.a(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            zjd r1 = r2.i()
            r11.<init>(r1)
            r3.putBinder(r0, r11)
            goto L99
        L90:
            k09 r1 = (defpackage.k09) r1
            android.os.Bundle r11 = r1.d(r4)
            r3.putBundle(r0, r11)
        L99:
            ya7 r11 = r9.a
            r11.z(r10, r3)
            return
        L9f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v89.e(int, b38):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != v89.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((v89) obj).a.asBinder());
    }

    @Override // defpackage.t69
    public final void f(int i, o3c o3cVar) {
        this.a.t(i, o3cVar.c());
    }

    @Override // defpackage.t69
    public final void g(int i, yie yieVar) {
        this.a.R(i, yieVar.b());
    }

    @Override // defpackage.t69
    public final void h(int i, q4c q4cVar, o3c o3cVar, boolean z, boolean z2) {
        Bundle bundleO;
        int i2 = this.b;
        hsi.g(i2 != 0);
        boolean z3 = z || !o3cVar.a(17);
        boolean z4 = z2 || !o3cVar.a(30);
        ya7 ya7Var = this.a;
        if (i2 < 2) {
            ya7Var.P(i, q4cVar.l(o3cVar, z, true).o(i2), z3);
            return;
        }
        q4c q4cVarL = q4cVar.l(o3cVar, z, z2);
        if (ya7Var instanceof vy8) {
            bundleO = new Bundle();
            bundleO.putBinder(q4c.l0, new p4c(q4cVarL));
        } else {
            bundleO = q4cVarL.o(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(o4c.d, z3);
        bundle.putBoolean(o4c.e, z4);
        ya7Var.w(i, bundleO, bundle);
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.t69
    public final void i(int i, wie wieVar, boolean z, boolean z2, int i2) {
        this.a.u(i, wieVar.a(z, z2).c(i2));
    }

    @Override // defpackage.t69
    public final void onDisconnected() {
        v9j.b(this.a);
    }
}
