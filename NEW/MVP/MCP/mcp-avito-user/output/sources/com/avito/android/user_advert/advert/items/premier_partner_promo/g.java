package com.avito.android.user_advert.advert.items.premier_partner_promo;

import Yo.w;
import com.avito.android.comfortable_deal.deeplink.ComfortableDealDeeplink;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PremierPartnerPromoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f309829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f309830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar) {
        super(0);
        this.f309829l = hVar;
        this.f309830m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f309829l;
        w wVar = hVar.f309831b;
        a aVar = this.f309830m;
        wVar.b(aVar.f309823b);
        MyAdvertDetailsActivity myAdvertDetailsActivity = hVar.f309832c;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(new ComfortableDealDeeplink(aVar.f309823b, "item_promo"));
        }
        return G0.f406611a;
    }
}
