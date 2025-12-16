package com.avito.android.tariff_lf.edit_info.ui;

import Y61.l;
import com.avito.android.tariff_lf.edit_info.item.header.HeaderItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditInfoContentsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/ui/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof HeaderItem) && (aVar2 instanceof HeaderItem)) {
            HeaderItem headerItem = (HeaderItem) aVar;
            HeaderItem headerItem2 = (HeaderItem) aVar2;
            return L.f(headerItem.f298991d, headerItem2.f298991d) && L.f(headerItem.f298990c, headerItem2.f298990c);
        }
        if ((aVar instanceof ZC0.e) && (aVar2 instanceof ZC0.e)) {
            return true;
        }
        if (!(aVar instanceof com.avito.android.tariff_lf.edit_info.item.info.a) || !(aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.info.a)) {
            return false;
        }
        com.avito.android.tariff_lf.edit_info.item.info.a aVar3 = (com.avito.android.tariff_lf.edit_info.item.info.a) aVar;
        com.avito.android.tariff_lf.edit_info.item.info.a aVar4 = (com.avito.android.tariff_lf.edit_info.item.info.a) aVar2;
        return L.f(aVar3.f299002d, aVar4.f299002d) && L.f(aVar3.f299001c, aVar4.f299001c);
    }
}
