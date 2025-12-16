package com.avito.android.str_insurance.converters;

import Y61.k;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.str_insurance.Offer;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceOfferConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/converters/g;", "Lcom/avito/android/str_insurance/converters/f;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f288549a;

    @Inject
    public g(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f288549a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_insurance.converters.f
    @k
    public final List<com.avito.conveyor_item.a> a(@k Zy0.c cVar) {
        Offer offer;
        InsuranceData insuranceData = cVar.f20608b;
        if (insuranceData == null || (offer = insuranceData.getOffer()) == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC35863o4 interfaceC35863o4 = this.f288549a;
        arrayList.add(new com.avito.android.str_insurance.items.title.e(R.attr.beige50, offer.getTitle(), interfaceC35863o4.a()));
        List<AttributedText> listD = offer.d();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.avito.android.str_insurance.items.insight.c(interfaceC35863o4.a(), (AttributedText) it.next()));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
