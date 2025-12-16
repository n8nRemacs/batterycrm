package com.avito.android.advert.item.realty_quiz_banner;

import Up0.InterfaceC15557a;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyQuizBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_quiz_banner/h;", "Lcom/avito/android/advert/item/realty_quiz_banner/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15557a f78369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f78370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f78371d;

    @Inject
    public h(@Y61.k InterfaceC15557a interfaceC15557a, @Y61.k c cVar, @Y61.k com.avito.android.advert_core.analytics.a aVar) {
        this.f78369b = interfaceC15557a;
        this.f78370c = cVar;
        this.f78371d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        RealtyQuizBannerItem realtyQuizBannerItem = (RealtyQuizBannerItem) aVar;
        oVar.r9(new e(this, realtyQuizBannerItem));
        com.avito.android.advert_core.analytics.a aVar2 = this.f78371d;
        aVar2.A6(null, "item_quiz_issimilar_yes", null);
        aVar2.A6(null, "item_quiz_issimilar_no", null);
        oVar.RB(new f(this, realtyQuizBannerItem));
        oVar.NQ(new g(this, realtyQuizBannerItem));
        oVar.Sg(realtyQuizBannerItem.f78351e);
        oVar.yK(realtyQuizBannerItem.f78353g);
        oVar.gP(realtyQuizBannerItem.f78350d);
        oVar.nE(realtyQuizBannerItem.f78349c);
    }
}
