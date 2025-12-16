package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: TeeAudioProcessor.java */
/* loaded from: classes6.dex */
public final class A extends m {

    /* compiled from: TeeAudioProcessor.java */
    public interface a {
    }

    /* compiled from: TeeAudioProcessor.java */
    public static final class b implements a {
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void d() {
        if (isActive()) {
            int i12 = this.f344041b.f343848a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void e() {
        if (isActive()) {
            int i12 = this.f344041b.f343848a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        byteBuffer.asReadOnlyBuffer();
        throw null;
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final void i() {
        if (isActive()) {
            int i12 = this.f344041b.f343848a;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.m
    public final AudioProcessor.a c(AudioProcessor.a aVar) {
        return aVar;
    }
}
