package com.avito.android.advertising.adapter.items.avito.bdui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.P;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.engine.component.B;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoNetworkBDUIViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/r;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/p;", "Lcom/avito/konveyor/adapter/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r extends com.avito.konveyor.adapter.b implements p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f87107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f87108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22977J f87109d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f87110e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final B f87111f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final aU0.b f87112g;

    /* renamed from: h, reason: collision with root package name */
    public final ForegroundFrameLayout f87113h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ImageView f87114i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public RatioForegroundFrameLayout f87115j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f87116k;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f87117b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f87118c;

        public a(View view, r rVar) {
            this.f87117b = view;
            this.f87118c = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RatioForegroundFrameLayout ratioForegroundFrameLayout = this.f87118c.f87115j;
            if (ratioForegroundFrameLayout == null) {
                return;
            }
            ratioForegroundFrameLayout.setVisibility(4);
        }
    }

    public r(@Y61.k View view, @Y61.k AdStyle adStyle, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k C22977J c22977j, @Y61.k x xVar, @Y61.k B b12, @Y61.k aU0.b bVar) {
        super(view);
        this.f87107b = view;
        this.f87108c = adStyle;
        this.f87109d = c22977j;
        this.f87110e = xVar;
        this.f87111f = b12;
        this.f87112g = bVar;
        this.f87113h = (ForegroundFrameLayout) view.findViewById(R.id.avito_ad_content);
        this.f87114i = (ImageView) view.findViewById(R.id.close_button);
        this.f87116k = C42727D.c(new q(screen, this, screenPerformanceTracker));
    }

    @Override // com.avito.android.advertising.adapter.items.avito.bdui.p
    public final void Ax(@Y61.k AvitoNetworkBanner.BDUI bdui, @Y61.k View.OnClickListener onClickListener) {
        String str = bdui.f87964d;
        if (str != null) {
            ((t) this.f87116k.getValue()).T3(str);
        }
        this.f87113h.setOnClickListener(onClickListener);
    }

    public final void B80(boolean z12, boolean z13, boolean z14) throws Resources.NotFoundException {
        Drawable drawable;
        ForegroundFrameLayout foregroundFrameLayout = this.f87113h;
        Context context = foregroundFrameLayout.getContext();
        if (z12) {
            if (z13) {
                int dimensionPixelOffset = foregroundFrameLayout.getContext().getResources().getDimensionPixelOffset(R.dimen.serp_card_foreground_padding);
                D6.b(foregroundFrameLayout, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset));
            }
            drawable = null;
        } else {
            drawable = androidx.core.content.d.getDrawable(context, R.drawable.serp_card_background);
        }
        foregroundFrameLayout.setBackground(drawable);
        foregroundFrameLayout.setForeground(androidx.core.content.d.getDrawable(context, z12 ? z14 ? R.drawable.ad_borderless_foreground_16 : R.drawable.ad_borderless_foreground : R.drawable.ad_border_foreground));
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.adapter.items.avito.bdui.p
    public final void NE() {
        RatioForegroundFrameLayout ratioForegroundFrameLayout = this.f87115j;
        int i12 = 8;
        View view = this.f87107b;
        if (ratioForegroundFrameLayout == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
            ViewGroup viewGroup = this.f87113h;
            RatioForegroundFrameLayout ratioForegroundFrameLayout2 = (RatioForegroundFrameLayout) layoutInflaterFrom.inflate(R.layout.not_load_ad_stub_big_media_x2_small, viewGroup, false);
            Eb.c cVar = new Eb.c(ratioForegroundFrameLayout2, AdStyle.f88545j, null, 4, null);
            BannerPageSource bannerPageSource = BannerPageSource.f87777c;
            com.avito.android.advertising.ui.h.f88704a.getClass();
            View view2 = cVar.f4089b;
            com.avito.android.advertising.ui.h.a(view2, bannerPageSource);
            cVar.f4091d = com.avito.android.advertising.ui.h.f(view2.getResources(), bannerPageSource);
            ratioForegroundFrameLayout2.setRatio(2.6666667f);
            D6.b(ratioForegroundFrameLayout2, Integer.valueOf(y6.b(8)), Integer.valueOf(y6.b(11)), Integer.valueOf(y6.b(8)), Integer.valueOf(y6.b(14)));
            viewGroup.addView(ratioForegroundFrameLayout2, 0);
            this.f87115j = ratioForegroundFrameLayout2;
        }
        RatioForegroundFrameLayout ratioForegroundFrameLayout3 = this.f87115j;
        if (ratioForegroundFrameLayout3 == null) {
            return;
        }
        if (view.getMeasuredHeight() == 0) {
            P.b(view, new a(view, this));
            i12 = 0;
        }
        ratioForegroundFrameLayout3.setVisibility(i12);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF4091d() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.bdui.p
    public final void YG(@Y61.k View.OnClickListener onClickListener) {
        ImageView imageView = this.f87114i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF4090c() {
        return this.f87108c;
    }

    @Override // com.avito.android.advertising.adapter.items.avito.bdui.p
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF87107b() {
        return this.f87107b;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
