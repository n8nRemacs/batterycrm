package androidx.media3.common;

import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.B;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.P;
import androidx.media3.common.V;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import com.facebook.imageutils.JfifUtil;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42167x;
import j.k0;
import java.util.List;

/* compiled from: SimpleBasePlayer.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public abstract class K extends AbstractC23093g {

    /* compiled from: SimpleBasePlayer.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f47265a;

        /* renamed from: b, reason: collision with root package name */
        public final V f47266b;

        /* renamed from: c, reason: collision with root package name */
        public final z f47267c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final B f47268d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Object f47269e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final z.g f47270f;

        /* renamed from: g, reason: collision with root package name */
        public final long f47271g;

        /* renamed from: h, reason: collision with root package name */
        public final long f47272h;

        /* renamed from: i, reason: collision with root package name */
        public final long f47273i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f47274j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f47275k;

        /* renamed from: l, reason: collision with root package name */
        public final long f47276l;

        /* renamed from: m, reason: collision with root package name */
        public final long f47277m;

        /* renamed from: n, reason: collision with root package name */
        public final long f47278n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f47279o;

        /* renamed from: p, reason: collision with root package name */
        public final AbstractC37401r1<c> f47280p;

        /* compiled from: SimpleBasePlayer.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f47281a;

            /* renamed from: b, reason: collision with root package name */
            public final V f47282b;

            /* renamed from: c, reason: collision with root package name */
            public final z f47283c;

            /* renamed from: d, reason: collision with root package name */
            @j.P
            public final B f47284d;

            /* renamed from: e, reason: collision with root package name */
            @j.P
            public final Object f47285e;

            /* renamed from: f, reason: collision with root package name */
            @j.P
            public final z.g f47286f;

            /* renamed from: g, reason: collision with root package name */
            public final long f47287g;

            /* renamed from: h, reason: collision with root package name */
            public final long f47288h;

            /* renamed from: i, reason: collision with root package name */
            public final long f47289i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f47290j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f47291k;

            /* renamed from: l, reason: collision with root package name */
            public final long f47292l;

            /* renamed from: m, reason: collision with root package name */
            public final long f47293m;

            /* renamed from: n, reason: collision with root package name */
            public final long f47294n;

            /* renamed from: o, reason: collision with root package name */
            public final boolean f47295o;

            /* renamed from: p, reason: collision with root package name */
            public final AbstractC37401r1<c> f47296p;

            public a(b bVar, a aVar) {
                this.f47281a = bVar.f47265a;
                this.f47282b = bVar.f47266b;
                this.f47283c = bVar.f47267c;
                this.f47284d = bVar.f47268d;
                this.f47285e = bVar.f47269e;
                this.f47286f = bVar.f47270f;
                this.f47287g = bVar.f47271g;
                this.f47288h = bVar.f47272h;
                this.f47289i = bVar.f47273i;
                this.f47290j = bVar.f47274j;
                this.f47291k = bVar.f47275k;
                this.f47292l = bVar.f47276l;
                this.f47293m = bVar.f47277m;
                this.f47294n = bVar.f47278n;
                this.f47295o = bVar.f47279o;
                this.f47296p = bVar.f47280p;
            }
        }

        public b(a aVar, a aVar2) {
            if (aVar.f47286f == null) {
                C23110a.a("presentationStartTimeMs can only be set if liveConfiguration != null", aVar.f47287g == -9223372036854775807L);
                C23110a.a("windowStartTimeMs can only be set if liveConfiguration != null", aVar.f47288h == -9223372036854775807L);
                C23110a.a("elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null", aVar.f47289i == -9223372036854775807L);
            } else if (aVar.f47287g != -9223372036854775807L && aVar.f47288h != -9223372036854775807L) {
                C23110a.a("windowStartTimeMs can't be less than presentationStartTimeMs", aVar.f47288h >= aVar.f47287g);
            }
            int size = aVar.f47296p.size();
            if (aVar.f47293m != -9223372036854775807L) {
                C23110a.a("defaultPositionUs can't be greater than durationUs", aVar.f47292l <= aVar.f47293m);
            }
            this.f47265a = aVar.f47281a;
            V v12 = aVar.f47282b;
            this.f47266b = v12;
            z zVar = aVar.f47283c;
            this.f47267c = zVar;
            B b12 = aVar.f47284d;
            this.f47268d = b12;
            this.f47269e = aVar.f47285e;
            this.f47270f = aVar.f47286f;
            this.f47271g = aVar.f47287g;
            this.f47272h = aVar.f47288h;
            this.f47273i = aVar.f47289i;
            this.f47274j = aVar.f47290j;
            this.f47275k = aVar.f47291k;
            this.f47276l = aVar.f47292l;
            this.f47277m = aVar.f47293m;
            long j12 = aVar.f47294n;
            this.f47278n = j12;
            this.f47279o = aVar.f47295o;
            AbstractC37401r1<c> abstractC37401r1 = aVar.f47296p;
            this.f47280p = abstractC37401r1;
            long[] jArr = new long[abstractC37401r1.size()];
            if (!abstractC37401r1.isEmpty()) {
                jArr[0] = -j12;
                if (size - 1 > 0) {
                    abstractC37401r1.get(0);
                    throw null;
                }
            }
            if (b12 != null) {
                return;
            }
            B.b bVar = new B.b();
            int size2 = v12.a().size();
            for (int i12 = 0; i12 < size2; i12++) {
                V.a aVar3 = v12.a().get(i12);
                for (int i13 = 0; i13 < aVar3.f47544b; i13++) {
                    if (aVar3.b(i13)) {
                        C23108t c23108tA = aVar3.a(i13);
                        if (c23108tA.f47755k != null) {
                            int i14 = 0;
                            while (true) {
                                Metadata metadata = c23108tA.f47755k;
                                if (i14 < metadata.c()) {
                                    metadata.b(i14).J5(bVar);
                                    i14++;
                                }
                            }
                        }
                    }
                }
            }
            bVar.c(zVar.f47981e);
            bVar.a();
        }

        public static Object a(b bVar, int i12) {
            AbstractC37401r1<c> abstractC37401r1 = bVar.f47280p;
            boolean zIsEmpty = abstractC37401r1.isEmpty();
            Object obj = bVar.f47265a;
            if (zIsEmpty) {
                return obj;
            }
            abstractC37401r1.get(i12);
            throw null;
        }

        public static void b(b bVar, int i12, P.d dVar) {
            dVar.b(bVar.f47265a, bVar.f47267c, bVar.f47269e, bVar.f47271g, bVar.f47272h, bVar.f47273i, bVar.f47274j, bVar.f47275k, bVar.f47270f, bVar.f47276l, bVar.f47277m, i12, (i12 + (bVar.f47280p.isEmpty() ? 1 : r1.size())) - 1, bVar.f47278n);
            dVar.f47418m = bVar.f47279o;
        }

        public static void c(b bVar, int i12, int i13, P.b bVar2) {
            AbstractC37401r1<c> abstractC37401r1 = bVar.f47280p;
            if (!abstractC37401r1.isEmpty()) {
                abstractC37401r1.get(i13);
                throw null;
            }
            long j12 = bVar.f47278n + bVar.f47277m;
            C23089c c23089c = C23089c.f47615g;
            boolean z12 = bVar.f47279o;
            Object obj = bVar.f47265a;
            bVar2.p(obj, obj, i12, j12, 0L, c23089c, z12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47265a.equals(bVar.f47265a) && this.f47266b.equals(bVar.f47266b) && this.f47267c.equals(bVar.f47267c) && androidx.media3.common.util.M.a(this.f47268d, bVar.f47268d) && androidx.media3.common.util.M.a(this.f47269e, bVar.f47269e) && androidx.media3.common.util.M.a(this.f47270f, bVar.f47270f) && this.f47271g == bVar.f47271g && this.f47272h == bVar.f47272h && this.f47273i == bVar.f47273i && this.f47274j == bVar.f47274j && this.f47275k == bVar.f47275k && this.f47276l == bVar.f47276l && this.f47277m == bVar.f47277m && this.f47278n == bVar.f47278n && this.f47279o == bVar.f47279o && this.f47280p.equals(bVar.f47280p);
        }

        public final int hashCode() {
            int iHashCode = (this.f47267c.hashCode() + ((this.f47266b.f47538b.hashCode() + C23088b.a(JfifUtil.MARKER_EOI, 31, this.f47265a)) * 31)) * 31;
            B b12 = this.f47268d;
            int iHashCode2 = (iHashCode + (b12 == null ? 0 : b12.hashCode())) * 31;
            Object obj = this.f47269e;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            z.g gVar = this.f47270f;
            int iHashCode4 = gVar != null ? gVar.hashCode() : 0;
            long j12 = this.f47271g;
            int i12 = (((iHashCode3 + iHashCode4) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f47272h;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f47273i;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f47274j ? 1 : 0)) * 31) + (this.f47275k ? 1 : 0)) * 31;
            long j15 = this.f47276l;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f47277m;
            int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.f47278n;
            return this.f47280p.hashCode() + ((((i16 + ((int) (j17 ^ (j17 >>> 32)))) * 31) + (this.f47279o ? 1 : 0)) * 31);
        }
    }

    /* compiled from: SimpleBasePlayer.java */
    public static final class c {

        /* compiled from: SimpleBasePlayer.java */
        public static final class a {
            public a(c cVar, a aVar) {
                throw null;
            }
        }

        public c(a aVar, a aVar2) {
            throw null;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: SimpleBasePlayer.java */
    public static final class d {
        public d() {
        }
    }

    /* compiled from: SimpleBasePlayer.java */
    public static final class e extends P {
        @Override // androidx.media3.common.P
        public final int g(Object obj) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final P.b n(int i12, P.b bVar, boolean z12) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final P.b o(Object obj, P.b bVar) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final int p() {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final Object t(int i12) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final P.d u(int i12, P.d dVar, long j12) {
            throw null;
        }

        @Override // androidx.media3.common.P
        public final int w() {
            throw null;
        }
    }

    /* compiled from: SimpleBasePlayer.java */
    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final L f47297a = new L(0);

        long get();
    }

    @Override // androidx.media3.common.H
    public final boolean A() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void E(H.g gVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void F(H.g gVar) {
        throw null;
    }

    @Override // androidx.media3.common.H
    public final Looper G() {
        return null;
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void H(int i12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void I(@j.P Surface surface) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void K(B b12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void L(boolean z12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void M(List<z> list, int i12, long j12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void N() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void O(int i12, int i13, List<z> list) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void P(int i12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final C23091e Q() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void R(int i12, int i13) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void T(int i12, List<z> list) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long U() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void W(int i12, int i13, int i14) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    @j.P
    public final PlaybackException a() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.AbstractC23093g
    @k0
    public final void a0(int i12, long j12, boolean z12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long b() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void c(List list) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void d(G g12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final X e() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final U g() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long getContentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdGroupIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentAdIndexInAdGroup() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentMediaItemIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getCurrentPeriodIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long getCurrentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final P getCurrentTimeline() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final V getCurrentTracks() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final C23104o getDeviceInfo() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long getDuration() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final boolean getPlayWhenReady() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final G getPlaybackParameters() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackState() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getPlaybackSuppressionReason() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int getRepeatMode() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long getTotalBufferedDuration() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final float getVolume() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void h(boolean z12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final boolean isLoading() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final boolean isPlayingAd() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long j() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long l() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final androidx.media3.common.text.b m() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final H.c n() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final boolean o() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final B p() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void prepare() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final long q() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void r(int i12, boolean z12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void release() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void s(int i12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void setPlayWhenReady(boolean z12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void setRepeatMode(int i12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void setVolume(float f12) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void stop() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void t(int i12, int i13) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    @Deprecated
    public final void v() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final int w() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final B y() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.H
    public final void z(U u12) {
        Thread.currentThread();
        throw null;
    }

    /* compiled from: SimpleBasePlayer.java */
    public static final class g {

        /* renamed from: A, reason: collision with root package name */
        public final L f47298A;

        /* renamed from: B, reason: collision with root package name */
        public final int f47299B;

        /* renamed from: a, reason: collision with root package name */
        public final H.c f47300a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47301b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47302c;

        /* renamed from: d, reason: collision with root package name */
        public final long f47303d;

        /* renamed from: e, reason: collision with root package name */
        public final long f47304e;

        /* renamed from: f, reason: collision with root package name */
        public final long f47305f;

        /* renamed from: g, reason: collision with root package name */
        public final G f47306g;

        /* renamed from: h, reason: collision with root package name */
        public final U f47307h;

        /* renamed from: i, reason: collision with root package name */
        public final C23091e f47308i;

        /* renamed from: j, reason: collision with root package name */
        @InterfaceC42167x
        public final float f47309j;

        /* renamed from: k, reason: collision with root package name */
        public final X f47310k;

        /* renamed from: l, reason: collision with root package name */
        public final androidx.media3.common.text.b f47311l;

        /* renamed from: m, reason: collision with root package name */
        public final C23104o f47312m;

        /* renamed from: n, reason: collision with root package name */
        @j.F
        public final int f47313n;

        /* renamed from: o, reason: collision with root package name */
        public final androidx.media3.common.util.C f47314o;

        /* renamed from: p, reason: collision with root package name */
        public final Metadata f47315p;

        /* renamed from: q, reason: collision with root package name */
        public final AbstractC37401r1<b> f47316q;

        /* renamed from: r, reason: collision with root package name */
        public final P f47317r;

        /* renamed from: s, reason: collision with root package name */
        public final B f47318s;

        /* renamed from: t, reason: collision with root package name */
        public final int f47319t;

        /* renamed from: u, reason: collision with root package name */
        public final int f47320u;

        /* renamed from: v, reason: collision with root package name */
        public final int f47321v;

        /* renamed from: w, reason: collision with root package name */
        public final f f47322w;

        /* renamed from: x, reason: collision with root package name */
        public final f f47323x;

        /* renamed from: y, reason: collision with root package name */
        public final L f47324y;

        /* renamed from: z, reason: collision with root package name */
        public final f f47325z;

        public g(a aVar, a aVar2) {
            int i12;
            boolean zX2 = aVar.f47346r.x();
            f l12 = aVar.f47352x;
            if (zX2) {
                int i13 = aVar.f47331c;
                C23110a.a("Empty playlist only allowed in STATE_IDLE or STATE_ENDED", i13 == 1 || i13 == 4);
                if (aVar.f47349u == -1 && aVar.f47350v == -1) {
                    z = true;
                }
                C23110a.a("Ads not allowed if playlist is empty", z);
            } else {
                int i14 = aVar.f47348t;
                if (i14 == -1) {
                    i12 = 0;
                } else {
                    C23110a.a("currentMediaItemIndex must be less than playlist.size()", i14 < aVar.f47346r.w());
                    i12 = i14;
                }
                if (aVar.f47349u != -1) {
                    P.b bVar = new P.b();
                    P.d dVar = new P.d();
                    Long l13 = aVar.f47351w;
                    long jLongValue = l13 != null ? l13.longValue() : l12.get();
                    P p12 = aVar.f47346r;
                    aVar.f47346r.n(p12.g(p12.q(dVar, bVar, i12, androidx.media3.common.util.M.F(jLongValue)).first), bVar, false);
                    C23110a.a("PeriodData has less ad groups than adGroupIndex", aVar.f47349u < bVar.f47385h.f47622b);
                    int i15 = bVar.f47385h.a(aVar.f47349u).f47637c;
                    if (i15 != -1) {
                        C23110a.a("Ad group has less ads than adIndexInGroupIndex", aVar.f47350v < i15);
                    }
                }
            }
            if (aVar.f47331c != 1) {
            }
            Long l14 = aVar.f47351w;
            l12 = l14 != null ? new L(l14.longValue()) : l12;
            f fVar = aVar.f47353y;
            this.f47300a = aVar.f47329a;
            this.f47301b = aVar.f47330b;
            this.f47302c = aVar.f47331c;
            this.f47303d = aVar.f47332d;
            this.f47304e = aVar.f47333e;
            this.f47305f = aVar.f47334f;
            this.f47306g = aVar.f47335g;
            this.f47307h = aVar.f47336h;
            this.f47308i = aVar.f47337i;
            this.f47309j = aVar.f47338j;
            this.f47310k = aVar.f47339k;
            this.f47311l = aVar.f47340l;
            this.f47312m = aVar.f47341m;
            this.f47313n = aVar.f47342n;
            this.f47314o = aVar.f47343o;
            this.f47315p = aVar.f47344p;
            this.f47316q = aVar.f47345q;
            this.f47317r = aVar.f47346r;
            this.f47318s = aVar.f47347s;
            this.f47319t = aVar.f47348t;
            this.f47320u = aVar.f47349u;
            this.f47321v = aVar.f47350v;
            this.f47322w = l12;
            this.f47323x = fVar;
            this.f47324y = aVar.f47354z;
            this.f47325z = aVar.f47326A;
            this.f47298A = aVar.f47327B;
            this.f47299B = aVar.f47328C;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            gVar.getClass();
            return this.f47301b == gVar.f47301b && this.f47300a.equals(gVar.f47300a) && this.f47302c == gVar.f47302c && androidx.media3.common.util.M.a(null, null) && this.f47303d == gVar.f47303d && this.f47304e == gVar.f47304e && this.f47305f == gVar.f47305f && this.f47306g.equals(gVar.f47306g) && this.f47307h.equals(gVar.f47307h) && this.f47308i.equals(gVar.f47308i) && this.f47309j == gVar.f47309j && this.f47310k.equals(gVar.f47310k) && this.f47311l.equals(gVar.f47311l) && this.f47312m.equals(gVar.f47312m) && this.f47313n == gVar.f47313n && this.f47314o.equals(gVar.f47314o) && this.f47315p.equals(gVar.f47315p) && this.f47316q.equals(gVar.f47316q) && this.f47318s.equals(gVar.f47318s) && this.f47319t == gVar.f47319t && this.f47320u == gVar.f47320u && this.f47321v == gVar.f47321v && this.f47322w.equals(gVar.f47322w) && this.f47323x.equals(gVar.f47323x) && this.f47324y.equals(gVar.f47324y) && this.f47325z.equals(gVar.f47325z) && this.f47298A.equals(gVar.f47298A) && this.f47299B == gVar.f47299B;
        }

        public final int hashCode() {
            int iHashCode = (((((this.f47300a.f47242b.hashCode() + JfifUtil.MARKER_EOI) * 961) + this.f47301b) * 31) + this.f47302c) * 887503681;
            long j12 = this.f47303d;
            int i12 = (iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f47304e;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f47305f;
            return ((((this.f47298A.hashCode() + ((this.f47325z.hashCode() + ((this.f47324y.hashCode() + ((this.f47323x.hashCode() + ((this.f47322w.hashCode() + ((((((((this.f47318s.hashCode() + ((this.f47316q.hashCode() + ((this.f47315p.hashCode() + ((this.f47314o.hashCode() + ((((this.f47312m.hashCode() + ((this.f47311l.hashCode() + ((this.f47310k.hashCode() + ((Float.floatToRawIntBits(this.f47309j) + ((this.f47308i.hashCode() + ((this.f47307h.hashCode() + ((this.f47306g.hashCode() + ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f47313n) * 961)) * 961)) * 31)) * 31)) * 31) + this.f47319t) * 31) + this.f47320u) * 31) + this.f47321v) * 31)) * 31)) * 31)) * 31)) * 31)) * 961) + this.f47299B) * 31) + ((int) 0);
        }

        /* compiled from: SimpleBasePlayer.java */
        public static final class a {

            /* renamed from: A, reason: collision with root package name */
            public final f f47326A;

            /* renamed from: B, reason: collision with root package name */
            public final L f47327B;

            /* renamed from: C, reason: collision with root package name */
            public final int f47328C;

            /* renamed from: a, reason: collision with root package name */
            public final H.c f47329a;

            /* renamed from: b, reason: collision with root package name */
            public final int f47330b;

            /* renamed from: c, reason: collision with root package name */
            public final int f47331c;

            /* renamed from: d, reason: collision with root package name */
            public final long f47332d;

            /* renamed from: e, reason: collision with root package name */
            public final long f47333e;

            /* renamed from: f, reason: collision with root package name */
            public final long f47334f;

            /* renamed from: g, reason: collision with root package name */
            public final G f47335g;

            /* renamed from: h, reason: collision with root package name */
            public final U f47336h;

            /* renamed from: i, reason: collision with root package name */
            public final C23091e f47337i;

            /* renamed from: j, reason: collision with root package name */
            public final float f47338j;

            /* renamed from: k, reason: collision with root package name */
            public final X f47339k;

            /* renamed from: l, reason: collision with root package name */
            public final androidx.media3.common.text.b f47340l;

            /* renamed from: m, reason: collision with root package name */
            public final C23104o f47341m;

            /* renamed from: n, reason: collision with root package name */
            public final int f47342n;

            /* renamed from: o, reason: collision with root package name */
            public final androidx.media3.common.util.C f47343o;

            /* renamed from: p, reason: collision with root package name */
            public final Metadata f47344p;

            /* renamed from: q, reason: collision with root package name */
            public final AbstractC37401r1<b> f47345q;

            /* renamed from: r, reason: collision with root package name */
            public final P f47346r;

            /* renamed from: s, reason: collision with root package name */
            public final B f47347s;

            /* renamed from: t, reason: collision with root package name */
            public final int f47348t;

            /* renamed from: u, reason: collision with root package name */
            public final int f47349u;

            /* renamed from: v, reason: collision with root package name */
            public final int f47350v;

            /* renamed from: w, reason: collision with root package name */
            @j.P
            public final Long f47351w;

            /* renamed from: x, reason: collision with root package name */
            public final f f47352x;

            /* renamed from: y, reason: collision with root package name */
            public final f f47353y;

            /* renamed from: z, reason: collision with root package name */
            public final L f47354z;

            public a() {
                this.f47329a = H.c.f47239c;
                this.f47330b = 1;
                this.f47331c = 1;
                this.f47332d = 5000L;
                this.f47333e = 15000L;
                this.f47334f = 3000L;
                this.f47335g = G.f47232e;
                this.f47336h = U.f47456B;
                this.f47337i = C23091e.f47644h;
                this.f47338j = 1.0f;
                this.f47339k = X.f47549f;
                this.f47340l = androidx.media3.common.text.b.f47856d;
                this.f47341m = C23104o.f47686f;
                this.f47342n = 0;
                this.f47343o = androidx.media3.common.util.C.f47872c;
                this.f47344p = new Metadata(-9223372036854775807L, new Metadata.Entry[0]);
                this.f47345q = AbstractC37401r1.C();
                this.f47346r = P.f47368b;
                this.f47347s = B.f47110J;
                this.f47348t = -1;
                this.f47349u = -1;
                this.f47350v = -1;
                this.f47351w = null;
                this.f47352x = new L(-9223372036854775807L);
                L l12 = f.f47297a;
                this.f47353y = l12;
                this.f47354z = new L(-9223372036854775807L);
                this.f47326A = l12;
                this.f47327B = l12;
                this.f47328C = 5;
            }

            public a(g gVar, a aVar) {
                this.f47329a = gVar.f47300a;
                this.f47330b = gVar.f47301b;
                this.f47331c = gVar.f47302c;
                this.f47332d = gVar.f47303d;
                this.f47333e = gVar.f47304e;
                this.f47334f = gVar.f47305f;
                this.f47335g = gVar.f47306g;
                this.f47336h = gVar.f47307h;
                this.f47337i = gVar.f47308i;
                this.f47338j = gVar.f47309j;
                this.f47339k = gVar.f47310k;
                this.f47340l = gVar.f47311l;
                this.f47341m = gVar.f47312m;
                this.f47342n = gVar.f47313n;
                this.f47343o = gVar.f47314o;
                this.f47344p = gVar.f47315p;
                this.f47345q = gVar.f47316q;
                this.f47346r = gVar.f47317r;
                this.f47347s = gVar.f47318s;
                this.f47348t = gVar.f47319t;
                this.f47349u = gVar.f47320u;
                this.f47350v = gVar.f47321v;
                this.f47351w = null;
                this.f47352x = gVar.f47322w;
                this.f47353y = gVar.f47323x;
                this.f47354z = gVar.f47324y;
                this.f47326A = gVar.f47325z;
                this.f47327B = gVar.f47298A;
                this.f47328C = gVar.f47299B;
            }
        }
    }
}
