package defpackage;

import java.io.BufferedInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public final class zpg extends Reader {
    public final boolean X;
    public int Z;
    public final b6 a;
    public BufferedInputStream b;
    public byte[] c;
    public int d;
    public int o;
    public int s0;
    public char[] u0;
    public char Y = 0;
    public final boolean t0 = true;

    public zpg(b6 b6Var, BufferedInputStream bufferedInputStream, byte[] bArr, int i, int i2, boolean z) {
        this.a = b6Var;
        this.b = bufferedInputStream;
        this.c = bArr;
        this.d = i;
        this.o = i2;
        this.X = z;
    }

    public final void c(int i) throws CharConversionException {
        throw new CharConversionException(ho7.j(wy1.k("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed 4, at char #", this.Z, ", byte #"), this.s0 + i, ")"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedInputStream bufferedInputStream = this.b;
        if (bufferedInputStream != null) {
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.a.g(bArr);
            }
            bufferedInputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.u0 == null) {
            this.u0 = new char[1];
        }
        if (read(this.u0, 0, 1) < 1) {
            return -1;
        }
        return this.u0[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x016c A[LOOP:0: B:58:0x00a8->B:77:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114 A[SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(char[] r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpg.read(char[], int, int):int");
    }
}
