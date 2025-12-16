package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.J;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.source.P;
import androidx.media3.exoplayer.source.Q;
import androidx.media3.exoplayer.source.chunk.i;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;

/* compiled from: ChunkSampleStream.java */
@J
/* loaded from: classes.dex */
public class h<T extends i> implements P, Q, Loader.b<e>, Loader.f {

    /* compiled from: ChunkSampleStream.java */
    public interface b<T extends i> {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public final void a() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.P
    public final int b(long j12) {
        if (k()) {
            return 0;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.P
    public final void c() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.P
    public final int e(F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (k()) {
            return -3;
        }
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j12, long j13) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        if (k()) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c h(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        ((e) eVar).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13, boolean z12) {
        ((e) eVar).getClass();
        throw null;
    }

    public final boolean k() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.P
    public final boolean n() {
        if (k()) {
            return false;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
        throw null;
    }

    /* compiled from: ChunkSampleStream.java */
    public final class a implements P {
        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() {
        }
    }
}
