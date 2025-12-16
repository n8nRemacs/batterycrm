package com.avito.android.profile.user_profile.cards.calls_history_card_item;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CallsHistoryCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/calls_history_card_item/d;", "LTV0/d;", "Lcom/avito/android/profile/user_profile/cards/calls_history_card_item/f;", "Lcom/avito/android/profile/user_profile/cards/CardItem$CallsHistoryCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, CardItem.CallsHistoryCardItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f224858c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final E f224859d;

    @Inject
    public d(@k l lVar, @k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f224857b = lVar;
        this.f224858c = interfaceC28373a;
        this.f224859d = e12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CardItem.CallsHistoryCardItem callsHistoryCardItem = (CardItem.CallsHistoryCardItem) aVar;
        ((f) eVar).e10(callsHistoryCardItem, new c(this, callsHistoryCardItem));
    }
}
