package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Xn.C17027b;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryItemsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.b<CategoryItemsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CategoryItemsArguments f116983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_items_tree.screens.items_screen.h f116984b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f116985c;

    @Inject
    public d(@Y61.k CategoryItemsArguments categoryItemsArguments, @Y61.k com.avito.android.category_items_tree.screens.items_screen.h hVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f116983a = categoryItemsArguments;
        this.f116984b = hVar;
        this.f116985c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CategoryItemsInternalAction> a() {
        CategoryItemsArguments categoryItemsArguments = this.f116983a;
        this.f116985c.c(new C17027b(categoryItemsArguments.f116795b, categoryItemsArguments.f116799f));
        return this.f116984b.a(1, true);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
