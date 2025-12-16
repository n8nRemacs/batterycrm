package com.avito.android.advert_core.pp_recall_promo;

import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPpRecallPromoPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/h;", "Lcom/avito/android/advert_core/pp_recall_promo/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f83972b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f83973c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f83974d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f83975e;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k @InterfaceC30174s String str, @Y61.k o oVar, @K9.b @Y61.l Kundle kundle) {
        this.f83972b = aVar;
        this.f83973c = str;
        this.f83974d = oVar;
        String strG = kundle != null ? kundle.g("phone") : null;
        this.f83975e = strG == null ? "" : strG;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem = (AdvertDetailsPpRecallPromoItem) aVar;
        AdvertDetailsPpRecallPromoItem.WidgetStyle widgetStyle = advertDetailsPpRecallPromoItem.f83920h;
        kVar.jD(widgetStyle.f83949b, widgetStyle.f83950c, widgetStyle.f83951d);
        AdvertDetailsPpRecallPromoItem.ImageInformation imageInformation = advertDetailsPpRecallPromoItem.f83919g;
        kVar.na(imageInformation.f83936b, imageInformation.f83937c, imageInformation.f83938d, imageInformation.f83939e, imageInformation.f83940f);
        kVar.b(advertDetailsPpRecallPromoItem.f83917e);
        kVar.tb(new d(this), advertDetailsPpRecallPromoItem.f83918f);
        kVar.q9(advertDetailsPpRecallPromoItem.f83921i);
        kVar.z4(this.f83975e);
        kVar.pn(advertDetailsPpRecallPromoItem.f83922j.f83947b, new e(this, advertDetailsPpRecallPromoItem));
        kVar.setLoading(advertDetailsPpRecallPromoItem.f83929q);
        kVar.Zk(new f(this), advertDetailsPpRecallPromoItem.f83923k);
        kVar.Gt(advertDetailsPpRecallPromoItem.f83924l, advertDetailsPpRecallPromoItem.f83930r);
        kVar.kg(new g(this, advertDetailsPpRecallPromoItem));
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.c
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("phone", this.f83975e);
        return kundle;
    }
}
