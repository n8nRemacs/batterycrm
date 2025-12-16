package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import androidx.compose.runtime.internal.P;
import fD0.C40281c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rD0.C47527a;
import rD0.C47528b;

/* compiled from: ConstructorConfigureCategoryConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/viewmodel/b;", "Lcom/avito/android/tariff_lf_constructor/configure/category/viewmodel/a;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.a
    @Y61.k
    public final C40281c a(@Y61.k C47528b c47528b) {
        int i12 = 0;
        ArrayList arrayListE0 = C42745f0.e0(new com.avito.android.tariff_lf_constructor.configure.header_item.a("header_item", c47528b.getTitle(), null, 4, null));
        List<C47527a> listB = c47528b.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (Object obj : listB) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C47527a c47527a = (C47527a) obj;
            arrayList.add(new com.avito.android.tariff_lf_constructor.configure.category.items.content.a(AK.c.g(i12, "category_item"), c47527a.getId(), c47527a.getTitle(), c47527a.getSubtitle(), c47527a.getIsEnabled()));
            i12 = i13;
        }
        C42745f0.h(arrayList, arrayListE0);
        return new C40281c(arrayListE0, c47528b.getAlertInfo());
    }
}
