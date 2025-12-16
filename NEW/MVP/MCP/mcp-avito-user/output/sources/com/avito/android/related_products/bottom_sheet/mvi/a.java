package com.avito.android.related_products.bottom_sheet.mvi;

import cj0.C27210c;
import cj0.InterfaceC27208a;
import com.avito.android.arch.mvi.a;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RelatedProductsBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcj0/a;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcj0/c;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC27208a, RelatedProductsBottomSheetInternalAction, C27210c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RelatedProductsBottomSheetInternalAction> b(InterfaceC27208a interfaceC27208a, C27210c c27210c) {
        InterfaceC27208a interfaceC27208a2 = interfaceC27208a;
        if (interfaceC27208a2 instanceof InterfaceC27208a.C2058a) {
            return new C43210w(new RelatedProductsBottomSheetInternalAction.HandleBeduinEvent(((InterfaceC27208a.C2058a) interfaceC27208a2).f58110a));
        }
        if (interfaceC27208a2 instanceof InterfaceC27208a.b) {
            return new C43210w(new RelatedProductsBottomSheetInternalAction.HandleBeduinState(((InterfaceC27208a.b) interfaceC27208a2).f58111a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
