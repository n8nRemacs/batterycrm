package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.I;
import j.P;
import j.X;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes6.dex */
public interface l {

    /* compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final m f345603a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f345604b;

        /* renamed from: c, reason: collision with root package name */
        public final I f345605c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final Surface f345606d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final MediaCrypto f345607e;

        public a(m mVar, MediaFormat mediaFormat, I i12, @P Surface surface, @P MediaCrypto mediaCrypto) {
            this.f345603a = mVar;
            this.f345604b = mediaFormat;
            this.f345605c = i12;
            this.f345606d = surface;
            this.f345607e = mediaCrypto;
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    public interface b {
        l a(a aVar);
    }

    /* compiled from: MediaCodecAdapter.java */
    public interface c {
        void a(long j12);
    }

    void a(int i12);

    int b(MediaCodec.BufferInfo bufferInfo);

    @X
    void c(Surface surface);

    int d();

    @X
    void e(int i12, long j12);

    void f(int i12, int i13, long j12, int i14);

    void flush();

    @X
    void g(c cVar, Handler handler);

    @P
    ByteBuffer getInputBuffer(int i12);

    @P
    ByteBuffer getOutputBuffer(int i12);

    MediaFormat getOutputFormat();

    void h(int i12, com.google.android.exoplayer2.decoder.d dVar, long j12);

    void release();

    void releaseOutputBuffer(int i12, boolean z12);

    @X
    void setParameters(Bundle bundle);
}
