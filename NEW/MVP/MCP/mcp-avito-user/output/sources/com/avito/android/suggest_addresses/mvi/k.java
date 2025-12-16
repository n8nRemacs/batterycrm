package com.avito.android.suggest_addresses.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;
import mA0.C43940a;
import oA0.C44612c;
import oA0.InterfaceC44610a;

/* compiled from: SuggestAddressesActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/k;", "Lcom/avito/android/arch/mvi/a;", "LoA0/a;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "LoA0/c;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements com.avito.android.arch.mvi.a<InterfaceC44610a, SuggestAddressesInternalAction, C44612c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.suggest_addresses.domain.a f291947a;

    @Inject
    public k(@Y61.k com.avito.android.suggest_addresses.domain.a aVar) {
        this.f291947a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SuggestAddressesInternalAction> b(InterfaceC44610a interfaceC44610a, C44612c c44612c) {
        InterfaceC43160i<SuggestAddressesInternalAction> x12;
        InterfaceC44610a interfaceC44610a2 = interfaceC44610a;
        C44612c c44612c2 = c44612c;
        if (interfaceC44610a2.equals(InterfaceC44610a.e.f419476a)) {
            return new C43210w(SuggestAddressesInternalAction.UpdateSuggests.f291935b);
        }
        if (interfaceC44610a2.equals(InterfaceC44610a.c.f419474a)) {
            return new C43207v(new SuggestAddressesInternalAction[]{SuggestAddressesInternalAction.HideKeyboard.f291919b, SuggestAddressesInternalAction.FinishScreen.f291917b});
        }
        boolean zEquals = interfaceC44610a2.equals(InterfaceC44610a.b.f419473a);
        List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list = c44612c2.f419486c;
        com.avito.android.suggest_addresses.domain.a aVar = this.f291947a;
        com.avito.android.suggest_addresses.domain.adapter.chips.c cVar = c44612c2.f419485b;
        if (zEquals) {
            List<C43940a> list2 = cVar.f291849b;
            ArrayList arrayList = new ArrayList(list2.size());
            for (C43940a c43940a : list2) {
                arrayList.add(new SuggestAddress(c43940a.f414358c, c43940a.f414359d, c43940a.f414360e, c43940a.f414362g, c43940a.f414361f, null, 32, null));
            }
            com.avito.android.suggest_addresses.domain.adapter.addresses.c cVar2 = (com.avito.android.suggest_addresses.domain.adapter.addresses.c) C42745f0.G(list);
            x12 = new X(new C43137a0(new e(2, null), (!arrayList.isEmpty() || cVar2 == null) ? new C43210w(new SuggestAddressesInternalAction.FinishScreenWithResult(arrayList)) : new a(aVar.b(cVar2.f291831e, cVar2.f291830d))), new f(3, null));
        } else {
            if (!(interfaceC44610a2 instanceof InterfaceC44610a.d)) {
                if (!(interfaceC44610a2 instanceof InterfaceC44610a.C12166a)) {
                    if (!(interfaceC44610a2 instanceof InterfaceC44610a.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC44610a.f fVar = (InterfaceC44610a.f) interfaceC44610a2;
                    return new C43210w(new SuggestAddressesInternalAction.UnselectSuggestion(fVar.f419477a, fVar.f419478b));
                }
                for (com.avito.android.suggest_addresses.domain.adapter.addresses.c cVar3 : list) {
                    if (L.f(cVar3.f291829c, ((InterfaceC44610a.C12166a) interfaceC44610a2).f419471a)) {
                        if (cVar3.f291833g) {
                            return new C43210w(new SuggestAddressesInternalAction.UnselectSuggestion(cVar3.f291829c, cVar3.f291828b));
                        }
                        x12 = new X(new C43137a0(new j(2, null), new c(aVar.b(cVar3.f291831e, cVar3.f291830d), cVar3)), new d(3, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            String str = c44612c2.f419490g;
            String str2 = ((InterfaceC44610a.d) interfaceC44610a2).f419475a;
            if (L.f(str, str2) || cVar.f291849b.size() >= 10) {
                return new C43207v(new SuggestAddressesInternalAction[0]);
            }
            x12 = new C43152f0(new X(new C43137a0(new g(interfaceC44610a2, null), new b(aVar.a(str2), interfaceC44610a2)), new h(3, null)), new i(3, null));
        }
        return x12;
    }
}
