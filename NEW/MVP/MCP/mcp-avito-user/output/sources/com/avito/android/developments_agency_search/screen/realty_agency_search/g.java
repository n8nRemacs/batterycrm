package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyAgencySearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/checkable_item/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/developments_agency_search/adapter/checkable_item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.l<com.avito.android.developments_agency_search.adapter.checkable_item.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchFragment f138645l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RealtyAgencySearchFragment realtyAgencySearchFragment) {
        super(1);
        this.f138645l = realtyAgencySearchFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.developments_agency_search.adapter.checkable_item.a aVar) {
        LotSort lotSortValueOf = LotSort.valueOf(aVar.f136215b);
        RealtyAgencySearchFragment.a aVar2 = RealtyAgencySearchFragment.f138222V0;
        this.f138645l.D5().accept(new InterfaceC14443a.n(lotSortValueOf));
        return G0.f406611a;
    }
}
