package com.avito.android.cyclic_gallery_widget.image_carousel.native_video;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.cyclic_gallery_widget.image_carousel.l;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.d;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.video_snippets.g;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselNativeVideoView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/f;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/native_video/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f132058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatioFrameLayout f132059c;

    /* renamed from: d, reason: collision with root package name */
    public final StyledPlayerView f132060d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f132061e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Float f132062f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f132063g;

    public f(@k View view) {
        super(view);
        this.f132058b = view;
        this.f132059c = (RatioFrameLayout) view;
        StyledPlayerView styledPlayerView = (StyledPlayerView) view.findViewById(R.id.player_view);
        this.f132060d = styledPlayerView;
        this.f132061e = (SimpleDraweeView) view.findViewById(R.id.thumbnail_view);
        view.setOnClickListener(new h(this, 20));
        v.b(styledPlayerView, R.dimen.serp_gallery_item_radius);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.native_video.e
    public final void IP(@k String str, @k String str2, boolean z12, @l g gVar, @l com.jakewharton.rxrelay3.c cVar) {
        if (gVar != null) {
            gVar.a(str2);
            gVar.b(str, z12, this.f132061e, cVar);
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.native_video.e
    public final void a(@l Y41.a<G0> aVar) {
        this.f132058b.setClickable(true);
        this.f132063g = aVar;
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.native_video.e
    public final void nq(boolean z12) {
        SimpleDraweeView simpleDraweeView = this.f132061e;
        if (z12) {
            D6.H(simpleDraweeView);
        } else {
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.native_video.e
    public final void q0(float f12) {
        if (L.d(this.f132062f, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f132059c;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f132062f = Float.valueOf(f12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.native_video.e
    public final void uL(@k com.avito.android.image_loader.k kVar, @k com.avito.android.cyclic_gallery_widget.image_carousel.l lVar, boolean z12) {
        int i12;
        SimpleDraweeView simpleDraweeView = this.f132061e;
        Drawable drawableU = z12 ? D6.u(simpleDraweeView, lVar.f132034g) : d.a.a(new com.avito.android.image_loader.e().a(simpleDraweeView.getContext()), simpleDraweeView.getContext(), kVar, null, null, 28);
        float dimensionPixelSize = simpleDraweeView.getResources().getDimensionPixelSize(lVar.f132028a);
        float dimensionPixelSize2 = simpleDraweeView.getResources().getDimensionPixelSize(lVar.f132029b);
        float dimensionPixelSize3 = simpleDraweeView.getResources().getDimensionPixelSize(lVar.f132031d);
        float dimensionPixelSize4 = simpleDraweeView.getResources().getDimensionPixelSize(lVar.f132030c);
        int i13 = Build.VERSION.SDK_INT;
        View view = this.f132058b;
        if (i13 >= 33) {
            view.setClipToOutline(true);
            view.setBackgroundResource(lVar.f132033f);
        } else {
            v.b(this.f132060d, lVar.f132032e);
            view.setBackgroundResource(R.drawable.gallery_item_bg_str_redesign_single);
            if (lVar.equals(l.d.f132038h)) {
                i12 = R.drawable.native_video_small_foreground_redesign;
            } else {
                i12 = lVar.equals(l.b.f132036h) ? true : lVar.equals(l.c.f132037h) ? true : lVar.equals(l.e.f132039h) ? R.drawable.native_video_large_foreground_redesign : R.drawable.native_video_foreground;
            }
            view.setForeground(D6.u(view, i12));
        }
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.d(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        hierarchy.s(roundingParams);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(kVar);
        aVarA.f169501s = drawableU;
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
    }
}
