package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.D;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.upstream.d;

/* compiled from: SplitParallelSampleBandwidthEstimator.java */
@J
/* loaded from: classes.dex */
public class j implements androidx.media3.exoplayer.upstream.experimental.a {

    /* renamed from: a, reason: collision with root package name */
    public final i f50107a;

    /* renamed from: b, reason: collision with root package name */
    public final D f50108b;

    /* renamed from: d, reason: collision with root package name */
    public int f50110d;

    /* renamed from: e, reason: collision with root package name */
    public long f50111e;

    /* renamed from: f, reason: collision with root package name */
    public long f50112f;

    /* renamed from: i, reason: collision with root package name */
    public int f50115i;

    /* renamed from: j, reason: collision with root package name */
    public long f50116j;

    /* renamed from: c, reason: collision with root package name */
    public final d.a.C1840a f50109c = new d.a.C1840a();

    /* renamed from: g, reason: collision with root package name */
    public long f50113g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public long f50114h = Long.MIN_VALUE;

    /* compiled from: SplitParallelSampleBandwidthEstimator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final i f50117a = new i();

        /* renamed from: b, reason: collision with root package name */
        public final D f50118b = InterfaceC23115f.f47901a;
    }

    public j(b bVar, a aVar) {
        this.f50107a = bVar.f50117a;
        this.f50108b = bVar.f50118b;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void a(d.a aVar) {
        this.f50109c.c(aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void b(Handler handler, androidx.media3.exoplayer.analytics.a aVar) {
        this.f50109c.a(handler, aVar);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void c(int i12) {
        long j12 = i12;
        this.f50112f += j12;
        this.f50116j += j12;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void d() {
        C23110a.g(this.f50110d > 0);
        this.f50108b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = (int) (jElapsedRealtime - this.f50111e);
        if (j12 > 0) {
            i iVar = this.f50107a;
            iVar.a(this.f50112f, 1000 * j12);
            int i12 = this.f50115i + 1;
            this.f50115i = i12;
            if (i12 > 0 && this.f50116j > 0) {
                this.f50113g = iVar.f50100a.isEmpty() ? Long.MIN_VALUE : (long) (iVar.f50103d / iVar.f50104e);
            }
            g((int) j12, this.f50112f, this.f50113g);
            this.f50111e = jElapsedRealtime;
            this.f50112f = 0L;
        }
        this.f50110d--;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void e() {
        if (this.f50110d == 0) {
            this.f50108b.getClass();
            this.f50111e = SystemClock.elapsedRealtime();
        }
        this.f50110d++;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.a
    public final void f(long j12) {
        this.f50108b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g(this.f50110d > 0 ? (int) (jElapsedRealtime - this.f50111e) : 0, this.f50112f, j12);
        i iVar = this.f50107a;
        iVar.f50100a.clear();
        iVar.f50103d = 0.0d;
        iVar.f50104e = 0.0d;
        this.f50113g = Long.MIN_VALUE;
        this.f50111e = jElapsedRealtime;
        this.f50112f = 0L;
        this.f50115i = 0;
        this.f50116j = 0L;
    }

    public final void g(int i12, long j12, long j13) {
        if (j13 != Long.MIN_VALUE) {
            if (i12 == 0 && j12 == 0 && j13 == this.f50114h) {
                return;
            }
            this.f50114h = j13;
            this.f50109c.b(i12, j12, j13);
        }
    }
}
