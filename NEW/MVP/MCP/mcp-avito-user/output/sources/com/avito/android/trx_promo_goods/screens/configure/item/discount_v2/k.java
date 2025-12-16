package com.avito.android.trx_promo_goods.screens.configure.item.discount_v2;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TrxPromoDiscountV2BannerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_goods/screens/configure/item/discount_v2/j;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f303534h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f303535b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Banner f303536c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f303537d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f303538e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f303539f;

    /* renamed from: g, reason: collision with root package name */
    public final int f303540g;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f303535b = aVar;
        Banner banner = (Banner) view;
        this.f303536c = banner;
        this.f303537d = (TextView) banner.findViewById(R.id.trx_promo_discount_v2_text_title);
        this.f303538e = (SimpleDraweeView) banner.findViewById(R.id.trx_promo_discount_v2_image);
        this.f303539f = (TextView) banner.findViewById(R.id.trx_promo_discount_v2_text_description);
        this.f303540g = y6.b(20);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.j
    public final void Q6(@l wZ.l lVar) {
        C35949t5.c(this.f303538e, com.avito.android.image_loader.b.b(lVar != null ? lVar.a(this.f303536c.getContext()) : null), null, null, null, 14);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.j
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f303536c.setOnClickListener(new A(19, aVar));
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.j
    public final void e(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f303537d, attributedText, this.f303535b);
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.j
    public final void fc(@InterfaceC42150f int i12) {
        Banner banner = this.f303536c;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(banner.getContext(), i12, 0, 4, null);
        c5275a.f179264a = this.f303540g;
        banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    @Override // com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.j
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f303539f, attributedText, this.f303535b);
    }
}
