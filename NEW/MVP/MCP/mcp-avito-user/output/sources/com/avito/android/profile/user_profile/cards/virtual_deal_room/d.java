package com.avito.android.profile.user_profile.cards.virtual_deal_room;

import N90.t;
import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VirtualDealRoomCardPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/virtual_deal_room/d;", "LTV0/d;", "Lcom/avito/android/profile/user_profile/cards/virtual_deal_room/f;", "Lcom/avito/android/profile/user_profile/cards/CardItem$VirtualDealRoomCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, CardItem.VirtualDealRoomCardItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225616b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225617c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f225616b = lVar;
        this.f225617c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        CardItem.VirtualDealRoomCardItem virtualDealRoomCardItem = (CardItem.VirtualDealRoomCardItem) aVar;
        fVar.setTitle(virtualDealRoomCardItem.f224617d);
        fVar.f(virtualDealRoomCardItem.f224618e);
        fVar.F4(virtualDealRoomCardItem.f224620g);
        fVar.c(new c(this, virtualDealRoomCardItem));
        this.f225617c.c(new t());
    }
}
