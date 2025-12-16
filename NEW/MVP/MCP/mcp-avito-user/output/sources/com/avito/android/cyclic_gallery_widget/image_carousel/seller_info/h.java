package com.avito.android.cyclic_gallery_widget.image_carousel.seller_info;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.util.C35852n1;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselSellerItemView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/h;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f132138b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RatioFrameLayout f132139c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f132140d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f132141e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f132142f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingBar f132143g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f132144h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f132145i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final CompactFlexibleLayout f132146j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Float f132147k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Y41.a<G0> f132148l;

    public h(@k View view) {
        super(view);
        this.f132138b = view;
        this.f132139c = (RatioFrameLayout) view;
        this.f132140d = (SimpleDraweeView) view.findViewById(R.id.logo);
        this.f132141e = (TextView) view.findViewById(R.id.seller_name);
        this.f132142f = (TextView) view.findViewById(R.id.rating_number);
        this.f132143g = (RatingBar) view.findViewById(R.id.rating_score);
        this.f132144h = (TextView) view.findViewById(R.id.rating_text);
        this.f132145i = (TextView) view.findViewById(R.id.gallery_seller_info_seller_type_view);
        this.f132146j = (CompactFlexibleLayout) view.findViewById(R.id.badge_bar);
        view.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 21));
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void Aa(int i12) {
        this.f132138b.setBackgroundResource(i12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void S2(@l String str, @l Float f12) {
        I5.a(this.f132142f, f12 != null ? C35852n1.a(f12.floatValue()) : null, false);
        RatingBar ratingBar = this.f132143g;
        if (f12 != null) {
            ratingBar.setFloatingRatingIsEnabled(true);
            ratingBar.setRating(f12.floatValue());
            D6.H(ratingBar);
        } else {
            D6.w(ratingBar);
        }
        I5.a(this.f132144h, str, false);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void T50(@k String str, boolean z12) {
        TextView textView = this.f132141e;
        textView.setText(str);
        if (z12) {
            FV.a.f4720a.f(textView, R.attr.textIconArrowForwardIos, FV.a.f4721b);
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void a(@l Y41.a<G0> aVar) {
        this.f132138b.setClickable(aVar != null);
        this.f132148l = aVar;
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void bK() {
        D6.w(this.f132140d);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void bu(@l com.avito.android.image_loader.a aVar, boolean z12, boolean z13) {
        SimpleDraweeView simpleDraweeView = this.f132140d;
        RoundingParams roundingParams = simpleDraweeView.getHierarchy().f6531c;
        if (roundingParams == null) {
            roundingParams = new RoundingParams();
        }
        View view = this.f132138b;
        if (z12) {
            roundingParams.f340152b = false;
            roundingParams.e(view.getResources().getDimension(R.dimen.rich_snippet_seller_info_rounding_radius));
            simpleDraweeView.getLayoutParams().width = view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_seller_info_shop_logo_width);
        } else if (z13) {
            roundingParams.f340152b = false;
            roundingParams.e(view.getResources().getDimension(R.dimen.rich_snippet_seller_info_rounding_radius));
            simpleDraweeView.getLayoutParams().width = view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_brandspace_logo_width);
            simpleDraweeView.getLayoutParams().height = view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_brandspace_logo_height);
        } else {
            roundingParams.f340152b = true;
            simpleDraweeView.getLayoutParams().width = view.getResources().getDimensionPixelSize(R.dimen.rich_snippet_seller_info_user_logo_width);
        }
        simpleDraweeView.getHierarchy().s(roundingParams);
        C35949t5.c(this.f132140d, aVar, null, null, null, 14);
        D6.H(simpleDraweeView);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void dJ(@l String str) {
        I5.a(this.f132145i, str, false);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void oj(int i12) {
        D6.f(this.f132138b, i12, 0, i12, 0, 10);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void q0(float f12) {
        if (L.d(this.f132147k, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f132139c;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f132147k = Float.valueOf(f12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void qX(int i12) {
        this.f132141e.setMaxLines(i12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g
    public final void t0(@l List<SerpBadge> list) {
        Q81.b.a(this.f132146j, list, 0);
    }
}
