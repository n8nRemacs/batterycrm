package com.avito.android.advert_core.pp_recall_promo;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsPpRecallPromoPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "clickStreamDeepLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f83970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsPpRecallPromoItem f83971m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem) {
        super(1);
        this.f83970l = hVar;
        this.f83971m = advertDetailsPpRecallPromoItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        h hVar = this.f83970l;
        hVar.f83974d.i2(this.f83971m);
        b.a.a(hVar.f83972b, deepLink, null, null, 6);
        return G0.f406611a;
    }
}
