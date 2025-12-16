package com.avito.android.str_insurance.converters;

import Y61.k;
import com.avito.android.str_insurance.Form;
import com.avito.android.str_insurance.InsuranceData;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StrInsuranceFlatFormConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/converters/c;", "Lcom/avito/android/str_insurance/converters/f;", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements f {
    @Inject
    public c() {
    }

    @Override // com.avito.android.str_insurance.converters.f
    @k
    public final List<com.avito.conveyor_item.a> a(@k Zy0.c cVar) {
        Form form;
        InsuranceData insuranceData = cVar.f20608b;
        return (insuranceData == null || (form = insuranceData.getForm()) == null) ? C42784z0.f406748b : Collections.singletonList(new com.avito.android.str_insurance.items.flat_form.c(form.getTitle(), form.getDescription(), form.getAddress(), form.getDisclaimer(), cVar.f20609c, form.getFlatNumberPattern(), form.getItemId(), cVar.f20610d));
    }
}
