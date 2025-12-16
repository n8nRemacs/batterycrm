package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: classes6.dex */
final class r extends m {

    /* renamed from: i, reason: collision with root package name */
    public static final int f344075i = Float.floatToIntBits(Float.NaN);

    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i12 = aVar.f343850c;
        if (i12 == 536870912 || i12 == 805306368 || i12 == 4) {
            return i12 != 4 ? new AudioProcessor.a(aVar.f343848a, aVar.f343849b, 4) : AudioProcessor.a.f343847e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f344041b.f343850c;
        int i14 = f344075i;
        if (i13 == 536870912) {
            byteBufferJ = j((i12 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i14) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i13 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i12);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i14) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }
}
