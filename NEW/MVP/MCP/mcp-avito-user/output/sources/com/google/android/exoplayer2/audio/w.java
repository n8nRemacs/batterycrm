package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.U;
import java.nio.ByteBuffer;

/* compiled from: ResamplingAudioProcessor.java */
/* loaded from: classes6.dex */
final class w extends m {
    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i12 = aVar.f343850c;
        if (i12 == 3 || i12 == 2 || i12 == 268435456 || i12 == 536870912 || i12 == 805306368 || i12 == 4) {
            return i12 != 2 ? new AudioProcessor.a(aVar.f343848a, aVar.f343849b, 2) : AudioProcessor.a.f343847e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i12 = iLimit - iPosition;
        int i13 = this.f344041b.f343850c;
        if (i13 == 3) {
            i12 *= 2;
        } else if (i13 == 4) {
            i12 /= 2;
        } else if (i13 != 268435456) {
            if (i13 != 536870912) {
                if (i13 != 805306368) {
                    throw new IllegalStateException();
                }
                i12 /= 2;
            } else {
                i12 /= 3;
                i12 *= 2;
            }
        }
        ByteBuffer byteBufferJ = j(i12);
        int i14 = this.f344041b.f343850c;
        if (i14 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i14 == 4) {
            while (iPosition < iLimit) {
                short sJ2 = (short) (U.j(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sJ2 & 255));
                byteBufferJ.put((byte) ((sJ2 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i14 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i14 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i14 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }
}
