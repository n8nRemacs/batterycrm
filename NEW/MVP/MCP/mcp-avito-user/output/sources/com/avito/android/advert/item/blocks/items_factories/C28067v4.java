package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.service_education.ServiceEducationItem;
import com.avito.android.advert_core.service_education.ServiceEducationValue;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.service_education.ServiceEducation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsServiceEducationItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/v4;", "Lcom/avito/android/advert/item/blocks/items_factories/u4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.v4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28067v4 implements InterfaceC28061u4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74045a;

    @Inject
    public C28067v4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74045a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28061u4
    @Y61.k
    public final ServiceEducationItem a(@Y61.k ServiceEducation serviceEducation, @Y61.k String str) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        String strValueOf = String.valueOf(156);
        int iA2 = this.f74045a.a();
        PrintableText printableTextF = serviceEducation.getTitle() != null ? com.avito.android.printable_text.b.f(String.valueOf(serviceEducation.getTitle())) : com.avito.android.printable_text.b.c(R.string.advert_details_service_education_title, new Serializable[0]);
        List<ServiceEducation.ServiceEducationValue> values = serviceEducation.getValues();
        ArrayList arrayList = new ArrayList(C42745f0.q(values, 10));
        for (ServiceEducation.ServiceEducationValue serviceEducationValue : values) {
            arrayList.add(new ServiceEducationValue(String.valueOf(serviceEducationValue.hashCode()), serviceEducationValue.getInstitution(), serviceEducationValue.getSpeciality(), serviceEducationValue.getYear()));
        }
        return new ServiceEducationItem(strValueOf, iA2, str, printableTextF, arrayList, false, true, false);
    }
}
