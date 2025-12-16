package com.avito.android.category_with_params.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsState;
import fo.InterfaceC40453a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryWithParamsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category_with_params/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lfo/a;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsState;", "<init>", "()V", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40453a, CategoryWithParamsInternalAction, CategoryWithParamsState> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CategoryWithParamsInternalAction> b(InterfaceC40453a interfaceC40453a, CategoryWithParamsState categoryWithParamsState) {
        InterfaceC40453a interfaceC40453a2 = interfaceC40453a;
        CategoryWithParamsState categoryWithParamsState2 = categoryWithParamsState;
        if (interfaceC40453a2 instanceof InterfaceC40453a.b) {
            return new C43210w(new CategoryWithParamsInternalAction.ToggleOption(((InterfaceC40453a.b) interfaceC40453a2).f396077a));
        }
        if (interfaceC40453a2 instanceof InterfaceC40453a.InterfaceC11170a) {
            return C43175k.G(new a(categoryWithParamsState2, interfaceC40453a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
