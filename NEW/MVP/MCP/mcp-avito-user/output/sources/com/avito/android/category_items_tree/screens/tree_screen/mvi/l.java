package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import androidx.compose.runtime.internal.P;
import bo.C25686c;
import com.avito.android.arch.mvi.u;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TreeReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lbo/c;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements u<TreeInternalAction, C25686c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25686c a(TreeInternalAction treeInternalAction, C25686c c25686c) {
        TreeInternalAction treeInternalAction2 = treeInternalAction;
        C25686c c25686c2 = c25686c;
        if (treeInternalAction2 instanceof TreeInternalAction.Loading) {
            return new C25686c(c25686c2.f57450e, c25686c2.f57448c, true, c25686c2.f57449d);
        }
        if (!(treeInternalAction2 instanceof TreeInternalAction.Content)) {
            return c25686c2;
        }
        TreeInternalAction.Content content = (TreeInternalAction.Content) treeInternalAction2;
        return new C25686c(content.f117163d, content.f117161b, false, content.f117162c);
    }
}
