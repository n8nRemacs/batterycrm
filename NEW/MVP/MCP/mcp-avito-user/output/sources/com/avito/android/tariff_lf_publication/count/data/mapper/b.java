package com.avito.android.tariff_lf_publication.count.data.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wZ.C49578b;

/* compiled from: TariffLfPublicationCountMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/data/mapper/b;", "Lcom/avito/android/tariff_lf_publication/count/data/mapper/a;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_lf_publication.count.data.mapper.a
    @k
    public final ArrayList a(@k PD0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff_lf_publication.common.ui.items.header.c(null, aVar.getTitle(), aVar.getDescription(), 1, null));
        for (PD0.c cVar : aVar.c()) {
            String str = "tariff_lf_publication_count_option_" + cVar.getId();
            long id2 = cVar.getId();
            String title = cVar.getTitle();
            boolean isSelected = cVar.getIsSelected();
            AttributedText description = cVar.getDescription();
            PD0.d priceInfo = cVar.getPriceInfo();
            arrayList.add(new com.avito.android.tariff_lf_publication.count.ui.items.option.c(str, id2, title, isSelected, description, priceInfo != null ? new LD0.a(priceInfo.getOldPrice(), priceInfo.getPrice()) : null));
        }
        return arrayList;
    }

    @Override // com.avito.android.tariff_lf_publication.count.data.mapper.a
    @k
    public final C49578b b(@k PD0.a aVar) {
        return new C49578b(aVar.getButton().getTitle(), aVar.getButton().getUri(), aVar.getButton().getStyle(), aVar.getButton().getIsEnabled());
    }
}
