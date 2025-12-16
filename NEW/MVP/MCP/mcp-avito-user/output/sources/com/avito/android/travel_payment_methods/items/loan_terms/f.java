package com.avito.android.travel_payment_methods.items.loan_terms;

import TV0.g;
import kotlin.Metadata;

/* compiled from: LoanTermsBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/f;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/a;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements InterfaceC35262a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j<u, LoanTermsItem> f302498a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f302499b;

    public f(@Y61.k j jVar, @Y61.k w wVar) {
        this.f302498a = jVar;
        this.f302499b = wVar.create();
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f302498a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f302499b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof LoanTermsItem;
    }
}
