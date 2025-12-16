package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.U;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes6.dex */
final class B extends m {

    /* renamed from: i, reason: collision with root package name */
    public int f343859i;

    /* renamed from: j, reason: collision with root package name */
    public int f343860j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f343861k;

    /* renamed from: l, reason: collision with root package name */
    public int f343862l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f343863m = U.f348110e;

    /* renamed from: n, reason: collision with root package name */
    public int f343864n;

    /* renamed from: o, reason: collision with root package name */
    public long f343865o;

    @Override // com.google.android.exoplayer2.audio.m, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean a() {
        return super.a() && this.f343864n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f343850c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f343861k = true;
        return (this.f343859i == 0 && this.f343860j == 0) ? AudioProcessor.a.f343847e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void d() {
        if (this.f343861k) {
            this.f343861k = false;
            int i12 = this.f343860j;
            int i13 = this.f344041b.f343851d;
            this.f343863m = new byte[i12 * i13];
            this.f343862l = this.f343859i * i13;
        }
        this.f343864n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void e() {
        if (this.f343861k) {
            if (this.f343864n > 0) {
                this.f343865o += r0 / this.f344041b.f343851d;
            }
            this.f343864n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.m, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer f() {
        int i12;
        if (super.a() && (i12 = this.f343864n) > 0) {
            j(i12).put(this.f343863m, 0, this.f343864n).flip();
            this.f343864n = 0;
        }
        return super.f();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        if (i12 == 0) {
            return;
        }
        int iMin = Math.min(i12, this.f343862l);
        this.f343865o += iMin / this.f344041b.f343851d;
        this.f343862l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f343862l > 0) {
            return;
        }
        int i13 = i12 - iMin;
        int length = (this.f343864n + i13) - this.f343863m.length;
        ByteBuffer byteBufferJ = j(length);
        int iK2 = U.k(length, 0, this.f343864n);
        byteBufferJ.put(this.f343863m, 0, iK2);
        int iK3 = U.k(length - iK2, 0, i13);
        byteBuffer.limit(byteBuffer.position() + iK3);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i13 - iK3;
        int i15 = this.f343864n - iK2;
        this.f343864n = i15;
        byte[] bArr = this.f343863m;
        System.arraycopy(bArr, iK2, bArr, 0, i15);
        byteBuffer.get(this.f343863m, this.f343864n, i14);
        this.f343864n += i14;
        byteBufferJ.flip();
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void i() {
        this.f343863m = U.f348110e;
    }
}
