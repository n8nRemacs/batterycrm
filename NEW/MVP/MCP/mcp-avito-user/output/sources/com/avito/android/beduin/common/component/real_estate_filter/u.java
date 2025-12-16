package com.avito.android.beduin.common.component.real_estate_filter;

import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f102345l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar) {
        super(0);
        this.f102345l = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        RealEstateDevelopment realEstateDevelopment;
        Object next;
        s sVar = this.f102345l;
        C28803d c28803d = sVar.f102337b;
        if (c28803d != null) {
            BeduinRealEstateFilterModel beduinRealEstateFilterModel = c28803d.f102290f;
            RealEstateDevelopment realEstateDevelopmentFindDefaultDevelopmentValue = beduinRealEstateFilterModel.getFilters().findDefaultDevelopmentValue();
            c28803d.f102295k = new RealEstateFilterState(beduinRealEstateFilterModel.getFilterState().getLocationId(), realEstateDevelopmentFindDefaultDevelopmentValue != null ? realEstateDevelopmentFindDefaultDevelopmentValue.getId() : null, null, null, null, null, null, null, null, null, 1020, null);
        }
        sVar.a();
        List<RealEstateDevelopment> developments = sVar.f102336a.getDevelopments();
        if (developments != null) {
            Iterator<T> it = developments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((RealEstateDevelopment) next).isDefaultFilterValue(), Boolean.TRUE)) {
                    break;
                }
            }
            realEstateDevelopment = (RealEstateDevelopment) next;
        } else {
            realEstateDevelopment = null;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = sVar.f102339d;
        if (realEstateDevelopment != null) {
            Input input = (Input) dVar.findViewById(R.id.development_input);
            if (input != null) {
                Input.t(input, realEstateDevelopment.getName(), false, 6);
            }
        } else {
            Input input2 = (Input) dVar.findViewById(R.id.development_input);
            if (input2 != null) {
                Input.t(input2, null, false, 6);
            }
        }
        Input input3 = (Input) dVar.findViewById(R.id.completion_input);
        if (input3 != null) {
            Input.t(input3, null, false, 6);
        }
        Input input4 = (Input) dVar.findViewById(R.id.finish_type_input);
        if (input4 != null) {
            Input.t(input4, null, false, 6);
        }
        Input input5 = (Input) dVar.findViewById(R.id.priceFrom);
        if (input5 != null) {
            Input.t(input5, null, false, 6);
        }
        Input input6 = (Input) dVar.findViewById(R.id.priceTo);
        if (input6 != null) {
            Input.t(input6, null, false, 6);
        }
        Input input7 = (Input) dVar.findViewById(R.id.areaFrom);
        if (input7 != null) {
            Input.t(input7, null, false, 6);
        }
        Input input8 = (Input) dVar.findViewById(R.id.areaTo);
        if (input8 != null) {
            Input.t(input8, null, false, 6);
        }
        Chips chips = (Chips) dVar.findViewById(R.id.room_types);
        if (chips != null) {
            chips.j();
        }
        return G0.f406611a;
    }
}
