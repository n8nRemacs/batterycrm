package com.avito.android.profile.user_profile.cards.address;

import Ua0.InterfaceC15503a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.address.EmptyAddressCardView;
import com.avito.android.remote.model.user_profile.items.AddressIcon;
import com.avito.android.remote.model.user_profile.items.SuggestedAddress;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: EmptyAddressCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/address/o;", "Lcom/avito/android/profile/user_profile/cards/address/k;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f224746b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f224747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f224748d = f2.b(0, 1, null, 5);

    @Inject
    public o(@Y61.k Y41.l lVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f224746b = interfaceC28373a;
        this.f224747c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        EmptyAddressCardView emptyAddressCardView = (EmptyAddressCardView) eVar;
        CardItem.EmptyAddressCardItem emptyAddressCardItem = (CardItem.EmptyAddressCardItem) aVar;
        emptyAddressCardView.setTitle(emptyAddressCardItem.f224395f);
        emptyAddressCardView.I1(emptyAddressCardItem.f224394e);
        emptyAddressCardView.setText(emptyAddressCardItem.f224397h);
        emptyAddressCardView.i(emptyAddressCardItem.f224398i);
        emptyAddressCardView.D3(emptyAddressCardItem.f224401l.getTitle(), new l(emptyAddressCardItem, this));
        AddressIcon addressIcon = emptyAddressCardItem.f224396g;
        String name = addressIcon.getName();
        String color = addressIcon.getColor();
        String str = emptyAddressCardItem.f224400k;
        emptyAddressCardView.j80(str, name, color);
        m mVar = new m(emptyAddressCardItem, this);
        n nVar = new n(emptyAddressCardItem, this);
        SuggestedAddress suggestedAddress = emptyAddressCardItem.f224399j;
        emptyAddressCardView.QD(suggestedAddress, mVar, nVar);
        emptyAddressCardView.sz(suggestedAddress != null ? EmptyAddressCardView.State.f224714b : (str == null || str.length() == 0) ? EmptyAddressCardView.State.f224716d : EmptyAddressCardView.State.f224715c);
    }
}
