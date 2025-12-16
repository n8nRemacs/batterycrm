package com.avito.android.profile.user_profile.cards.referral;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReferralCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/referral/e;", "Lcom/avito/android/profile/user_profile/cards/referral/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225307b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225308c;

    @Inject
    public e(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f225307b = interfaceC28373a;
        this.f225308c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CardItem.ReferralCardItem referralCardItem = (CardItem.ReferralCardItem) aVar;
        ((g) eVar).tC(referralCardItem, new d(this, referralCardItem));
    }
}
