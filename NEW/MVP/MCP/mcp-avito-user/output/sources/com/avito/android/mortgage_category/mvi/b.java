package com.avito.android.mortgage_category.mvi;

import P10.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage_category.mvi.entity.MortgageCategoryInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageCategoryActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LP10/a;", "Lcom/avito/android/mortgage_category/mvi/entity/MortgageCategoryInternalAction;", "LP10/d;", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<P10.a, MortgageCategoryInternalAction, P10.d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_category.mvi.domain.a f204917a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage_category.mvi.domain.d f204918b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final I10.a f204919c;

    @Inject
    public b(@k com.avito.android.mortgage_category.mvi.domain.a aVar, @k com.avito.android.mortgage_category.mvi.domain.d dVar, @k I10.a aVar2) {
        this.f204917a = aVar;
        this.f204918b = dVar;
        this.f204919c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MortgageCategoryInternalAction> b(P10.a aVar, P10.d dVar) {
        P10.a aVar2 = aVar;
        P10.d dVar2 = dVar;
        if (aVar2.equals(a.b.f12774a)) {
            return this.f204917a.a(dVar2.f12778b, dVar2.f12779c);
        }
        if (aVar2.equals(a.C0826a.f12773a)) {
            return C43175k.G(new a(dVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
