package com.avito.android.beduin.common.component.real_estate_filter;

import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedFinishTypeDate", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<RealEstateFinishType> f102317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28803d f102318m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List<RealEstateFinishType> list, C28803d c28803d) {
        super(1);
        this.f102317l = list;
        this.f102318m = c28803d;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Object next;
        String str2 = str;
        Iterator<T> it = this.f102317l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(str2, ((RealEstateFinishType) next).getId())) {
                break;
            }
        }
        RealEstateFinishType realEstateFinishType = (RealEstateFinishType) next;
        C28803d c28803d = this.f102318m;
        RealEstateFilterState realEstateFilterState = c28803d.f102295k;
        c28803d.y(realEstateFilterState.copy((511 & 1) != 0 ? realEstateFilterState.locationId : null, (511 & 2) != 0 ? realEstateFilterState.developmentId : null, (511 & 4) != 0 ? realEstateFilterState.areaTo : null, (511 & 8) != 0 ? realEstateFilterState.areaFrom : null, (511 & 16) != 0 ? realEstateFilterState.priceTo : null, (511 & 32) != 0 ? realEstateFilterState.priceFrom : null, (511 & 64) != 0 ? realEstateFilterState.completionDateFrom : null, (511 & 128) != 0 ? realEstateFilterState.completionDateTo : null, (511 & 256) != 0 ? realEstateFilterState.roomsTypeIds : null, (511 & 512) != 0 ? realEstateFilterState.finishTypeId : realEstateFinishType != null ? realEstateFinishType.getId() : null));
        return G0.f406611a;
    }
}
