package defpackage;

/* loaded from: classes.dex */
public final class lv1 implements upc {
    public final /* synthetic */ qv1 a;

    public lv1(qv1 qv1Var) {
        this.a = qv1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // defpackage.upc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            qv1 r0 = r10.a
            vpc r1 = r0.j
            nnb r2 = r0.d
            r3 = r2
            dob r3 = (defpackage.dob) r3
            tcf r3 = r3.z0
            java.lang.Object r3 = r3.getValue()
            onb r3 = (defpackage.onb) r3
            cnb r3 = r3.a
            v21 r4 = r0.b
            w21 r4 = (defpackage.w21) r4
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r4 = r4.b()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r4 = r4.getDeviceType()
            java.lang.String r4 = r4.name()
            java.lang.String r5 = "speakerphone"
            boolean r4 = defpackage.fni.a(r4, r5)
            g1e r5 = r0.h
            boolean r5 = r5.c()
            tv1 r6 = r0.a
            hw1 r6 = (defpackage.hw1) r6
            mb4 r6 = r6.l()
            boolean r6 = r6.i
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L4e
            dob r2 = (defpackage.dob) r2
            tcf r2 = r2.z0
            java.lang.Object r2 = r2.getValue()
            onb r2 = (defpackage.onb) r2
            boolean r2 = r2.h
            if (r2 == 0) goto L4c
            goto L4e
        L4c:
            r2 = r8
            goto L4f
        L4e:
            r2 = r7
        L4f:
            tcf r6 = r0.f()
            java.lang.Object r6 = r6.getValue()
            e2e r6 = (defpackage.e2e) r6
            f2e r6 = r6.a
            f2e r9 = defpackage.f2e.a
            if (r6 != r9) goto L86
            tcf r0 = r0.f()
            java.lang.Object r0 = r0.getValue()
            e2e r0 = (defpackage.e2e) r0
            t1e r0 = r0.b
            if (r0 == 0) goto L70
            zi1 r0 = r0.c
            goto L71
        L70:
            r0 = 0
        L71:
            bj1 r6 = r3.a
            zi1 r6 = r6.getId()
            boolean r0 = defpackage.fni.a(r0, r6)
            if (r0 != 0) goto L87
            bj1 r0 = r3.a
            boolean r0 = r0.m()
            if (r0 == 0) goto L86
            goto L87
        L86:
            r7 = r8
        L87:
            if (r2 != 0) goto Laa
            if (r4 != 0) goto Laa
            if (r5 != 0) goto Laa
            if (r7 == 0) goto L90
            goto Laa
        L90:
            r1.getClass()
            android.os.PowerManager$WakeLock r0 = r1.f     // Catch: java.lang.Exception -> L9b
            if (r0 == 0) goto L9d
            r0.acquire()     // Catch: java.lang.Exception -> L9b
            return
        L9b:
            r0 = move-exception
            goto L9e
        L9d:
            return
        L9e:
            java.lang.String r1 = r0.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = "ProximityHelperTag"
            defpackage.wqi.g(r3, r0, r1, r2)
            return
        Laa:
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv1.a():void");
    }

    @Override // defpackage.upc
    public final void b() {
        this.a.j.c();
    }
}
