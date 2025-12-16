package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.mortgage;

import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search_impl.generated.api.api_1_nd_trx_mortgage_list_post.MortgageApplicationView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zw.b;

/* compiled from: MortgageItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f136847l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationView f136848m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GetMortgageListRequestStatus f136849n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, MortgageApplicationView mortgageApplicationView, GetMortgageListRequestStatus getMortgageListRequestStatus) {
        super(0);
        this.f136847l = eVar;
        this.f136848m = mortgageApplicationView;
        this.f136849n = getMortgageListRequestStatus;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f136847l;
        MortgageApplicationView mortgageApplicationView = this.f136848m;
        eVar.f136846b.invoke(new b.k(mortgageApplicationView.getId(), this.f136849n, mortgageApplicationView.getUri()));
        return G0.f406611a;
    }
}
