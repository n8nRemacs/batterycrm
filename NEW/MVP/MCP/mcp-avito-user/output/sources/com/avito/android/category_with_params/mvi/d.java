package com.avito.android.category_with_params.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_with_params.entity.CategoryParams;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CategoryWithParamsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_with_params/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/category_with_params/mvi/entity/CategoryWithParamsInternalAction;", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.b<CategoryWithParamsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CategoryParams f117687a;

    @Inject
    public d(@Y61.k CategoryParams categoryParams) {
        this.f117687a = categoryParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CategoryWithParamsInternalAction> a() {
        return new C43210w(new CategoryWithParamsInternalAction.CategoryWithParamsDataReceived(this.f117687a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
