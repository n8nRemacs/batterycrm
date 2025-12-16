package com.avito.android.avl.view;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.avl_analytics.AvlFromPage;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.D6;
import com.avito.android.util.w6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.AbstractC36510e;
import com.google.android.exoplayer2.C36607v;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.ui.C;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.cache.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl/view/B;", "Lcom/avito/konveyor/adapter/b;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B extends com.avito.konveyor.adapter.b {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f98333M = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final ImageView f98334A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final ImageButton f98335B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f98336C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public InterfaceC36534o f98337D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public O f98338E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f98339F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public BaseAvlVideoItem f98340G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public VideoStopReason f98341H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f98342I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final a f98343J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final b f98344K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final c f98345L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f98346b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f98347c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f98348d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f98349e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98350f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J80.b f98351g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f98352h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f98353i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f98354j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.d f98355k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl.features.a f98356l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final StyledPlayerView f98357m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f98358n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f98359o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f98360p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f98361q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f98362r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final View f98363s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextView f98364t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ImageView f98365u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f98366v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f98367w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.google.android.exoplayer2.ui.C f98368x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f98369y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final TextView f98370z;

    /* compiled from: VideoViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl/view/B$a", "Lcom/google/android/exoplayer2/analytics/b;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.google.android.exoplayer2.analytics.b {
        public a() {
        }

        @Override // com.google.android.exoplayer2.analytics.b
        public final void ZT(@Y61.k b.C10568b c10568b, int i12) {
            B.this.f98351g.e(i12);
        }
    }

    /* compiled from: VideoViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl/view/B$b", "Lcom/google/android/exoplayer2/d0$g;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d0.g {
        public b() {
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            if (i12 == 1) {
                B b12 = B.this;
                if (!z12) {
                    VideoStopReason videoStopReason = VideoStopReason.f90114e;
                    int i13 = B.f98333M;
                    b12.I80(videoStopReason);
                } else {
                    InterfaceC36534o interfaceC36534o = b12.f98337D;
                    if (interfaceC36534o == null || interfaceC36534o.getPlaybackState() != 3) {
                        return;
                    }
                    B.B80(b12);
                }
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            B b12 = B.this;
            if (i12 == 2) {
                b12.f98351g.g();
                return;
            }
            if (i12 != 3) {
                return;
            }
            b12.f98351g.b();
            InterfaceC36534o interfaceC36534o = b12.f98337D;
            if (interfaceC36534o == null || !interfaceC36534o.getPlayWhenReady()) {
                return;
            }
            B.B80(b12);
            b12.H80(true);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerError(@Y61.k PlaybackException playbackException) {
            B b12 = B.this;
            b12.f98339F = true;
            InterfaceC36534o interfaceC36534o = b12.f98337D;
            String strA = interfaceC36534o != null ? J80.g.a(interfaceC36534o) : null;
            if (strA == null) {
                strA = "";
            }
            BaseAvlVideoItem baseAvlVideoItem = b12.f98340G;
            String itemId = baseAvlVideoItem != null ? baseAvlVideoItem.getF98644i() : null;
            int layoutPosition = b12.getLayoutPosition();
            String message = playbackException.getMessage();
            b12.f98350f.g(Integer.valueOf(layoutPosition), itemId, strA, message != null ? message : "");
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPositionDiscontinuity(@Y61.k d0.k kVar, @Y61.k d0.k kVar2, int i12) {
            B b12 = B.this;
            if (i12 == 1 && !b12.f98342I) {
                b12.I80(VideoStopReason.f90115f);
            }
            b12.f98342I = false;
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onRenderedFirstFrame() {
            InterfaceC36534o interfaceC36534o;
            B b12 = B.this;
            b12.f98351g.d();
            InterfaceC36534o interfaceC36534o2 = b12.f98337D;
            if (interfaceC36534o2 == null || !interfaceC36534o2.getPlayWhenReady() || (interfaceC36534o = b12.f98337D) == null || interfaceC36534o.getPlaybackState() != 3) {
                return;
            }
            b12.I80(VideoStopReason.f90111b);
            BaseAvlVideoItem baseAvlVideoItem = b12.f98340G;
            String itemId = baseAvlVideoItem != null ? baseAvlVideoItem.getF98644i() : null;
            AvlFromPage avlFromPage = AvlFromPage.f98428c;
            b12.f98351g.f(Integer.valueOf(b12.getLayoutPosition()), itemId, "feed_fullscreen");
            B.B80(b12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onVideoSizeChanged(@Y61.k com.google.android.exoplayer2.video.o oVar) {
            B b12 = B.this;
            double measuredWidth = (oVar.f348321b / oVar.f348322c) / (b12.f98357m.getMeasuredWidth() / b12.f98357m.getMeasuredHeight());
            if (0.8d > measuredWidth || measuredWidth > 1.2d) {
                b12.f98357m.setResizeMode(4);
            } else {
                b12.f98357m.setResizeMode(3);
            }
        }
    }

    /* compiled from: VideoViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl/view/B$c", "Lcom/google/android/exoplayer2/ui/C$a;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements C.a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void a(long j12) {
            d0 d0Var = B.this.f98337D;
            if (d0Var != null) {
                ((AbstractC36510e) d0Var).seekTo(j12);
            }
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void b(long j12, boolean z12) {
            d0 d0Var = B.this.f98337D;
            if (d0Var != null) {
                ((AbstractC36510e) d0Var).setPlayWhenReady(true);
            }
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void c(long j12) {
            d0 d0Var = B.this.f98337D;
            if (d0Var != null) {
                ((AbstractC36510e) d0Var).setPlayWhenReady(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(@Y61.k View view, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k com.avito.android.avl_analytics.a aVar3, @Y61.k J80.b bVar, @Y61.k Y41.a<Boolean> aVar4, @Y61.k Y41.a<G0> aVar5, @Y61.k Y41.l<? super Integer, G0> lVar3, @Y61.k a.d dVar, @Y61.k com.avito.android.avl.features.a aVar6) {
        super(view);
        this.f98346b = aVar;
        this.f98347c = aVar2;
        this.f98348d = lVar;
        this.f98349e = lVar2;
        this.f98350f = aVar3;
        this.f98351g = bVar;
        this.f98352h = aVar4;
        this.f98353i = aVar5;
        this.f98354j = lVar3;
        this.f98355k = dVar;
        this.f98356l = aVar6;
        this.f98357m = (StyledPlayerView) view.findViewById(R.id.player_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.cross_button);
        this.f98358n = (ConstraintLayout) view.findViewById(R.id.goods_view_container);
        this.f98359o = view.findViewById(R.id.goods_click_view);
        this.f98360p = (SimpleDraweeView) view.findViewById(R.id.goods_image_view);
        this.f98361q = (TextView) view.findViewById(R.id.goods_price_view);
        this.f98362r = (TextView) view.findViewById(R.id.goods_title_view);
        this.f98363s = view.findViewById(R.id.overlay_view);
        this.f98364t = (TextView) view.findViewById(R.id.seller_name);
        this.f98365u = (ImageView) view.findViewById(R.id.seller_rating);
        this.f98366v = (TextView) view.findViewById(R.id.seller_rating_value);
        this.f98367w = (TextView) view.findViewById(R.id.seller_rating_comment);
        this.f98368x = (com.google.android.exoplayer2.ui.C) view.findViewById(R.id.exo_progress);
        this.f98369y = (SimpleDraweeView) view.findViewById(R.id.video_thumbnail);
        this.f98370z = (TextView) view.findViewById(R.id.status);
        this.f98334A = (ImageView) view.findViewById(R.id.share_button);
        this.f98335B = (ImageButton) view.findViewById(R.id.exo_mute);
        this.f98336C = (ConstraintLayout) view.findViewById(R.id.control_view);
        imageView.setOnClickListener(new ViewOnClickListenerC28722b(this, 1));
        this.f98343J = new a();
        this.f98344K = new b();
        this.f98345L = new c();
    }

    public static final void B80(B b12) {
        b12.f98357m.setKeepScreenOn(true);
        InterfaceC36534o interfaceC36534o = b12.f98337D;
        String strA = interfaceC36534o != null ? J80.g.a(interfaceC36534o) : null;
        BaseAvlVideoItem baseAvlVideoItem = b12.f98340G;
        String itemId = baseAvlVideoItem != null ? baseAvlVideoItem.getF98644i() : null;
        Integer numValueOf = Integer.valueOf(b12.getLayoutPosition());
        BaseAvlVideoItem baseAvlVideoItem2 = b12.f98340G;
        String xHash = baseAvlVideoItem2 != null ? baseAvlVideoItem2.getF98645j() : null;
        InterfaceC36534o interfaceC36534o2 = b12.f98337D;
        b12.f98350f.h(interfaceC36534o2 != null ? J80.g.b(interfaceC36534o2) : null, numValueOf, strA, itemId, xHash);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = b12.f98369y.animate().alpha(0.0f);
        viewPropertyAnimatorAlpha.setDuration(300L);
        w6.a(viewPropertyAnimatorAlpha, new C(b12));
        viewPropertyAnimatorAlpha.start();
    }

    public final void C80() {
        if (this.f98337D == null) {
            return;
        }
        D6.H(this.f98369y);
        this.f98368x.a(this.f98345L);
        InterfaceC36534o interfaceC36534o = this.f98337D;
        if (interfaceC36534o != null) {
            interfaceC36534o.s(this.f98344K);
            interfaceC36534o.L(this.f98343J);
            interfaceC36534o.release();
        }
        this.f98357m.setPlayer(null);
        this.f98337D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D80(@Y61.k Context context) {
        BaseAvlVideoItem baseAvlVideoItem = this.f98340G;
        if (baseAvlVideoItem == null || this.f98337D != null) {
            return;
        }
        String videoUrl = baseAvlVideoItem.getF98639d();
        StyledPlayerView styledPlayerView = this.f98357m;
        if (videoUrl == null) {
            D6.w(styledPlayerView);
            return;
        }
        this.f98351g.a(videoUrl);
        O oA2 = this.f98338E;
        if (oA2 == null) {
            C36607v c36607v = O.f343527h;
            O.c cVar = new O.c();
            cVar.f343535b = Uri.parse(videoUrl);
            oA2 = cVar.a();
        }
        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(this.f98355k);
        factory.f346269h = true;
        HlsMediaSource hlsMediaSourceB = factory.a(oA2);
        InterfaceC36534o interfaceC36534oA = new InterfaceC36534o.c(context).a();
        com.avito.android.avl.features.a aVar = this.f98356l;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.avl.features.a.f98177c[0];
        if (((Boolean) aVar.f98178b.a().invoke()).booleanValue()) {
            interfaceC36534oA.H(hlsMediaSourceB);
        } else {
            ((AbstractC36510e) interfaceC36534oA).r(oA2);
        }
        interfaceC36534oA.setVolume(((Boolean) ((r) this.f98352h).invoke()).booleanValue() ? 0.0f : 1.0f);
        interfaceC36534oA.setRepeatMode(2);
        interfaceC36534oA.N(this.f98344K);
        interfaceC36534oA.y(this.f98343J);
        interfaceC36534oA.prepare();
        this.f98337D = interfaceC36534oA;
        this.f98368x.c(this.f98345L);
        this.f98339F = false;
        styledPlayerView.setPlayer(this.f98337D);
        styledPlayerView.setControllerShowTimeoutMs(-1);
        styledPlayerView.setControllerHideOnTouch(false);
        styledPlayerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.avl.view.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i12 = B.f98333M;
                view.performClick();
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                B b12 = this.f98424b;
                d0 player = b12.f98357m.getPlayer();
                if (player != null) {
                    if (player.k()) {
                        d0 d0Var = b12.f98337D;
                        if (d0Var != null) {
                            ((AbstractC36510e) d0Var).setPlayWhenReady(false);
                        }
                        b12.H80(false);
                    } else {
                        b12.G80();
                    }
                }
                return true;
            }
        });
        D6.H(styledPlayerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E80(@Y61.k final com.avito.android.avl_public.repo.BaseAvlVideoItem r9) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avl.view.B.E80(com.avito.android.avl_public.repo.BaseAvlVideoItem):void");
    }

    public final void F80(boolean z12) {
        d0 d0Var;
        if (this.f98336C.getVisibility() != 8 || ((d0Var = this.f98337D) != null && ((AbstractC36510e) d0Var).k())) {
            if (z12) {
                I80(VideoStopReason.f90113d);
            }
            d0 d0Var2 = this.f98337D;
            if (d0Var2 != null) {
                ((AbstractC36510e) d0Var2).setPlayWhenReady(false);
            }
            H80(false);
            this.f98342I = true;
            d0 d0Var3 = this.f98337D;
            if (d0Var3 != null) {
                ((AbstractC36510e) d0Var3).seekTo(0L);
            }
        }
    }

    public final void G80() {
        ConstraintLayout constraintLayout = this.f98336C;
        if (constraintLayout.getVisibility() != 0) {
            D6.H(constraintLayout);
        }
        if (this.f98339F) {
            ((m) this.f98347c).invoke();
            return;
        }
        d0 d0Var = this.f98337D;
        if (d0Var != null) {
            ((AbstractC36510e) d0Var).setPlayWhenReady(true);
        }
        H80(true);
    }

    public final void H80(boolean z12) {
        BaseAvlVideoItem baseAvlVideoItem = this.f98340G;
        String itemId = baseAvlVideoItem != null ? baseAvlVideoItem.getF98644i() : null;
        AvlFromPage avlFromPage = AvlFromPage.f98428c;
        this.f98351g.c(null, itemId, "feed_fullscreen", z12);
    }

    public final void I80(VideoStopReason videoStopReason) {
        VideoStopReason videoStopReason2 = this.f98341H;
        if (videoStopReason2 == VideoStopReason.f90112c || videoStopReason2 == videoStopReason) {
            return;
        }
        VideoStopReason videoStopReason3 = VideoStopReason.f90114e;
        if (videoStopReason2 == videoStopReason3 && videoStopReason == VideoStopReason.f90113d) {
            return;
        }
        if (videoStopReason2 == VideoStopReason.f90113d && videoStopReason == videoStopReason3) {
            return;
        }
        this.f98357m.setKeepScreenOn(false);
        this.f98341H = videoStopReason;
        InterfaceC36534o interfaceC36534o = this.f98337D;
        String strA = interfaceC36534o != null ? J80.g.a(interfaceC36534o) : null;
        BaseAvlVideoItem baseAvlVideoItem = this.f98340G;
        String itemId = baseAvlVideoItem != null ? baseAvlVideoItem.getF98644i() : null;
        InterfaceC36534o interfaceC36534o2 = this.f98337D;
        Double dB2 = interfaceC36534o2 != null ? J80.g.b(interfaceC36534o2) : null;
        Double dValueOf = this.f98337D != null ? Double.valueOf(r0.getCurrentPosition() / 1000.0d) : null;
        Integer numValueOf = Integer.valueOf(getLayoutPosition());
        BaseAvlVideoItem baseAvlVideoItem2 = this.f98340G;
        this.f98350f.b(strA, itemId, dB2, dValueOf, numValueOf, baseAvlVideoItem2 != null ? baseAvlVideoItem2.getF98645j() : null, videoStopReason);
    }
}
