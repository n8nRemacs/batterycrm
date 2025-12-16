package com.avito.android.autoteka.items.purchaseViaStandalone;

import Hf.InterfaceC13983a;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PurchaseViaStandalonePresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f96942l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChoosingTypePurchaseState.PurchaseViaStandaloneState f96943m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ChoosingTypePurchaseState.PurchaseViaStandaloneState purchaseViaStandaloneState) {
        super(0);
        this.f96942l = eVar;
        this.f96943m = purchaseViaStandaloneState;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f96942l;
        eVar.f96945b.invoke(new InterfaceC13983a.d(this.f96943m.f96707f.getUrl()));
        return G0.f406611a;
    }
}
