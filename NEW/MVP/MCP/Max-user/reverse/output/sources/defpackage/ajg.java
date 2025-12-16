package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ajg extends wi0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.wi0, defpackage.j50
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // defpackage.wi0, defpackage.j50
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // defpackage.j50
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
        ByteBuffer byteBufferJ = j(length);
        int i3 = xxg.i(length, 0, this.n);
        byteBufferJ.put(this.m, 0, i3);
        int i4 = xxg.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferJ.flip();
    }

    @Override // defpackage.wi0
    public final h50 f(h50 h50Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (h50Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(h50Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? h50.e : h50Var;
    }

    @Override // defpackage.wi0
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.wi0
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.wi0
    public final void i() {
        this.m = xxg.f;
    }
}
