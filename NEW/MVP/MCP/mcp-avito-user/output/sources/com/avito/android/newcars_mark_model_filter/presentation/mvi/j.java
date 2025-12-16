package com.avito.android.newcars_mark_model_filter.presentation.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import o30.InterfaceC44575a;

/* compiled from: NewCarsBrandModelFilterActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "Lo30/a;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lo30/c;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC44575a, NewCarsBrandModelFilterInternalAction, o30.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.newcars_mark_model_filter.domain.a f207349a;

    @Inject
    public j(@Y61.k com.avito.android.newcars_mark_model_filter.domain.a aVar) {
        this.f207349a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<NewCarsBrandModelFilterInternalAction> b(InterfaceC44575a interfaceC44575a, o30.c cVar) {
        InterfaceC44575a interfaceC44575a2 = interfaceC44575a;
        o30.c cVar2 = cVar;
        boolean z12 = interfaceC44575a2 instanceof InterfaceC44575a.d;
        com.avito.android.newcars_mark_model_filter.domain.a aVar = this.f207349a;
        if (z12) {
            List<com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a> list = cVar2.f419353e;
            if (!list.isEmpty()) {
                return new C43210w(new NewCarsBrandModelFilterInternalAction.BrandsLoaded(list));
            }
            return new C43152f0(new X(new C43137a0(new a(2, null), aVar.b()), new b(3, null)), new c(3, null));
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.e) {
            List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> list2 = cVar2.f419354f;
            if (!list2.isEmpty()) {
                return new C43210w(new NewCarsBrandModelFilterInternalAction.ModelsLoaded(list2, ((InterfaceC44575a.e) interfaceC44575a2).f419342a));
            }
            return new C43152f0(new X(new C43137a0(new d(2, null), aVar.c(((InterfaceC44575a.e) interfaceC44575a2).f419342a)), new e(3, null)), new f(3, null));
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.C12161a) {
            InterfaceC44575a.C12161a c12161a = (InterfaceC44575a.C12161a) interfaceC44575a2;
            return new C43152f0(new X(new C43137a0(new g(2, null), aVar.a(c12161a.f419338a, c12161a.f419339b)), new h(3, null)), new i(3, null));
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.g) {
            InterfaceC44575a.g gVar = (InterfaceC44575a.g) interfaceC44575a2;
            return new C43210w(new NewCarsBrandModelFilterInternalAction.SelectModel(gVar.f419344a, gVar.f419345b));
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.b) {
            return new C43210w(NewCarsBrandModelFilterInternalAction.CancelSelection.f207330b);
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.f) {
            return new C43210w(new NewCarsBrandModelFilterInternalAction.Search(((InterfaceC44575a.f) interfaceC44575a2).f419343a));
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.c) {
            return new C43210w(NewCarsBrandModelFilterInternalAction.HideLoader.f207331b);
        }
        if (interfaceC44575a2 instanceof InterfaceC44575a.h) {
            return new C43210w(NewCarsBrandModelFilterInternalAction.ShowLoader.f207338b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
