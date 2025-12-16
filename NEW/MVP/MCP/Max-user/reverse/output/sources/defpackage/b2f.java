package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class b2f implements iof, kh4 {
    public final bfb a;
    public final z62[] f;
    public int h;
    public oh4 i;
    public SubtitleDecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final oh4[] e = new nof[2];
    public int g = 2;

    public b2f() {
        z62[] z62VarArr = new z62[2];
        int i = 0;
        while (true) {
            if (i >= this.g) {
                break;
            }
            this.e[i] = new nof(1);
            i++;
        }
        this.f = z62VarArr;
        this.h = 2;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new z62(this, 2);
        }
        bfb bfbVar = new bfb(1, this);
        this.a = bfbVar;
        bfbVar.start();
        int i3 = this.g;
        oh4[] oh4VarArr = this.e;
        fsi.d(i3 == oh4VarArr.length);
        for (oh4 oh4Var : oh4VarArr) {
            oh4Var.y(1024);
        }
    }

    @Override // defpackage.iof
    public final void a(long j) {
    }

    @Override // defpackage.kh4
    public final z62 b() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (z62) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kh4
    public final Object c() {
        oh4 oh4Var;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                fsi.d(this.i == null);
                int i = this.g;
                if (i == 0) {
                    oh4Var = null;
                } else {
                    oh4[] oh4VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    oh4Var = oh4VarArr[i2];
                }
                this.i = oh4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oh4Var;
    }

    @Override // defpackage.kh4
    public final void d(nof nofVar) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                fsi.b(nofVar == this.i);
                this.c.addLast(nofVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract gof e(int i, boolean z, byte[] bArr);

    public final SubtitleDecoderException f(oh4 oh4Var, z62 z62Var, boolean z) {
        nof nofVar = (nof) oh4Var;
        try {
            ByteBuffer byteBuffer = nofVar.d;
            byteBuffer.getClass();
            z62Var.x(nofVar.X, e(byteBuffer.limit(), z, byteBuffer.array()), nofVar.s0);
            z62Var.b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // defpackage.kh4
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                oh4 oh4Var = this.i;
                if (oh4Var != null) {
                    oh4Var.w();
                    oh4[] oh4VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    oh4VarArr[i] = oh4Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    oh4 oh4Var2 = (oh4) this.c.removeFirst();
                    oh4Var2.w();
                    oh4[] oh4VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    oh4VarArr2[i2] = oh4Var2;
                }
                while (!this.d.isEmpty()) {
                    ((z62) this.d.removeFirst()).w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.l     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r8.c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r8.h     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r1 = move-exception
            goto La6
        L23:
            boolean r1 = r8.l     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r3
        L29:
            java.util.ArrayDeque r1 = r8.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            oh4 r1 = (defpackage.oh4) r1     // Catch: java.lang.Throwable -> L20
            z62[] r4 = r8.f     // Catch: java.lang.Throwable -> L20
            int r5 = r8.h     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r2
            r8.h = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r8.k     // Catch: java.lang.Throwable -> L20
            r8.k = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 4
            boolean r6 = r1.j(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L4c
            r4.a(r0)
            goto L79
        L4c:
            boolean r0 = r1.j(r7)
            if (r0 == 0) goto L55
            r4.a(r7)
        L55:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r8.f(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.RuntimeException -> L64
            goto L6d
        L5a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L62:
            r0 = r5
            goto L6d
        L64:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L62
        L6d:
            if (r0 == 0) goto L79
            java.lang.Object r5 = r8.b
            monitor-enter(r5)
            r8.j = r0     // Catch: java.lang.Throwable -> L76
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            return r3
        L76:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r0
        L79:
            java.lang.Object r3 = r8.b
            monitor-enter(r3)
            boolean r0 = r8.k     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L86
            r4.w()     // Catch: java.lang.Throwable -> L84
            goto L95
        L84:
            r0 = move-exception
            goto La4
        L86:
            boolean r0 = r4.j(r7)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L90
            r4.w()     // Catch: java.lang.Throwable -> L84
            goto L95
        L90:
            java.util.ArrayDeque r0 = r8.d     // Catch: java.lang.Throwable -> L84
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L84
        L95:
            r1.w()     // Catch: java.lang.Throwable -> L84
            oh4[] r0 = r8.e     // Catch: java.lang.Throwable -> L84
            int r4 = r8.g     // Catch: java.lang.Throwable -> L84
            int r5 = r4 + 1
            r8.g = r5     // Catch: java.lang.Throwable -> L84
            r0[r4] = r1     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            return r2
        La4:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            throw r0
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.g():boolean");
    }

    @Override // defpackage.kh4
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
