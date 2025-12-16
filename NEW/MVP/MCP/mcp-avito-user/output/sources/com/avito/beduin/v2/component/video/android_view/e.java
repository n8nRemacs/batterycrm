package com.avito.beduin.v2.component.video.android_view;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.avito.beduin.v2.component.video.state.MediaState;
import com.avito.beduin.v2.component.video.state.PlayerState;
import com.avito.beduin.v2.component.video.state.VideoScale;
import com.avito.beduin.v2.component.video.state.p;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VideoComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/e;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/component/video/state/e;", "Lcom/avito/beduin/v2/component/video/android_view/c;", "a", "b", "c", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC36333c<com.avito.beduin.v2.component.video.state.e, com.avito.beduin.v2.component.video.android_view.c> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final h f336322m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public c f336323n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public PlayerState f336324o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public MediaState f336325p;

    /* renamed from: q, reason: collision with root package name */
    public long f336326q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Long f336327r;

    /* compiled from: VideoComponent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/e$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/video/state/e;", "LFV0/h;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends n<com.avito.beduin.v2.component.video.state.e> implements FV0.h {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final h f336328c;

        public a(@k h hVar) {
            super(p.f336385c);
            this.f336328c = hVar;
        }

        @Override // FV0.h
        public final void P() {
            this.f336328c.P();
        }

        @Override // FV0.h
        public final void Q(@k FV0.a aVar) {
            this.f336328c.Q(aVar);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new e(this.f336328c);
        }
    }

    /* compiled from: VideoComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/e$b;", "Lcom/google/android/exoplayer2/d0$g;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d0.g {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d0 f336329b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Y41.l<PlayerState, G0> f336330c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Y41.l<MediaState, G0> f336331d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Y41.l<String, G0> f336332e;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k d0 d0Var, @l Y41.l<? super PlayerState, G0> lVar, @l Y41.l<? super MediaState, G0> lVar2, @l Y41.l<? super String, G0> lVar3) {
            this.f336329b = d0Var;
            this.f336330c = lVar;
            this.f336331d = lVar2;
            this.f336332e = lVar3;
            onPlaybackStateChanged(d0Var.getPlaybackState());
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            ((C10435e) this.f336330c).invoke((i12 == 3 && this.f336329b.getPlayWhenReady()) ? PlayerState.f336349c : PlayerState.f336350d);
            ((f) this.f336331d).invoke(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? MediaState.f336342c : MediaState.f336345f : MediaState.f336343d : MediaState.f336344e : MediaState.f336342c);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerError(@k PlaybackException playbackException) {
            Y41.l<String, G0> lVar = this.f336332e;
            if (lVar != null) {
                String message = playbackException.getMessage();
                if (message == null) {
                    message = "";
                }
                lVar.invoke(message);
            }
        }
    }

    /* compiled from: VideoComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/e$c;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.beduin.v2.component.video.state.e f336333a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.beduin.v2.theme.k f336334b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final d0.g f336335c;

        public c(@k com.avito.beduin.v2.component.video.state.e eVar, @k com.avito.beduin.v2.theme.k kVar, @k d0.g gVar) {
            this.f336333a = eVar;
            this.f336334b = kVar;
            this.f336335c = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f336333a, cVar.f336333a) && L.f(this.f336334b, cVar.f336334b) && L.f(this.f336335c, cVar.f336335c);
        }

        public final int hashCode() {
            return this.f336335c.hashCode() + ((this.f336334b.hashCode() + (this.f336333a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "VideoRenderState(state=" + this.f336333a + ", styleProvider=" + this.f336334b + ", listener=" + this.f336335c + ')';
        }
    }

    /* compiled from: VideoComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[VideoScale.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VideoScale[] videoScaleArr = VideoScale.f336354b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VideoScale[] videoScaleArr2 = VideoScale.f336354b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: VideoComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/PlayerState;", "playerState", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/video/state/PlayerState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.video.android_view.e$e, reason: collision with other inner class name */
    public static final class C10435e extends N implements Y41.l<PlayerState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.video.state.e f336337m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10435e(com.avito.beduin.v2.component.video.state.e eVar) {
            super(1);
            this.f336337m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            e eVar = e.this;
            if (playerState2 != eVar.f336324o) {
                eVar.f336324o = playerState2;
                Y41.l<PlayerState, G0> lVar = this.f336337m.f336364e;
                if (lVar != null) {
                    lVar.invoke(playerState2);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/MediaState;", "mediaState", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/component/video/state/MediaState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<MediaState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.video.state.e f336339m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.beduin.v2.component.video.state.e eVar) {
            super(1);
            this.f336339m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            e eVar = e.this;
            if (mediaState2 != eVar.f336325p) {
                eVar.f336325p = mediaState2;
                Y41.l<MediaState, G0> lVar = this.f336339m.f336365f;
                if (lVar != null) {
                    lVar.invoke(mediaState2);
                }
            }
            return G0.f406611a;
        }
    }

    public e(@k h hVar) {
        super(null, 1, null);
        this.f336322m = hVar;
        this.f336324o = PlayerState.f336350d;
        this.f336325p = MediaState.f336342c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        com.avito.beduin.v2.component.video.android_view.c cVar = new com.avito.beduin.v2.component.video.android_view.c(viewGroup.getContext(), null);
        cVar.setClipToOutline(true);
        cVar.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        cVar.setPlayer(this.f336322m.a());
        cVar.setUseController(false);
        cVar.addOnAttachStateChangeListener(new com.avito.beduin.v2.component.video.android_view.f(cVar, this));
        return cVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void q(View view, Bundle bundle) {
        long j12 = bundle.getLong("seekPosition", 0L);
        this.f336327r = Long.valueOf(j12);
        d0 player = ((com.avito.beduin.v2.component.video.android_view.c) view).getPlayer();
        if (player != null) {
            player.seekTo(j12);
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final Bundle r(View view) {
        d0 player = ((com.avito.beduin.v2.component.video.android_view.c) view).getPlayer();
        if (player == null) {
            return null;
        }
        long currentPosition = player.getCurrentPosition();
        Bundle bundle = new Bundle();
        bundle.putLong("seekPosition", currentPosition);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void l(@k com.avito.beduin.v2.component.video.android_view.c cVar, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.video.state.e eVar) {
        com.avito.beduin.v2.component.video.state.e eVar2;
        c cVar2;
        com.avito.beduin.v2.component.video.state.e eVar3;
        c cVar3;
        com.avito.beduin.v2.component.video.state.e eVar4;
        WeakReference<InterfaceC36249i> weakReference = this.f337943c;
        if (!L.f(weakReference != null ? weakReference.get() : null, k())) {
            d0 player = cVar.getPlayer();
            c cVar4 = this.f336323n;
            if (cVar4 != null) {
                d0.g gVar = cVar4.f336335c;
                if (player != null) {
                    player.s(gVar);
                }
            }
            this.f336323n = null;
            this.f336326q = 0L;
            this.f336324o = PlayerState.f336350d;
            this.f336325p = MediaState.f336342c;
        }
        d0 player2 = cVar.getPlayer();
        if (player2 == null || ((com.avito.beduin.v2.component.video.android_view.b) cVar.getPlayer()).f336321c) {
            c cVar5 = this.f336323n;
            if (cVar5 != null) {
                d0.g gVar2 = cVar5.f336335c;
                d0 player3 = cVar.getPlayer();
                if (player3 != null) {
                    player3.s(gVar2);
                }
            }
            player2 = this.f336322m.a();
            cVar.setPlayer(player2);
        }
        M.a(cVar, eVar.f336368i);
        player2.setVolume(eVar.f336362c);
        boolean z12 = eVar.f336361b;
        player2.setPlayWhenReady(z12);
        boolean z13 = eVar.f336363d;
        player2.setRepeatMode(z13 ? 1 : 0);
        int i12 = 0;
        Object[] objArr = (!z12 || (cVar3 = this.f336323n) == null || (eVar4 = cVar3.f336333a) == null || eVar4.f336361b) ? false : true;
        Object[] objArr2 = (!z13 || (cVar2 = this.f336323n) == null || (eVar3 = cVar2.f336333a) == null || eVar3.f336363d || !z12) ? false : true;
        if (this.f336325p == MediaState.f336345f && (objArr != false || objArr2 != false)) {
            player2.seekTo(0L);
        }
        c cVar6 = this.f336323n;
        com.avito.beduin.v2.component.video.state.a aVar = (cVar6 == null || (eVar2 = cVar6.f336333a) == null) ? null : eVar2.f336360a;
        com.avito.beduin.v2.component.video.state.a aVar2 = eVar.f336360a;
        if (!L.f(aVar2, aVar) || player2.A() == 0) {
            if (aVar2 instanceof com.avito.beduin.v2.component.video.state.c) {
                com.avito.beduin.v2.component.video.state.c cVar7 = (com.avito.beduin.v2.component.video.state.c) aVar2;
                int iOrdinal = cVar7.f336358b.ordinal();
                if (iOrdinal == 0) {
                    i12 = 4;
                } else if (iOrdinal == 1) {
                    i12 = 3;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.setResizeMode(i12);
                O.c cVar8 = new O.c();
                cVar8.f343535b = Uri.parse(cVar7.f336357a);
                player2.r(cVar8.a());
                player2.prepare();
                Long l12 = this.f336327r;
                this.f336327r = null;
                player2.seekTo(l12 != null ? l12.longValue() : this.f336326q);
            }
        } else if (z12 && player2.getPlaybackState() == 1) {
            player2.prepare();
        }
        b bVar = new b(player2, new C10435e(eVar), new f(eVar), eVar.f336366g);
        c cVar9 = this.f336323n;
        if (cVar9 != null) {
            player2.s(cVar9.f336335c);
        }
        player2.N(bVar);
        cVar.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(eVar, 26));
        this.f336323n = new c(eVar, kVar, bVar);
    }
}
