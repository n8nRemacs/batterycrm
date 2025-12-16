package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot;

import Jw.C14255a;
import Lw.InterfaceC14443a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.Metro;
import ex.C40176c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: LotSearchResultItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/h;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/k;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/lot/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.d<k, a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14443a, G0> f138428b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super InterfaceC14443a, G0> lVar) {
        this.f138428b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        kVar.a(new d(this, aVar2));
        kVar.Gc(new e(this, aVar2));
        boolean z12 = aVar2.f138411g.f138413a;
        kVar.cf(!z12);
        kVar.OA(z12);
        kVar.Y8(new f(this, aVar2));
        kVar.TT(new g(this, aVar2));
        C40176c c40176c = aVar2.f138407c;
        kVar.WH(C14255a.a(c40176c.h()));
        kVar.to(aVar2.f138408d);
        kVar.Zv(aVar2.f138409e);
        kVar.Q70(c40176c.getPrice().getPerMeter());
        kVar.GG(aVar2.f138410f);
        kVar.Oj(C42745f0.O(C42756l.B(new String[]{c40176c.getSquareAll(), c40176c.getFloor(), c40176c.getCompletionQuarter().getValue()}), "  ·  ", null, null, null, 62));
        kVar.r70(c40176c.getDevelopment().getName() + ", " + c40176c.getDeveloper().getName());
        kVar.D2((Metro) C42745f0.G(aVar2.f138412h));
    }
}
