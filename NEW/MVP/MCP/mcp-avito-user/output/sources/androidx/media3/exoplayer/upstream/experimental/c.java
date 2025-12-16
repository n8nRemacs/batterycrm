package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.upstream.d;

/* compiled from: CombinedParallelSampleBandwidthEstimator.java */
@J
/* loaded from: classes.dex */
public class c implements androidx.media3.exoplayer.upstream.experimental.a {

    /* renamed from: a, reason: collision with root package name */
    public final i f50073a;

    /* renamed from: c, reason: collision with root package name */
    public final D f50075c;

    /* renamed from: d, reason: collision with root package name */
    public int f50076d;

    /* renamed from: e, reason: collision with root package name */
    public long f50077e;

    /* renamed from: f, reason: collision with root package name */
    public long f50078f;

    /* renamed from: i, reason: collision with root package name */
    public int f50081i;

    /* renamed from: j, reason: collision with root package name */
    public long f50082j;

    /* renamed from: b, reason: collision with root package name */
    public final d.a.C1840a f50074b = new d.a.C1840a();

    /* renamed from: g, reason: collision with root package name */
    public long f50079g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public long f50080h = Long.MIN_VALUE;

    /* compiled from: CombinedParallelSampleBandwidthEstimator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final i f50083a = new i();

        /* renamed from: b, reason: collision with root package name */
        public final D f50084b = InterfaceC23115f.f47901a;
    }

    public c(b bVar, a aVar) {
        this.f50073a = bVar.f50083a;
        this.f50075c = bVar.f50084b;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void a(d.a aVar) {
        this.f50074b.c(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
        this.f50074b.a(handler, aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void c(int i12) {
        long j12 = i12;
        this.f50078f += j12;
        this.f50082j += j12;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void d() {
        C23110a.g(this.f50076d > 0);
        int i12 = this.f50076d - 1;
        this.f50076d = i12;
        if (i12 > 0) {
            return;
        }
        this.f50075c.getClass();
        long jElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f50077e);
        if (jElapsedRealtime > 0) {
            i iVar = this.f50073a;
            iVar.a(this.f50078f, 1000 * jElapsedRealtime);
            int i13 = this.f50081i + 1;
            this.f50081i = i13;
            if (i13 > 0 && this.f50082j > 0) {
                this.f50079g = iVar.f50100a.isEmpty() ? Long.MIN_VALUE : (long) (iVar.f50103d / iVar.f50104e);
            }
            g((int) jElapsedRealtime, this.f50078f, this.f50079g);
            this.f50078f = 0L;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void e() {
        if (this.f50076d == 0) {
            this.f50075c.getClass();
            this.f50077e = SystemClock.elapsedRealtime();
        }
        this.f50076d++;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void f(long j12) {
        this.f50075c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g(this.f50076d > 0 ? (int) (jElapsedRealtime - this.f50077e) : 0, this.f50078f, j12);
        i iVar = this.f50073a;
        iVar.f50100a.clear();
        iVar.f50103d = 0.0d;
        iVar.f50104e = 0.0d;
        this.f50079g = Long.MIN_VALUE;
        this.f50077e = jElapsedRealtime;
        this.f50078f = 0L;
        this.f50081i = 0;
        this.f50082j = 0L;
    }

    public final void g(int i12, long j12, long j13) {
        if (j13 != Long.MIN_VALUE) {
            if (i12 == 0 && j12 == 0 && j13 == this.f50080h) {
                return;
            }
            this.f50080h = j13;
            this.f50074b.b(i12, j12, j13);
        }
    }
}
