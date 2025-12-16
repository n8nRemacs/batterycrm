package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.U;
import java.nio.ByteBuffer;

/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes6.dex */
public final class x extends m {

    /* renamed from: i, reason: collision with root package name */
    public final long f344102i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f344103j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f344104k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f344105l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f344106m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f344107n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f344108o;

    /* renamed from: p, reason: collision with root package name */
    public int f344109p;

    /* renamed from: q, reason: collision with root package name */
    public int f344110q;

    /* renamed from: r, reason: collision with root package name */
    public int f344111r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f344112s;

    /* renamed from: t, reason: collision with root package name */
    public long f344113t;

    public x() {
        byte[] bArr = U.f348110e;
        this.f344107n = bArr;
        this.f344108o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f343850c == 2) {
            return this.f344106m ? aVar : AudioProcessor.a.f343847e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void d() {
        if (this.f344106m) {
            AudioProcessor.a aVar = this.f344041b;
            int i12 = aVar.f343851d;
            this.f344105l = i12;
            int i13 = aVar.f343848a;
            int i14 = ((int) ((this.f344102i * i13) / 1000000)) * i12;
            if (this.f344107n.length != i14) {
                this.f344107n = new byte[i14];
            }
            int i15 = ((int) ((this.f344103j * i13) / 1000000)) * i12;
            this.f344111r = i15;
            if (this.f344108o.length != i15) {
                this.f344108o = new byte[i15];
            }
        }
        this.f344109p = 0;
        this.f344113t = 0L;
        this.f344110q = 0;
        this.f344112s = false;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void e() {
        int i12 = this.f344110q;
        if (i12 > 0) {
            l(i12, this.f344107n);
        }
        if (this.f344112s) {
            return;
        }
        this.f344113t += this.f344111r / this.f344105l;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f344046g.hasRemaining()) {
            int i12 = this.f344109p;
            if (i12 == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f344107n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f344104k) {
                            int i13 = this.f344105l;
                            iPosition = androidx.compose.ui.graphics.colorspace.e.x(iLimit2, i13, i13, i13);
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f344109p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    j(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f344112s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i12 == 1) {
                int iLimit3 = byteBuffer.limit();
                int iK2 = k(byteBuffer);
                int iPosition2 = iK2 - byteBuffer.position();
                byte[] bArr = this.f344107n;
                int length = bArr.length;
                int i14 = this.f344110q;
                int i15 = length - i14;
                if (iK2 >= iLimit3 || iPosition2 >= i15) {
                    int iMin = Math.min(iPosition2, i15);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f344107n, this.f344110q, iMin);
                    int i16 = this.f344110q + iMin;
                    this.f344110q = i16;
                    byte[] bArr2 = this.f344107n;
                    if (i16 == bArr2.length) {
                        if (this.f344112s) {
                            l(this.f344111r, bArr2);
                            this.f344113t += (this.f344110q - (this.f344111r * 2)) / this.f344105l;
                        } else {
                            this.f344113t += (i16 - this.f344111r) / this.f344105l;
                        }
                        m(byteBuffer, this.f344107n, this.f344110q);
                        this.f344110q = 0;
                        this.f344109p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    l(i14, bArr);
                    this.f344110q = 0;
                    this.f344109p = 0;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iK3 = k(byteBuffer);
                byteBuffer.limit(iK3);
                this.f344113t += byteBuffer.remaining() / this.f344105l;
                m(byteBuffer, this.f344108o, this.f344111r);
                if (iK3 < iLimit4) {
                    l(this.f344111r, this.f344108o);
                    this.f344109p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void i() {
        this.f344106m = false;
        this.f344111r = 0;
        byte[] bArr = U.f348110e;
        this.f344107n = bArr;
        this.f344108o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.m, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean isActive() {
        return this.f344106m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f344104k) {
                int i12 = this.f344105l;
                return (iPosition / i12) * i12;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i12, byte[] bArr) {
        j(i12).put(bArr, 0, i12).flip();
        if (i12 > 0) {
            this.f344112s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i12) {
        int iMin = Math.min(byteBuffer.remaining(), this.f344111r);
        int i13 = this.f344111r - iMin;
        System.arraycopy(bArr, i12 - i13, this.f344108o, 0, i13);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f344108o, i13, iMin);
    }
}
