package com.avito.android.profile.user_profile.cards.referral;

import Ua0.InterfaceC15503a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28436q0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReferralCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f225305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CardItem.ReferralCardItem f225306m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, CardItem.ReferralCardItem referralCardItem) {
        super(0);
        this.f225305l = eVar;
        this.f225306m = referralCardItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f225305l;
        InterfaceC28373a interfaceC28373a = eVar.f225307b;
        CardItem.ReferralCardItem referralCardItem = this.f225306m;
        interfaceC28373a.c(new C28436q0(referralCardItem.f224527h));
        DeepLink deepLink = referralCardItem.f224526g.getDeepLink();
        if (deepLink != null) {
            eVar.f225308c.invoke(new InterfaceC15503a.C1130a(deepLink, false, 2, null));
        }
        return G0.f406611a;
    }
}
