package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class sng extends xfh {
    public static final /* synthetic */ yy7[] x0 = {new z8a(sng.class, "disableTwoFAJob", "getDisableTwoFAJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, sng.class, "loadDetailsJob", "getLoadDetailsJob()Lkotlinx/coroutines/Job;")};
    public final k18 X;
    public final tcf Y;
    public final hbd Z;
    public final String b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final ci5 s0;
    public final ci5 t0;
    public final AtomicReference u0;
    public final t9f v0;
    public final t9f w0;

    public sng(String str) {
        ykg ykgVar = ykg.a;
        k18 k18VarB = ykgVar.b();
        bwf bwfVarD = ykgVar.getAccessor().d(46);
        k18 k18VarA = ykgVar.a();
        bwf bwfVarD2 = ykgVar.getAccessor().d(110);
        this.b = str;
        this.c = k18VarB;
        this.d = k18VarA;
        this.o = bwfVarD;
        this.X = bwfVarD2;
        tcf tcfVarA = ucf.a(hd5.a);
        this.Y = tcfVarA;
        this.Z = new hbd(tcfVarA);
        this.s0 = new ci5(0);
        this.t0 = new ci5(0);
        this.u0 = new AtomicReference(null);
        this.v0 = c7j.c();
        this.w0 = c7j.c();
        klc klcVar = (klc) bwfVarD2.getValue();
        long jS = ((w4e) ((pb3) bwfVarD.getValue())).s();
        gw0.w(new g56(new hbd((f9a) klcVar.f.computeIfAbsent(Long.valueOf(jS), new ni(26, new k03(klcVar, jS, 2)))), new lng(this, null), 1), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.sng r12, defpackage.o98 r13, defpackage.q44 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.mng
            if (r0 == 0) goto L13
            r0 = r14
            mng r0 = (defpackage.mng) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mng r0 = new mng
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.X
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o98 r13 = r0.o
            sng r12 = r0.d
            defpackage.g8j.b(r14)
            goto L57
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            defpackage.g8j.b(r14)
            k18 r14 = r12.c
            java.lang.Object r14 = r14.getValue()
            lzf r14 = (defpackage.lzf) r14
            q2b r14 = (defpackage.q2b) r14
            z74 r14 = r14.b()
            nng r1 = new nng
            r1.<init>(r12, r3)
            r0.d = r12
            r0.o = r13
            r0.Z = r2
            java.lang.Object r14 = defpackage.svi.i(r14, r1, r0)
            g84 r0 = defpackage.g84.a
            if (r14 != r0) goto L57
            return r0
        L57:
            xac r14 = (defpackage.xac) r14
            java.util.concurrent.atomic.AtomicReference r12 = r12.u0
            java.lang.Object r12 = r12.get()
            d70 r12 = (defpackage.d70) r12
            if (r12 == 0) goto L66
            java.lang.String r12 = r12.c
            goto L67
        L66:
            r12 = r3
        L67:
            java.lang.Object r14 = r14.c
            flc r0 = defpackage.flc.d
            boolean r14 = r14.contains(r0)
            if (r14 == 0) goto L78
            if (r12 == 0) goto L78
            r5g r3 = new r5g
            r3.<init>(r12)
        L78:
            r10 = r3
            dng r12 = new dng
            int r14 = defpackage.mvd.F0
            n5g r0 = new n5g
            r0.<init>(r14)
            r12.<init>(r0)
            r13.add(r12)
            int r12 = defpackage.e0d.oneme_settings_twofa_configuration_setting_password
            long r4 = (long) r12
            int r12 = defpackage.r4d.oneme_settings_twofa_change_password_title
            n5g r2 = new n5g
            r2.<init>(r12)
            eng r0 = new eng
            r6 = 0
            r7 = 112(0x70, float:1.57E-43)
            r1 = 1
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r13.add(r0)
            int r12 = defpackage.e0d.oneme_settings_twofa_configuration_setting_email
            long r8 = (long) r12
            int r12 = defpackage.r4d.oneme_settings_twofa_change_email_title
            n5g r6 = new n5g
            r6.<init>(r12)
            eng r4 = new eng
            r7 = 0
            r11 = 80
            r5 = 3
            r4.<init>(r5, r6, r7, r8, r10, r11)
            r13.add(r4)
            int r12 = defpackage.r4d.oneme_settings_twofa_configuration_description
            n5g r14 = new n5g
            r14.<init>(r12)
            cng r12 = new cng
            r12.<init>(r14)
            r13.add(r12)
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sng.t(sng, o98, q44):java.lang.Object");
    }
}
