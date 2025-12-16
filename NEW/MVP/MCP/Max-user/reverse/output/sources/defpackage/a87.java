package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a87 extends y77 {
    public final ga7 X;
    public final /* synthetic */ a9 Y;
    public long d;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a87(a9 a9Var, ga7 ga7Var) {
        super(a9Var);
        this.Y = a9Var;
        this.X = ga7Var;
        this.d = -1L;
        this.o = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r11.o == false) goto L30;
     */
    @Override // defpackage.y77, defpackage.x6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.qu0 r12, long r13) throws java.io.IOException {
        /*
            r11 = this;
            a9 r0 = r11.Y
            java.lang.Object r1 = r0.e
            wv0 r1 = (defpackage.wv0) r1
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 < 0) goto Lcb
            boolean r4 = r11.b
            if (r4 != 0) goto Lc3
            boolean r4 = r11.o
            r5 = -1
            if (r4 != 0) goto L17
            goto L76
        L17:
            long r7 = r11.d
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L77
        L21:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2a
            r1.T()
        L2a:
            long r7 = r1.f0()     // Catch: java.lang.NumberFormatException -> L52
            r11.d = r7     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r1 = r1.T()     // Catch: java.lang.NumberFormatException -> L52
            java.lang.CharSequence r1 = defpackage.vmf.c0(r1)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L52
            long r7 = r11.d     // Catch: java.lang.NumberFormatException -> L52
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L9d
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> L52
            r8 = 0
            if (r7 <= 0) goto L54
            java.lang.String r7 = ";"
            boolean r7 = defpackage.dnf.r(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> L52
            if (r7 == 0) goto L9d
            goto L54
        L52:
            r12 = move-exception
            goto Lb9
        L54:
            long r9 = r11.d
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L72
            r11.o = r8
            java.lang.Object r1 = r0.b
            v32 r1 = (defpackage.v32) r1
            j17 r1 = r1.c0()
            java.lang.Object r2 = r0.c
            sua r2 = (defpackage.sua) r2
            mni r2 = r2.t0
            ga7 r3 = r11.X
            defpackage.v97.b(r2, r3, r1)
            r11.l()
        L72:
            boolean r1 = r11.o
            if (r1 != 0) goto L77
        L76:
            return r5
        L77:
            long r1 = r11.d
            long r13 = java.lang.Math.min(r13, r1)
            long r12 = super.b(r12, r13)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L8b
            long r0 = r11.d
            long r0 = r0 - r12
            r11.d = r0
            return r12
        L8b:
            java.lang.Object r12 = r0.d
            qbd r12 = (defpackage.qbd) r12
            r12.k()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            r11.l()
            throw r12
        L9d:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L52
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L52
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> L52
            long r2 = r11.d     // Catch: java.lang.NumberFormatException -> L52
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> L52
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> L52
            r14 = 34
            r13.append(r14)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L52
            r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L52
            throw r12     // Catch: java.lang.NumberFormatException -> L52
        Lb9:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r12 = r12.getMessage()
            r13.<init>(r12)
            throw r13
        Lc3:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "closed"
            r12.<init>(r13)
            throw r12
        Lcb:
            java.lang.String r12 = "byteCount < 0: "
            java.lang.String r12 = defpackage.vb9.e(r13, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a87.b(qu0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.b) {
            return;
        }
        if (this.o) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zT = yxg.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((qbd) this.Y.d).k();
                l();
            }
        }
        this.b = true;
    }
}
