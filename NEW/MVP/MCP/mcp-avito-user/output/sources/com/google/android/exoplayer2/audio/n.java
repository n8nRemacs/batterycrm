package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes6.dex */
final class n extends m {

    /* renamed from: i, reason: collision with root package name */
    @P
    public int[] f344048i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public int[] f344049j;

    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f344048i;
        if (iArr == null) {
            return AudioProcessor.a.f343847e;
        }
        if (aVar.f343850c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int length = iArr.length;
        int i12 = aVar.f343849b;
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
        return z12 ? new AudioProcessor.a(aVar.f343848a, iArr.length, 2) : AudioProcessor.a.f343847e;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void d() {
        this.f344049j = this.f344048i;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int[] iArr = this.f344049j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f344041b.f343851d) * this.f344042c.f343851d);
        while (iPosition < iLimit) {
            for (int i12 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i12 * 2) + iPosition));
            }
            iPosition += this.f344041b.f343851d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void i() {
        this.f344049j = null;
        this.f344048i = null;
    }
}
