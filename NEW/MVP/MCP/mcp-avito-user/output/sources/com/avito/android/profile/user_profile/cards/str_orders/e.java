package com.avito.android.profile.user_profile.cards.str_orders;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrOrdersCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/str_orders/e;", "Lcom/avito/android/profile/user_profile/cards/str_orders/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225587b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225587b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.StrOrdersCardItem strOrdersCardItem = (CardItem.StrOrdersCardItem) aVar;
        gVar.setTitle(strOrdersCardItem.f224605d);
        gVar.f(strOrdersCardItem.f224606e);
        gVar.sc(strOrdersCardItem.f224609h);
        gVar.P(strOrdersCardItem.f224607f, new d(this, strOrdersCardItem));
    }
}
