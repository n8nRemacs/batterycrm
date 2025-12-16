package com.avito.android.tariff_lf.package_info.recycler.price_segment;

import com.avito.android.tariff_lf.remote.model.TariffPriceSegment;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffPriceSegmentPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/l;", "LTV0/d;", "Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/e;", "Lcom/avito/android/tariff_lf/package_info/recycler/price_segment/d;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements TV0.d<e, d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f299277b;

    @Inject
    public l(@Y61.k g gVar) {
        this.f299277b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        TariffPriceSegment tariffPriceSegment = ((d) aVar).f299270c;
        eVar2.b(tariffPriceSegment.getTitle());
        eVar2.iY(this.f299277b.a(tariffPriceSegment.c()));
    }
}
