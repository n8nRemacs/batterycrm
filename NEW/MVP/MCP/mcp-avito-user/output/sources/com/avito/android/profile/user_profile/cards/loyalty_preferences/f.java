package com.avito.android.profile.user_profile.cards.loyalty_preferences;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.cards.CardItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoyaltyPreferencesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CardItem.LoyaltyPreferencesCardItem f225057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f225058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardItem.LoyaltyPreferencesCardItem loyaltyPreferencesCardItem, g gVar) {
        super(0);
        this.f225057l = loyaltyPreferencesCardItem;
        this.f225058m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CardItem.LoyaltyPreferencesCardItem loyaltyPreferencesCardItem = this.f225057l;
        if (loyaltyPreferencesCardItem.f224435g.getDeepLink() != null) {
            this.f225058m.f225059b.invoke(new InterfaceC15503a.k(loyaltyPreferencesCardItem));
        }
        return G0.f406611a;
    }
}
