package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final class ks1 {
    public final qv1 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final jve f;
    public final gbd g;

    public ks1(qv1 qv1Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = qv1Var;
        this.b = k18Var3;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var4;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.f = jveVarB;
        this.g = new gbd(jveVarB);
    }

    public final z01 a() {
        return (z01) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k51 b(defpackage.zi1 r19, android.graphics.Point r20) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.b(zi1, android.graphics.Point):k51");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r18, android.os.Bundle r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.c(int, android.os.Bundle, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r12, defpackage.q44 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.is1
            if (r0 == 0) goto L13
            r0 = r14
            is1 r0 = (defpackage.is1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            is1 r0 = new is1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ks1 r12 = r0.d
            defpackage.g8j.b(r14)
            goto L48
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            defpackage.g8j.b(r14)
            k18 r14 = r11.d
            java.lang.Object r14 = r14.getValue()
            w63 r14 = (defpackage.w63) r14
            r0.d = r11
            r0.Y = r2
            java.lang.Object r14 = r14.p(r12, r0)
            g84 r12 = defpackage.g84.a
            if (r14 != r12) goto L47
            return r12
        L47:
            r12 = r11
        L48:
            pb2 r14 = (defpackage.pb2) r14
            long r13 = r14.a
            k18 r0 = r12.c
            qv1 r1 = r12.a
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            yx1 r2 = (defpackage.yx1) r2
            mcf r0 = r1.b()
            tcf r0 = (defpackage.tcf) r0
            java.lang.Object r0 = r0.getValue()
            mb4 r0 = (defpackage.mb4) r0
            java.lang.String r4 = r0.c
            mcf r0 = r1.b()
            tcf r0 = (defpackage.tcf) r0
            java.lang.Object r0 = r0.getValue()
            mb4 r0 = (defpackage.mb4) r0
            boolean r9 = r0.i
            r2.getClass()
            r8 = 0
            r10 = 124(0x7c, float:1.74E-43)
            java.lang.String r3 = "CHAT_OPENED"
            r5 = 0
            r6 = 0
            r7 = 0
            defpackage.yx1.d(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            jve r12 = r12.f
            ug1 r0 = defpackage.ug1.c
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = "&type=local&pop_controllers=true"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            ei4 r14 = new ei4
            r14.<init>(r13)
            r12.h(r14)
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.d(long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.js1
            if (r0 == 0) goto L13
            r0 = r7
            js1 r0 = (defpackage.js1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            js1 r0 = new js1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ks1 r5 = r0.d
            defpackage.g8j.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r7)
            k18 r7 = r4.d
            java.lang.Object r7 = r7.getValue()
            w63 r7 = (defpackage.w63) r7
            r0.d = r4
            r0.Y = r2
            java.lang.Object r7 = r7.p(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L47
            return r5
        L47:
            r5 = r4
        L48:
            pb2 r7 = (defpackage.pb2) r7
            long r6 = r7.a
            jve r5 = r5.f
            ug1 r0 = defpackage.ug1.c
            ei4 r6 = defpackage.ug1.M0(r0, r6)
            r5.h(r6)
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.e(long, q44):java.lang.Object");
    }

    public final void f(zi1 zi1Var) {
        qv1 qv1Var = this.a;
        boolean z = ((mb4) ((tcf) qv1Var.b()).getValue()).e;
        if (!zi1Var.equals(zi1.c) && ((mb4) ((tcf) qv1Var.b()).getValue()).i && z) {
            qv1Var.i(zi1Var, false);
        }
    }

    public final void g(zi1 zi1Var) {
        String name;
        cnb cnbVar = (cnb) ((onb) ((tcf) this.a.e()).getValue()).c.get(zi1Var);
        if (cnbVar == null || (name = cnbVar.b.getName()) == null) {
            return;
        }
        cn1 cn1Var = en1.b;
        this.f.h(new dn1(new p5g(m0b.c1, ys.D(new Object[]{name})), new da1(this, zi1Var, name, 1)));
    }

    public final void h() {
        qv1 qv1Var = this.a;
        yx1 yx1Var = (yx1) qv1Var.n.getValue();
        String str = qv1Var.c().c;
        f41 f41Var = qv1Var.e;
        long j = f41Var.b() ? 2L : 1L;
        boolean z = qv1Var.c().i;
        yx1Var.getClass();
        yx1.d(yx1Var, "CAMERA_CHANGED", str, null, Long.valueOf(j), null, null, z, 116);
        int i = f41Var.b() ? 2 : 1;
        CameraManager cameraManagerA = f41Var.a();
        if (cameraManagerA != null) {
            cameraManagerA.switchCamera(new b32(i));
        }
    }
}
