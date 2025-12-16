package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class ve4 extends InputStream {
    public final Object X;
    public final /* synthetic */ int a;
    public final byte[] b;
    public boolean c;
    public boolean d;
    public final Object o;

    public ve4(qe4 qe4Var, ye4 ye4Var) {
        this.a = 0;
        this.c = false;
        this.d = false;
        this.o = qe4Var;
        this.X = ye4Var;
        this.b = new byte[1];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                if (!this.d) {
                    ((qe4) this.o).close();
                    this.d = true;
                    break;
                }
                break;
            default:
                if (!this.d) {
                    ((se4) this.o).close();
                    this.d = true;
                    break;
                }
                break;
        }
    }

    public final void l() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    ((qe4) this.o).R((ye4) this.X);
                    this.c = true;
                    break;
                }
                break;
            default:
                if (!this.c) {
                    ((se4) this.o).H((ze4) this.X);
                    this.c = true;
                    break;
                }
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                byte[] bArr = this.b;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.b;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        switch (this.a) {
        }
        return read(bArr, 0, bArr.length);
    }

    public ve4(se4 se4Var, ze4 ze4Var) {
        this.a = 1;
        this.c = false;
        this.d = false;
        this.o = se4Var;
        this.X = ze4Var;
        this.b = new byte[1];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                fsi.d(!this.d);
                l();
                int i3 = ((qe4) this.o).read(bArr, i, i2);
                if (i3 == -1) {
                    break;
                }
                break;
            default:
                hsi.g(!this.d);
                l();
                int i4 = ((se4) this.o).read(bArr, i, i2);
                if (i4 == -1) {
                    break;
                }
                break;
        }
        return -1;
    }
}
