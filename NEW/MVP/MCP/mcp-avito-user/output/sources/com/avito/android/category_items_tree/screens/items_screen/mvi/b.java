package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Yn.C18303c;
import Yn.InterfaceC18301a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryItemsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LYn/a;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "LYn/c;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC18301a, CategoryItemsInternalAction, C18303c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_items_tree.screens.items_screen.h f116975a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f116976b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CategoryItemsArguments f116977c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f116978d;

    @Inject
    public b(@Y61.k com.avito.android.category_items_tree.screens.items_screen.h hVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k CategoryItemsArguments categoryItemsArguments, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f116975a = hVar;
        this.f116976b = aVar;
        this.f116977c = categoryItemsArguments;
        this.f116978d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CategoryItemsInternalAction> b(InterfaceC18301a interfaceC18301a, C18303c c18303c) {
        return C43175k.G(new a(interfaceC18301a, c18303c, this, null));
    }
}
