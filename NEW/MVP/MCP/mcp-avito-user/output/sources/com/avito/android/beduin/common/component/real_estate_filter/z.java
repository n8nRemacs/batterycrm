package com.avito.android.beduin.common.component.real_estate_filter;

import com.avito.android.lib.design.chips.Chips;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinRealEstateFilterDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/z;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chips f102358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f102359b;

    public z(Chips chips, s sVar) {
        this.f102358a = chips;
        this.f102359b = sVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        c((com.avito.android.lib.design.chips.h) C42745f0.G(this.f102358a.s()));
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        c((com.avito.android.lib.design.chips.h) C42745f0.G(this.f102358a.s()));
    }

    public final void c(com.avito.android.lib.design.chips.h hVar) {
        z zVar;
        E e12;
        RealEstateRoomType realEstateRoomType;
        if (hVar instanceof E) {
            e12 = (E) hVar;
            zVar = this;
        } else {
            zVar = this;
            e12 = null;
        }
        s sVar = zVar.f102359b;
        C28803d c28803d = sVar.f102337b;
        if (c28803d != null) {
            String id2 = (e12 == null || (realEstateRoomType = e12.f102275b) == null) ? null : realEstateRoomType.getId();
            RealEstateFilterState realEstateFilterState = c28803d.f102295k;
            c28803d.y(realEstateFilterState.copy((511 & 1) != 0 ? realEstateFilterState.locationId : null, (511 & 2) != 0 ? realEstateFilterState.developmentId : null, (511 & 4) != 0 ? realEstateFilterState.areaTo : null, (511 & 8) != 0 ? realEstateFilterState.areaFrom : null, (511 & 16) != 0 ? realEstateFilterState.priceTo : null, (511 & 32) != 0 ? realEstateFilterState.priceFrom : null, (511 & 64) != 0 ? realEstateFilterState.completionDateFrom : null, (511 & 128) != 0 ? realEstateFilterState.completionDateTo : null, (511 & 256) != 0 ? realEstateFilterState.roomsTypeIds : id2 != null ? Collections.singletonList(id2) : null, (511 & 512) != 0 ? realEstateFilterState.finishTypeId : null));
        }
        sVar.a();
    }
}
