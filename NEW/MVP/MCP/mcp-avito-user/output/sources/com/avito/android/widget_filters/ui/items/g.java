package com.avito.android.widget_filters.ui.items;

import NP0.j;
import NP0.m;
import NP0.p;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersItemsDiffUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/g;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends C23424o.f<TV0.a> {
    @Inject
    public g() {
    }

    public static Object d(Object obj, Object obj2) {
        if (L.f(obj, obj2)) {
            return null;
        }
        return obj2;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF270893b() == aVar4.getF270893b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Object eVar;
        Object bVar;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof com.avito.android.widget_filters.ui.items.location.e) || !(aVar4 instanceof com.avito.android.widget_filters.ui.items.location.e)) {
            if ((aVar3 instanceof com.avito.android.widget_filters.ui.items.category.g) && (aVar4 instanceof com.avito.android.widget_filters.ui.items.category.g)) {
                com.avito.android.widget_filters.ui.items.category.g gVar = (com.avito.android.widget_filters.ui.items.category.g) aVar3;
                com.avito.android.widget_filters.ui.items.category.g gVar2 = (com.avito.android.widget_filters.ui.items.category.g) aVar4;
                d dVar = (d) d(gVar.f330338c, gVar2.f330338c);
                com.avito.android.widget_filters.ui.items.category.a aVar5 = (com.avito.android.widget_filters.ui.items.category.a) d(gVar.f330339d, gVar2.f330339d);
                Boolean bool = (Boolean) d(Boolean.valueOf(gVar.f330340e), Boolean.valueOf(gVar2.f330340e));
                NP0.d dVar2 = gVar.f330341f;
                List<NP0.c> list = dVar2 != null ? dVar2.f11437f : null;
                NP0.d dVar3 = gVar2.f330341f;
                List list2 = (List) d(list, dVar3 != null ? dVar3.f11437f : null);
                List list3 = (List) d(dVar2 != null ? dVar2.f11438g : null, dVar3 != null ? dVar3.f11438g : null);
                Boolean bool2 = (Boolean) d(dVar2 != null ? Boolean.valueOf(dVar2.f11439h) : null, dVar3 != null ? Boolean.valueOf(dVar3.f11439h) : null);
                String str = (String) d(dVar2 != null ? dVar2.f11440i : null, dVar3 != null ? dVar3.f11440i : null);
                bVar = new com.avito.android.widget_filters.ui.items.category.b(dVar, aVar5, bool, list2, list3, bool2, str);
                if (dVar == null && aVar5 == null && bool == null && list2 == null && list3 == null && bool2 == null && str == null) {
                    return null;
                }
            } else if ((aVar3 instanceof com.avito.android.widget_filters.ui.items.dates.e) && (aVar4 instanceof com.avito.android.widget_filters.ui.items.dates.e)) {
                com.avito.android.widget_filters.ui.items.dates.e eVar2 = (com.avito.android.widget_filters.ui.items.dates.e) aVar3;
                com.avito.android.widget_filters.ui.items.dates.e eVar3 = (com.avito.android.widget_filters.ui.items.dates.e) aVar4;
                d dVar4 = (d) d(eVar2.f330373c, eVar3.f330373c);
                com.avito.android.widget_filters.ui.items.dates.a aVar6 = (com.avito.android.widget_filters.ui.items.dates.a) d(eVar2.f330374d, eVar3.f330374d);
                Boolean bool3 = (Boolean) d(Boolean.valueOf(eVar2.f330375e), Boolean.valueOf(eVar3.f330375e));
                bVar = new com.avito.android.widget_filters.ui.items.dates.b(dVar4, aVar6, bool3);
                if (dVar4 == null && aVar6 == null && bool3 == null) {
                    return null;
                }
            } else {
                if (!(aVar3 instanceof com.avito.android.widget_filters.ui.items.guests.h) || !(aVar4 instanceof com.avito.android.widget_filters.ui.items.guests.h)) {
                    return null;
                }
                com.avito.android.widget_filters.ui.items.guests.h hVar = (com.avito.android.widget_filters.ui.items.guests.h) aVar3;
                com.avito.android.widget_filters.ui.items.guests.h hVar2 = (com.avito.android.widget_filters.ui.items.guests.h) aVar4;
                d dVar5 = (d) d(hVar.f330424c, hVar2.f330424c);
                com.avito.android.widget_filters.ui.items.guests.a aVar7 = (com.avito.android.widget_filters.ui.items.guests.a) d(hVar.f330425d, hVar2.f330425d);
                Boolean bool4 = (Boolean) d(Boolean.valueOf(hVar.f330426e), Boolean.valueOf(hVar2.f330426e));
                j jVar = hVar.f330427f;
                Integer numValueOf = jVar != null ? Integer.valueOf(jVar.f11487u) : null;
                j jVar2 = hVar2.f330427f;
                Integer num = (Integer) d(numValueOf, jVar2 != null ? Integer.valueOf(jVar2.f11487u) : null);
                Integer num2 = (Integer) d(jVar != null ? Integer.valueOf(jVar.f11488v) : null, jVar2 != null ? Integer.valueOf(jVar2.f11488v) : null);
                Integer num3 = (Integer) d(jVar != null ? Integer.valueOf(jVar.f11483q) : null, jVar2 != null ? Integer.valueOf(jVar2.f11483q) : null);
                List list4 = (List) d(jVar != null ? jVar.f11484r : null, jVar2 != null ? jVar2.f11484r : null);
                Boolean bool5 = (Boolean) d(jVar != null ? Boolean.valueOf(jVar.f11489w) : null, jVar2 != null ? Boolean.valueOf(jVar2.f11489w) : null);
                NP0.b bVar2 = hVar.f330428g;
                Boolean boolValueOf = bVar2 != null ? Boolean.valueOf(bVar2.f11426g) : null;
                NP0.b bVar3 = hVar2.f330428g;
                Boolean bool6 = (Boolean) d(boolValueOf, bVar3 != null ? Boolean.valueOf(bVar3.f11426g) : null);
                eVar = new com.avito.android.widget_filters.ui.items.guests.e(dVar5, bool4, aVar7, num, num2, num3, list4, bool5, bool6);
                if (dVar5 == null && aVar7 == null && bool4 == null && num == null && num2 == null && num3 == null && list4 == null && bool5 == null && bool6 == null) {
                    return null;
                }
            }
            return bVar;
        }
        com.avito.android.widget_filters.ui.items.location.e eVar4 = (com.avito.android.widget_filters.ui.items.location.e) aVar3;
        com.avito.android.widget_filters.ui.items.location.e eVar5 = (com.avito.android.widget_filters.ui.items.location.e) aVar4;
        d dVar6 = (d) d(eVar4.f330483c, eVar5.f330483c);
        com.avito.android.widget_filters.ui.items.location.a aVar8 = (com.avito.android.widget_filters.ui.items.location.a) d(eVar4.f330484d, eVar5.f330484d);
        Boolean bool7 = (Boolean) d(Boolean.valueOf(eVar4.f330485e), Boolean.valueOf(eVar5.f330485e));
        m mVar = eVar4.f330486f;
        String str2 = mVar != null ? mVar.f11497f : null;
        m mVar2 = eVar5.f330486f;
        String str3 = (String) d(str2, mVar2 != null ? mVar2.f11497f : null);
        List list5 = (List) d(mVar != null ? mVar.f11501j : null, mVar2 != null ? mVar2.f11501j : null);
        List list6 = (List) d(mVar != null ? mVar.f11502k : null, mVar2 != null ? mVar2.f11502k : null);
        Boolean bool8 = (Boolean) d(mVar != null ? Boolean.valueOf(mVar.f11503l) : null, mVar2 != null ? Boolean.valueOf(mVar2.f11503l) : null);
        p pVar = (p) d(mVar != null ? mVar.f11504m : null, mVar2 != null ? mVar2.f11504m : null);
        eVar = new com.avito.android.widget_filters.ui.items.location.b(dVar6, bool7, aVar8, str3, list5, list6, bool8, pVar);
        if (dVar6 == null && aVar8 == null && bool7 == null && str3 == null && list6 == null && pVar == null) {
            return null;
        }
        return eVar;
    }
}
