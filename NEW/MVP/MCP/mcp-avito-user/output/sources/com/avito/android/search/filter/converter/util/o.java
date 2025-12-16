package com.avito.android.search.filter.converter.util;

import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ItemWithState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersListChangePayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/util/o;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements com.avito.android.recycler.data_aware.a {
    @Inject
    public o() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        Object cVar;
        Object obj;
        Object next;
        Object next2;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null)) {
            return null;
        }
        if (aVar == null || !(aVar instanceof ParameterElement.v.b) || !(((ParameterElement.v.b) aVar).f262845h instanceof ParameterElement.DisplayType.i) || aVar2 == null || !(aVar2 instanceof ParameterElement.v.b) || !(((ParameterElement.v.b) aVar2).f262845h instanceof ParameterElement.DisplayType.i)) {
            if (aVar != null && (aVar instanceof ParameterElement.s) && (((ParameterElement.s) aVar).f262820f instanceof ParameterElement.DisplayType.g) && aVar2 != null && (aVar2 instanceof ParameterElement.s) && (((ParameterElement.s) aVar2).f262820f instanceof ParameterElement.DisplayType.g)) {
                ParameterElement.s sVar = (ParameterElement.s) aVar;
                ParameterElement.s sVar2 = (ParameterElement.s) aVar2;
                List<Cp0.e> list = sVar2.f262819e;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Cp0.e) it.next()).f2697b);
                }
                List<Cp0.e> list2 = sVar.f262819e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Cp0.e) it2.next()).f2697b);
                }
                List listD0 = C42745f0.d0(arrayList, arrayList2);
                List listD02 = C42745f0.d0(arrayList2, arrayList);
                LinkedHashSet linkedHashSetM = C42745f0.M(arrayList, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : linkedHashSetM) {
                    String str = (String) obj2;
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (L.f(((Cp0.e) next).f2697b, str)) {
                            break;
                        }
                    }
                    Cp0.e eVar = (Cp0.e) next;
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        if (L.f(((Cp0.e) next2).f2697b, str)) {
                            break;
                        }
                    }
                    if (!L.f(eVar, (Cp0.e) next2)) {
                        arrayList3.add(obj2);
                    }
                }
                L.f(sVar.f262825k, sVar2.f262825k);
                return new k(arrayList3, listD02, listD0);
            }
            if ((aVar instanceof ParameterElement.y) && (aVar2 instanceof ParameterElement.y)) {
                ParameterElement.y yVar = (ParameterElement.y) aVar2;
                ItemWithState.State state = yVar.f262876m;
                ParameterElement.y yVar2 = (ParameterElement.y) aVar;
                ItemWithState.State state2 = !L.f(yVar2.f262876m, state) ? state : null;
                hJ.m mVar = yVar.f262879p;
                l lVar = new l(state2, null, !L.f(yVar2.f262879p, mVar) ? mVar : null, null, 10, null);
                ItemWithState.State state3 = lVar.f262993a;
                obj = lVar;
                if (state3 == null) {
                    obj = lVar;
                    if (L.f(yVar2.f262868e, yVar.f262868e)) {
                        hJ.m mVar2 = lVar.f262994b;
                        obj = lVar;
                        if (mVar2 == null) {
                            return null;
                        }
                    }
                }
            } else if ((aVar instanceof com.avito.android.search.filter.converter.common.d) && (aVar2 instanceof com.avito.android.search.filter.converter.common.d)) {
                com.avito.android.search.filter.converter.common.d dVar = (com.avito.android.search.filter.converter.common.d) aVar2;
                ItemWithState.State f262797p = dVar.getF262797p();
                com.avito.android.search.filter.converter.common.d dVar2 = (com.avito.android.search.filter.converter.common.d) aVar;
                if (L.f(dVar2.getF262797p(), dVar.getF262797p())) {
                    f262797p = null;
                }
                String f262786e = dVar.getF262786e();
                if (L.f(dVar2.getF262786e(), dVar.getF262786e())) {
                    f262786e = null;
                }
                hJ.m f262800s = dVar.getF262800s();
                if (L.f(dVar2.getF262800s(), dVar.getF262800s())) {
                    f262800s = null;
                }
                dVar.getF262796o();
                L.f(dVar2.getF262796o(), dVar.getF262796o());
                cVar = new l(f262797p, f262786e, f262800s);
                if (f262797p == null && f262786e == null && f262800s == null) {
                    return null;
                }
            } else if ((aVar instanceof com.avito.android.search.filter.converter.common.b) && (aVar2 instanceof com.avito.android.search.filter.converter.common.b)) {
                com.avito.android.search.filter.converter.common.b bVar = (com.avito.android.search.filter.converter.common.b) aVar2;
                cVar = new a(((com.avito.android.search.filter.converter.common.b) aVar).f262953d != bVar.f262953d ? Boolean.valueOf(bVar.f262953d) : null);
            } else if ((aVar instanceof ParameterElement.z) && (aVar2 instanceof ParameterElement.z)) {
                ParameterElement.z zVar = (ParameterElement.z) aVar2;
                ItemWithState.State state4 = zVar.f262887j;
                ParameterElement.z.a aVar3 = zVar.f262884g;
                Object vVar = new v();
                obj = vVar;
                obj = vVar;
                if (state4 == null && aVar3 == null) {
                    ParameterElement.z zVar2 = (ParameterElement.z) aVar;
                    obj = vVar;
                    if (L.f(zVar2.f262886i, zVar.f262886i)) {
                        obj = vVar;
                        if (L.f(zVar2.f262884g, zVar.f262884g)) {
                            return null;
                        }
                    }
                }
            } else if ((aVar instanceof ParameterElement.u) && (aVar2 instanceof ParameterElement.u)) {
                obj = t.f262999a;
                if (L.f(((ParameterElement.u) aVar).f262839c, ((ParameterElement.u) aVar2).f262839c)) {
                    return null;
                }
            } else {
                if (!(aVar instanceof ParameterElement.e) || !(aVar2 instanceof ParameterElement.e)) {
                    return null;
                }
                ParameterElement.e eVar2 = (ParameterElement.e) aVar2;
                ParameterElement.f fVar = eVar2.f262745c;
                ParameterElement.e eVar3 = (ParameterElement.e) aVar;
                ParameterElement.f fVar2 = eVar3.f262745c;
                L.f(fVar2 != null ? fVar2.f262748d : null, fVar != null ? fVar.f262748d : null);
                b bVar2 = new b();
                ParameterElement.f fVar3 = eVar3.f262745c;
                Long l12 = fVar3 != null ? fVar3.f262748d : null;
                ParameterElement.f fVar4 = eVar2.f262745c;
                if (L.f(l12, fVar4 != null ? fVar4.f262748d : null)) {
                    if (L.f(fVar3 != null ? fVar3.f262750f : null, fVar4 != null ? fVar4.f262750f : null)) {
                        bVar2 = null;
                    }
                }
                ParameterElement.f fVar5 = eVar3.f262746d;
                Long l13 = fVar5 != null ? fVar5.f262748d : null;
                ParameterElement.f fVar6 = eVar2.f262746d;
                L.f(l13, fVar6 != null ? fVar6.f262748d : null);
                b bVar3 = new b();
                if (L.f(fVar5 != null ? fVar5.f262748d : null, fVar6 != null ? fVar6.f262748d : null)) {
                    if (L.f(fVar5 != null ? fVar5.f262750f : null, fVar6 != null ? fVar6.f262750f : null)) {
                        bVar3 = null;
                    }
                }
                Boolean boolValueOf = fVar6 != null ? Boolean.valueOf(fVar6.f262749e) : null;
                if (L.f(fVar6 != null ? Boolean.valueOf(fVar6.f262749e) : null, fVar5 != null ? Boolean.valueOf(fVar5.f262749e) : null)) {
                    boolValueOf = null;
                }
                cVar = new c();
                if (bVar2 == null && bVar3 == null && boolValueOf == null) {
                    return null;
                }
            }
            return obj;
        }
        ParameterElement.v.b bVar4 = (ParameterElement.v.b) aVar;
        ParameterElement.v.b bVar5 = (ParameterElement.v.b) aVar2;
        L.f(bVar4.f262844g, bVar5.f262844g);
        ItemWithState.State state5 = bVar4.f262851n;
        ItemWithState.State state6 = bVar5.f262851n;
        if (L.f(state5, state6)) {
            state6 = null;
        }
        cVar = new u();
        if (state6 == null && bVar5.f262844g == null) {
            return null;
        }
        return cVar;
    }
}
