package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class jhb implements jof, mh4 {
    public final bfb a;
    public final ph4[] e;
    public final qh4[] f;
    public int g;
    public int h;
    public ph4 i;
    public SubtitleDecoderException j;
    public boolean k;
    public boolean l;
    public final tof n;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public jhb(tof tofVar) {
        oof[] oofVarArr = new oof[2];
        a72[] a72VarArr = new a72[2];
        this.e = oofVarArr;
        this.g = oofVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = new oof(1);
        }
        this.f = a72VarArr;
        this.h = a72VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new a72(this, 1);
        }
        bfb bfbVar = new bfb(2, this);
        this.a = bfbVar;
        bfbVar.start();
        int i3 = this.g;
        ph4[] ph4VarArr = this.e;
        hsi.g(i3 == ph4VarArr.length);
        for (ph4 ph4Var : ph4VarArr) {
            ph4Var.y(1024);
        }
        this.n = tofVar;
    }

    @Override // defpackage.jof
    public final void a(long j) {
    }

    @Override // defpackage.mh4
    public final Object b() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (qh4) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mh4
    public final Object c() {
        ph4 ph4Var;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                hsi.g(this.i == null);
                int i = this.g;
                if (i == 0) {
                    ph4Var = null;
                } else {
                    ph4[] ph4VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    ph4Var = ph4VarArr[i2];
                }
                this.i = ph4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph4Var;
    }

    @Override // defpackage.mh4
    public final void d(long j) {
        synchronized (this.b) {
            try {
                hsi.g(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mh4
    public final void e(oof oofVar) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                hsi.b(oofVar == this.i);
                this.c.addLast(oofVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final DecoderException f(ph4 ph4Var, qh4 qh4Var, boolean z) {
        oof oofVar = (oof) ph4Var;
        a72 a72Var = (a72) qh4Var;
        try {
            ByteBuffer byteBuffer = oofVar.o;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            tof tofVar = this.n;
            if (z) {
                tofVar.reset();
            }
            a72Var.y(oofVar.Y, tofVar.o(0, bArrArray, iLimit), oofVar.t0);
            a72Var.d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // defpackage.mh4
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                ph4 ph4Var = this.i;
                if (ph4Var != null) {
                    ph4Var.w();
                    ph4[] ph4VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    ph4VarArr[i] = ph4Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    ph4 ph4Var2 = (ph4) this.c.removeFirst();
                    ph4Var2.w();
                    ph4[] ph4VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    ph4VarArr2[i2] = ph4Var2;
                }
                while (!this.d.isEmpty()) {
                    ((qh4) this.d.removeFirst()).x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhb.g():boolean");
    }

    @Override // defpackage.mh4
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        this.a.interrupt();
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
