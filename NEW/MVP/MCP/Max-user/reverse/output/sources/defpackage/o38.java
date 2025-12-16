package defpackage;

/* loaded from: classes.dex */
public final class o38 extends w12 {
    public j48 H;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.w12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n38 q() {
        /*
            r7 = this;
            j48 r0 = r7.H
            java.lang.String r1 = "CamLifecycleController"
            r2 = 0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "Lifecycle is not set."
            android.util.Log.d(r1, r0)
            return r2
        Ld:
            x9c r0 = r7.q
            if (r0 != 0) goto L17
            java.lang.String r0 = "CameraProvider is not ready."
            android.util.Log.d(r1, r0)
            return r2
        L17:
            boolean r0 = r7.j()
            java.lang.String r1 = "CameraController"
            if (r0 != 0) goto L27
            java.lang.String r0 = "Camera not initialized."
            defpackage.gri.a(r1, r0)
        L24:
            r0 = r2
            goto Lb0
        L27:
            q8c r0 = r7.s
            if (r0 == 0) goto La9
            chh r0 = r7.r
            if (r0 == 0) goto La9
            bxg r0 = new bxg
            r0.<init>()
            r8c r1 = r7.c
            r0.a(r1)
            defpackage.jei.b()
            int r1 = r7.b
            r3 = 1
            r1 = r1 & r3
            r4 = 0
            if (r1 == 0) goto L49
            ee7 r1 = r7.e
            r0.a(r1)
            goto L54
        L49:
            x9c r1 = r7.q
            ee7 r5 = r7.e
            uwg[] r6 = new defpackage.uwg[r3]
            r6[r4] = r5
            r1.a(r6)
        L54:
            defpackage.jei.b()
            int r1 = r7.b
            r1 = r1 & 2
            if (r1 == 0) goto L63
            dd7 r1 = r7.h
            r0.a(r1)
            goto L6e
        L63:
            x9c r1 = r7.q
            dd7 r5 = r7.h
            uwg[] r6 = new defpackage.uwg[r3]
            r6[r4] = r5
            r1.a(r6)
        L6e:
            defpackage.jei.b()
            int r1 = r7.b
            r1 = r1 & 4
            if (r1 == 0) goto L7d
            s1h r1 = r7.i
            r0.a(r1)
            goto L88
        L7d:
            x9c r1 = r7.q
            s1h r5 = r7.i
            uwg[] r3 = new defpackage.uwg[r3]
            r3[r4] = r5
            r1.a(r3)
        L88:
            chh r1 = r7.r
            r0.a = r1
            java.util.HashSet r1 = r7.D
            java.util.Iterator r1 = r1.iterator()
        L92:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r1.next()
            j5h r3 = (defpackage.j5h) r3
            java.util.ArrayList r4 = r0.c
            r4.add(r3)
            goto L92
        La4:
            u5i r0 = r0.b()
            goto Lb0
        La9:
            java.lang.String r0 = "PreviewView not attached to CameraController."
            defpackage.gri.a(r1, r0)
            goto L24
        Lb0:
            if (r0 != 0) goto Lb3
            return r2
        Lb3:
            x9c r1 = r7.q     // Catch: java.lang.IllegalArgumentException -> Lc0
            j48 r2 = r7.H     // Catch: java.lang.IllegalArgumentException -> Lc0
            f32 r3 = r7.a     // Catch: java.lang.IllegalArgumentException -> Lc0
            w9c r1 = r1.a     // Catch: java.lang.IllegalArgumentException -> Lc0
            n38 r0 = r1.c(r2, r3, r0)     // Catch: java.lang.IllegalArgumentException -> Lc0
            return r0
        Lc0:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o38.q():n38");
    }

    public final void w() {
        jei.b();
        this.H = null;
        this.p = null;
        x9c x9cVar = this.q;
        if (x9cVar != null) {
            x9cVar.a.f();
        }
    }
}
