package com.avito.android.profile.user_profile.cards.loyalty_preferences;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoyaltyPreferencesPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/loyalty_preferences/g;", "Lcom/avito/android/profile/user_profile/cards/loyalty_preferences/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225059b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225059b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        CardItem.LoyaltyPreferencesCardItem loyaltyPreferencesCardItem = (CardItem.LoyaltyPreferencesCardItem) aVar;
        cVar.setTitle(loyaltyPreferencesCardItem.f224432d);
        cVar.f(loyaltyPreferencesCardItem.f224433e);
        cVar.s(loyaltyPreferencesCardItem.f224434f);
        cVar.P(loyaltyPreferencesCardItem.f224435g.getTitle(), new f(loyaltyPreferencesCardItem, this));
    }
}
