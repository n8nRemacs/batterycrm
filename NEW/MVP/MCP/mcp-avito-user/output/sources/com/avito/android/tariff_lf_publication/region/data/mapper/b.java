package com.avito.android.tariff_lf_publication.region.data.mapper;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wZ.C49578b;

/* compiled from: TariffLfPublicationRegionMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/data/mapper/b;", "Lcom/avito/android/tariff_lf_publication/region/data/mapper/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_lf_publication.region.data.mapper.a
    @l
    public final String a(@k SD0.a aVar) {
        Object next;
        Iterator<T> it = aVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SD0.c) next).getIsSelected()) {
                break;
            }
        }
        SD0.c cVar = (SD0.c) next;
        if (cVar != null) {
            return cVar.getId();
        }
        return null;
    }

    @Override // com.avito.android.tariff_lf_publication.region.data.mapper.a
    @k
    public final ArrayList b(@k SD0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff_lf_publication.common.ui.items.header.c(null, aVar.getTitle(), aVar.getDescription(), 1, null));
        for (SD0.c cVar : aVar.c()) {
            arrayList.add(new com.avito.android.tariff_lf_publication.region.ui.items.option.c("tariff_lf_publication_region_option_" + cVar.getId(), cVar.getId(), cVar.getTitle(), cVar.getIsSelected()));
        }
        return arrayList;
    }

    @Override // com.avito.android.tariff_lf_publication.region.data.mapper.a
    @k
    public final C49578b c(@k SD0.a aVar) {
        SD0.b button = aVar.getButton();
        return new C49578b(button.getTitle(), button.getUri(), button.getStyle(), button.getIsEnabled());
    }
}
