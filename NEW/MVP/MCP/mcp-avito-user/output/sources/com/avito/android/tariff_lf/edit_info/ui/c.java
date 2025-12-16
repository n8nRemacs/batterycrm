package com.avito.android.tariff_lf.edit_info.ui;

import Y61.l;
import com.avito.android.tariff_lf.edit_info.item.header.HeaderItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditInfoEqualityComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/ui/c;", "Lcom/avito/android/recycler/data_aware/f;", "<init>", "()V", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.recycler.data_aware.f {
    @Inject
    public c() {
    }

    @Override // com.avito.android.recycler.data_aware.f
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof com.avito.android.tariff_lf.edit_info.item.info.a) && (aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.info.a)) {
            return L.f(((com.avito.android.tariff_lf.edit_info.item.info.a) aVar).f299000b, ((com.avito.android.tariff_lf.edit_info.item.info.a) aVar2).f299000b);
        }
        if ((aVar instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.a) && (aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.prolongation.a)) {
            return L.f(((com.avito.android.tariff_lf.edit_info.item.prolongation.a) aVar).f299035b, ((com.avito.android.tariff_lf.edit_info.item.prolongation.a) aVar2).f299035b);
        }
        if ((aVar instanceof HeaderItem) && (aVar2 instanceof HeaderItem)) {
            return L.f(((HeaderItem) aVar).f298990c, ((HeaderItem) aVar2).f298990c);
        }
        if ((aVar instanceof ZC0.e) && (aVar2 instanceof ZC0.e)) {
            return true;
        }
        if ((aVar instanceof com.avito.android.tariff_lf.edit_info.item.package_title.a) && (aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.package_title.a)) {
            return L.f(((com.avito.android.tariff_lf.edit_info.item.package_title.a) aVar).f299026b, ((com.avito.android.tariff_lf.edit_info.item.package_title.a) aVar2).f299026b);
        }
        if ((aVar instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a) && (aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a)) {
            return L.f(((com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a) aVar).f298960b, ((com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a) aVar2).f298960b);
        }
        if ((aVar instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.a) && (aVar2 instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.a)) {
            return L.f(((com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.a) aVar).f298936b, ((com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus.a) aVar2).f298936b);
        }
        if ((aVar instanceof com.avito.android.tariff_lf.bar.a) && (aVar2 instanceof com.avito.android.tariff_lf.bar.a)) {
            return L.f(aVar, aVar2);
        }
        return false;
    }
}
