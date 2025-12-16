package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v0f extends wi0 {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public v0f() {
        byte[] bArr = xxg.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // defpackage.j50
    public final void c(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i2 = this.l;
                            iPosition = ((iLimit2 / i2) * i2) + i2;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK = k(byteBuffer);
                int iPosition2 = iK - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i3 = this.q;
                int i4 = length - i3;
                if (iK >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.n, this.q, iMin);
                    int i5 = this.q + iMin;
                    this.q = i5;
                    byte[] bArr2 = this.n;
                    if (i5 == bArr2.length) {
                        if (this.s) {
                            l(this.r, bArr2);
                            this.t += (this.q - (this.r * 2)) / this.l;
                        } else {
                            this.t += (i5 - this.r) / this.l;
                        }
                        m(this.q, byteBuffer, this.n);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i3, bArr);
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                byteBuffer.limit(iK2);
                this.t += byteBuffer.remaining() / this.l;
                m(this.r, byteBuffer, this.o);
                if (iK2 < iLimit4) {
                    l(this.r, this.o);
                    this.p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // defpackage.wi0
    public final h50 f(h50 h50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (h50Var.c == 2) {
            return this.m ? h50Var : h50.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(h50Var);
    }

    @Override // defpackage.wi0
    public final void g() {
        if (this.m) {
            h50 h50Var = this.b;
            int i = h50Var.d;
            this.l = i;
            int i2 = h50Var.a;
            int i3 = ((int) ((this.i * i2) / 1000000)) * i;
            if (this.n.length != i3) {
                this.n = new byte[i3];
            }
            int i4 = ((int) ((this.j * i2) / 1000000)) * i;
            this.r = i4;
            if (this.o.length != i4) {
                this.o = new byte[i4];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // defpackage.wi0
    public final void h() {
        int i = this.q;
        if (i > 0) {
            l(i, this.n);
        }
        if (this.s) {
            return;
        }
        this.t += this.r / this.l;
    }

    @Override // defpackage.wi0
    public final void i() {
        this.m = false;
        this.r = 0;
        byte[] bArr = xxg.f;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // defpackage.wi0, defpackage.j50
    public final boolean isActive() {
        return this.m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i = this.l;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i, byte[] bArr) {
        j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void m(int i, ByteBuffer byteBuffer, byte[] bArr) {
        int iMin = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - iMin;
        System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.o, i2, iMin);
    }
}
