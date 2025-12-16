package com.avito.android.category.mvi;

import Nn.InterfaceC14592a;
import Pn.InterfaceC14813a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.ListItem;
import com.avito.android.category.mvi.entity.CategoryInternalAction;
import com.avito.android.category.mvi.entity.CategoryState;
import com.avito.android.remote.model.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/category/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LPn/a;", "Lcom/avito/android/category/mvi/entity/CategoryInternalAction;", "Lcom/avito/android/category/mvi/entity/CategoryState;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC14813a, CategoryInternalAction, CategoryState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category.d f116687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14592a f116688b;

    @Inject
    public f(@Y61.k com.avito.android.category.d dVar, @Y61.k InterfaceC14592a interfaceC14592a) {
        this.f116687a = dVar;
        this.f116688b = interfaceC14592a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CategoryInternalAction> b(InterfaceC14813a interfaceC14813a, CategoryState categoryState) {
        InterfaceC14813a interfaceC14813a2 = interfaceC14813a;
        CategoryState categoryState2 = categoryState;
        if (interfaceC14813a2 instanceof InterfaceC14813a.b) {
            return new C43210w(CategoryInternalAction.CloseScreen.f116667b);
        }
        boolean z12 = interfaceC14813a2 instanceof InterfaceC14813a.C0862a;
        com.avito.android.category.d dVar = this.f116687a;
        if (!z12) {
            if (!(interfaceC14813a2 instanceof InterfaceC14813a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Q<Location, String> q12 = categoryState2.f116680e;
            if (q12 != null) {
                return new C43137a0(new d(categoryState2, null), new a(dVar.b(q12.f406619b, q12.f406620c, null)));
            }
            CategoryArguments categoryArguments = categoryState2.f116681f;
            return new C43137a0(new c(2, null), new b(dVar.a(categoryArguments.f116451b, categoryArguments.f116453d)));
        }
        InterfaceC14813a.C0862a c0862a = (InterfaceC14813a.C0862a) interfaceC14813a2;
        ListItem listItem = c0862a.f13274a;
        if (listItem instanceof ListItem.Category) {
            ListItem.Category category = (ListItem.Category) listItem;
            if (!category.f116479e.isEmpty()) {
                return new C43210w(new CategoryInternalAction.ExpandCategory(category));
            }
        }
        this.f116688b.a(listItem.getF116488c(), listItem.getF116487b());
        return new C43137a0(new e(categoryState2, c0862a, null), new a(dVar.b(categoryState2.f116679d, listItem.getF116487b(), listItem.getParams())));
    }
}
