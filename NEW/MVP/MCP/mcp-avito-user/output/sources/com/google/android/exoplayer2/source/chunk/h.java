package com.google.android.exoplayer2.source.chunk;

import android.net.Uri;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.M;
import com.google.android.exoplayer2.source.N;
import com.google.android.exoplayer2.source.chunk.i;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* compiled from: ChunkSampleStream.java */
/* loaded from: classes6.dex */
public class h<T extends i> implements M, N, Loader.b<e>, Loader.f {

    /* compiled from: ChunkSampleStream.java */
    public interface b<T extends i> {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public final void a() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.M
    public final int b(long j12) {
        if (i()) {
            return 0;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.M
    public final void c() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.M
    public final int g(J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
        if (i()) {
            return -3;
        }
        Object obj = null;
        obj.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        if (i()) {
            return 0L;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        if (i()) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        e eVar2 = (e) eVar;
        long j14 = eVar2.f346218a;
        Uri uri = eVar2.f346226i.f347753c;
        throw null;
    }

    public final boolean i() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        e eVar2 = (e) eVar;
        long j14 = eVar2.f346226i.f347752b;
        boolean z12 = eVar2 instanceof com.google.android.exoplayer2.source.chunk.a;
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.M
    public final boolean n() {
        if (i()) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        throw null;
    }

    /* compiled from: ChunkSampleStream.java */
    public final class a implements M {
        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() {
        }
    }
}
