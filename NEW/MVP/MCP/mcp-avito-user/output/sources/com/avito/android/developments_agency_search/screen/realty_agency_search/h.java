package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Lw.InterfaceC14443a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.RealtyAgencySearchFragment;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyAgencySearchFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RealtyAgencySearchFragment f138646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RealtyAgencySearchFragment realtyAgencySearchFragment) {
        super(0);
        this.f138646l = realtyAgencySearchFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        LotSort.f138659b.getClass();
        LotSort lotSort = LotSort.f138660c;
        RealtyAgencySearchFragment.a aVar = RealtyAgencySearchFragment.f138222V0;
        this.f138646l.D5().accept(new InterfaceC14443a.n(lotSort));
        return G0.f406611a;
    }
}
