package x11;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import j.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x11.d;

/* compiled from: BlankAudioDataSource.java */
/* renamed from: x11.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49744b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final long f442089a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f442090b;

    /* renamed from: c, reason: collision with root package name */
    public MediaFormat f442091c;

    /* renamed from: d, reason: collision with root package name */
    public long f442092d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442093e = false;

    public C49744b(long j12) {
        this.f442089a = j12;
    }

    @Override // x11.d
    public final void a() {
        this.f442090b = ByteBuffer.allocateDirect(8192).order(ByteOrder.nativeOrder());
        MediaFormat mediaFormat = new MediaFormat();
        this.f442091c = mediaFormat;
        mediaFormat.setString("mime", "audio/raw");
        this.f442091c.setInteger("bitrate", 1411200);
        this.f442091c.setInteger("channel-count", 2);
        this.f442091c.setInteger("max-input-size", 8192);
        this.f442091c.setInteger("sample-rate", 44100);
        this.f442093e = true;
    }

    @Override // x11.d
    public final int b() {
        return 0;
    }

    @Override // x11.d
    public final long c() {
        return this.f442092d;
    }

    @Override // x11.d
    public final long d() {
        return this.f442089a;
    }

    @Override // x11.d
    public final boolean e() {
        return this.f442092d >= this.f442089a;
    }

    @Override // x11.d
    public final void g() {
        this.f442092d = 0L;
        this.f442093e = false;
    }

    @Override // x11.d
    public final boolean h(@N TrackType trackType) {
        return trackType == TrackType.f365974b;
    }

    @Override // x11.d
    public final boolean isInitialized() {
        return this.f442093e;
    }

    @Override // x11.d
    @P
    public final double[] j() {
        return null;
    }

    @Override // x11.d
    public final void k(@N d.a aVar) {
        int iPosition = aVar.f442094a.position();
        int iMin = Math.min(aVar.f442094a.remaining(), 8192);
        this.f442090b.clear();
        this.f442090b.limit(iMin);
        aVar.f442094a.put(this.f442090b);
        aVar.f442094a.position(iPosition);
        aVar.f442094a.limit(iPosition + iMin);
        aVar.f442095b = true;
        long j12 = this.f442092d;
        aVar.f442096c = j12;
        aVar.f442097d = true;
        this.f442092d = ((iMin * 1000000) / 176400) + j12;
    }

    @Override // x11.d
    @P
    public final MediaFormat l(@N TrackType trackType) {
        if (trackType == TrackType.f365974b) {
            return this.f442091c;
        }
        return null;
    }

    @Override // x11.d
    public final void f(@N TrackType trackType) {
    }

    @Override // x11.d
    public final void i(@N TrackType trackType) {
    }
}
