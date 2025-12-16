package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class of9 extends OutputStream {
    public final mf9 a;
    public qk4 b;
    public int c;

    public of9(mf9 mf9Var, int i) {
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.a = mf9Var;
        this.c = 0;
        this.b = vc3.k0(mf9Var.get(i), mf9Var, vc3.X);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vc3.P(this.b);
        this.b = null;
        this.c = -1;
        l();
    }

    public final void l() throws IOException {
        try {
            super.close();
        } catch (IOException e) {
            rei.g(e);
            throw null;
        }
    }

    public final nf9 w() {
        if (!vc3.i0(this.b)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        qk4 qk4Var = this.b;
        if (qk4Var != null) {
            return new nf9(this.c, qk4Var);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (vc3.i0(this.b)) {
                int i3 = this.c + i2;
                if (vc3.i0(this.b)) {
                    qk4 qk4Var = this.b;
                    if (qk4Var != null) {
                        if (i3 > ((lf9) qk4Var.Z()).getSize()) {
                            mf9 mf9Var = this.a;
                            lf9 lf9Var = (lf9) mf9Var.get(i3);
                            qk4 qk4Var2 = this.b;
                            if (qk4Var2 != null) {
                                ((lf9) qk4Var2.Z()).w(lf9Var, this.c);
                                this.b.close();
                                this.b = vc3.k0(lf9Var, mf9Var, vc3.X);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        qk4 qk4Var3 = this.b;
                        if (qk4Var3 != null) {
                            ((lf9) qk4Var3.Z()).Q(this.c, i, i2, bArr);
                            this.c += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        StringBuilder sbK = wy1.k("length=", bArr.length, "; regionStart=", i, "; regionLength=");
        sbK.append(i2);
        throw new ArrayIndexOutOfBoundsException(sbK.toString());
    }

    public of9(mf9 mf9Var) {
        this(mf9Var, mf9Var.t0[0]);
    }
}
