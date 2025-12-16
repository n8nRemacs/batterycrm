package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import j.P;
import j.X;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter.java */
@J
/* loaded from: classes.dex */
public interface l {

    /* compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n f49381a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f49382b;

        /* renamed from: c, reason: collision with root package name */
        public final C23108t f49383c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final Surface f49384d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final MediaCrypto f49385e;

        public a(n nVar, MediaFormat mediaFormat, C23108t c23108t, @P Surface surface, @P MediaCrypto mediaCrypto) {
            this.f49381a = nVar;
            this.f49382b = mediaFormat;
            this.f49383c = c23108t;
            this.f49384d = surface;
            this.f49385e = mediaCrypto;
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

    void g(int i12, androidx.media3.decoder.d dVar, long j12);

    @P
    ByteBuffer getInputBuffer(int i12);

    @P
    ByteBuffer getOutputBuffer(int i12);

    MediaFormat getOutputFormat();

    @X
    void h(c cVar, Handler handler);

    void release();

    void releaseOutputBuffer(int i12, boolean z12);

    @X
    void setParameters(Bundle bundle);
}
