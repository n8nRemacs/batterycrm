package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import androidx.compose.runtime.internal.P;
import ao.C23643b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TreeBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.b<TreeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TreeArguments f117158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_items_tree.screens.tree_screen.f f117159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f117160c;

    @Inject
    public e(@Y61.k TreeArguments treeArguments, @Y61.k com.avito.android.category_items_tree.screens.tree_screen.f fVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f117158a = treeArguments;
        this.f117159b = fVar;
        this.f117160c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TreeInternalAction> a() {
        TreeArguments treeArguments = this.f117158a;
        this.f117160c.c(new C23643b(treeArguments.f117020b));
        return this.f117159b.a(treeArguments.f117020b, treeArguments.f117021c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
