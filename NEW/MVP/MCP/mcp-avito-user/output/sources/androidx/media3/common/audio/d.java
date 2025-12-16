package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import java.nio.ByteBuffer;

/* compiled from: ChannelMixingAudioProcessor.java */
@J
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray<e> f47576i = new SparseArray<>();

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f47563c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        if (this.f47576i.get(aVar.f47562b) != null) {
            return new AudioProcessor.a(aVar.f47561a, 0, 2);
        }
        throw new AudioProcessor.UnhandledAudioFormatException("No mixing matrix for input channel count", aVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        C23110a.h(this.f47576i.get(this.f47569b.f47562b));
        ByteBuffer byteBufferJ = j((byteBuffer.remaining() / this.f47569b.f47564d) * this.f47570c.f47564d);
        while (byteBuffer.hasRemaining()) {
        }
        byteBufferJ.flip();
    }
}
