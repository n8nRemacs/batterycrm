package com.avito.android.advert_core.pp_recall_promo;

import androidx.core.os.C22777e;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsPpRecallPromoPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "number", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f83967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsPpRecallPromoItem f83968m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem) {
        super(1);
        this.f83967l = hVar;
        this.f83968m = advertDetailsPpRecallPromoItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        h hVar = this.f83967l;
        PpRecallDeeplink ppRecallDeeplink = new PpRecallDeeplink(hVar.f83973c, str, "buyers_item");
        AdvertDetailsPpRecallPromoItem.EventData eventData = this.f83968m.f83927o;
        b.a.a(hVar.f83972b, ppRecallDeeplink, null, C22777e.b(new Q("recalldeeplink.pagetype", eventData != null ? eventData.f83935d : null), new Q("recalldeeplink.placement", eventData != null ? eventData.f83934c : null), new Q("recalldeeplink.banner_name", eventData != null ? eventData.f83933b : null)), 2);
        return G0.f406611a;
    }
}
