package com.avito.android.autoteka.items.choosingProduct;

import Hf.InterfaceC13983a;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChoosingProductPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/e;", "LTV0/d;", "Lcom/avito/android/autoteka/items/choosingProduct/g;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$ChoosingProductState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<g, ChoosingTypePurchaseState.ChoosingProductState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13983a, G0> f96714b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@Y61.k Y41.l<? super InterfaceC13983a, G0> lVar) {
        this.f96714b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ChoosingTypePurchaseState.ChoosingProductState choosingProductState = (ChoosingTypePurchaseState.ChoosingProductState) aVar;
        gVar.vL(new c(this), choosingProductState.f96693f);
        gVar.F(choosingProductState.f96690c);
        gVar.Kn(choosingProductState.f96692e, new d(this));
    }
}
