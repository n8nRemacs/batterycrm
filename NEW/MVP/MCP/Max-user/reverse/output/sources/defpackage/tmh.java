package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class tmh {
    public final long a;
    public final long b;
    public final f84 c;
    public final Context d;
    public final hbd e;
    public final lqh f;
    public final String g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final jve k;
    public final gbd l;
    public volatile qv7 m;

    public tmh(long j, long j2, ContextScope contextScope, Context context, hbd hbdVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        StringBuilder sbL = az1.l(j, "webapp_biom_s_key_", "_");
        sbL.append(j2);
        lqh lqhVar = new lqh(sbL.toString(), true);
        this.a = j;
        this.b = j2;
        this.c = contextScope;
        this.d = context;
        this.e = hbdVar;
        this.f = lqhVar;
        this.g = tmh.class.getName();
        this.h = k18Var;
        this.i = k18Var2;
        this.j = k18Var3;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.k = jveVarB;
        this.l = new gbd(jveVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.tmh r6, defpackage.lo0 r7, defpackage.q44 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.dmh
            if (r0 == 0) goto L13
            r0 = r8
            dmh r0 = (defpackage.dmh) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            dmh r0 = new dmh
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            lo0 r7 = r0.o
            tmh r6 = r0.d
            defpackage.g8j.b(r8)
            goto L53
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.g8j.b(r8)
            lzf r8 = r6.e()
            q2b r8 = (defpackage.q2b) r8
            z74 r8 = r8.b()
            emh r2 = new emh
            r2.<init>(r6, r3)
            r0.d = r6
            r0.o = r7
            r0.Z = r4
            java.lang.Object r8 = defpackage.svi.i(r8, r2, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            umh r8 = (defpackage.umh) r8
            ro0 r0 = new ro0
            boolean r1 = r6.f()
            boolean r2 = r8.e
            boolean r5 = r8.f
            java.lang.String r8 = r8.d
            if (r8 == 0) goto L6c
            int r8 = r8.length()
            if (r8 != 0) goto L6a
            goto L6c
        L6a:
            r8 = 0
            goto L6d
        L6c:
            r8 = r4
        L6d:
            r8 = r8 ^ r4
            r0.<init>(r1, r2, r5, r8)
            r7.a(r0)
            r6.m = r3
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.a(tmh, lo0, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.tmh r8, defpackage.mo0 r9, defpackage.go0 r10, defpackage.q44 r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.gmh
            if (r0 == 0) goto L13
            r0 = r11
            gmh r0 = (defpackage.gmh) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            gmh r0 = new gmh
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.Y
            int r1 = r0.s0
            r2 = 2
            qqg r3 = defpackage.qqg.a
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2d
            defpackage.g8j.b(r11)
            return r3
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            go0 r10 = r0.X
            mo0 r9 = r0.o
            tmh r8 = r0.d
            defpackage.g8j.b(r11)
            goto L60
        L3f:
            defpackage.g8j.b(r11)
            lzf r11 = r8.e()
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.b()
            hmh r1 = new hmh
            r1.<init>(r8, r5)
            r0.d = r8
            r0.o = r9
            r0.X = r10
            r0.s0 = r4
            java.lang.Object r11 = defpackage.svi.i(r11, r1, r0)
            if (r11 != r6) goto L60
            goto La4
        L60:
            umh r11 = (defpackage.umh) r11
            if (r11 == 0) goto L67
            java.lang.String r1 = r11.d
            goto L68
        L67:
            r1 = r5
        L68:
            if (r11 == 0) goto Lb4
            if (r1 == 0) goto Lb4
            int r11 = r1.length()
            if (r11 != 0) goto L73
            goto Lb4
        L73:
            int r11 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r11 >= r7) goto L81
            if (r10 == 0) goto L7e
            javax.crypto.Cipher r11 = r10.b
            goto L7f
        L7e:
            r11 = r5
        L7f:
            if (r11 != 0) goto La6
        L81:
            lqh r11 = r8.f
            if (r10 == 0) goto L88
            javax.crypto.Cipher r7 = r10.b
            goto L89
        L88:
            r7 = r5
        L89:
            boolean r11 = r11.a(r4, r1, r7)
            if (r11 != 0) goto La6
            java.lang.String r10 = r8.g
            java.lang.String r11 = "Fail check key when we try auth. Clear token and send token not found."
            defpackage.wqi.r(r10, r11)
            r0.d = r5
            r0.o = r5
            r0.X = r5
            r0.s0 = r2
            java.lang.Object r8 = r8.d(r9, r0)
            if (r8 != r6) goto La5
        La4:
            return r6
        La5:
            return r3
        La6:
            lqh r8 = r8.f
            if (r10 == 0) goto Lac
            javax.crypto.Cipher r5 = r10.b
        Lac:
            java.lang.String r8 = r8.d(r1, r5)
            r9.a(r8)
            return r3
        Lb4:
            anh r8 = new anh
            r8.<init>()
            r9.b(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.b(tmh, mo0, go0, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.tmh r7, defpackage.po0 r8, defpackage.go0 r9, defpackage.q44 r10) throws java.lang.Throwable {
        /*
            lqh r0 = r7.f
            boolean r1 = r10 instanceof defpackage.rmh
            if (r1 == 0) goto L15
            r1 = r10
            rmh r1 = (defpackage.rmh) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            rmh r1 = new rmh
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.o
            int r2 = r1.Y
            qqg r3 = defpackage.qqg.a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            po0 r8 = r1.d
            defpackage.g8j.b(r10)
            goto L78
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.g8j.b(r10)
            java.lang.String r10 = r8.d
            if (r10 != 0) goto L3b
            return r3
        L3b:
            r2 = 0
            if (r9 == 0) goto L41
            javax.crypto.Cipher r5 = r9.b
            goto L42
        L41:
            r5 = r2
        L42:
            if (r5 != 0) goto L52
            r5 = 6
            boolean r5 = defpackage.lqh.b(r0, r5)
            if (r5 != 0) goto L52
            java.lang.String r5 = r7.g
            java.lang.String r6 = "Fail check key when we try update token after biometry."
            defpackage.wqi.r(r5, r6)
        L52:
            if (r9 == 0) goto L57
            javax.crypto.Cipher r9 = r9.b
            goto L58
        L57:
            r9 = r2
        L58:
            java.lang.String r9 = r0.e(r10, r9)
            lzf r10 = r7.e()
            q2b r10 = (defpackage.q2b) r10
            z74 r10 = r10.b()
            smh r0 = new smh
            r0.<init>(r7, r9, r2)
            r1.d = r8
            r1.Y = r4
            java.lang.Object r7 = defpackage.svi.i(r10, r0, r1)
            g84 r9 = defpackage.g84.a
            if (r7 != r9) goto L78
            return r9
        L78:
            r8.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.c(tmh, po0, go0, q44):java.lang.Object");
    }

    public static String g(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.length() > 128 ? vmf.Z(128, str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.qv7 r5, defpackage.q44 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wlh
            if (r0 == 0) goto L13
            r0 = r6
            wlh r0 = (defpackage.wlh) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wlh r0 = new wlh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            qv7 r5 = r0.d
            defpackage.g8j.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r6)
            lzf r6 = r4.e()
            q2b r6 = (defpackage.q2b) r6
            z74 r6 = r6.b()
            xlh r1 = new xlh
            r3 = 0
            r1.<init>(r4, r3)
            r0.d = r5
            r0.Y = r2
            java.lang.Object r6 = defpackage.svi.i(r6, r1, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L4f
            return r0
        L4f:
            anh r6 = new anh
            r6.<init>()
            r5.b(r6)
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.d(qv7, q44):java.lang.Object");
    }

    public final lzf e() {
        return (lzf) this.i.getValue();
    }

    public final boolean f() {
        Object ipdVar;
        try {
            int iE = new jdc(new ukd(this.d)).e(15);
            String str = this.g;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "Biometry status: " + iE, null);
                }
            }
            ipdVar = Boolean.valueOf(iE == 0);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj = Boolean.FALSE;
        if (ipdVar instanceof ipd) {
            ipdVar = obj;
        }
        return ((Boolean) ipdVar).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if (r12 == r8) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.qo0 r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.h(qo0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.oo0 r11, defpackage.q44 r12) throws java.lang.Throwable {
        /*
            r10 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r12 instanceof defpackage.jmh
            if (r1 == 0) goto L15
            r1 = r12
            jmh r1 = (defpackage.jmh) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            jmh r1 = new jmh
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L35
            if (r3 != r4) goto L2d
            defpackage.g8j.b(r12)
            return r0
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            oo0 r11 = r1.o
            tmh r3 = r1.d
            defpackage.g8j.b(r12)
            goto L6c
        L3d:
            defpackage.g8j.b(r12)
            boolean r12 = r10.f()
            if (r12 != 0) goto L4f
            xmh r12 = new xmh
            r12.<init>(r6)
            r11.b(r12)
            return r0
        L4f:
            lzf r12 = r10.e()
            q2b r12 = (defpackage.q2b) r12
            z74 r12 = r12.b()
            kmh r3 = new kmh
            r3.<init>(r10, r5)
            r1.d = r10
            r1.o = r11
            r1.Z = r6
            java.lang.Object r12 = defpackage.svi.i(r12, r3, r1)
            if (r12 != r2) goto L6b
            goto Ld7
        L6b:
            r3 = r10
        L6c:
            umh r12 = (defpackage.umh) r12
            if (r12 != 0) goto L79
            xmh r12 = new xmh
            r12.<init>(r6)
            r11.b(r12)
            return r0
        L79:
            boolean r7 = r12.e
            if (r7 == 0) goto L8c
            boolean r12 = r12.f
            if (r12 == 0) goto L8c
            ymh r12 = new ymh
            jnh r1 = defpackage.jnh.Z
            r12.<init>(r1)
            r11.b(r12)
            return r0
        L8c:
            qv7 r12 = r3.m
            if (r12 == 0) goto L98
            d1 r7 = new d1
            r7.<init>()
            r12.b(r7)
        L98:
            r3.m = r11
            int r11 = defpackage.igb.a
            n5g r12 = new n5g
            r12.<init>(r11)
            pq3 r11 = new pq3
            int r7 = defpackage.mvd.f0
            n5g r8 = new n5g
            r8.<init>(r7)
            r7 = 3
            r9 = 32
            r11.<init>(r6, r8, r7, r9)
            pq3 r6 = new pq3
            int r7 = defpackage.igb.c
            n5g r8 = new n5g
            r8.<init>(r7)
            r6.<init>(r4, r8, r4, r9)
            pq3[] r11 = new defpackage.pq3[]{r11, r6}
            java.util.List r11 = defpackage.ve3.j(r11)
            jve r3 = r3.k
            ulh r6 = new ulh
            r6.<init>(r12, r11)
            r1.d = r5
            r1.o = r5
            r1.Z = r4
            java.lang.Object r11 = r3.a(r6, r1)
            if (r11 != r2) goto Ld8
        Ld7:
            return r2
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.i(oo0, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.lo0 r12, defpackage.q44 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.j(lo0, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, tmh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.mo0 r12, defpackage.q44 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.k(mo0, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        if (defpackage.svi.i(r11, r3, r1) == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.po0 r10, defpackage.q44 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmh.l(po0, q44):java.lang.Object");
    }
}
