package androidx.media3.exoplayer.audio;

import aZ0.InterfaceC19845a;
import androidx.media3.common.audio.AudioProcessor;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes.dex */
final class l extends androidx.media3.common.audio.c {

    /* renamed from: i, reason: collision with root package name */
    @P
    public int[] f48941i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public int[] f48942j;

    @Override // androidx.media3.common.audio.c
    @InterfaceC19845a
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f48941i;
        if (iArr == null) {
            return AudioProcessor.a.f47560e;
        }
        if (aVar.f47563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int length = iArr.length;
        int i12 = aVar.f47562b;
        boolean z12 = i12 != length;
        int i13 = 0;
        while (i13 < iArr.length) {
            int i14 = iArr[i13];
            if (i14 >= i12) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z12 |= i14 != i13;
            i13++;
        }
        return z12 ? new AudioProcessor.a(aVar.f47561a, iArr.length, 2) : AudioProcessor.a.f47560e;
    }

    @Override // androidx.media3.common.audio.c
    public final void c() {
        this.f48942j = this.f48941i;
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        this.f48942j = null;
        this.f48941i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int[] iArr = this.f48942j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f47569b.f47564d) * this.f47570c.f47564d);
        while (iPosition < iLimit) {
            for (int i12 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i12 * 2) + iPosition));
            }
            iPosition += this.f47569b.f47564d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }
}
