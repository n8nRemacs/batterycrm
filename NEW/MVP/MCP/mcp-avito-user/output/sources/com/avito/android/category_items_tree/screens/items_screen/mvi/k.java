package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Yn.C18303c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.category_items_tree.screens.items_screen.a;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: CategoryItemsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "LYn/c;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements u<CategoryItemsInternalAction, C18303c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C18303c a(CategoryItemsInternalAction categoryItemsInternalAction, C18303c c18303c) {
        CategoryItemsInternalAction categoryItemsInternalAction2 = categoryItemsInternalAction;
        C18303c c18303c2 = c18303c;
        boolean z12 = categoryItemsInternalAction2 instanceof CategoryItemsInternalAction.LoadMoreItems;
        List<com.avito.android.category_items_tree.screens.items_screen.a> list = c18303c2.f19656c;
        if (z12) {
            if (((CategoryItemsInternalAction.LoadMoreItems) categoryItemsInternalAction2).f116993b) {
                return c18303c2;
            }
            return C18303c.a(c18303c2, C42745f0.i0(a.c.f116813a, list));
        }
        if (!(categoryItemsInternalAction2 instanceof CategoryItemsInternalAction.Items)) {
            if (categoryItemsInternalAction2 instanceof CategoryItemsInternalAction.LoadMoreError) {
                return C18303c.a(c18303c2, com.avito.android.category_items_tree.screens.items_screen.b.a(list));
            }
            throw new NoWhenBranchMatchedException();
        }
        CategoryItemsInternalAction.Items items = (CategoryItemsInternalAction.Items) categoryItemsInternalAction2;
        ArrayList arrayListH0 = C42745f0.h0(items.f116991d, com.avito.android.category_items_tree.screens.items_screen.b.a(list));
        int i12 = c18303c2.f19657d;
        boolean z13 = items.f116990c;
        if (!z13) {
            i12++;
        }
        return new C18303c(items.f116989b, arrayListH0, i12, z13);
    }
}
