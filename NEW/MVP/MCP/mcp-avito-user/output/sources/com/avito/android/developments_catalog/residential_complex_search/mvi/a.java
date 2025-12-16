package com.avito.android.developments_catalog.residential_complex_search.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sx.InterfaceC48426a;

/* compiled from: ResidentialComplexActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lsx/a;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/n;", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC48426a, ResidentialComplexInternalAction, n> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.developments_catalog.residential_complex_search.h f139199a;

    @Inject
    public a(@Y61.k com.avito.android.developments_catalog.residential_complex_search.h hVar) {
        this.f139199a = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ResidentialComplexInternalAction> b(InterfaceC48426a interfaceC48426a, n nVar) {
        C43210w c43210w;
        InterfaceC48426a interfaceC48426a2 = interfaceC48426a;
        if (interfaceC48426a2 instanceof InterfaceC48426a.d) {
            return this.f139199a.a(((InterfaceC48426a.d) interfaceC48426a2).f438924a);
        }
        if (interfaceC48426a2 instanceof InterfaceC48426a.c) {
            InterfaceC48426a.c cVar = (InterfaceC48426a.c) interfaceC48426a2;
            return new C43210w(new ResidentialComplexInternalAction.ReturnItemResult(cVar.f438922a, cVar.f438923b));
        }
        if (interfaceC48426a2 instanceof InterfaceC48426a.C12651a) {
            c43210w = new C43210w(ResidentialComplexInternalAction.CloseScreen.f139208b);
        } else {
            if (!(interfaceC48426a2 instanceof InterfaceC48426a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ResidentialComplexInternalAction.ClearSearchField.f139207b);
        }
        return c43210w;
    }
}
