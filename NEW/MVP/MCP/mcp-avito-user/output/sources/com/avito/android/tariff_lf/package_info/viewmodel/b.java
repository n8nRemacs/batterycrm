package com.avito.android.tariff_lf.package_info.viewmodel;

import cD0.C27018l;
import cD0.C27019m;
import cD0.C27020n;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.tariff.remote.model.bar.BarProgressState;
import com.avito.android.tariff_lf.remote.model.TariffPriceSegment;
import com.avito.android.util.O2;
import fC0.C40276a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPackageInfoConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/b;", "Lcom/avito/android/tariff_lf/package_info/viewmodel/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf.bar.i f299279a;

    @Inject
    public b(@Y61.k com.avito.android.tariff_lf.bar.i iVar) {
        this.f299279a = iVar;
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.a
    @Y61.k
    public final ArrayList a(@Y61.k C27020n c27020n) {
        C27018l tariffPackage = c27020n.getTariffPackage();
        int i12 = 0;
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.tariff_lf.package_info.recycler.header.c(tariffPackage.getPackageTitle(), tariffPackage.getPackageSubtitle()));
        YB0.c bar = tariffPackage.getBar();
        if (bar != null) {
            String title = bar.getTitle();
            String subtitle = bar.getSubtitle();
            float value = bar.getCurrentProgress().getValue();
            BarProgressState state = bar.getCurrentProgress().getState();
            com.avito.android.tariff_lf.bar.i iVar = this.f299279a;
            ProgressState progressStateB = iVar.b(state);
            YB0.a description = bar.getDescription();
            String title2 = description != null ? description.getTitle() : null;
            YB0.a description2 = bar.getDescription();
            arrayListE0.add(new com.avito.android.tariff_lf.bar.a("info_bar", title, subtitle, title2, iVar.a(description2 != null ? description2.getState() : null), value, progressStateB));
        }
        List<C27019m> listB = tariffPackage.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        int i13 = 0;
        for (Object obj : listB) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            C27019m c27019m = (C27019m) obj;
            String strG = AK.c.g(i13, "package_item");
            String title3 = c27019m.getTitle();
            List<C40276a> listA = c27019m.a();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
            int i15 = i12;
            for (Object obj2 : listA) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C40276a c40276a = (C40276a) obj2;
                arrayList2.add(new TC0.a(AK.c.g(i15, "microcategory_item"), c40276a.getTitle(), c40276a.getSubcategories()));
                i15 = i16;
            }
            arrayList.add(new com.avito.android.tariff_lf.package_info.recycler.c(strG, title3, arrayList2));
            i13 = i14;
            i12 = 0;
        }
        arrayListE0.addAll(arrayList);
        if (O2.a(tariffPackage.e())) {
            List<TariffPriceSegment> listE = tariffPackage.e();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listE, 10));
            int i17 = 0;
            for (Object obj3 : listE) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList3.add(new com.avito.android.tariff_lf.package_info.recycler.price_segment.d(AK.c.g(i17, "price_segment_item"), (TariffPriceSegment) obj3));
                i17 = i18;
            }
            arrayListE0.addAll(arrayList3);
        }
        return arrayListE0;
    }
}
