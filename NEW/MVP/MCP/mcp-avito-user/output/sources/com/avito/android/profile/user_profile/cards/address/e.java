package com.avito.android.profile.user_profile.cards.address;

import Ua0.InterfaceC15503a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.AddressDescription;
import com.avito.android.remote.model.user_profile.items.AddressIcon;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddressCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/e;", "Lcom/avito/android/profile/user_profile/cards/address/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f224725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f224726c;

    @Inject
    public e(@Y61.k Y41.l lVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f224725b = interfaceC28373a;
        this.f224726c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.AddressCardItem addressCardItem = (CardItem.AddressCardItem) aVar;
        gVar.setTitle(addressCardItem.f224303e);
        AddressIcon addressIcon = addressCardItem.f224305g;
        gVar.HZ(addressIcon.getName(), addressIcon.getColor());
        AddressDescription addressDescription = addressCardItem.f224306h;
        gVar.Mv(addressCardItem.f224304f, addressDescription.getHouse(), addressDescription.getLocation(), addressDescription.getDetails());
        gVar.D3(addressCardItem.f224307i.getTitle(), new d(this, addressCardItem));
    }
}
