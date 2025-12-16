package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.arch.mvi.a;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersInternalAction;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import ft.InterfaceC40476a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FiltersActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/logics/b;", "Lcom/avito/android/arch/mvi/a;", "Lft/a;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersState;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40476a, FiltersInternalAction, FiltersState> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FiltersInternalAction> b(InterfaceC40476a interfaceC40476a, FiltersState filtersState) {
        return C43175k.G(new a(interfaceC40476a, filtersState, null));
    }
}
