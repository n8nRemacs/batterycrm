package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.M;
import java.nio.ByteBuffer;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes.dex */
final class x extends androidx.media3.common.audio.c {

    /* renamed from: i, reason: collision with root package name */
    public int f49001i;

    /* renamed from: j, reason: collision with root package name */
    public int f49002j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f49003k;

    /* renamed from: l, reason: collision with root package name */
    public int f49004l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f49005m = M.f47891e;

    /* renamed from: n, reason: collision with root package name */
    public int f49006n;

    /* renamed from: o, reason: collision with root package name */
    public long f49007o;

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final boolean a() {
        return super.a() && this.f49006n == 0;
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f47563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f49003k = true;
        return (this.f49001i == 0 && this.f49002j == 0) ? AudioProcessor.a.f47560e : aVar;
    }

    @Override // androidx.media3.common.audio.c
    public final void c() {
        if (this.f49003k) {
            this.f49003k = false;
            int i12 = this.f49002j;
            int i13 = this.f47569b.f47564d;
            this.f49005m = new byte[i12 * i13];
            this.f49004l = this.f49001i * i13;
        }
        this.f49006n = 0;
    }

    @Override // androidx.media3.common.audio.c
    public final void d() {
        if (this.f49003k) {
            if (this.f49006n > 0) {
                this.f49007o += r0 / this.f47569b.f47564d;
            }
            this.f49006n = 0;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        this.f49005m = M.f47891e;
    }

    @Override // androidx.media3.common.audio.c, androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer f() {
        int i12;
        if (super.a() && (i12 = this.f49006n) > 0) {
            j(i12).put(this.f49005m, 0, this.f49006n).flip();
            this.f49006n = 0;
        }
        return super.f();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        if (i12 == 0) {
            return;
        }
        int iMin = Math.min(i12, this.f49004l);
        this.f49007o += iMin / this.f47569b.f47564d;
        this.f49004l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f49004l > 0) {
            return;
        }
        int i13 = i12 - iMin;
        int length = (this.f49006n + i13) - this.f49005m.length;
        ByteBuffer byteBufferJ = j(length);
        int iK2 = M.k(length, 0, this.f49006n);
        byteBufferJ.put(this.f49005m, 0, iK2);
        int iK3 = M.k(length - iK2, 0, i13);
        byteBuffer.limit(byteBuffer.position() + iK3);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i13 - iK3;
        int i15 = this.f49006n - iK2;
        this.f49006n = i15;
        byte[] bArr = this.f49005m;
        System.arraycopy(bArr, iK2, bArr, 0, i15);
        byteBuffer.get(this.f49005m, this.f49006n, i14);
        this.f49006n += i14;
        byteBufferJ.flip();
    }
}
