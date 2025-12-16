package androidx.media3.exoplayer.audio;

import aZ0.InterfaceC19845a;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor.java */
@J
/* loaded from: classes.dex */
public final class t extends androidx.media3.common.audio.c {

    /* renamed from: i, reason: collision with root package name */
    public final long f48988i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f48989j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f48990k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f48991l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48992m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f48993n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f48994o;

    /* renamed from: p, reason: collision with root package name */
    public int f48995p;

    /* renamed from: q, reason: collision with root package name */
    public int f48996q;

    /* renamed from: r, reason: collision with root package name */
    public int f48997r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f48998s;

    /* renamed from: t, reason: collision with root package name */
    public long f48999t;

    public t() {
        byte[] bArr = M.f47891e;
        this.f48993n = bArr;
        this.f48994o = bArr;
    }

    @Override // androidx.media3.common.audio.c
    @InterfaceC19845a
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f47563c == 2) {
            return this.f48992m ? aVar : AudioProcessor.a.f47560e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.c
    public final void c() {
        if (this.f48992m) {
            AudioProcessor.a aVar = this.f47569b;
            int i12 = aVar.f47564d;
            this.f48991l = i12;
            int i13 = aVar.f47561a;
            int i14 = ((int) ((this.f48988i * i13) / 1000000)) * i12;
            if (this.f48993n.length != i14) {
                this.f48993n = new byte[i14];
            }
            int i15 = ((int) ((this.f48989j * i13) / 1000000)) * i12;
            this.f48997r = i15;
            if (this.f48994o.length != i15) {
                this.f48994o = new byte[i15];
            }
        }
        this.f48995p = 0;
        this.f48999t = 0L;
        this.f48996q = 0;
        this.f48998s = false;
    }

    @Override // androidx.media3.common.audio.c
    public final void d() {
        int i12 = this.f48996q;
        if (i12 > 0) {
            l(i12, this.f48993n);
        }
        if (this.f48998s) {
            return;
        }
        this.f48999t += this.f48997r / this.f48991l;
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        this.f48992m = false;
        this.f48997r = 0;
        byte[] bArr = M.f47891e;
        this.f48993n = bArr;
        this.f48994o = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f47574g.hasRemaining()) {
            int i12 = this.f48995p;
            if (i12 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f48993n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f48990k) {
                            int i13 = this.f48991l;
                            iPosition = androidx.compose.ui.graphics.colorspace.e.x(iLimit2, i13, i13, i13);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f48995p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f48998s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i12 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                int iPosition2 = iK2 - byteBuffer.position();
                byte[] bArr = this.f48993n;
                int length = bArr.length;
                int i14 = this.f48996q;
                int i15 = length - i14;
                if (iK2 >= iLimit3 || iPosition2 >= i15) {
                    int iMin = Math.min(iPosition2, i15);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f48993n, this.f48996q, iMin);
                    int i16 = this.f48996q + iMin;
                    this.f48996q = i16;
                    byte[] bArr2 = this.f48993n;
                    if (i16 == bArr2.length) {
                        if (this.f48998s) {
                            l(this.f48997r, bArr2);
                            this.f48999t += (this.f48996q - (this.f48997r * 2)) / this.f48991l;
                        } else {
                            this.f48999t += (i16 - this.f48997r) / this.f48991l;
                        }
                        m(byteBuffer, this.f48993n, this.f48996q);
                        this.f48996q = 0;
                        this.f48995p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i14, bArr);
                    this.f48996q = 0;
                    this.f48995p = 0;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK3 = k(byteBuffer);
                byteBuffer.limit(iK3);
                this.f48999t += byteBuffer.remaining() / this.f48991l;
                m(byteBuffer, this.f48994o, this.f48997r);
                if (iK3 < iLimit4) {
                    l(this.f48997r, this.f48994o);
                    this.f48995p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        return this.f48992m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f48990k) {
                int i12 = this.f48991l;
                return (iPosition / i12) * i12;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i12, byte[] bArr) {
        j(i12).put(bArr, 0, i12).flip();
        if (i12 > 0) {
            this.f48998s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i12) {
        int iMin = Math.min(byteBuffer.remaining(), this.f48997r);
        int i13 = this.f48997r - iMin;
        System.arraycopy(bArr, i12 - i13, this.f48994o, 0, i13);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f48994o, i13, iMin);
    }
}
