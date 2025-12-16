package com.avito.android.beduin.common.component.real_estate_filter;

import android.view.View;
import com.avito.android.beduin.common.form.transforms.RealEstateFilterStateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Iterator;
import lj.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f102331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f102332c;

    public /* synthetic */ q(s sVar, int i12) {
        this.f102331b = i12;
        this.f102332c = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102331b) {
            case 0:
                s sVar = this.f102332c;
                C28803d c28803d = sVar.f102337b;
                if (c28803d != null) {
                    RealEstateFilterState realEstateFilterState = c28803d.f102295k;
                    RealEstateFilterStateTransform realEstateFilterStateTransform = new RealEstateFilterStateTransform(realEstateFilterState);
                    BeduinRealEstateFilterModel beduinRealEstateFilterModel = c28803d.f102290f;
                    BeduinModel beduinModelApply = beduinRealEstateFilterModel.apply(realEstateFilterStateTransform);
                    BeduinRealEstateFilterModel beduinRealEstateFilterModel2 = beduinModelApply instanceof BeduinRealEstateFilterModel ? (BeduinRealEstateFilterModel) beduinModelApply : null;
                    if (beduinRealEstateFilterModel2 != null) {
                        c28803d.v(beduinRealEstateFilterModel2);
                    }
                    c28803d.f102291g.h(new d.h(beduinRealEstateFilterModel, beduinModelApply));
                    C28800a c28800a = c28803d.f102293i;
                    c28800a.b(realEstateFilterState);
                    ArrayList arrayList = new ArrayList();
                    c28800a.a("developmentId", realEstateFilterState, arrayList);
                    c28800a.a(SearchParamsConverterKt.LOCATION_ID, realEstateFilterState, arrayList);
                    c28800a.a("completionDateFrom", realEstateFilterState, arrayList);
                    c28800a.a("completionDateTo", realEstateFilterState, arrayList);
                    c28800a.a("roomsTypeIds", realEstateFilterState, arrayList);
                    c28800a.a("finishTypeId", realEstateFilterState, arrayList);
                    c28800a.a("areaFrom", realEstateFilterState, arrayList);
                    c28800a.a("areaTo", realEstateFilterState, arrayList);
                    c28800a.a("priceFrom", realEstateFilterState, arrayList);
                    c28800a.a("priceTo", realEstateFilterState, arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c28800a.c((String) it.next(), null);
                    }
                }
                sVar.f102339d.dismiss();
                break;
            default:
                s sVar2 = this.f102332c;
                C28803d c28803d2 = sVar2.f102337b;
                if (c28803d2 != null) {
                    RealEstateFilterState realEstateFilterState2 = c28803d2.f102295k;
                    RealEstateFilterStateTransform realEstateFilterStateTransform2 = new RealEstateFilterStateTransform(realEstateFilterState2);
                    BeduinRealEstateFilterModel beduinRealEstateFilterModel3 = c28803d2.f102290f;
                    BeduinModel beduinModelApply2 = beduinRealEstateFilterModel3.apply(realEstateFilterStateTransform2);
                    BeduinRealEstateFilterModel beduinRealEstateFilterModel4 = beduinModelApply2 instanceof BeduinRealEstateFilterModel ? (BeduinRealEstateFilterModel) beduinModelApply2 : null;
                    if (beduinRealEstateFilterModel4 != null) {
                        c28803d2.v(beduinRealEstateFilterModel4);
                    }
                    c28803d2.f102291g.h(new d.h(beduinRealEstateFilterModel3, beduinModelApply2));
                    C28800a c28800a2 = c28803d2.f102293i;
                    c28800a2.b(realEstateFilterState2);
                    ArrayList arrayList2 = new ArrayList();
                    c28800a2.a("developmentId", realEstateFilterState2, arrayList2);
                    c28800a2.a(SearchParamsConverterKt.LOCATION_ID, realEstateFilterState2, arrayList2);
                    c28800a2.a("completionDateFrom", realEstateFilterState2, arrayList2);
                    c28800a2.a("completionDateTo", realEstateFilterState2, arrayList2);
                    c28800a2.a("roomsTypeIds", realEstateFilterState2, arrayList2);
                    c28800a2.a("finishTypeId", realEstateFilterState2, arrayList2);
                    c28800a2.a("areaFrom", realEstateFilterState2, arrayList2);
                    c28800a2.a("areaTo", realEstateFilterState2, arrayList2);
                    c28800a2.a("priceFrom", realEstateFilterState2, arrayList2);
                    c28800a2.a("priceTo", realEstateFilterState2, arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c28800a2.c((String) it2.next(), null);
                    }
                }
                sVar2.f102339d.dismiss();
                break;
        }
    }
}
