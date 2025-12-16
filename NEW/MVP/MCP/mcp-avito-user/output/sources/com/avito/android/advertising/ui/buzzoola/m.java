package com.avito.android.advertising.ui.buzzoola;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.video_snippets.g;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import j.InterfaceC42161q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialVideoViewHolderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/m;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/advertising/ui/buzzoola/k;", "Lcom/google/android/exoplayer2/d0$g;", "Lcom/google/android/exoplayer2/analytics/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.android.serp.c implements k, d0.g, com.google.android.exoplayer2.analytics.b {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f88599x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f88600b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f88601c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f88602d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f88603e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88604f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f88605g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f88606h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f88607i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Button f88608j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f88609k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f88610l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final StyledPlayerView f88611m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f88612n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f88613o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ProgressBarRe23 f88614p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final View f88615q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f88616r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public View f88617s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public String f88618t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public g.c f88619u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advertising.adapter.items.buzzoola.video.m f88620v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public y f88621w;

    /* compiled from: CommercialVideoViewHolderImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advertising/ui/buzzoola/m$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            int i12 = m.f88599x;
            m.this.C80();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            m mVar = m.this;
            y yVar = mVar.f88621w;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            mVar.f88621w = null;
            String str = mVar.f88618t;
            com.avito.android.player_holder.a aVar = mVar.f88602d;
            aVar.c(str);
            StyledPlayerView styledPlayerView = mVar.f88611m;
            d0 player = styledPlayerView.getPlayer();
            if (player != null) {
                player.pause();
            }
            aVar.F(styledPlayerView);
        }
    }

    public m(@Y61.k View view, @Y61.k AdStyle adStyle, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k H h12) {
        super(view);
        this.f88600b = view;
        this.f88601c = adStyle;
        this.f88602d = aVar;
        this.f88603e = h12;
        View viewFindViewById = view.findViewById(R.id.buzzoola_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f88604f = (ViewGroup) viewFindViewById;
        this.f88605g = (ViewGroup) view.findViewById(R.id.media_view_container);
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88606h = (TextView) viewFindViewById2;
        this.f88607i = (TextView) view.findViewById(R.id.description);
        this.f88608j = (Button) view.findViewById(R.id.call_to_action_button);
        this.f88609k = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f88610l = (SimpleDraweeView) view.findViewById(R.id.image);
        View viewFindViewById3 = view.findViewById(R.id.player_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.exoplayer2.ui.StyledPlayerView");
        }
        this.f88611m = (StyledPlayerView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.video_pause_play_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f88612n = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.video_mute_unmute_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f88613o = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.video_progress);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f88614p = (ProgressBarRe23) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.video_spinner);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f88615q = viewFindViewById7;
        this.f88616r = (TextView) view.findViewById(R.id.advertising_badge);
        this.f88618t = "";
        view.addOnAttachStateChangeListener(new a());
    }

    public final boolean B80() {
        d0 player = this.f88611m.getPlayer();
        if (player == null) {
            return false;
        }
        return (player.getPlaybackState() == 3 || player.getPlaybackState() == 4) && player.a() == null && player.getCurrentPosition() > 0;
    }

    public final void C80() {
        if (this.f88621w != null) {
            return;
        }
        String str = this.f88618t;
        com.avito.android.player_holder.a aVar = this.f88602d;
        aVar.t(str, this);
        aVar.x(this.f88618t, this);
        y yVar = this.f88621w;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f88621w = (y) z.a0(200L, 200L, TimeUnit.MILLISECONDS, this.f88603e).N(new n(this)).d0(new o(this)).N(p.f88625b).t0(new q(this));
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    public final void E8(@Y61.l String str) {
        Button button = this.f88608j;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void H60(@InterfaceC42161q int i12) {
        e.a.l(this, R.dimen.ad_video_icon_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        e.a.a(this, R.dimen.ad_image_corner_radius);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    @Y61.k
    /* renamed from: PJ, reason: from getter */
    public final StyledPlayerView getF88611m() {
        return this.f88611m;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: Qw, reason: from getter */
    public final TextView getF88607i() {
        return this.f88607i;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    public final void S3(@Y61.l View.OnClickListener onClickListener) {
        this.f88616r.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: T1, reason: from getter */
    public final ViewGroup getF88604f() {
        return this.f88604f;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    @Y61.k
    /* renamed from: V6, reason: from getter */
    public final TextView getF88616r() {
        return this.f88616r;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void ZT(@Y61.k b.C10568b c10568b, int i12) {
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
        if (mVar == null || !mVar.a()) {
            return;
        }
        mVar.f87539h.c(i12, mVar.f87533b.getF272777l());
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    public final void cT(@Y61.k g.c cVar) {
        View view = this.f88600b;
        Drawable drawableH = C35835l0.h(R.attr.ic_pause16, view.getContext());
        Button button = this.f88612n;
        button.setImageDrawable(drawableH);
        boolean z12 = cVar.f326093g == 0.0f;
        Drawable drawableH2 = C35835l0.h(z12 ? R.attr.ic_mute16 : R.attr.ic_unmute16, view.getContext());
        Button button2 = this.f88613o;
        button2.setImageDrawable(drawableH2);
        D6.G(this.f88610l, true);
        View view2 = this.f88617s;
        if (view2 != null) {
            D6.G(view2, false);
        }
        D6.G(this.f88615q, true);
        String str = cVar.f326087a;
        if (str == null) {
            str = cVar.f326088b;
        }
        this.f88618t = str;
        this.f88619u = cVar;
        C80();
        button.setOnClickListener(new l(this, 0));
        button2.setOnClickListener(new l(this, 1));
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        ViewGroup f88605g = getF88605g();
        if (f88605g != null) {
            v.b(f88605g, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@Y61.l TextView textView, @Y61.l String str) {
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: getCallToActionView */
    public final TextView getF6596j() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF4793c() {
        return this.f88601c;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF88600b() {
        return this.f88600b;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void h(@Y61.l String str) {
        TextView f88607i = getF88607i();
        if (f88607i != null) {
            I5.a(f88607i, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.j
    @Y61.l
    /* renamed from: iW, reason: from getter */
    public final g.c getF88619u() {
        return this.f88619u;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void j00(float f12) {
        ViewGroup f88605g = getF88605g();
        RatioForegroundFrameLayout ratioForegroundFrameLayout = f88605g instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) f88605g : null;
        if (ratioForegroundFrameLayout != null) {
            ratioForegroundFrameLayout.setRatio(f12);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    public final void j1(@Y61.l Uri uri) {
        this.f88610l.e(uri);
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: j70 */
    public final ViewGroup getF7319x() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: od, reason: from getter */
    public final ViewGroup getF88605g() {
        return this.f88605g;
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onIsPlayingChanged(boolean z12) {
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
        if (mVar != null && mVar.a()) {
            mVar.f87539h.b(mVar.f87533b.getF272777l(), z12);
        }
        this.f88612n.setImageDrawable(C35835l0.h(z12 ? R.attr.ic_pause16 : R.attr.ic_play16, this.f88600b.getContext()));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackStateChanged(int i12) {
        boolean zB80 = B80();
        View view = this.f88615q;
        if (zB80) {
            View view2 = this.f88617s;
            if (view2 != null) {
                D6.G(view2, false);
            }
            D6.G(view, false);
        } else {
            d0 player = this.f88611m.getPlayer();
            if (player != null && player.getPlaybackState() == 2 && player.a() == null) {
                View view3 = this.f88617s;
                if (view3 != null) {
                    D6.G(view3, false);
                }
                D6.G(view, true);
            }
        }
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
        if (mVar != null) {
            mVar.c(i12);
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerErrorChanged(@Y61.l PlaybackException playbackException) {
        View viewInflate;
        if (playbackException != null) {
            com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
            if (mVar != null && mVar.a()) {
                StringBuilder sb2 = new StringBuilder();
                String message = playbackException.getMessage();
                sb2.append(message != null ? message.concat(" ") : null);
                sb2.append('(');
                sb2.append(playbackException.a());
                sb2.append(')');
                mVar.f87538g.o0(playbackException.f343668b, mVar.f87533b, mVar.f87532a, sb2.toString(), mVar.f87536e);
            }
            View view = this.f88600b;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.video_error_container);
            if (viewStub != null && (viewInflate = viewStub.inflate()) != null) {
                D6.H(viewInflate);
                this.f88617s = viewInflate;
                View viewFindViewById = view.findViewById(R.id.video_retry);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                ((Button) viewFindViewById).setOnClickListener(new l(this, 2));
            }
        }
        View view2 = this.f88617s;
        if (view2 != null) {
            D6.G(view2, true);
        }
        D6.G(this.f88615q, false);
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRenderedFirstFrame() {
        D6.G(this.f88610l, false);
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
        if (mVar == null || !mVar.a()) {
            return;
        }
        com.avito.android.advertising.loaders.j jVar = mVar.f87538g;
        String str = mVar.f87532a;
        BannerInfo bannerInfo = mVar.f87533b;
        jVar.V4(str, bannerInfo);
        mVar.f87540i.b(mVar.f87535d);
        mVar.f87539h.f(bannerInfo.getF272777l());
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onVolumeChanged(float f12) {
        com.avito.android.advertising.adapter.items.buzzoola.video.m mVar = this.f88620v;
        if (mVar != null) {
            mVar.f87537f.f87518c = f12;
        }
        boolean z12 = f12 == 0.0f;
        this.f88613o.setImageDrawable(C35835l0.h(z12 ? R.attr.ic_mute16 : R.attr.ic_unmute16, this.f88600b.getContext()));
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    public final void pw(@Y61.l com.avito.android.advertising.adapter.items.buzzoola.video.m mVar) {
        this.f88620v = mVar;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.k
    /* renamed from: qs, reason: from getter */
    public final TextView getF88606h() {
        return this.f88606h;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void setTitle(@Y61.l String str) {
        TextView f88606h = getF88606h();
        if (f88606h != null) {
            I5.a(f88606h, str, false);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final View uC() {
        return this.f88609k;
    }

    @Override // com.avito.android.advertising.ui.e
    @Y61.l
    /* renamed from: wV */
    public final TextView getF6601o() {
        return null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void y9(@Y61.l Uri uri) {
        View viewUC = uC();
        if (viewUC instanceof SimpleDraweeView) {
            ((SimpleDraweeView) viewUC).e(uri);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.k
    @Y61.l
    /* renamed from: zZ, reason: from getter */
    public final Button getF88608j() {
        return this.f88608j;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.j
    @Y61.k
    /* renamed from: ze, reason: from getter */
    public final String getF88618t() {
        return this.f88618t;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Oc(@Y61.l String str) {
    }
}
