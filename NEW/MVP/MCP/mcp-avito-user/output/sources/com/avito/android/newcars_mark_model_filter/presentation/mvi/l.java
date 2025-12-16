package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NewCarsBrandModelFilterBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/l;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements com.avito.android.arch.mvi.b<NewCarsBrandModelFilterInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.newcars_mark_model_filter.domain.a f207352a;

    @Inject
    public l(@Y61.k com.avito.android.newcars_mark_model_filter.domain.a aVar) {
        this.f207352a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<NewCarsBrandModelFilterInternalAction> a() {
        return this.f207352a.b();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
