package x11;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: DataSource.java */
/* loaded from: classes7.dex */
public interface d {

    /* compiled from: DataSource.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ByteBuffer f442094a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f442095b;

        /* renamed from: c, reason: collision with root package name */
        public long f442096c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f442097d;
    }

    void a();

    int b();

    long c();

    long d();

    boolean e();

    void f(@N TrackType trackType);

    void g();

    boolean h(@N TrackType trackType);

    void i(@N TrackType trackType);

    boolean isInitialized();

    @P
    double[] j();

    void k(@N a aVar);

    @P
    MediaFormat l(@N TrackType trackType);
}
