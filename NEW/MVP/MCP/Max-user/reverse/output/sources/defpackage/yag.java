package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import java.nio.channels.AsynchronousSocketChannel;
import javax.net.ssl.SSLEngine;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class yag {
    public final SSLEngine a;
    public final AsynchronousByteChannel b;
    public final String c = yag.class.getName();
    public final n9a d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public final yu0 i;
    public final yu0 j;
    public final yu0 k;
    public fua l;
    public int m;
    public final fua n;

    public yag(su0 su0Var, SSLEngine sSLEngine, AsynchronousSocketChannel asynchronousSocketChannel) {
        this.a = sSLEngine;
        this.b = asynchronousSocketChannel;
        Symbol symbol = o9a.a;
        this.d = new n9a();
        this.i = new yu0("inEncrypted", true, su0Var);
        this.j = new yu0("outEncrypted", false, su0Var);
        this.k = new yu0("inPlain", true, su0Var);
        this.n = new fua(new ByteBuffer[]{ByteBuffer.allocate(0)});
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.nio.ByteBuffer r9, defpackage.q44 r10) {
        /*
            r8 = this;
            qqg r0 = defpackage.qqg.a
            java.lang.String r1 = "Read from channel; response: "
            boolean r2 = r10 instanceof defpackage.hag
            if (r2 == 0) goto L17
            r2 = r10
            hag r2 = (defpackage.hag) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s0 = r3
            goto L1c
        L17:
            hag r2 = new hag
            r2.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r2.Y
            g84 r3 = defpackage.g84.a
            int r4 = r2.s0
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            yag r9 = r2.X
            java.nio.ByteBuffer r3 = r2.o
            yag r2 = r2.d
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L60
        L31:
            r9 = move-exception
            goto L8c
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.g8j.b(r10)
            java.lang.String r10 = r8.c     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = "Reading from channel"
            defpackage.wqi.n(r10, r4)     // Catch: java.lang.Throwable -> L8a
            iag r10 = new iag     // Catch: java.lang.Throwable -> L8a
            r4 = 0
            r10.<init>(r8, r9, r4)     // Catch: java.lang.Throwable -> L8a
            r2.d = r8     // Catch: java.lang.Throwable -> L8a
            r2.o = r9     // Catch: java.lang.Throwable -> L8a
            r2.X = r8     // Catch: java.lang.Throwable -> L8a
            r2.s0 = r5     // Catch: java.lang.Throwable -> L8a
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r10 = defpackage.yei.f(r6, r10, r2)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r3) goto L5d
            return r3
        L5d:
            r2 = r8
            r3 = r9
            r9 = r2
        L60:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L31
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = r9.c     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L31
            r4.append(r10)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = ", buffer: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L31
            r4.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L31
            defpackage.wqi.n(r9, r1)     // Catch: java.lang.Throwable -> L31
            r9 = -1
            if (r10 == r9) goto L84
            r10 = r0
            goto L91
        L84:
            fag r9 = new fag     // Catch: java.lang.Throwable -> L31
            r9.<init>()     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            ipd r10 = new ipd
            r10.<init>(r9)
        L91:
            java.lang.Throwable r9 = defpackage.kpd.a(r10)
            if (r9 == 0) goto L99
            r2.f = r5
        L99:
            defpackage.g8j.b(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.a(java.nio.ByteBuffer, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.ByteBuffer r10, defpackage.q44 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.jag
            if (r0 == 0) goto L13
            r0 = r11
            jag r0 = (defpackage.jag) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            jag r0 = new jag
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.nio.ByteBuffer r10 = r0.o
            yag r2 = r0.d
            defpackage.g8j.b(r11)
            goto L37
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.g8j.b(r11)
            r2 = r9
        L37:
            boolean r11 = r10.hasRemaining()
            if (r11 == 0) goto L78
            java.lang.String r11 = r2.c
            l6b r4 = defpackage.wqi.a
            r5 = 0
            if (r4 != 0) goto L45
            goto L63
        L45:
            lg8 r6 = defpackage.lg8.c
            boolean r7 = r4.b(r6)
            if (r7 == 0) goto L63
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "calling channel.write("
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = ")"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r4.c(r6, r11, r7, r5)
        L63:
            kag r11 = new kag
            r11.<init>(r2, r10, r5)
            r0.d = r2
            r0.o = r10
            r0.Z = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r11 = defpackage.yei.f(r4, r11, r0)
            if (r11 != r1) goto L37
            return r1
        L78:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.b(java.nio.ByteBuffer, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fua r10, defpackage.q44 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "engine.unwrap() result="
            boolean r1 = r11 instanceof defpackage.lag
            if (r1 == 0) goto L15
            r1 = r11
            lag r1 = (defpackage.lag) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            lag r1 = new lag
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            fua r10 = r1.o
            yag r1 = r1.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            goto L5d
        L2d:
            r10 = move-exception
            goto Lb3
        L30:
            r10 = move-exception
            goto Lb0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            defpackage.g8j.b(r11)
            yu0 r11 = r9.i
            java.nio.ByteBuffer r11 = r11.e()
            r11.flip()
            dag r11 = new dag     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            r3 = 0
            r11.<init>(r9, r10, r3)     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            r1.d = r9     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            r1.o = r10     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            r1.Z = r4     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            bd5 r3 = defpackage.bd5.a     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            java.lang.Object r11 = defpackage.vmi.i(r3, r11, r1)     // Catch: java.lang.Throwable -> Lac javax.net.ssl.SSLException -> Lae
            if (r11 != r2) goto L5c
            return r2
        L5c:
            r1 = r9
        L5d:
            javax.net.ssl.SSLEngineResult r11 = (javax.net.ssl.SSLEngineResult) r11     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r2 = r1.c     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            l6b r3 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            if (r3 != 0) goto L66
            goto L9e
        L66:
            lg8 r5 = defpackage.lg8.c     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            boolean r6 = r3.b(r5)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            if (r6 == 0) goto L9e
            javax.net.ssl.SSLEngine r6 = r1.a     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r6.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            yu0 r7 = r1.i     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r8.append(r11)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", engineStatus="
            r8.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r8.append(r6)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", inEncrypted="
            r8.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r8.append(r7)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", dest="
            r8.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r8.append(r10)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r0 = 0
            r3.c(r5, r2, r10, r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
        L9e:
            yu0 r10 = r1.i
            java.nio.ByteBuffer r10 = r10.e()
            r10.compact()
            return r11
        La8:
            r1 = r9
            goto Lb3
        Laa:
            r1 = r9
            goto Lb0
        Lac:
            r10 = move-exception
            goto La8
        Lae:
            r10 = move-exception
            goto Laa
        Lb0:
            r1.f = r4     // Catch: java.lang.Throwable -> L2d
            throw r10     // Catch: java.lang.Throwable -> L2d
        Lb3:
            yu0 r11 = r1.i
            java.nio.ByteBuffer r11 = r11.e()
            r11.compact()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.c(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fua r8, defpackage.q44 r9) throws javax.net.ssl.SSLException {
        /*
            r7 = this;
            java.lang.String r0 = "engine.wrap() result: ["
            boolean r1 = r9 instanceof defpackage.mag
            if (r1 == 0) goto L15
            r1 = r9
            mag r1 = (defpackage.mag) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            mag r1 = new mag
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            fua r8 = r1.o
            yag r1 = r1.d
            defpackage.g8j.b(r9)     // Catch: javax.net.ssl.SSLException -> L2d
            goto L50
        L2d:
            r8 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.g8j.b(r9)
            dag r9 = new dag     // Catch: javax.net.ssl.SSLException -> L86
            r3 = 1
            r9.<init>(r7, r8, r3)     // Catch: javax.net.ssl.SSLException -> L86
            r1.d = r7     // Catch: javax.net.ssl.SSLException -> L86
            r1.o = r8     // Catch: javax.net.ssl.SSLException -> L86
            r1.Z = r4     // Catch: javax.net.ssl.SSLException -> L86
            bd5 r3 = defpackage.bd5.a     // Catch: javax.net.ssl.SSLException -> L86
            java.lang.Object r9 = defpackage.vmi.i(r3, r9, r1)     // Catch: javax.net.ssl.SSLException -> L86
            if (r9 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            javax.net.ssl.SSLEngineResult r9 = (javax.net.ssl.SSLEngineResult) r9     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r2 = r1.c     // Catch: javax.net.ssl.SSLException -> L2d
            javax.net.ssl.SSLEngine r3 = r1.a     // Catch: javax.net.ssl.SSLException -> L2d
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r3.getHandshakeStatus()     // Catch: javax.net.ssl.SSLException -> L2d
            yu0 r5 = r1.j     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: javax.net.ssl.SSLException -> L2d
            r6.<init>(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r6.append(r9)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r0 = "]; engine status: "
            r6.append(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r6.append(r3)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r0 = "; srcBuffer: "
            r6.append(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r6.append(r8)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r8 = ", outEncrypted: "
            r6.append(r8)     // Catch: javax.net.ssl.SSLException -> L2d
            r6.append(r5)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r8 = r6.toString()     // Catch: javax.net.ssl.SSLException -> L2d
            defpackage.wqi.n(r2, r8)     // Catch: javax.net.ssl.SSLException -> L2d
            return r9
        L84:
            r1 = r7
            goto L88
        L86:
            r8 = move-exception
            goto L84
        L88:
            r1.f = r4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.d(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [yag] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q44 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.nag
            if (r0 == 0) goto L13
            r0 = r7
            nag r0 = (defpackage.nag) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            nag r0 = new nag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            yag r0 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L85
        L2f:
            r7 = move-exception
            goto La5
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            yag r2 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L79
        L40:
            r7 = move-exception
            r0 = r2
            goto La5
        L43:
            yag r2 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L67
        L49:
            defpackage.g8j.b(r7)
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> L8b
            if (r7 != 0) goto L94
            boolean r7 = r6.f     // Catch: java.lang.Throwable -> L8b
            if (r7 != 0) goto L8e
            r6.g = r5     // Catch: java.lang.Throwable -> L8b
            yu0 r7 = r6.j     // Catch: java.lang.Throwable -> L8b
            r7.c()     // Catch: java.lang.Throwable -> L8b
            r0.d = r6     // Catch: java.lang.Throwable -> L8b
            r0.Y = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r6.p(r0)     // Catch: java.lang.Throwable -> L8b
            if (r7 != r1) goto L66
            goto L83
        L66:
            r2 = r6
        L67:
            javax.net.ssl.SSLEngine r7 = r2.a     // Catch: java.lang.Throwable -> L40
            r7.closeOutbound()     // Catch: java.lang.Throwable -> L40
            fua r7 = r2.n     // Catch: java.lang.Throwable -> L40
            r0.d = r2     // Catch: java.lang.Throwable -> L40
            r0.Y = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r2.m(r7, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L79
            goto L83
        L79:
            r0.d = r2     // Catch: java.lang.Throwable -> L40
            r0.Y = r3     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r2.p(r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            r0 = r2
        L85:
            java.nio.channels.AsynchronousByteChannel r7 = r0.b     // Catch: java.lang.Throwable -> L2f
            r7.close()     // Catch: java.lang.Throwable -> L2f
            goto L95
        L8b:
            r7 = move-exception
            r0 = r6
            goto La5
        L8e:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L8b
            r7.<init>()     // Catch: java.lang.Throwable -> L8b
            throw r7     // Catch: java.lang.Throwable -> L8b
        L94:
            r0 = r6
        L95:
            yu0 r7 = r0.i
            r7.a()
            yu0 r7 = r0.k
            r7.a()
            yu0 r7 = r0.j
            r7.a()
            goto Lad
        La5:
            java.lang.String r1 = r0.c     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = "error doing TLS shutdown on close(), continuing"
            defpackage.wqi.e(r1, r2, r7)     // Catch: java.lang.Throwable -> Lb0
            goto L95
        Lad:
            qqg r7 = defpackage.qqg.a
            return r7
        Lb0:
            r7 = move-exception
            yu0 r1 = r0.i
            r1.a()
            yu0 r1 = r0.k
            r1.a()
            yu0 r0 = r0.j
            r0.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.e(q44):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v7, types: [j9a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.q44 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.f(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r9 == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if (r1.i(r0) == r6) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007e -> B:34:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a9 -> B:21:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b9 -> B:21:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.q44 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.pag
            if (r0 == 0) goto L13
            r0 = r9
            pag r0 = (defpackage.pag) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            pag r0 = new pag
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L4d
            if (r1 == r5) goto L47
            if (r1 == r4) goto L41
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            yag r1 = r0.d
            defpackage.g8j.b(r9)
            goto L81
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            yag r1 = r0.d
            defpackage.g8j.b(r9)
            goto Lb7
        L41:
            yag r1 = r0.d
            defpackage.g8j.b(r9)
            goto L51
        L47:
            yag r1 = r0.d
            defpackage.g8j.b(r9)
            goto La1
        L4d:
            defpackage.g8j.b(r9)
            r1 = r8
        L51:
            javax.net.ssl.SSLEngine r9 = r1.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()
            if (r9 != 0) goto L5b
            r9 = -1
            goto L63
        L5b:
            int[] r7 = defpackage.gag.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r7[r9]
        L63:
            if (r9 == r5) goto Lac
            if (r9 == r4) goto L94
            if (r9 == r3) goto Lbb
            if (r9 == r2) goto L8c
            r7 = 5
            if (r9 != r7) goto L84
            eag r9 = new eag
            r7 = 0
            r9.<init>(r1, r7)
            r0.d = r1
            r0.Y = r2
            bd5 r7 = defpackage.bd5.a
            java.lang.Object r9 = defpackage.vmi.i(r7, r9, r0)
            if (r9 != r6) goto L81
            goto Lb6
        L81:
            qqg r9 = (defpackage.qqg) r9
            goto L51
        L84:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unsupported usage"
            r9.<init>(r0)
            throw r9
        L8c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unreachable status"
            r9.<init>(r0)
            throw r9
        L94:
            fua r9 = r1.n
            r0.d = r1
            r0.Y = r5
            java.lang.Object r9 = r1.m(r9, r0)
            if (r9 != r6) goto La1
            goto Lb6
        La1:
            r0.d = r1
            r0.Y = r4
            java.lang.Object r9 = r1.p(r0)
            if (r9 != r6) goto L51
            goto Lb6
        Lac:
            r0.d = r1
            r0.Y = r3
            java.lang.Object r9 = r1.i(r0)
            if (r9 != r6) goto Lb7
        Lb6:
            return r6
        Lb7:
            int r9 = r1.m
            if (r9 <= 0) goto L51
        Lbb:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.g(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0173, code lost:
    
        if (r13.o(r3) == r4) goto L103;
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x018a: IPUT (r12v0 ?? I:int), (r13 I:yag) yag.m int, block:B:110:0x018a */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x018f: IPUT (r12v0 ?? I:int), (r13 I:yag) yag.m int, block:B:112:0x018f */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179 A[Catch: all -> 0x0040, fag -> 0x0185, Merged into TryCatch #0 {all -> 0x0040, fag -> 0x0185, blocks: (B:15:0x003b, B:92:0x0147, B:104:0x0176, B:62:0x00e4, B:64:0x00e8, B:66:0x00ee, B:71:0x00f8, B:73:0x00ff, B:72:0x00fb, B:76:0x0109, B:86:0x0126, B:89:0x0130, B:93:0x014a, B:96:0x0159, B:98:0x015d, B:101:0x0167, B:79:0x0113, B:105:0x0179, B:106:0x017e, B:109:0x0185, B:22:0x0051, B:25:0x005c, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:54:0x00ce, B:56:0x00d4, B:53:0x00c4, B:107:0x017f, B:108:0x0184), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4 A[Catch: all -> 0x0040, fag -> 0x0185, Merged into TryCatch #0 {all -> 0x0040, fag -> 0x0185, blocks: (B:15:0x003b, B:92:0x0147, B:104:0x0176, B:62:0x00e4, B:64:0x00e8, B:66:0x00ee, B:71:0x00f8, B:73:0x00ff, B:72:0x00fb, B:76:0x0109, B:86:0x0126, B:89:0x0130, B:93:0x014a, B:96:0x0159, B:98:0x015d, B:101:0x0167, B:79:0x0113, B:105:0x0179, B:106:0x017e, B:109:0x0185, B:22:0x0051, B:25:0x005c, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:54:0x00ce, B:56:0x00d4, B:53:0x00c4, B:107:0x017f, B:108:0x0184), top: B:116:0x002b }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d A[Catch: all -> 0x0040, fag -> 0x0185, Merged into TryCatch #0 {all -> 0x0040, fag -> 0x0185, blocks: (B:15:0x003b, B:92:0x0147, B:104:0x0176, B:62:0x00e4, B:64:0x00e8, B:66:0x00ee, B:71:0x00f8, B:73:0x00ff, B:72:0x00fb, B:76:0x0109, B:86:0x0126, B:89:0x0130, B:93:0x014a, B:96:0x0159, B:98:0x015d, B:101:0x0167, B:79:0x0113, B:105:0x0179, B:106:0x017e, B:109:0x0185, B:22:0x0051, B:25:0x005c, B:40:0x00a6, B:42:0x00aa, B:44:0x00ae, B:46:0x00b6, B:54:0x00ce, B:56:0x00d4, B:53:0x00c4, B:107:0x017f, B:108:0x0184), top: B:116:0x002b }, TRY_LEAVE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0173 -> B:104:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0144 -> B:92:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x015b -> B:104:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fua r18, defpackage.q44 r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.h(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:23:0x0048, B:26:0x0053, B:28:0x0061, B:31:0x006d, B:33:0x0075, B:34:0x0078, B:36:0x0080, B:38:0x0084, B:41:0x0089, B:43:0x0095, B:44:0x009a, B:20:0x003b), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:23:0x0048, B:26:0x0053, B:28:0x0061, B:31:0x006d, B:33:0x0075, B:34:0x0078, B:36:0x0080, B:38:0x0084, B:41:0x0089, B:43:0x0095, B:44:0x009a, B:20:0x003b), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, yag] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:23:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.q44 r10) {
        /*
            r9 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r10 instanceof defpackage.rag
            if (r1 == 0) goto L15
            r1 = r10
            rag r1 = (defpackage.rag) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            rag r1 = new rag
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            yag r3 = r1.d
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r10 = move-exception
            goto Lab
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            yag r3 = r1.d
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L53
        L3f:
            defpackage.g8j.b(r10)
            yu0 r10 = r9.i
            r10.c()
            r3 = r9
        L48:
            r1.d = r3     // Catch: java.lang.Throwable -> L2e
            r1.Y = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r3.k(r1)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r2) goto L53
            goto Laa
        L53:
            javax.net.ssl.SSLEngineResult r10 = (javax.net.ssl.SSLEngineResult) r10     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.SSLEngine r6 = r3.a     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r6.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2e
            int r7 = r10.bytesProduced()     // Catch: java.lang.Throwable -> L2e
            if (r7 <= 0) goto L6d
            int r10 = r10.bytesProduced()     // Catch: java.lang.Throwable -> L2e
            r3.m = r10     // Catch: java.lang.Throwable -> L2e
        L67:
            yu0 r10 = r3.i
            r10.d()
            return r0
        L6d:
            javax.net.ssl.SSLEngineResult$Status r7 = r10.getStatus()     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.SSLEngineResult$Status r8 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L2e
            if (r7 != r8) goto L78
            r3.h = r5     // Catch: java.lang.Throwable -> L2e
            goto L67
        L78:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = r10.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2e
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L2e
            if (r10 == r7) goto L67
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L2e
            if (r6 == r10) goto L67
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L2e
            if (r6 != r10) goto L89
            goto L67
        L89:
            yu0 r10 = r3.i     // Catch: java.lang.Throwable -> L2e
            java.nio.ByteBuffer r10 = r10.e()     // Catch: java.lang.Throwable -> L2e
            boolean r10 = r10.hasRemaining()     // Catch: java.lang.Throwable -> L2e
            if (r10 != 0) goto L9a
            yu0 r10 = r3.i     // Catch: java.lang.Throwable -> L2e
            r10.b()     // Catch: java.lang.Throwable -> L2e
        L9a:
            yu0 r10 = r3.i     // Catch: java.lang.Throwable -> L2e
            java.nio.ByteBuffer r10 = r10.e()     // Catch: java.lang.Throwable -> L2e
            r1.d = r3     // Catch: java.lang.Throwable -> L2e
            r1.Y = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r3.a(r10, r1)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r2) goto L48
        Laa:
            return r2
        Lab:
            yu0 r0 = r3.i
            r0.d()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.i(q44):java.lang.Object");
    }

    public final int j(fua fuaVar) {
        yu0 yu0Var = this.k;
        yu0Var.e().flip();
        ByteBuffer byteBufferE = yu0Var.e();
        fuaVar.getClass();
        int i = fuaVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ByteBuffer byteBuffer = ((ByteBuffer[]) fuaVar.d)[i3];
            if (byteBufferE.hasRemaining()) {
                int iMin = Math.min(byteBufferE.remaining(), byteBuffer.remaining());
                if (iMin < 0) {
                    throw new IllegalArgumentException("negative length");
                }
                if (byteBufferE.remaining() < iMin) {
                    throw new IllegalArgumentException(wy1.g("source buffer does not have enough remaining capacity (", byteBufferE.remaining(), " < ", iMin, ")").toString());
                }
                if (byteBuffer.remaining() < iMin) {
                    throw new IllegalArgumentException(wy1.g("destination buffer does not have enough remaining capacity (", byteBuffer.remaining(), " < ", iMin, ")").toString());
                }
                if (iMin != 0) {
                    byteBuffer.put(byteBufferE.array(), byteBufferE.position(), iMin);
                    byteBufferE.position(byteBufferE.position() + iMin);
                }
                i2 += iMin;
            }
        }
        yu0Var.e().compact();
        if (!yu0Var.d() && yu0Var.e != null) {
            yu0Var.f(yu0Var.e().position());
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:21:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.q44 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.sag
            if (r0 == 0) goto L13
            r0 = r11
            sag r0 = (defpackage.sag) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            sag r0 = new sag
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            fua r1 = r0.o
            yag r3 = r0.d
            defpackage.g8j.b(r11)
            goto L59
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            defpackage.g8j.b(r11)
            fua r11 = r10.l
            if (r11 == 0) goto L3b
            r3 = r10
            r1 = r11
            goto L4a
        L3b:
            yu0 r11 = r10.k
            r11.c()
            fua r1 = new fua
            java.nio.ByteBuffer r11 = r11.e()
            r1.<init>(r11)
            r3 = r10
        L4a:
            r0.d = r3
            r0.o = r1
            r0.Z = r2
            java.lang.Object r11 = r3.c(r1, r0)
            g84 r4 = defpackage.g84.a
            if (r11 != r4) goto L59
            return r4
        L59:
            javax.net.ssl.SSLEngineResult r11 = (javax.net.ssl.SSLEngineResult) r11
            javax.net.ssl.SSLEngine r4 = r3.a
            yu0 r5 = r3.k
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r4.getHandshakeStatus()
            int r6 = r11.bytesProduced()
            if (r6 <= 0) goto L6a
            goto Lc2
        L6a:
            javax.net.ssl.SSLEngineResult$Status r6 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r6 != r7) goto L73
            goto Lc2
        L73:
            javax.net.ssl.SSLEngineResult$Status r6 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r6 != r7) goto L7c
            goto Lc2
        L7c:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r11.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r7 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r6 == r7) goto Lc2
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r4 == r6) goto Lc2
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r4 != r6) goto L8d
            goto Lc2
        L8d:
            javax.net.ssl.SSLEngineResult$Status r11 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW
            if (r11 != r4) goto L4a
            fua r11 = r3.l
            boolean r11 = defpackage.fni.a(r1, r11)
            if (r11 == 0) goto Lb5
            r5.c()
            java.nio.ByteBuffer r11 = r5.e()
            int r11 = r11.capacity()
            long r6 = (long) r11
            long r8 = r1.f()
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto Lb8
            r5.b()
            goto Lb8
        Lb5:
            r5.b()
        Lb8:
            fua r1 = new fua
            java.nio.ByteBuffer r11 = r5.e()
            r1.<init>(r11)
            goto L4a
        Lc2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.k(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r14 == r1) goto L42;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00c9: IGET (r14 I:yu0) = (r7 I:yag) yag.j yu0, block:B:49:0x00c9 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00aa, B:45:0x00b4, B:46:0x00bf, B:25:0x005c, B:29:0x006f, B:31:0x0079, B:37:0x008e, B:34:0x0080, B:36:0x0088, B:40:0x0099, B:47:0x00c3, B:48:0x00c8, B:20:0x0046), top: B:51:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00aa, B:45:0x00b4, B:46:0x00bf, B:25:0x005c, B:29:0x006f, B:31:0x0079, B:37:0x008e, B:34:0x0080, B:36:0x0088, B:40:0x0099, B:47:0x00c3, B:48:0x00c8, B:20:0x0046), top: B:51:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00aa, B:45:0x00b4, B:46:0x00bf, B:25:0x005c, B:29:0x006f, B:31:0x0079, B:37:0x008e, B:34:0x0080, B:36:0x0088, B:40:0x0099, B:47:0x00c3, B:48:0x00c8, B:20:0x0046), top: B:51:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00aa, B:45:0x00b4, B:46:0x00bf, B:25:0x005c, B:29:0x006f, B:31:0x0079, B:37:0x008e, B:34:0x0080, B:36:0x0088, B:40:0x0099, B:47:0x00c3, B:48:0x00c8, B:20:0x0046), top: B:51:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [yag] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a7 -> B:43:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fua r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.l(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fua r6, defpackage.q44 r7) throws javax.net.ssl.SSLException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.uag
            if (r0 == 0) goto L13
            r0 = r7
            uag r0 = (defpackage.uag) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            uag r0 = new uag
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            fua r6 = r0.o
            yag r1 = r0.d
            defpackage.g8j.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.g8j.b(r7)
            r1 = r5
        L35:
            r0.d = r1
            r0.o = r6
            r0.Z = r2
            java.lang.Object r7 = r1.d(r6, r0)
            g84 r3 = defpackage.g84.a
            if (r7 != r3) goto L44
            return r3
        L44:
            javax.net.ssl.SSLEngineResult r7 = (javax.net.ssl.SSLEngineResult) r7
            javax.net.ssl.SSLEngineResult$Status r3 = r7.getStatus()
            if (r3 != 0) goto L4e
            r3 = -1
            goto L56
        L4e:
            int[] r4 = defpackage.gag.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L56:
            if (r3 == r2) goto L75
            r4 = 2
            if (r3 == r4) goto L75
            r7 = 3
            if (r3 == r7) goto L6f
            r6 = 4
            if (r3 == r6) goto L67
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Undefined status"
            r6.<init>(r7)
            throw r6
        L6f:
            yu0 r7 = r1.j
            r7.b()
            goto L35
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.m(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.fua r10, defpackage.q44 r11) throws java.nio.channels.ClosedChannelException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.vag
            if (r0 == 0) goto L13
            r0 = r11
            vag r0 = (defpackage.vag) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            vag r0 = new vag
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.g8j.b(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            fua r10 = r0.o
            yag r2 = r0.d
            defpackage.g8j.b(r11)
            goto L6c
        L3b:
            defpackage.g8j.b(r11)
            java.lang.String r11 = r9.c
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L45
            goto L5e
        L45:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r2.b(r6)
            if (r7 == 0) goto L5e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "write: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.c(r6, r11, r7, r3)
        L5e:
            r0.d = r9
            r0.o = r10
            r0.Z = r5
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L6b
            goto L80
        L6b:
            r2 = r9
        L6c:
            boolean r11 = r2.f
            if (r11 != 0) goto L82
            boolean r11 = r2.g
            if (r11 != 0) goto L82
            r0.d = r3
            r0.o = r3
            r0.Z = r4
            java.lang.Object r10 = r2.l(r10, r0)
            if (r10 != r1) goto L81
        L80:
            return r1
        L81:
            return r10
        L82:
            java.nio.channels.ClosedChannelException r10 = new java.nio.channels.ClosedChannelException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.n(fua, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.q44 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.wag
            if (r0 == 0) goto L13
            r0 = r6
            wag r0 = (defpackage.wag) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wag r0 = new wag
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            yag r0 = r0.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r6 = move-exception
            goto L69
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            yag r1 = r0.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L3c
            goto L53
        L3c:
            r6 = move-exception
            r0 = r1
            goto L69
        L3f:
            defpackage.g8j.b(r6)
            yu0 r6 = r5.j
            r6.c()
            r0.d = r5     // Catch: java.lang.Throwable -> L67
            r0.Y = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r5.p(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r4) goto L52
            goto L5d
        L52:
            r1 = r5
        L53:
            r0.d = r1     // Catch: java.lang.Throwable -> L3c
            r0.Y = r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r1.g(r0)     // Catch: java.lang.Throwable -> L3c
            if (r6 != r4) goto L5e
        L5d:
            return r4
        L5e:
            r0 = r1
        L5f:
            yu0 r6 = r0.j
            r6.d()
            qqg r6 = defpackage.qqg.a
            return r6
        L67:
            r6 = move-exception
            r0 = r5
        L69:
            yu0 r0 = r0.j
            r0.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.o(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.q44 r6) {
        /*
            r5 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r6 instanceof defpackage.xag
            if (r1 == 0) goto L15
            r1 = r6
            xag r1 = (defpackage.xag) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            xag r1 = new xag
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            yag r1 = r1.d
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L60
        L2b:
            r6 = move-exception
            goto L64
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.g8j.b(r6)
            yu0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            int r6 = r6.position()
            if (r6 != 0) goto L45
            return r0
        L45:
            yu0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            r6.flip()
            yu0 r6 = r5.j     // Catch: java.lang.Throwable -> L62
            java.nio.ByteBuffer r6 = r6.e()     // Catch: java.lang.Throwable -> L62
            r1.d = r5     // Catch: java.lang.Throwable -> L62
            r1.Y = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r5.b(r6, r1)     // Catch: java.lang.Throwable -> L62
            if (r6 != r2) goto L5f
            return r2
        L5f:
            r1 = r5
        L60:
            r2 = r0
            goto L69
        L62:
            r6 = move-exception
            r1 = r5
        L64:
            ipd r2 = new ipd
            r2.<init>(r6)
        L69:
            java.lang.Throwable r6 = defpackage.kpd.a(r2)
            if (r6 == 0) goto L71
            r1.f = r4
        L71:
            yu0 r6 = r1.j
            java.nio.ByteBuffer r6 = r6.e()
            r6.compact()
            defpackage.g8j.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yag.p(q44):java.lang.Object");
    }
}
