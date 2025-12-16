package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bjg extends xi0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.xi0, defpackage.l50
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // defpackage.xi0, defpackage.l50
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // defpackage.l50
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferK = k(length);
        int i3 = zxg.i(length, 0, this.n);
        byteBufferK.put(this.m, 0, i3);
        int i4 = zxg.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferK.flip();
    }

    @Override // defpackage.l50
    public final long f(long j) {
        return j - zxg.c0(this.b.a, this.j + this.i);
    }

    @Override // defpackage.xi0
    public final i50 g(i50 i50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!zxg.M(i50Var.c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? i50.e : i50Var;
    }

    @Override // defpackage.xi0
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.xi0
    public final void i() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.xi0
    public final void j() {
        this.m = zxg.b;
    }
}
