package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.n;
import com.google.android.exoplayer2.upstream.z;
import j.P;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
    }

    public static final class PlaylistStuckException extends IOException {
    }

    public interface a {
    }

    public interface b {
        void a();

        boolean b(Uri uri, z.d dVar, boolean z12);
    }

    public interface c {
    }

    void a(n nVar);

    void b(Uri uri, A.a aVar, HlsMediaSource hlsMediaSource);

    @P
    g c();

    @P
    f d(boolean z12, Uri uri);

    void e();

    long f();

    void g(n nVar);

    void i(Uri uri);

    void k(Uri uri);

    boolean m(Uri uri);

    boolean n();

    boolean o(Uri uri, long j12);

    void stop();
}
