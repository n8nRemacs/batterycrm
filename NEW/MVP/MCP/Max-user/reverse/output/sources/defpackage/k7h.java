package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class k7h {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ContextScope e;
    public final n9a f;
    public final js g;
    public Uri h;
    public x9f i;
    public x9f j;
    public final String k;
    public final jve l;
    public final gbd m;

    public k7h(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = d7j.a(((q2b) ((lzf) k18Var.getValue())).b());
        Symbol symbol = o9a.a;
        this.f = new n9a();
        this.g = new js();
        this.k = k7h.class.getName();
        jve jveVarB = kve.b(1, 0, 6);
        this.l = jveVarB;
        this.m = new gbd(jveVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.k7h r8, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.a7h
            if (r0 == 0) goto L13
            r0 = r9
            a7h r0 = (defpackage.a7h) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            a7h r0 = new a7h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.g8j.b(r9)
            return r2
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            n9a r8 = r0.o
            k7h r1 = r0.d
            defpackage.g8j.b(r9)
            r9 = r8
            r8 = r1
            goto L51
        L3f:
            defpackage.g8j.b(r9)
            n9a r9 = r8.f
            r0.d = r8
            r0.o = r9
            r0.Z = r4
            java.lang.Object r1 = r9.e(r5, r0)
            if (r1 != r6) goto L51
            goto L8e
        L51:
            js r1 = r8.g     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L5e
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5e
            goto L73
        L5c:
            r8 = move-exception
            goto L90
        L5e:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5c
        L62:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L73
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L5c
            y6h r7 = (defpackage.y6h) r7     // Catch: java.lang.Throwable -> L5c
            boolean r7 = r7.b     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L62
            r4 = 0
        L73:
            r9.g(r5)
            if (r4 == 0) goto L79
            goto L8f
        L79:
            gbd r9 = r8.m
            uxb r1 = new uxb
            r4 = 28
            r1.<init>(r9, r8, r4)
            r0.d = r5
            r0.o = r5
            r0.Z = r3
            java.lang.Object r8 = defpackage.gw0.p(r1, r0)
            if (r8 != r6) goto L8f
        L8e:
            return r6
        L8f:
            return r2
        L90:
            r9.g(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7h.a(k7h, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.k7h r5, defpackage.o98 r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.f7h
            if (r0 == 0) goto L13
            r0 = r7
            f7h r0 = (defpackage.f7h) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            f7h r0 = new f7h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Z
            int r1 = r0.t0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            n9a r5 = r0.Y
            java.lang.String r6 = r0.X
            java.io.Serializable r1 = r0.o
            k7h r0 = r0.d
            defpackage.g8j.b(r7)
            r7 = r5
            r5 = r0
            goto L77
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            defpackage.g8j.b(r7)
            java.io.Serializable r7 = r5.d(r6, r3, r2)
            java.lang.Throwable r1 = defpackage.kpd.a(r7)
            if (r1 != 0) goto L47
            r1 = r7
            goto L5a
        L47:
            r7 = 0
            java.io.Serializable r6 = r5.d(r6, r3, r7)     // Catch: java.lang.Throwable -> L52
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            r6 = move-exception
            ipd r7 = new ipd
            r7.<init>(r6)
            r6 = r7
        L59:
            r1 = r6
        L5a:
            boolean r6 = r1 instanceof defpackage.ipd
            if (r6 != 0) goto L86
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            n9a r7 = r5.f
            r0.d = r5
            r0.o = r1
            r0.X = r6
            r0.Y = r7
            r0.t0 = r2
            java.lang.Object r0 = r7.e(r3, r0)
            g84 r4 = defpackage.g84.a
            if (r0 != r4) goto L77
            goto L8d
        L77:
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L81
            r5.h = r6     // Catch: java.lang.Throwable -> L81
            r7.g(r3)
            goto L86
        L81:
            r5 = move-exception
            r7.g(r3)
            throw r5
        L86:
            boolean r5 = r1 instanceof defpackage.ipd
            r5 = r5 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7h.b(k7h, o98, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(defpackage.q44 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.c7h
            if (r0 == 0) goto L13
            r0 = r7
            c7h r0 = (defpackage.c7h) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            c7h r0 = new c7h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            n9a r1 = r0.o
            k7h r0 = r0.d
            defpackage.g8j.b(r7)
            goto L47
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.g8j.b(r7)
            r0.d = r6
            n9a r1 = r6.f
            r0.o = r1
            r0.Z = r2
            java.lang.Object r7 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L46
            return r0
        L46:
            r0 = r6
        L47:
            o98 r7 = defpackage.ve3.d()     // Catch: java.lang.Throwable -> L53
            android.net.Uri r2 = r0.h     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L55
            r7.add(r2)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r7 = move-exception
            goto L85
        L55:
            js r0 = r0.g     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L60:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L53
            y6h r4 = (defpackage.y6h) r4     // Catch: java.lang.Throwable -> L53
            boolean r5 = r4.b     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L73
            android.net.Uri r4 = r4.a     // Catch: java.lang.Throwable -> L53
            goto L74
        L73:
            r4 = r3
        L74:
            if (r4 == 0) goto L60
            r2.add(r4)     // Catch: java.lang.Throwable -> L53
            goto L60
        L7a:
            r7.addAll(r2)     // Catch: java.lang.Throwable -> L53
            o98 r7 = defpackage.ve3.a(r7)     // Catch: java.lang.Throwable -> L53
            r1.g(r3)
            return r7
        L85:
            r1.g(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7h.c(q44):java.io.Serializable");
    }

    public final Serializable d(List list, File file, boolean z) {
        Serializable ipdVar;
        if (file == null) {
            file = ((iz5) ((qx5) this.c.getValue())).l(String.valueOf(System.currentTimeMillis()));
        }
        try {
            ha9 ha9Var = new ha9((Context) this.b.getValue());
            ha9Var.c = file.getPath();
            ha9Var.i = true;
            ha9Var.j = z;
            gu5 gu5Var = (gu5) ((rt5) this.d.getValue());
            ha9Var.r = ((Boolean) gu5Var.B.D(gu5Var, gu5.S[15])).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ha9Var.b.add((Uri) it.next());
            }
            ipdVar = ha9Var.a().w().e.toString();
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            String str = (String) ipdVar;
            String str2 = this.k;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str2, wy1.h("mergeFiles success: ", str), null);
                }
            }
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(this.k, "mergeFiles failed, enableFastTransform: " + z, thA);
        }
        return ipdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r11, defpackage.q44 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.e7h
            if (r0 == 0) goto L13
            r0 = r12
            e7h r0 = (defpackage.e7h) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            e7h r0 = new e7h
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.Y
            int r1 = r0.s0
            qqg r2 = defpackage.qqg.a
            r3 = 2
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L41
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.g8j.b(r12)
            return r2
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            n9a r11 = r0.X
            android.net.Uri r1 = r0.o
            k7h r7 = r0.d
            defpackage.g8j.b(r12)
            r12 = r11
            r11 = r1
            goto L56
        L41:
            defpackage.g8j.b(r12)
            r0.d = r10
            r0.o = r11
            n9a r12 = r10.f
            r0.X = r12
            r0.s0 = r4
            java.lang.Object r1 = r12.e(r5, r0)
            if (r1 != r6) goto L55
            goto La3
        L55:
            r7 = r10
        L56:
            js r1 = r7.g     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L72
        L5c:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L74
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L72
            r9 = r8
            y6h r9 = (defpackage.y6h) r9     // Catch: java.lang.Throwable -> L72
            android.net.Uri r9 = r9.a     // Catch: java.lang.Throwable -> L72
            boolean r9 = defpackage.fni.a(r9, r11)     // Catch: java.lang.Throwable -> L72
            if (r9 == 0) goto L5c
            goto L75
        L72:
            r11 = move-exception
            goto La5
        L74:
            r8 = r5
        L75:
            y6h r8 = (defpackage.y6h) r8     // Catch: java.lang.Throwable -> L72
            android.net.Uri r1 = r7.h     // Catch: java.lang.Throwable -> L72
            boolean r11 = defpackage.fni.a(r11, r1)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L89
            js r11 = r7.g     // Catch: java.lang.Throwable -> L72
            java.util.Collection r11 = defpackage.uog.a(r11)     // Catch: java.lang.Throwable -> L72
            r11.remove(r8)     // Catch: java.lang.Throwable -> L72
            goto L8d
        L89:
            if (r8 == 0) goto L8d
            r8.b = r4     // Catch: java.lang.Throwable -> L72
        L8d:
            r12.g(r5)
            jve r11 = r7.l
            r11.h(r2)
            r0.d = r5
            r0.o = r5
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r11 = r7.g(r0)
            if (r11 != r6) goto La4
        La3:
            return r6
        La4:
            return r2
        La5:
            r12.g(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7h.e(android.net.Uri, q44):java.lang.Object");
    }

    public final void f() {
        String str = this.k;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "releaseAll called", null);
            }
        }
        zs0.e(new mwd(new h7h(this.l.i(), null, this)), this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.q44 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.i7h
            if (r0 == 0) goto L13
            r0 = r9
            i7h r0 = (defpackage.i7h) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            i7h r0 = new i7h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            n9a r1 = r0.o
            k7h r0 = r0.d
            defpackage.g8j.b(r9)
            goto L47
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.g8j.b(r9)
            r0.d = r8
            n9a r1 = r8.f
            r0.o = r1
            r0.Z = r2
            java.lang.Object r9 = r1.e(r3, r0)
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L46
            return r0
        L46:
            r0 = r8
        L47:
            x9f r9 = r0.i     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto L52
            boolean r9 = r9.isActive()     // Catch: java.lang.Throwable -> L84
            if (r9 != r2) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            qqg r9 = defpackage.qqg.a
            if (r2 == 0) goto L5b
            r1.g(r3)
            return r9
        L5b:
            js r2 = r0.g     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r5.<init>()     // Catch: java.lang.Throwable -> L84
        L6b:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r6 == 0) goto L86
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L84
            y6h r6 = (defpackage.y6h) r6     // Catch: java.lang.Throwable -> L84
            boolean r7 = r6.b     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L86
            android.net.Uri r7 = r6.a     // Catch: java.lang.Throwable -> L84
            r4.add(r7)     // Catch: java.lang.Throwable -> L84
            r5.add(r6)     // Catch: java.lang.Throwable -> L84
            goto L6b
        L84:
            r9 = move-exception
            goto Lb0
        L86:
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L90
            r1.g(r3)
            return r9
        L90:
            kotlinx.coroutines.internal.ContextScope r2 = r0.e     // Catch: java.lang.Throwable -> L84
            k18 r6 = r0.a     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L84
            lzf r6 = (defpackage.lzf) r6     // Catch: java.lang.Throwable -> L84
            q2b r6 = (defpackage.q2b) r6     // Catch: java.lang.Throwable -> L84
            z74 r6 = r6.b()     // Catch: java.lang.Throwable -> L84
            j7h r7 = new j7h     // Catch: java.lang.Throwable -> L84
            r7.<init>(r0, r4, r5, r3)     // Catch: java.lang.Throwable -> L84
            r4 = 2
            x9f r2 = defpackage.svi.e(r2, r6, r3, r7, r4)     // Catch: java.lang.Throwable -> L84
            r0.i = r2     // Catch: java.lang.Throwable -> L84
            r1.g(r3)
            return r9
        Lb0:
            r1.g(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7h.g(q44):java.lang.Object");
    }
}
