package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import androidx.compose.runtime.internal.P;
import bo.InterfaceC25685b;
import com.avito.android.arch.mvi.t;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TreeOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lbo/b;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<TreeInternalAction, InterfaceC25685b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25685b b(TreeInternalAction treeInternalAction) {
        TreeInternalAction treeInternalAction2 = treeInternalAction;
        if (treeInternalAction2 instanceof TreeInternalAction.Error) {
            return new InterfaceC25685b.a(((TreeInternalAction.Error) treeInternalAction2).f117164b);
        }
        return null;
    }
}
