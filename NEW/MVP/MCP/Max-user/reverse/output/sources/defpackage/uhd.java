package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class uhd {
    public s6b a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(mid midVar) {
        int i = midVar.t0;
        if (!midVar.o() && (i & 4) == 0) {
            midVar.f();
        }
    }

    public abstract boolean a(mid midVar, mid midVar2, kt ktVar, kt ktVar2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.mid r10) {
        /*
            r9 = this;
            s6b r0 = r9.a
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r0.a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1 = 1
            r10.w(r1)
            android.view.View r2 = r10.a
            mid r3 = r10.Z
            r4 = 0
            if (r3 == 0) goto L19
            mid r3 = r10.s0
            if (r3 != 0) goto L19
            r10.Z = r4
        L19:
            r10.s0 = r4
            int r3 = r10.t0
            r3 = r3 & 16
            if (r3 == 0) goto L23
            goto Lbb
        L23:
            r0.C0()
            ggg r3 = r0.s0
            java.lang.Object r4 = r3.o
            v32 r4 = (defpackage.v32) r4
            java.lang.Object r5 = r3.d
            x6i r5 = (defpackage.x6i) r5
            int r6 = r3.b
            r7 = 0
            if (r6 != r1) goto L45
            java.lang.Object r1 = r3.c
            android.view.View r1 = (android.view.View) r1
            if (r1 != r2) goto L3d
        L3b:
            r1 = r7
            goto L70
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L45:
            r8 = 2
            if (r6 == r8) goto Lb3
            r3.b = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.b     // Catch: java.lang.Throwable -> L5b
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r6.indexOfChild(r2)     // Catch: java.lang.Throwable -> L5b
            r8 = -1
            if (r6 != r8) goto L5d
            r3.g0(r2)     // Catch: java.lang.Throwable -> L5b
        L58:
            r3.b = r7
            goto L70
        L5b:
            r10 = move-exception
            goto Lb0
        L5d:
            boolean r8 = r4.W(r6)     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L6d
            r4.d0(r6)     // Catch: java.lang.Throwable -> L5b
            r3.g0(r2)     // Catch: java.lang.Throwable -> L5b
            r5.w(r6)     // Catch: java.lang.Throwable -> L5b
            goto L58
        L6d:
            r3.b = r7
            goto L3b
        L70:
            if (r1 == 0) goto L9f
            mid r3 = androidx.recyclerview.widget.RecyclerView.U(r2)
            did r4 = r0.c
            r4.l(r3)
            did r4 = r0.c
            r4.i(r3)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.L1
            if (r3 == 0) goto L9f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RecyclerView"
            android.util.Log.d(r4, r3)
        L9f:
            r3 = r1 ^ 1
            r0.D0(r3)
            if (r1 != 0) goto Lbb
            boolean r10 = r10.s()
            if (r10 == 0) goto Lbb
            r0.removeDetachedView(r2, r7)
            return
        Lb0:
            r3.b = r7
            throw r10
        Lb3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhd.c(mid):void");
    }

    public abstract void d(mid midVar);

    public abstract void e();

    public long f() {
        return this.e;
    }

    public abstract boolean g();
}
