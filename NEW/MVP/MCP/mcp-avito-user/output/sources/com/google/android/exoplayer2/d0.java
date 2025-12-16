package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36599o;
import j.InterfaceC42167x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* compiled from: Player.java */
/* loaded from: classes6.dex */
public interface d0 {

    /* compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: Player.java */
    public static final class c implements InterfaceC36525h {

        /* renamed from: b, reason: collision with root package name */
        public final C36599o f344191b;

        static {
            new a().b();
        }

        public c(C36599o c36599o, a aVar) {
            this.f344191b = c36599o;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f344191b.equals(((c) obj).f344191b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f344191b.hashCode();
        }

        /* compiled from: Player.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final C36599o.b f344192a;

            public a() {
                this.f344192a = new C36599o.b();
            }

            public final void a(int i12, boolean z12) {
                C36599o.b bVar = this.f344192a;
                if (z12) {
                    bVar.a(i12);
                } else {
                    bVar.getClass();
                }
            }

            public final c b() {
                return new c(this.f344192a.b(), null);
            }

            public a(c cVar, a aVar) {
                C36599o.b bVar = new C36599o.b();
                this.f344192a = bVar;
                C36599o c36599o = cVar.f344191b;
                for (int i12 = 0; i12 < c36599o.f348141a.size(); i12++) {
                    bVar.a(c36599o.a(i12));
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
        public final C36599o f344193a;

        public f(C36599o c36599o) {
            this.f344193a = c36599o;
        }

        public final boolean a(int i12) {
            return this.f344193a.f348141a.get(i12);
        }

        public final boolean b(int... iArr) {
            C36599o c36599o = this.f344193a;
            for (int i12 : iArr) {
                if (c36599o.f348141a.get(i12)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f344193a.equals(((f) obj).f344193a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f344193a.hashCode();
        }
    }

    /* compiled from: Player.java */
    public interface g {
        default void onCues(com.google.android.exoplayer2.text.d dVar) {
        }

        @Deprecated
        default void onPositionDiscontinuity(int i12) {
        }

        @Deprecated
        default void onCues(List<com.google.android.exoplayer2.text.a> list) {
        }

        default void onPositionDiscontinuity(k kVar, k kVar2, int i12) {
        }

        default void onRenderedFirstFrame() {
        }

        @Deprecated
        default void onSeekProcessed() {
        }

        default void onAvailableCommandsChanged(c cVar) {
        }

        default void onDeviceInfoChanged(C36533n c36533n) {
        }

        default void onIsLoadingChanged(boolean z12) {
        }

        default void onIsPlayingChanged(boolean z12) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z12) {
        }

        default void onMediaMetadataChanged(P p12) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlaybackParametersChanged(c0 c0Var) {
        }

        default void onPlaybackStateChanged(int i12) {
        }

        default void onPlaybackSuppressionReasonChanged(int i12) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(@j.P PlaybackException playbackException) {
        }

        default void onRepeatModeChanged(int i12) {
        }

        default void onShuffleModeEnabledChanged(boolean z12) {
        }

        default void onSkipSilenceEnabledChanged(boolean z12) {
        }

        default void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.r rVar) {
        }

        default void onTracksChanged(t0 t0Var) {
        }

        default void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
        }

        default void onVolumeChanged(float f12) {
        }

        default void onDeviceVolumeChanged(int i12, boolean z12) {
        }

        default void onEvents(d0 d0Var, f fVar) {
        }

        default void onMediaItemTransition(@j.P O o12, int i12) {
        }

        default void onPlayWhenReadyChanged(boolean z12, int i12) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z12, int i12) {
        }

        default void onSurfaceSizeChanged(int i12, int i13) {
        }

        default void onTimelineChanged(s0 s0Var, int i12) {
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
    public static final class k implements InterfaceC36525h {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final Object f344194b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344195c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final O f344196d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public final Object f344197e;

        /* renamed from: f, reason: collision with root package name */
        public final int f344198f;

        /* renamed from: g, reason: collision with root package name */
        public final long f344199g;

        /* renamed from: h, reason: collision with root package name */
        public final long f344200h;

        /* renamed from: i, reason: collision with root package name */
        public final int f344201i;

        /* renamed from: j, reason: collision with root package name */
        public final int f344202j;

        public k(@j.P Object obj, int i12, @j.P O o12, @j.P Object obj2, int i13, long j12, long j13, int i14, int i15) {
            this.f344194b = obj;
            this.f344195c = i12;
            this.f344196d = o12;
            this.f344197e = obj2;
            this.f344198f = i13;
            this.f344199g = j12;
            this.f344200h = j13;
            this.f344201i = i14;
            this.f344202j = i15;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || k.class != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            return this.f344195c == kVar.f344195c && this.f344198f == kVar.f344198f && this.f344199g == kVar.f344199g && this.f344200h == kVar.f344200h && this.f344201i == kVar.f344201i && this.f344202j == kVar.f344202j && com.google.common.base.F.a(this.f344194b, kVar.f344194b) && com.google.common.base.F.a(this.f344197e, kVar.f344197e) && com.google.common.base.F.a(this.f344196d, kVar.f344196d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f344194b, Integer.valueOf(this.f344195c), this.f344196d, this.f344197e, Integer.valueOf(this.f344198f), Long.valueOf(this.f344199g), Long.valueOf(this.f344200h), Integer.valueOf(this.f344201i), Integer.valueOf(this.f344202j)});
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

    int A();

    @j.P
    O B();

    void C();

    void D(@j.P SurfaceView surfaceView);

    void E();

    Looper G();

    void I();

    void K();

    void M();

    void N(g gVar);

    @j.P
    PlaybackException a();

    long b();

    void c(List list);

    void d(c0 c0Var);

    com.google.android.exoplayer2.video.o e();

    void f(int i12, long j12);

    com.google.android.exoplayer2.trackselection.r g();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    s0 getCurrentTimeline();

    t0 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    c0 getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    int getRepeatMode();

    long getTotalBufferedDuration();

    @InterfaceC42167x
    float getVolume();

    void h(boolean z12);

    long i();

    boolean isPlayingAd();

    long j();

    boolean k();

    long l();

    com.google.android.exoplayer2.text.d m();

    c n();

    boolean o();

    P p();

    void pause();

    void play();

    void prepare();

    long q();

    void r(O o12);

    void release();

    void s(g gVar);

    void seekTo(long j12);

    void setPlayWhenReady(boolean z12);

    void setRepeatMode(int i12);

    void setVideoTextureView(@j.P TextureView textureView);

    void setVolume(@InterfaceC42167x float f12);

    void t(@j.P SurfaceView surfaceView);

    boolean u(int i12);

    void v(@j.P TextureView textureView);

    void w(com.google.android.exoplayer2.trackselection.r rVar);

    void x();

    void z();
}
