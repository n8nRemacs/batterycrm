package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.autoteka.items.error.choosingTypePurchase.ChoosingTypePurchaseErrorItem;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: AutotekaChoosingPurchaseReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "LHf/c;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements u<AutotekaChoosingPurchaseInternalAction, Hf.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f97212b = new p();

    @Override // com.avito.android.arch.mvi.u
    public final Hf.c a(AutotekaChoosingPurchaseInternalAction autotekaChoosingPurchaseInternalAction, Hf.c cVar) {
        AutotekaChoosingPurchaseInternalAction autotekaChoosingPurchaseInternalAction2 = autotekaChoosingPurchaseInternalAction;
        Hf.c cVar2 = cVar;
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.Loading) {
            Hf.c.f7585d.getClass();
            return Hf.c.f7586e;
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.Error) {
            ApiError apiError = ((AutotekaChoosingPurchaseInternalAction.Error) autotekaChoosingPurchaseInternalAction2).f97161b;
            return new c.d(new ChoosingTypePurchaseErrorItem(null, com.avito.android.autoteka.helpers.j.c(apiError), com.avito.android.autoteka.helpers.j.b(apiError), com.avito.android.autoteka.helpers.j.a(apiError), 1, null), apiError);
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.BuyAgainState) {
            AutotekaChoosingPurchaseInternalAction.BuyAgainState buyAgainState = (AutotekaChoosingPurchaseInternalAction.BuyAgainState) autotekaChoosingPurchaseInternalAction2;
            return new c.a(buyAgainState.f97153b, buyAgainState.f97154c);
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.ChoosingProductState) {
            AutotekaChoosingPurchaseInternalAction.ChoosingProductState choosingProductState = (AutotekaChoosingPurchaseInternalAction.ChoosingProductState) autotekaChoosingPurchaseInternalAction2;
            ChoosingTypePurchaseState.ChoosingProductState choosingProductState2 = choosingProductState.f97158b;
            return new c.b(choosingProductState2, choosingProductState2.f96691d, choosingProductState.f97159c);
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageState) {
            AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageState purchaseViaPackageState = (AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageState) autotekaChoosingPurchaseInternalAction2;
            return new c.f(purchaseViaPackageState.f97173b, purchaseViaPackageState.f97174c);
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.PurchaseViaPackageOnSuccess) {
            if (!(cVar2 instanceof c.f)) {
                return cVar2;
            }
            c.f fVar = (c.f) cVar2;
            return c.f.a(fVar, ChoosingTypePurchaseState.PurchaseViaPackageState.a(fVar.f7597f, false));
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.UseReportPackageError) {
            if (!(cVar2 instanceof c.f)) {
                return cVar2;
            }
            c.f fVar2 = (c.f) cVar2;
            return c.f.a(fVar2, ChoosingTypePurchaseState.PurchaseViaPackageState.a(fVar2.f7597f, false));
        }
        if (autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.BuyReportViaPackageLoading) {
            if (!(cVar2 instanceof c.f)) {
                return cVar2;
            }
            c.f fVar3 = (c.f) cVar2;
            return c.f.a(fVar3, ChoosingTypePurchaseState.PurchaseViaPackageState.a(fVar3.f7597f, true));
        }
        if (!(autotekaChoosingPurchaseInternalAction2 instanceof AutotekaChoosingPurchaseInternalAction.PurchaseViaStandaloneState)) {
            return cVar2;
        }
        AutotekaChoosingPurchaseInternalAction.PurchaseViaStandaloneState purchaseViaStandaloneState = (AutotekaChoosingPurchaseInternalAction.PurchaseViaStandaloneState) autotekaChoosingPurchaseInternalAction2;
        return new c.g(purchaseViaStandaloneState.f97175b, purchaseViaStandaloneState.f97176c);
    }
}
