package x11;

import com.otaliastudios.transcoder.common.TrackType;
import j.N;
import java.io.IOException;

/* compiled from: TrimDataSource.java */
/* loaded from: classes7.dex */
public class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f442114b;

    @Override // x11.e, x11.d
    public final void a() {
        super.a();
        long jD2 = this.f442098a.d();
        if (0 >= jD2) {
            throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
        }
        this.f442114b = jD2;
    }

    @Override // x11.e, x11.d
    public final long c() {
        super.c();
        throw null;
    }

    @Override // x11.e, x11.d
    public final long d() {
        throw null;
    }

    @Override // x11.e, x11.d
    public final boolean e() {
        return super.e() || c() >= d();
    }

    @Override // x11.e, x11.d
    public final void g() throws IOException {
        super.g();
        this.f442114b = Long.MIN_VALUE;
    }

    @Override // x11.e, x11.d
    public final boolean h(@N TrackType trackType) {
        return this.f442098a.h(trackType);
    }

    @Override // x11.e, x11.d
    public final boolean isInitialized() {
        return super.isInitialized() && this.f442114b != Long.MIN_VALUE;
    }
}
