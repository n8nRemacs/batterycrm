package com.avito.android.str_insurance.converters;

import Y61.k;
import com.avito.android.R;
import com.avito.android.str_insurance.Confirmation;
import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.util.InterfaceC35863o4;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: StrInsuranceConfirmationConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/converters/a;", "Lcom/avito/android/str_insurance/converters/f;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f288546a;

    @Inject
    public a(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f288546a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_insurance.converters.f
    @k
    public final List<com.avito.conveyor_item.a> a(@k Zy0.c cVar) {
        Confirmation confirmation;
        InsuranceData insuranceData = cVar.f20608b;
        return (insuranceData == null || (confirmation = insuranceData.getConfirmation()) == null) ? C42784z0.f406748b : Collections.singletonList(new com.avito.android.str_insurance.items.title.e(R.attr.transparentWhite, confirmation.getDescription(), this.f288546a.a()));
    }
}
