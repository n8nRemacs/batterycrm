package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.nw;
import j.InterfaceC42167x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public interface gt0 {

    public static final class a implements rg {

        /* renamed from: b, reason: collision with root package name */
        public static final a f385828b = new C10978a().a();

        /* renamed from: a, reason: collision with root package name */
        private final nw f385829a;

        /* renamed from: com.yandex.mobile.ads.impl.gt0$a$a, reason: collision with other inner class name */
        public static final class C10978a {

            /* renamed from: a, reason: collision with root package name */
            private final nw.a f385830a = new nw.a();

            public final C10978a a(int i12) {
                this.f385830a.a(i12);
                return this;
            }

            public final C10978a a(boolean z12, int i12) {
                nw.a aVar = this.f385830a;
                if (z12) {
                    aVar.a(i12);
                } else {
                    aVar.getClass();
                }
                return this;
            }

            public final C10978a a(int... iArr) {
                nw.a aVar = this.f385830a;
                aVar.getClass();
                for (int i12 : iArr) {
                    aVar.a(i12);
                }
                return this;
            }

            public final C10978a a(a aVar) {
                nw.a aVar2 = this.f385830a;
                nw nwVar = aVar.f385829a;
                aVar2.getClass();
                for (int i12 = 0; i12 < nwVar.a(); i12++) {
                    aVar2.a(nwVar.b(i12));
                }
                return this;
            }

            public final a a() {
                return new a(this.f385830a.a(), 0);
            }
        }

        public /* synthetic */ a(nw nwVar, int i12) {
            this(nwVar);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f385829a.equals(((a) obj).f385829a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f385829a.hashCode();
        }

        private a(nw nwVar) {
            this.f385829a = nwVar;
        }

        private static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f385828b;
            }
            C10978a c10978a = new C10978a();
            for (int i12 = 0; i12 < integerArrayList.size(); i12++) {
                c10978a.a(integerArrayList.get(i12).intValue());
            }
            return c10978a.a();
        }
    }

    public interface b {
        default void a() {
        }

        @Deprecated
        default void b() {
        }

        default void a(int i12) {
        }

        default void b(lt ltVar) {
        }

        default void a(Metadata metadata) {
        }

        default void a(ad0 ad0Var) {
        }

        default void a(ct0 ct0Var) {
        }

        default void a(a aVar) {
        }

        default void a(c cVar, c cVar2, int i12) {
        }

        default void a(ji1 ji1Var) {
        }

        default void a(@j.P lt ltVar) {
        }

        default void a(sa1 sa1Var) {
        }

        default void a(@j.P xc0 xc0Var, int i12) {
        }

        default void a(xm xmVar) {
        }

        default void a(zp zpVar) {
        }

        default void a(boolean z12, int i12) {
        }

        @Deprecated
        default void c() {
        }

        default void onRenderedFirstFrame() {
        }

        @Deprecated
        default void onCues(List<vm> list) {
        }

        default void onIsLoadingChanged(boolean z12) {
        }

        default void onIsPlayingChanged(boolean z12) {
        }

        default void onPlaybackStateChanged(int i12) {
        }

        default void onPlaybackSuppressionReasonChanged(int i12) {
        }

        default void onSkipSilenceEnabledChanged(boolean z12) {
        }

        default void onVolumeChanged(float f12) {
        }

        default void onPlayWhenReadyChanged(boolean z12, int i12) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z12, int i12) {
        }

        default void onSurfaceSizeChanged(int i12, int i13) {
        }
    }

    public static final class c implements rg {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final Object f385831a;

        /* renamed from: b, reason: collision with root package name */
        public final int f385832b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final xc0 f385833c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        public final Object f385834d;

        /* renamed from: e, reason: collision with root package name */
        public final int f385835e;

        /* renamed from: f, reason: collision with root package name */
        public final long f385836f;

        /* renamed from: g, reason: collision with root package name */
        public final long f385837g;

        /* renamed from: h, reason: collision with root package name */
        public final int f385838h;

        /* renamed from: i, reason: collision with root package name */
        public final int f385839i;

        public c(@j.P Object obj, int i12, @j.P xc0 xc0Var, @j.P Object obj2, int i13, long j12, long j13, int i14, int i15) {
            this.f385831a = obj;
            this.f385832b = i12;
            this.f385833c = xc0Var;
            this.f385834d = obj2;
            this.f385835e = i13;
            this.f385836f = j12;
            this.f385837g = j13;
            this.f385838h = i14;
            this.f385839i = i15;
        }

        private static c a(Bundle bundle) {
            int i12 = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            return new c(null, i12, bundle2 == null ? null : (xc0) xc0.f391604g.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f385832b == cVar.f385832b && this.f385835e == cVar.f385835e && this.f385836f == cVar.f385836f && this.f385837g == cVar.f385837g && this.f385838h == cVar.f385838h && this.f385839i == cVar.f385839i && vp0.a(this.f385831a, cVar.f385831a) && vp0.a(this.f385834d, cVar.f385834d) && vp0.a(this.f385833c, cVar.f385833c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f385831a, Integer.valueOf(this.f385832b), this.f385833c, this.f385834d, Integer.valueOf(this.f385835e), Long.valueOf(this.f385836f), Long.valueOf(this.f385837g), Integer.valueOf(this.f385838h), Integer.valueOf(this.f385839i)});
        }
    }

    @j.P
    lt a();

    void a(b bVar);

    void b(b bVar);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    i91 getCurrentTimeline();

    sa1 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    @InterfaceC42167x
    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z12);

    void setVideoTextureView(@j.P TextureView textureView);

    void setVolume(@InterfaceC42167x float f12);

    void stop();
}
