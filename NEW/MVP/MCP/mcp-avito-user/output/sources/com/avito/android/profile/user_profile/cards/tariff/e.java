package com.avito.android.profile.user_profile.cards.tariff;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Action;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/tariff/e;", "Lcom/avito/android/profile/user_profile/cards/tariff/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225600b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225600b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.TariffCardItem tariffCardItem = (CardItem.TariffCardItem) aVar;
        gVar.n00(tariffCardItem.f224611d);
        String str = tariffCardItem.f224612e;
        if (str == null) {
            gVar.qk(tariffCardItem.f224613f);
        } else {
            gVar.XV(str);
        }
        if (tariffCardItem.f224614g) {
            gVar.lg();
        } else {
            gVar.qI();
        }
        Action action = tariffCardItem.f224615h;
        if (action == null) {
            gVar.io();
            return;
        }
        String title = action.getTitle();
        action.getDeepLink();
        gVar.o80(title);
        gVar.Q(new d(this, tariffCardItem));
    }
}
