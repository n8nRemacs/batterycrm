package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.source.A;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42154j;
import java.util.List;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes.dex */
final class X {

    /* renamed from: t, reason: collision with root package name */
    public static final A.b f48592t = new A.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.P f48593a;

    /* renamed from: b, reason: collision with root package name */
    public final A.b f48594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f48595c;

    /* renamed from: d, reason: collision with root package name */
    public final long f48596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48597e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final ExoPlaybackException f48598f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48599g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.Y f48600h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.s f48601i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Metadata> f48602j;

    /* renamed from: k, reason: collision with root package name */
    public final A.b f48603k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f48604l;

    /* renamed from: m, reason: collision with root package name */
    public final int f48605m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.G f48606n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f48607o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f48608p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f48609q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f48610r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f48611s;

    public X(androidx.media3.common.P p12, A.b bVar, long j12, long j13, int i12, @j.P ExoPlaybackException exoPlaybackException, boolean z12, androidx.media3.exoplayer.source.Y y12, androidx.media3.exoplayer.trackselection.s sVar, List<Metadata> list, A.b bVar2, boolean z13, int i13, androidx.media3.common.G g12, long j14, long j15, long j16, long j17, boolean z14) {
        this.f48593a = p12;
        this.f48594b = bVar;
        this.f48595c = j12;
        this.f48596d = j13;
        this.f48597e = i12;
        this.f48598f = exoPlaybackException;
        this.f48599g = z12;
        this.f48600h = y12;
        this.f48601i = sVar;
        this.f48602j = list;
        this.f48603k = bVar2;
        this.f48604l = z13;
        this.f48605m = i13;
        this.f48606n = g12;
        this.f48608p = j14;
        this.f48609q = j15;
        this.f48610r = j16;
        this.f48611s = j17;
        this.f48607o = z14;
    }

    public static X i(androidx.media3.exoplayer.trackselection.s sVar) {
        androidx.media3.common.P p12 = androidx.media3.common.P.f47368b;
        A.b bVar = f48592t;
        return new X(p12, bVar, -9223372036854775807L, 0L, 1, null, false, androidx.media3.exoplayer.source.Y.f49705e, sVar, AbstractC37401r1.C(), bVar, false, 0, androidx.media3.common.G.f47232e, 0L, 0L, 0L, 0L, false);
    }

    @InterfaceC42154j
    public final X a() {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, this.f48597e, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, this.f48604l, this.f48605m, this.f48606n, this.f48608p, this.f48609q, j(), SystemClock.elapsedRealtime(), this.f48607o);
    }

    @InterfaceC42154j
    public final X b(A.b bVar) {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, this.f48597e, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, bVar, this.f48604l, this.f48605m, this.f48606n, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    @InterfaceC42154j
    public final X c(A.b bVar, long j12, long j13, long j14, long j15, androidx.media3.exoplayer.source.Y y12, androidx.media3.exoplayer.trackselection.s sVar, List<Metadata> list) {
        return new X(this.f48593a, bVar, j13, j14, this.f48597e, this.f48598f, this.f48599g, y12, sVar, list, this.f48603k, this.f48604l, this.f48605m, this.f48606n, this.f48608p, j15, j12, SystemClock.elapsedRealtime(), this.f48607o);
    }

    @InterfaceC42154j
    public final X d(int i12, boolean z12) {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, this.f48597e, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, z12, i12, this.f48606n, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    @InterfaceC42154j
    public final X e(@j.P ExoPlaybackException exoPlaybackException) {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, this.f48597e, exoPlaybackException, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, this.f48604l, this.f48605m, this.f48606n, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    @InterfaceC42154j
    public final X f(androidx.media3.common.G g12) {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, this.f48597e, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, this.f48604l, this.f48605m, g12, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    @InterfaceC42154j
    public final X g(int i12) {
        return new X(this.f48593a, this.f48594b, this.f48595c, this.f48596d, i12, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, this.f48604l, this.f48605m, this.f48606n, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    @InterfaceC42154j
    public final X h(androidx.media3.common.P p12) {
        return new X(p12, this.f48594b, this.f48595c, this.f48596d, this.f48597e, this.f48598f, this.f48599g, this.f48600h, this.f48601i, this.f48602j, this.f48603k, this.f48604l, this.f48605m, this.f48606n, this.f48608p, this.f48609q, this.f48610r, this.f48611s, this.f48607o);
    }

    public final long j() {
        long j12;
        long j13;
        if (!k()) {
            return this.f48610r;
        }
        do {
            j12 = this.f48611s;
            j13 = this.f48610r;
        } while (j12 != this.f48611s);
        return androidx.media3.common.util.M.F(androidx.media3.common.util.M.Q(j13) + ((long) ((SystemClock.elapsedRealtime() - j12) * this.f48606n.f47236b)));
    }

    public final boolean k() {
        return this.f48597e == 3 && this.f48604l && this.f48605m == 0;
    }
}
