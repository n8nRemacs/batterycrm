package com.avito.android.related_products.bottom_sheet.mvi;

import cj0.C27210c;
import com.avito.android.arch.mvi.u;
import com.avito.android.related_products.bottom_sheet.mvi.entity.RelatedProductsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetInternalAction;", "Lcj0/c;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<RelatedProductsBottomSheetInternalAction, C27210c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C27210c a(RelatedProductsBottomSheetInternalAction relatedProductsBottomSheetInternalAction, C27210c c27210c) {
        C27210c.b c2060b;
        C27210c.b bVar;
        RelatedProductsBottomSheetInternalAction relatedProductsBottomSheetInternalAction2 = relatedProductsBottomSheetInternalAction;
        C27210c c27210c2 = c27210c;
        if (!(relatedProductsBottomSheetInternalAction2 instanceof RelatedProductsBottomSheetInternalAction.HandleBeduinState)) {
            return c27210c2;
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((RelatedProductsBottomSheetInternalAction.HandleBeduinState) relatedProductsBottomSheetInternalAction2).f252927b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            bVar = C27210c.b.C2061c.f58121a;
        } else {
            if (abstractC40048c instanceof AbstractC40048c.a) {
                c2060b = new C27210c.b.a(((AbstractC40048c.a) abstractC40048c).getF395211c());
            } else {
                if (!(abstractC40048c instanceof AbstractC40048c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c2060b = new C27210c.b.C2060b(((AbstractC40048c.b) abstractC40048c).f395216b);
            }
            bVar = c2060b;
        }
        return new C27210c(bVar);
    }
}
