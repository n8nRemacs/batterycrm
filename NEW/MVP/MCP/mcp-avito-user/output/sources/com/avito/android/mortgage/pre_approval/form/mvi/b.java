package com.avito.android.mortgage.pre_approval.form.mvi;

import Q00.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PreApprovalFormActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LQ00/a;", "Lcom/avito/android/mortgage/pre_approval/form/mvi/entity/PreApprovalFormInternalAction;", "LR00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<Q00.a, PreApprovalFormInternalAction, R00.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.form.mvi.domain.a f201857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.pre_approval.form.mvi.domain.e f201858b;

    @Inject
    public b(@Y61.k com.avito.android.mortgage.pre_approval.form.mvi.domain.a aVar, @Y61.k com.avito.android.mortgage.pre_approval.form.mvi.domain.e eVar) {
        this.f201857a = aVar;
        this.f201858b = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PreApprovalFormInternalAction> b(Q00.a aVar, R00.b bVar) {
        C43210w c43210w;
        Object dVar;
        Q00.a aVar2 = aVar;
        R00.b bVar2 = bVar;
        if (aVar2 instanceof a.f) {
            return this.f201857a.a();
        }
        if (aVar2 instanceof a.b) {
            c43210w = new C43210w(PreApprovalFormInternalAction.CloseFlow.f201916b);
        } else {
            boolean z12 = aVar2 instanceof a.d;
            com.avito.android.mortgage.pre_approval.form.mvi.domain.e eVar = this.f201858b;
            if (z12) {
                List<String> listA = eVar.f201902a.f201912a.a(bVar2.f14058d);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, P00.a> entry : bVar2.f14056b.entrySet()) {
                    if (listA.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    P00.a aVar3 = (P00.a) entry2.getValue();
                    if (aVar3 instanceof P00.c) {
                        P00.c cVar = (P00.c) aVar3;
                        String str = cVar.f12768b;
                        dVar = (str == null || str.length() == 0) ? P00.c.b(cVar, null, null, com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_options_error, new Serializable[0]), 3) : P00.c.b(cVar, null, null, null, 3);
                    } else if (aVar3 instanceof P00.b) {
                        P00.b bVar3 = (P00.b) aVar3;
                        dVar = bVar3.f12762a != null ? P00.b.b(bVar3, null, null, null, null, 15) : P00.b.b(bVar3, null, null, null, com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_input_error, new Serializable[0]), 15);
                    } else {
                        if (!(aVar3 instanceof P00.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        P00.d dVar2 = (P00.d) aVar3;
                        String str2 = dVar2.f12770a;
                        String str3 = dVar2.f12770a;
                        dVar = (str2 == null || str2.length() == 0) ? new P00.d(str3, com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_input_error, new Serializable[0])) : new P00.d(str3, null);
                    }
                    linkedHashMap2.put(key, dVar);
                }
                return C43175k.G(new com.avito.android.mortgage.pre_approval.form.mvi.domain.d(new C43210w(new PreApprovalFormInternalAction.UpdateValidationResult(linkedHashMap2)), null, eVar, bVar2));
            }
            if (aVar2 instanceof a.e) {
                eVar.getClass();
                return com.avito.android.mortgage.pre_approval.form.mvi.domain.e.a(bVar2);
            }
            if (aVar2 instanceof a.g) {
                a.g gVar = (a.g) aVar2;
                return C43175k.G(new a(gVar.f13403a, gVar.f13404b, null));
            }
            if (aVar2 instanceof a.i) {
                a.i iVar = (a.i) aVar2;
                c43210w = new C43210w(new PreApprovalFormInternalAction.UpdateSelectValue(iVar.f13407a, iVar.f13408b));
            } else if (aVar2 instanceof a.C0879a) {
                a.C0879a c0879a = (a.C0879a) aVar2;
                c43210w = new C43210w(new PreApprovalFormInternalAction.UpdateChipsValue(c0879a.f13396a, c0879a.f13397b));
            } else if (aVar2 instanceof a.j) {
                a.j jVar = (a.j) aVar2;
                c43210w = new C43210w(new PreApprovalFormInternalAction.UpdateInputValue(jVar.f13409a, jVar.f13410b));
            } else {
                if (aVar2 instanceof a.k) {
                    a.k kVar = (a.k) aVar2;
                    String str4 = kVar.f13411a;
                    return new C43207v(new PreApprovalFormInternalAction[]{new PreApprovalFormInternalAction.UpdateInputByPredefined(str4, kVar.f13412b), new PreApprovalFormInternalAction.ApplyBusinessRules(str4)});
                }
                if (aVar2 instanceof a.l) {
                    a.l lVar = (a.l) aVar2;
                    c43210w = new C43210w(new PreApprovalFormInternalAction.UpdateInputBySlider(lVar.f13413a, lVar.f13414b));
                } else if (aVar2 instanceof a.h) {
                    c43210w = new C43210w(new PreApprovalFormInternalAction.ApplyBusinessRules(((a.h) aVar2).f13405a));
                } else {
                    if (!(aVar2 instanceof a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c43210w = new C43210w(new PreApprovalFormInternalAction.ApplyBusinessRules(((a.c) aVar2).f13399a));
                }
            }
        }
        return c43210w;
    }
}
