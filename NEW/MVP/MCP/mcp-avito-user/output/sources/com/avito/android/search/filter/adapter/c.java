package com.avito.android.search.filter.adapter;

import Y61.l;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: FilterItemsContentsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/c;", "Lcom/avito/android/search/filter/adapter/b;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    public static String b(ParameterElement.o oVar) {
        String str = oVar.f262786e;
        if (str == null) {
            return "";
        }
        String str2 = oVar.f262790i;
        if (str2 == null) {
            str2 = "";
        }
        String strU = C43066x.U(str2, str);
        String str3 = oVar.f262791j;
        return C43066x.X(str3 != null ? str3 : "", strU);
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207385b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207385b()) : null)) {
            return false;
        }
        if ((aVar instanceof ParameterElement.v) && (aVar2 instanceof ParameterElement.v)) {
            ParameterElement.v vVar = (ParameterElement.v) aVar;
            if (vVar.f262845h instanceof ParameterElement.DisplayType.b) {
                ParameterElement.v vVar2 = (ParameterElement.v) aVar2;
                if (vVar2.f262845h instanceof ParameterElement.DisplayType.b) {
                    return L.f(vVar.f262844g, vVar2.f262844g);
                }
            }
        }
        if (!(aVar instanceof ParameterElement.g) || !(aVar2 instanceof ParameterElement.g)) {
            return false;
        }
        ParameterElement.g gVar = (ParameterElement.g) aVar;
        ParameterElement.g gVar2 = (ParameterElement.g) aVar2;
        return L.f(gVar.f262689b, gVar2.f262689b) && b(gVar.f262753e).equals(b(gVar2.f262753e)) && b(gVar.f262754f).equals(b(gVar2.f262754f)) && L.f(gVar.f262752d, gVar2.f262752d);
    }
}
