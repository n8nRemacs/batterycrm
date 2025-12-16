package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class wq5 extends fj0 implements pga {
    public final cz4 j;
    public final w7c k;
    public final AtomicBoolean l;
    public final gge m;
    public final Object n;
    public gge o;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wq5(defpackage.uda r8, defpackage.c9f r9, defpackage.qs3 r10, defpackage.cz4 r11, defpackage.w7c r12) {
        /*
            r7 = this;
            nr3 r0 = new nr3
            z7c r1 = r8.b
            z7c r2 = r8.b
            j98 r3 = r8.d
            pe8 r1 = r1.a
            java.lang.String r1 = r1.I()
            r4 = 0
            if (r1 == 0) goto L1b
            int r5 = r1.length()
            if (r5 <= 0) goto L18
            goto L19
        L18:
            r1 = r4
        L19:
            if (r1 != 0) goto L20
        L1b:
            r3.getClass()
            java.lang.String r1 = "api.oneme.ru"
        L20:
            pe8 r5 = r2.a
            java.lang.String r5 = r5.J()
            if (r5 == 0) goto L31
            int r6 = r5.length()
            if (r6 <= 0) goto L2f
            r4 = r5
        L2f:
            if (r4 != 0) goto L36
        L31:
            r3.getClass()
            java.lang.String r4 = "443"
        L36:
            pe8 r2 = r2.a
            boolean r2 = r2.L()
            r0.<init>(r1, r4, r2)
            r7.<init>(r8, r0, r9, r10)
            r7.j = r11
            r7.k = r12
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>()
            r7.l = r9
            gge r9 = new gge
            r9.<init>(r8)
            r7.m = r9
            java.lang.Object r8 = new java.lang.Object
            r8.<init>()
            r7.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq5.<init>(uda, c9f, qs3, cz4, w7c):void");
    }

    @Override // defpackage.cb3
    public final void close() {
    }

    @Override // defpackage.fj0, defpackage.cb3
    public final Socket connect() throws IOException {
        throw new IOException("Not implemented");
    }

    @Override // defpackage.cb3
    public final int d() {
        return this.f.b();
    }

    @Override // defpackage.cb3
    public final void g(boolean z) {
        this.l.set(z);
    }

    @Override // defpackage.cb3
    public final String i() {
        return this.f.a;
    }

    @Override // defpackage.cb3
    public final int j() {
        return 15000;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    @Override // defpackage.fj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.Socket n(javax.net.SocketFactory r23, java.lang.String r24, int r25) throws java.net.SocketException, java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq5.n(javax.net.SocketFactory, java.lang.String, int):java.net.Socket");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:10:0x001a, B:12:0x001f, B:14:0x002d, B:16:0x0033, B:22:0x003f, B:30:0x0062, B:33:0x0067, B:34:0x006e, B:25:0x0046, B:27:0x004e, B:35:0x006f, B:37:0x0073, B:38:0x0076, B:40:0x007c, B:46:0x00aa, B:43:0x0091, B:45:0x0099, B:55:0x00bd, B:56:0x00bf, B:39:0x0078, B:53:0x00b7, B:54:0x00bc), top: B:59:0x001a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gge r() {
        /*
            r9 = this;
            java.lang.String r0 = "has already connected "
            java.lang.String r1 = "FastClient"
            l6b r2 = defpackage.wqi.a
            r3 = 0
            if (r2 != 0) goto La
            goto L17
        La:
            lg8 r4 = defpackage.lg8.d
            boolean r5 = r2.b(r4)
            if (r5 == 0) goto L17
            java.lang.String r5 = "createConnection"
            r2.c(r4, r1, r5, r3)
        L17:
            java.lang.Object r1 = r9.n
            monitor-enter(r1)
            gge r2 = r9.o     // Catch: java.lang.Throwable -> L60
            r4 = 0
            if (r2 == 0) goto L6f
            java.lang.Object r5 = r2.b     // Catch: java.lang.Throwable -> L60
            java.net.Socket r5 = (java.net.Socket) r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r2 = r2.c     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2     // Catch: java.lang.Throwable -> L60
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L3c
            boolean r2 = r5.isClosed()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L3c
            boolean r2 = r5.isConnected()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L3a
            goto L3c
        L3a:
            r2 = r4
            goto L3d
        L3c:
            r2 = 1
        L3d:
            if (r2 != 0) goto L6f
            java.lang.String r2 = "FastClient"
            l6b r4 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L46
            goto L62
        L46:
            lg8 r5 = defpackage.lg8.c     // Catch: java.lang.Throwable -> L60
            boolean r6 = r4.b(r5)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L62
            gge r6 = r9.o     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r7.append(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L60
            r4.c(r5, r2, r0, r3)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r0 = move-exception
            goto Lc0
        L62:
            gge r0 = r9.o     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L67
            goto Lb2
        L67:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r2     // Catch: java.lang.Throwable -> L60
        L6f:
            gge r0 = r9.o     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L76
            r0.close()     // Catch: java.lang.Throwable -> L60
        L76:
            r9.o = r3     // Catch: java.lang.Throwable -> L60
            java.net.Socket r0 = super.connect()     // Catch: java.lang.Throwable -> Lb4 java.lang.Exception -> Lb6
            r9.d = r3     // Catch: java.lang.Throwable -> L60
            gge r2 = r9.m     // Catch: java.lang.Throwable -> L60
            r2.g()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r2.o     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5     // Catch: java.lang.Throwable -> L60
            r5.set(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "ConnectionBackoff"
            l6b r5 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L91
            goto Laa
        L91:
            lg8 r6 = defpackage.lg8.c     // Catch: java.lang.Throwable -> L60
            boolean r7 = r5.b(r6)     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto Laa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "onConnectionSuccessful, "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L60
            r7.append(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L60
            r5.c(r6, r4, r2, r3)     // Catch: java.lang.Throwable -> L60
        Laa:
            gge r2 = new gge     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r9.o = r2     // Catch: java.lang.Throwable -> L60
            r0 = r2
        Lb2:
            monitor-exit(r1)
            return r0
        Lb4:
            r0 = move-exception
            goto Lbd
        Lb6:
            r0 = move-exception
            gge r2 = r9.m     // Catch: java.lang.Throwable -> Lb4
            r2.i(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        Lbd:
            r9.d = r3     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        Lc0:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq5.r():gge");
    }
}
