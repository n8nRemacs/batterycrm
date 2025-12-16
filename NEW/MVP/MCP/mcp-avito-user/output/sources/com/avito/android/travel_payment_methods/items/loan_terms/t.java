package com.avito.android.travel_payment_methods.items.loan_terms;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.travel_payment_methods.items.loan_terms.g;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LoanTermsPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/t;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/j;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/u;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/LoanTermsItem;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements j<u, LoanTermsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Y41.p<? super String, ? super String, G0> f302510b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super String, G0> f302511c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super DeepLink, G0> f302512d;

    public t() {
        throw null;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((u) eVar, (LoanTermsItem) aVar);
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.j
    public final void d7(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f302511c = lVar;
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.j
    public final void e6(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f302510b = pVar;
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.j
    public final void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f302512d = lVar;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        u uVar = (u) eVar;
        LoanTermsItem loanTermsItem = (LoanTermsItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<g> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(uVar, loanTermsItem);
            return;
        }
        for (g gVar : list2) {
            if (gVar instanceof g.c) {
                g.c cVar = (g.c) gVar;
                uVar.mp(cVar.f302502a, cVar.f302503b);
            } else if (gVar instanceof g.b) {
                uVar.E60(((g.b) gVar).f302501a, new s(this));
            } else if (gVar instanceof g.a) {
                uVar.dL(((g.a) gVar).f302500a);
            }
        }
    }

    public final void k(@Y61.k u uVar, @Y61.k LoanTermsItem loanTermsItem) {
        LoanTerm loanTerm = (LoanTerm) C42745f0.K((int) loanTermsItem.f302494c, loanTermsItem.f302495d);
        uVar.mp(loanTerm != null ? loanTerm.f302537f : null, loanTerm != null ? loanTerm.f302535d : null);
        uVar.E60(loanTermsItem, new r(this));
        uVar.dL(loanTerm != null ? loanTerm.f302534c : null);
        uVar.g1(this.f302512d);
        uVar.Na(this.f302511c);
    }
}
