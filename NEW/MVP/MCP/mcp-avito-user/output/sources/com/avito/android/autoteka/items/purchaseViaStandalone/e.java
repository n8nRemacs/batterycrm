package com.avito.android.autoteka.items.purchaseViaStandalone;

import Hf.InterfaceC13983a;
import Y41.l;
import Y61.k;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PurchaseViaStandalonePresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/purchaseViaStandalone/e;", "LTV0/d;", "Lcom/avito/android/autoteka/items/purchaseViaStandalone/g;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$PurchaseViaStandaloneState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<g, ChoosingTypePurchaseState.PurchaseViaStandaloneState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13983a, G0> f96945b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13983a, G0> lVar) {
        this.f96945b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ChoosingTypePurchaseState.PurchaseViaStandaloneState purchaseViaStandaloneState = (ChoosingTypePurchaseState.PurchaseViaStandaloneState) aVar;
        gVar.b(purchaseViaStandaloneState.f96704c);
        gVar.q(purchaseViaStandaloneState.f96705d);
        gVar.Ci(purchaseViaStandaloneState.f96707f.getTitle(), new c(this, purchaseViaStandaloneState));
        gVar.fi(purchaseViaStandaloneState.f96706e.getText(), new d(this));
    }
}
