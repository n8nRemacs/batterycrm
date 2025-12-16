package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.J;
import java.nio.ByteBuffer;

/* compiled from: TeeAudioProcessor.java */
@J
/* loaded from: classes.dex */
public final class v extends androidx.media3.common.audio.c {

    /* compiled from: TeeAudioProcessor.java */
    public interface a {
    }

    /* compiled from: TeeAudioProcessor.java */
    public static final class b implements a {
    }

    @Override // androidx.media3.common.audio.c
    public final void c() {
        if (isActive()) {
            int i12 = this.f47569b.f47561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final void d() {
        if (isActive()) {
            int i12 = this.f47569b.f47561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.c
    public final void e() {
        if (isActive()) {
            int i12 = this.f47569b.f47561a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        byteBuffer.asReadOnlyBuffer();
        throw null;
    }

    @Override // androidx.media3.common.audio.c
    public final AudioProcessor.a b(AudioProcessor.a aVar) {
        return aVar;
    }
}
