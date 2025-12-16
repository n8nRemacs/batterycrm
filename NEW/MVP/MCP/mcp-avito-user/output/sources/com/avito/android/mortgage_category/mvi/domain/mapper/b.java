package com.avito.android.mortgage_category.mvi.domain.mapper;

import M10.d;
import O10.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageCategoryContentMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/domain/mapper/b;", "Lcom/avito/android/mortgage_category/mvi/domain/mapper/a;", "<init>", "()V", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static O10.c b(d dVar) {
        List<String> listB = dVar.b();
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.avito.android.lib.compose.design.shared.stepsbar.b((String) it.next(), null, 2, null));
        }
        return new O10.c((int) dVar.getCurrentStepIdx(), arrayList);
    }

    @Override // com.avito.android.mortgage_category.mvi.domain.mapper.a
    @l
    public final O10.b a(@k M10.a aVar) {
        if (aVar.getWithCalculation() != null) {
            O10.c cVarB = b(aVar.getHeader());
            String title = aVar.getWithCalculation().getTitle();
            List<String> listA = aVar.getWithCalculation().a();
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            List<String> list = listA;
            String description = aVar.getWithCalculation().getDescription();
            M10.b action = aVar.getAction();
            return new b.C0773b(cVarB, title, list, description, new O10.a(action.getTitle(), action.getUri(), false, 4, null));
        }
        if (aVar.getWithoutCalculation() != null) {
            O10.c cVarB2 = b(aVar.getHeader());
            UniversalImage universalImage = new UniversalImage(aVar.getWithoutCalculation().getImage().getValue(), aVar.getWithoutCalculation().getImage().getValueDark());
            String title2 = aVar.getWithoutCalculation().getTitle();
            String subtitle = aVar.getWithoutCalculation().getSubtitle();
            M10.b action2 = aVar.getAction();
            return new b.c(cVarB2, universalImage, title2, subtitle, new O10.a(action2.getTitle(), action2.getUri(), false, 4, null));
        }
        if (aVar.getArchived() == null) {
            return null;
        }
        O10.c cVarB3 = b(aVar.getHeader());
        UniversalImage universalImage2 = new UniversalImage(aVar.getArchived().getImage().getValue(), aVar.getArchived().getImage().getValueDark());
        String title3 = aVar.getArchived().getTitle();
        String subtitle2 = aVar.getArchived().getSubtitle();
        M10.b action3 = aVar.getAction();
        return new b.a(cVarB3, universalImage2, title3, subtitle2, new O10.a(action3.getTitle(), action3.getUri(), false, 4, null));
    }
}
