package x11;

import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import j.P;
import java.io.IOException;
import x11.d;

/* compiled from: DataSourceWrapper.java */
/* loaded from: classes7.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public g f442098a = null;

    @Override // x11.d
    public void a() {
        g gVar = this.f442098a;
        if (gVar.f442108i) {
            return;
        }
        gVar.a();
    }

    @Override // x11.d
    public final int b() {
        return this.f442098a.b();
    }

    @Override // x11.d
    public long c() {
        return this.f442098a.c();
    }

    @Override // x11.d
    public long d() {
        return this.f442098a.d();
    }

    @Override // x11.d
    public boolean e() {
        return this.f442098a.e();
    }

    @Override // x11.d
    public final void f(@N TrackType trackType) {
        this.f442098a.f(trackType);
    }

    @Override // x11.d
    public void g() throws IOException {
        this.f442098a.g();
    }

    @Override // x11.d
    public boolean h(@N TrackType trackType) {
        return this.f442098a.h(trackType);
    }

    @Override // x11.d
    public final void i(@N TrackType trackType) {
        this.f442098a.i(trackType);
    }

    @Override // x11.d
    public boolean isInitialized() {
        return this.f442098a.f442108i;
    }

    @Override // x11.d
    @P
    public final double[] j() {
        return this.f442098a.j();
    }

    @Override // x11.d
    public final void k(@N d.a aVar) {
        this.f442098a.k(aVar);
    }

    @Override // x11.d
    @P
    public final MediaFormat l(@N TrackType trackType) {
        return this.f442098a.l(trackType);
    }
}
