package com.avito.android.autoteka.items.buyAgain;

import Hf.InterfaceC13983a;
import Y41.l;
import Y61.k;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BuyAgainPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/buyAgain/d;", "LTV0/d;", "Lcom/avito/android/autoteka/items/buyAgain/f;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$BuyAgainState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<f, ChoosingTypePurchaseState.BuyAgainState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13983a, G0> f96678b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13983a, G0> lVar) {
        this.f96678b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ChoosingTypePurchaseState.BuyAgainState buyAgainState = (ChoosingTypePurchaseState.BuyAgainState) aVar;
        fVar.b(buyAgainState.f96685c);
        fVar.q(buyAgainState.f96686d);
        fVar.or(new c(this));
    }
}
