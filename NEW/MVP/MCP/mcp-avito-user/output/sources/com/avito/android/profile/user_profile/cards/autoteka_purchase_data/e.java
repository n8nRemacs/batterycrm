package com.avito.android.profile.user_profile.cards.autoteka_purchase_data;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutotekaPurchaseDataCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/autoteka_purchase_data/e;", "Lcom/avito/android/profile/user_profile/cards/autoteka_purchase_data/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224800b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224800b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.AutotekaPurchaseDataCardItem autotekaPurchaseDataCardItem = (CardItem.AutotekaPurchaseDataCardItem) aVar;
        gVar.setIcon(autotekaPurchaseDataCardItem.f224327h);
        gVar.setTitle(autotekaPurchaseDataCardItem.f224323d);
        gVar.f(autotekaPurchaseDataCardItem.f224324e);
        gVar.P(autotekaPurchaseDataCardItem.f224325f, new d(this, autotekaPurchaseDataCardItem));
    }
}
