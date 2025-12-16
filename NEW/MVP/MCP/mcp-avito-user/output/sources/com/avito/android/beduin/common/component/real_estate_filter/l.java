package com.avito.android.beduin.common.component.real_estate_filter;

import android.content.res.Resources;
import com.avito.android.beduin.common.form.transforms.RealEstateFilterStateTransform;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;

/* compiled from: BeduinRealEstateFilterComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", SearchParamsConverterKt.LOCATION_ID, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28803d f102325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f102326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C28803d c28803d, B b12) {
        super(1);
        this.f102325l = c28803d;
        this.f102326m = b12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) throws Resources.NotFoundException {
        C28803d c28803d = this.f102325l;
        BeduinRealEstateFilterModel beduinRealEstateFilterModel = c28803d.f102290f;
        RealEstateFilterState filterState = beduinRealEstateFilterModel.getFilterState();
        BeduinRealEstateFilterModel beduinRealEstateFilterModel2 = (BeduinRealEstateFilterModel) beduinRealEstateFilterModel.apply(new RealEstateFilterStateTransform(filterState.copy((511 & 1) != 0 ? filterState.locationId : str, (511 & 2) != 0 ? filterState.developmentId : null, (511 & 4) != 0 ? filterState.areaTo : null, (511 & 8) != 0 ? filterState.areaFrom : null, (511 & 16) != 0 ? filterState.priceTo : null, (511 & 32) != 0 ? filterState.priceFrom : null, (511 & 64) != 0 ? filterState.completionDateFrom : null, (511 & 128) != 0 ? filterState.completionDateTo : null, (511 & 256) != 0 ? filterState.roomsTypeIds : null, (511 & 512) != 0 ? filterState.finishTypeId : null)));
        c28803d.v(beduinRealEstateFilterModel2);
        c28803d.f102291g.h(new d.h(beduinRealEstateFilterModel, beduinRealEstateFilterModel2));
        RealEstateLocation realEstateLocationU = C28803d.u(beduinRealEstateFilterModel2);
        if (realEstateLocationU != null) {
            this.f102326m.a(realEstateLocationU.getNamePrepositional(), beduinRealEstateFilterModel.getTitleStyle());
            C28800a c28800a = c28803d.f102293i;
            c28800a.getClass();
            c28800a.d(new com.google.gson.d().a().l(Collections.singletonMap("location", realEstateLocationU.getName())));
            c28800a.c(SearchParamsConverterKt.LOCATION_ID, realEstateLocationU.getName());
        }
        return G0.f406611a;
    }
}
