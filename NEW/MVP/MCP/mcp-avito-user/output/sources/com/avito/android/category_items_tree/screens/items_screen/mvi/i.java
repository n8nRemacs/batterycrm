package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Yn.InterfaceC18302b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryItemsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "LYn/b;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<CategoryItemsInternalAction, InterfaceC18302b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC18302b b(CategoryItemsInternalAction categoryItemsInternalAction) {
        CategoryItemsInternalAction categoryItemsInternalAction2 = categoryItemsInternalAction;
        if (categoryItemsInternalAction2 instanceof CategoryItemsInternalAction.LoadMoreError) {
            return new InterfaceC18302b.a(((CategoryItemsInternalAction.LoadMoreError) categoryItemsInternalAction2).f116992b);
        }
        return null;
    }
}
