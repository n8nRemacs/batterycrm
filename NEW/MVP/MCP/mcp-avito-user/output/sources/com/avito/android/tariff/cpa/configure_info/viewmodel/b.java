package com.avito.android.tariff.cpa.configure_info.viewmodel;

import aB0.C19754c;
import androidx.compose.runtime.internal.P;
import cC0.C27004a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CpaConfigureInfoConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/viewmodel/b;", "Lcom/avito/android/tariff/cpa/configure_info/viewmodel/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.a
    @Y61.k
    public final C19754c a(@Y61.k C27004a c27004a) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.tariff.cpa.configure_info.items.header.a(c27004a.getTitle(), c27004a.getDescription()));
        List<cC0.b> listC = c27004a.c();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
        for (cC0.b bVar : listC) {
            arrayList2.add(new com.avito.android.tariff.cpa.configure_info.items.feature.a(bVar.getTitle(), bVar.getDescription(), bVar.getIcon()));
        }
        C42745f0.h(arrayList2, arrayList);
        return new C19754c(arrayList, c27004a.getButton());
    }
}
