package androidx.media3.common;

import aZ0.InterfaceC19845a;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.C23107s;
import j.InterfaceC42167x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Player.java */
/* loaded from: classes.dex */
public interface H {

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: Player.java */
    public static final class c implements InterfaceC23096j {

        /* renamed from: c, reason: collision with root package name */
        public static final c f47239c = new a().c();

        /* renamed from: d, reason: collision with root package name */
        public static final String f47240d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f47241e;

        /* renamed from: b, reason: collision with root package name */
        public final C23107s f47242b;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47240d = Integer.toString(0, 36);
            f47241e = new C23088b(20);
        }

        public c(C23107s c23107s, a aVar) {
            this.f47242b = c23107s;
        }

        public final boolean a(int i12) {
            return this.f47242b.f47700a.get(i12);
        }

        public final boolean b(int... iArr) {
            return this.f47242b.a(iArr);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f47242b.equals(((c) obj).f47242b);
            }
            return false;
        }

        public final int g() {
            return this.f47242b.f47700a.size();
        }

        public final int hashCode() {
            return this.f47242b.hashCode();
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i12 = 0;
            while (true) {
                C23107s c23107s = this.f47242b;
                if (i12 >= c23107s.f47700a.size()) {
                    bundle.putIntegerArrayList(f47240d, arrayList);
                    return bundle;
                }
                arrayList.add(Integer.valueOf(c23107s.b(i12)));
                i12++;
            }
        }

        /* compiled from: Player.java */
        @androidx.media3.common.util.J
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final int[] f47243b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            public final C23107s.b f47244a;

            public a() {
                this.f47244a = new C23107s.b();
            }

            @InterfaceC19845a
            public final void a(int i12) {
                this.f47244a.a(i12);
            }

            @InterfaceC19845a
            public final void b(int i12, boolean z12) {
                C23107s.b bVar = this.f47244a;
                if (z12) {
                    bVar.a(i12);
                } else {
                    bVar.getClass();
                }
            }

            public final c c() {
                return new c(this.f47244a.c(), null);
            }

            public a(c cVar, a aVar) {
                C23107s.b bVar = new C23107s.b();
                this.f47244a = bVar;
                C23107s c23107s = cVar.f47242b;
                for (int i12 = 0; i12 < c23107s.f47700a.size(); i12++) {
                    bVar.a(c23107s.b(i12));
                }
            }
        }
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: Player.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final C23107s f47245a;

        @androidx.media3.common.util.J
        public f(C23107s c23107s) {
            this.f47245a = c23107s;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f47245a.equals(((f) obj).f47245a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47245a.hashCode();
        }
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    /* compiled from: Player.java */
    public static final class k implements InterfaceC23096j {

        /* renamed from: k, reason: collision with root package name */
        public static final String f47246k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f47247l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f47248m;

        /* renamed from: n, reason: collision with root package name */
        public static final String f47249n;

        /* renamed from: o, reason: collision with root package name */
        public static final String f47250o;

        /* renamed from: p, reason: collision with root package name */
        public static final String f47251p;

        /* renamed from: q, reason: collision with root package name */
        public static final String f47252q;

        /* renamed from: r, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final C23088b f47253r;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Object f47254b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47255c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.media3.common.util.J
        @j.P
        public final z f47256d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Object f47257e;

        /* renamed from: f, reason: collision with root package name */
        public final int f47258f;

        /* renamed from: g, reason: collision with root package name */
        public final long f47259g;

        /* renamed from: h, reason: collision with root package name */
        public final long f47260h;

        /* renamed from: i, reason: collision with root package name */
        public final int f47261i;

        /* renamed from: j, reason: collision with root package name */
        public final int f47262j;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47246k = Integer.toString(0, 36);
            f47247l = Integer.toString(1, 36);
            f47248m = Integer.toString(2, 36);
            f47249n = Integer.toString(3, 36);
            f47250o = Integer.toString(4, 36);
            f47251p = Integer.toString(5, 36);
            f47252q = Integer.toString(6, 36);
            f47253r = new C23088b(21);
        }

        @androidx.media3.common.util.J
        public k(@j.P Object obj, int i12, @j.P z zVar, @j.P Object obj2, int i13, long j12, long j13, int i14, int i15) {
            this.f47254b = obj;
            this.f47255c = i12;
            this.f47256d = zVar;
            this.f47257e = obj2;
            this.f47258f = i13;
            this.f47259g = j12;
            this.f47260h = j13;
            this.f47261i = i14;
            this.f47262j = i15;
        }

        @androidx.media3.common.util.J
        public final Bundle a(boolean z12, boolean z13) {
            Bundle bundle = new Bundle();
            bundle.putInt(f47246k, z13 ? this.f47255c : 0);
            z zVar = this.f47256d;
            if (zVar != null && z12) {
                bundle.putBundle(f47247l, zVar.a(false));
            }
            bundle.putInt(f47248m, z13 ? this.f47258f : 0);
            bundle.putLong(f47249n, z12 ? this.f47259g : 0L);
            bundle.putLong(f47250o, z12 ? this.f47260h : 0L);
            bundle.putInt(f47251p, z12 ? this.f47261i : -1);
            bundle.putInt(f47252q, z12 ? this.f47262j : -1);
            return bundle;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || k.class != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            return this.f47255c == kVar.f47255c && this.f47258f == kVar.f47258f && this.f47259g == kVar.f47259g && this.f47260h == kVar.f47260h && this.f47261i == kVar.f47261i && this.f47262j == kVar.f47262j && com.google.common.base.F.a(this.f47254b, kVar.f47254b) && com.google.common.base.F.a(this.f47257e, kVar.f47257e) && com.google.common.base.F.a(this.f47256d, kVar.f47256d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f47254b, Integer.valueOf(this.f47255c), this.f47256d, this.f47257e, Integer.valueOf(this.f47258f), Long.valueOf(this.f47259g), Long.valueOf(this.f47260h), Integer.valueOf(this.f47261i), Integer.valueOf(this.f47262j)});
        }

        @Override // androidx.media3.common.InterfaceC23096j
        @androidx.media3.common.util.J
        public final Bundle k() {
            return a(true, true);
        }
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    boolean A();

    @j.P
    z B();

    @j.F
    int C();

    void D();

    void E(g gVar);

    void F(g gVar);

    Looper G();

    @Deprecated
    void H(@j.F int i12);

    void I(@j.P Surface surface);

    void K(B b12);

    @Deprecated
    void L(boolean z12);

    void M(List<z> list, int i12, long j12);

    @Deprecated
    void N();

    void O(int i12, int i13, List<z> list);

    void P(int i12);

    C23091e Q();

    void R(@j.F int i12, int i13);

    void S(z zVar);

    void T(int i12, List<z> list);

    long U();

    void V(z zVar, long j12);

    void W(int i12, int i13, int i14);

    @j.P
    PlaybackException a();

    long b();

    void c(List list);

    void d(G g12);

    X e();

    void f(z zVar);

    U g();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    P getCurrentTimeline();

    V getCurrentTracks();

    C23104o getDeviceInfo();

    long getDuration();

    boolean getPlayWhenReady();

    G getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getRepeatMode();

    long getTotalBufferedDuration();

    @InterfaceC42167x
    float getVolume();

    void h(boolean z12);

    long i();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isLoading();

    boolean isPlayingAd();

    long j();

    boolean k();

    long l();

    androidx.media3.common.text.b m();

    c n();

    boolean o();

    B p();

    void pause();

    void play();

    void prepare();

    long q();

    void r(int i12, boolean z12);

    void release();

    void s(int i12);

    void seekTo(long j12);

    void setPlayWhenReady(boolean z12);

    void setPlaybackSpeed(@InterfaceC42167x float f12);

    void setRepeatMode(int i12);

    void setVolume(@InterfaceC42167x float f12);

    void stop();

    void t(int i12, int i13);

    boolean u(int i12);

    @Deprecated
    void v();

    @j.F
    int w();

    long x();

    B y();

    void z(U u12);

    /* compiled from: Player.java */
    public interface g {
        default void onRenderedFirstFrame() {
        }

        default void C(f fVar) {
        }

        default void D(C23091e c23091e) {
        }

        default void E(B b12) {
        }

        default void a(androidx.media3.common.text.b bVar) {
        }

        default void b(X x12) {
        }

        @androidx.media3.common.util.J
        default void d(Metadata metadata) {
        }

        default void e(B b12) {
        }

        default void g(PlaybackException playbackException) {
        }

        default void i(long j12) {
        }

        default void j(V v12) {
        }

        default void k(C23104o c23104o) {
        }

        default void m(G g12) {
        }

        @androidx.media3.common.util.J
        @Deprecated
        default void onCues(List<androidx.media3.common.text.a> list) {
        }

        default void onIsLoadingChanged(boolean z12) {
        }

        default void onIsPlayingChanged(boolean z12) {
        }

        @androidx.media3.common.util.J
        @Deprecated
        default void onLoadingChanged(boolean z12) {
        }

        default void onPlaybackStateChanged(int i12) {
        }

        default void onPlaybackSuppressionReasonChanged(int i12) {
        }

        @androidx.media3.common.util.J
        @Deprecated
        default void onPositionDiscontinuity(int i12) {
        }

        default void onRepeatModeChanged(int i12) {
        }

        default void onShuffleModeEnabledChanged(boolean z12) {
        }

        default void onSkipSilenceEnabledChanged(boolean z12) {
        }

        default void onVolumeChanged(float f12) {
        }

        default void p(@j.P PlaybackException playbackException) {
        }

        default void q(long j12) {
        }

        default void s(c cVar) {
        }

        default void y(long j12) {
        }

        default void z(U u12) {
        }

        default void onDeviceVolumeChanged(int i12, boolean z12) {
        }

        default void onPlayWhenReadyChanged(boolean z12, int i12) {
        }

        @androidx.media3.common.util.J
        @Deprecated
        default void onPlayerStateChanged(boolean z12, int i12) {
        }

        default void onSurfaceSizeChanged(int i12, int i13) {
        }

        default void v(P p12, int i12) {
        }

        default void w(int i12, @j.P z zVar) {
        }

        default void t(int i12, k kVar, k kVar2) {
        }
    }
}
