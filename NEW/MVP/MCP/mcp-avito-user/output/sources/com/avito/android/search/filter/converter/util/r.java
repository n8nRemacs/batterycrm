package com.avito.android.search.filter.converter.util;

import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParametersListContentsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/util/r;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements com.avito.android.recycler.data_aware.b {
    @Inject
    public r() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207394c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207394c()) : null)) {
            return false;
        }
        if ((aVar instanceof com.avito.android.search.filter.converter.common.d) && (aVar2 instanceof com.avito.android.search.filter.converter.common.d)) {
            com.avito.android.search.filter.converter.common.d dVar = (com.avito.android.search.filter.converter.common.d) aVar;
            com.avito.android.search.filter.converter.common.d dVar2 = (com.avito.android.search.filter.converter.common.d) aVar2;
            if (!L.f(dVar.getF262786e(), dVar2.getF262786e()) || !L.f(dVar.getF262797p(), dVar2.getF262797p())) {
                return false;
            }
            DisplayingOptions f262794m = dVar.getF262794m();
            Boolean enabled = f262794m != null ? f262794m.getEnabled() : null;
            DisplayingOptions f262794m2 = dVar2.getF262794m();
            if (!L.f(enabled, f262794m2 != null ? f262794m2.getEnabled() : null)) {
                return false;
            }
            DisplayingOptions f262794m3 = dVar.getF262794m();
            String prefix = f262794m3 != null ? f262794m3.getPrefix() : null;
            DisplayingOptions f262794m4 = dVar2.getF262794m();
            if (!L.f(prefix, f262794m4 != null ? f262794m4.getPrefix() : null)) {
                return false;
            }
            DisplayingOptions f262794m5 = dVar.getF262794m();
            String postfix = f262794m5 != null ? f262794m5.getPostfix() : null;
            DisplayingOptions f262794m6 = dVar2.getF262794m();
            if (!L.f(postfix, f262794m6 != null ? f262794m6.getPostfix() : null) || !L.f(dVar.getF262796o(), dVar2.getF262796o())) {
                return false;
            }
        } else if ((aVar instanceof com.avito.android.search.filter.converter.common.b) && (aVar2 instanceof com.avito.android.search.filter.converter.common.b)) {
            if (((com.avito.android.search.filter.converter.common.b) aVar).f262953d != ((com.avito.android.search.filter.converter.common.b) aVar2).f262953d) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.y) && (aVar2 instanceof ParameterElement.y)) {
            ParameterElement.y yVar = (ParameterElement.y) aVar;
            ParameterElement.y yVar2 = (ParameterElement.y) aVar2;
            if (!L.f(yVar.f262868e, yVar2.f262868e) || !L.f(yVar.f262876m, yVar2.f262876m)) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.v) && (aVar2 instanceof ParameterElement.v)) {
            ParameterElement.v vVar = (ParameterElement.v) aVar;
            ParameterElement.v vVar2 = (ParameterElement.v) aVar2;
            if (!L.f(vVar.f262842e, vVar2.f262842e) || !L.f(vVar.f262851n, vVar2.f262851n) || vVar.f262848k != vVar2.f262848k) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.s) && (aVar2 instanceof ParameterElement.s)) {
            ParameterElement.s sVar = (ParameterElement.s) aVar;
            ParameterElement.s sVar2 = (ParameterElement.s) aVar2;
            if (!L.f(sVar.f262818d, sVar2.f262818d) || !L.f(sVar.f262819e, sVar2.f262819e) || !L.f(sVar.f262825k, sVar2.f262825k)) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.t) && (aVar2 instanceof ParameterElement.t)) {
            ParameterElement.t tVar = (ParameterElement.t) aVar;
            ParameterElement.t tVar2 = (ParameterElement.t) aVar2;
            if (!L.f(tVar.f262837c, tVar2.f262837c) || !L.f(tVar.f262838d, tVar2.f262838d)) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.f) && (aVar2 instanceof ParameterElement.f)) {
            ParameterElement.f fVar = (ParameterElement.f) aVar;
            ParameterElement.f fVar2 = (ParameterElement.f) aVar2;
            if (!L.f(fVar.f262748d, fVar2.f262748d) || !L.f(fVar.f262750f, fVar2.f262750f)) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.e) && (aVar2 instanceof ParameterElement.e)) {
            ParameterElement.e eVar = (ParameterElement.e) aVar;
            ParameterElement.e eVar2 = (ParameterElement.e) aVar2;
            if (!a(eVar.f262745c, eVar2.f262745c) || !a(eVar.f262746d, eVar2.f262746d)) {
                return false;
            }
        } else if ((aVar instanceof ParameterElement.h) && (aVar2 instanceof ParameterElement.h)) {
            ParameterElement.h hVar = (ParameterElement.h) aVar;
            ParameterElement.h hVar2 = (ParameterElement.h) aVar2;
            if (!L.f(hVar.f262756c, hVar2.f262756c) || !L.f(hVar.f262757d, hVar2.f262757d)) {
                return false;
            }
        } else {
            if ((aVar instanceof ParameterElement.u) && (aVar2 instanceof ParameterElement.u)) {
                return L.f(((ParameterElement.u) aVar).f262839c, ((ParameterElement.u) aVar2).f262839c);
            }
            if ((aVar instanceof ParameterElement.z) && (aVar2 instanceof ParameterElement.z)) {
                ParameterElement.z zVar = (ParameterElement.z) aVar;
                ParameterElement.z zVar2 = (ParameterElement.z) aVar2;
                if (!L.f(zVar.f262886i, zVar2.f262886i) || !L.f(zVar.f262887j, zVar2.f262887j) || !L.f(zVar.f262884g, zVar2.f262884g)) {
                    return false;
                }
            } else if ((aVar instanceof ParameterElement.A) && (aVar2 instanceof ParameterElement.A)) {
                return L.f(aVar, aVar2);
            }
        }
        return true;
    }
}
