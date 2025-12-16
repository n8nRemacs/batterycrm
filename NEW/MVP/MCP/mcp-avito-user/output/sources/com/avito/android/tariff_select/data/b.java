package com.avito.android.tariff_select.data;

import Y61.k;
import cE0.C27030a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffSelectMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_select/data/b;", "Lcom/avito/android/tariff_select/data/a;", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_select.data.a
    @k
    public final ArrayList a(@k C27030a c27030a) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff_select.ui.items.header.a(c27030a.getTitle(), c27030a.getDescription()));
        int i12 = 0;
        for (Object obj : c27030a.b()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C27030a.C2039a c2039a = (C27030a.C2039a) obj;
            String strG = AK.c.g(i12, "tariff_select_tariff");
            arrayList.add(new com.avito.android.tariff_select.ui.items.tariff.a(c2039a.getUri(), c2039a.getImage(), c2039a.getText(), strG));
            i12 = i13;
        }
        return arrayList;
    }
}
