package com.avito.android.category_with_params.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import fo.InterfaceC40454b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryWithParamsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category_with_params/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "Lfo/b;", "<init>", "()V", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<CategoryWithParamsInternalAction, InterfaceC40454b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40454b b(CategoryWithParamsInternalAction categoryWithParamsInternalAction) {
        CategoryWithParamsInternalAction categoryWithParamsInternalAction2 = categoryWithParamsInternalAction;
        if (!(categoryWithParamsInternalAction2 instanceof CategoryWithParamsInternalAction.FinishScreenWithResult)) {
            return null;
        }
        CategoryWithParamsInternalAction.FinishScreenWithResult finishScreenWithResult = (CategoryWithParamsInternalAction.FinishScreenWithResult) categoryWithParamsInternalAction2;
        return new InterfaceC40454b.a(finishScreenWithResult.f117690b, finishScreenWithResult.f117691c);
    }
}
