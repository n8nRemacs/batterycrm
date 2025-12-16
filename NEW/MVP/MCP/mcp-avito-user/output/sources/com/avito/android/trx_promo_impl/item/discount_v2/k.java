package com.avito.android.trx_promo_impl.item.discount_v2;

import RF0.m;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoStrDiscountV2BannerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/discount_v2/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_impl/item/discount_v2/j;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f304284h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f304285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Banner f304286c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f304287d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f304288e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f304289f;

    /* renamed from: g, reason: collision with root package name */
    public final int f304290g;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f304285b = aVar;
        Banner banner = (Banner) view;
        this.f304286c = banner;
        this.f304287d = (TextView) banner.findViewById(R.id.trx_promo_str_discount_v2_text_title);
        this.f304288e = (SimpleDraweeView) banner.findViewById(R.id.trx_promo_str_discount_v2_image);
        this.f304289f = (TextView) banner.findViewById(R.id.trx_promo_str_discount_v2_text_description);
        this.f304290g = y6.b(20);
    }

    @Override // com.avito.android.trx_promo_impl.item.discount_v2.j
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f304286c.setOnClickListener(new A(20, aVar));
    }

    @Override // com.avito.android.trx_promo_impl.item.discount_v2.j
    public final void e(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f304287d, attributedText, this.f304285b);
    }

    @Override // com.avito.android.trx_promo_impl.item.discount_v2.j
    public final void fc(@InterfaceC42150f int i12) {
        Banner banner = this.f304286c;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(banner.getContext(), i12, 0, 4, null);
        c5275a.f179264a = this.f304290g;
        banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    @Override // com.avito.android.trx_promo_impl.item.discount_v2.j
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f304289f, attributedText, this.f304285b);
    }

    @Override // com.avito.android.trx_promo_impl.item.discount_v2.j
    public final void tt(@l m mVar) {
        Image image;
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(this.f304286c.getContext());
        Image image2 = mVar.f14249a;
        if (!zB2 && (image = mVar.f14250b) != null) {
            image2 = image;
        }
        C35949t5.c(this.f304288e, com.avito.android.image_loader.b.b(image2), null, null, null, 14);
    }
}
