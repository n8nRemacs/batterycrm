package oq0;

import Y61.l;
import com.avito.android.select_districts.items.selected.o;
import java.util.ArrayList;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictsItemPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq0/f;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oq0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44848f implements com.avito.android.recycler.data_aware.a {
    @Inject
    public C44848f() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207369c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207369c()) : null)) {
            return null;
        }
        if (!(aVar instanceof com.avito.android.select_districts.items.selected.e) || !(aVar2 instanceof com.avito.android.select_districts.items.selected.e)) {
            if (!(aVar instanceof com.avito.android.select_districts.items.selectable.c) || !(aVar2 instanceof com.avito.android.select_districts.items.selectable.c)) {
                return null;
            }
            com.avito.android.select_districts.items.selectable.c cVar = (com.avito.android.select_districts.items.selectable.c) aVar2;
            String str = cVar.f266966b;
            boolean z12 = cVar.f266968d;
            h hVar = new h(str, z12);
            if (((com.avito.android.select_districts.items.selectable.c) aVar).f266968d != z12) {
                return hVar;
            }
            return null;
        }
        com.avito.android.select_districts.items.selected.e eVar = (com.avito.android.select_districts.items.selected.e) aVar2;
        if (eVar.f266984e.isEmpty()) {
            return C44845c.f420227a;
        }
        Set<o> set = eVar.f266984e;
        int size = set.size();
        com.avito.android.select_districts.items.selected.e eVar2 = (com.avito.android.select_districts.items.selected.e) aVar;
        int size2 = eVar2.f266984e.size();
        Set<o> set2 = eVar2.f266984e;
        if (size > size2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!set2.contains((o) obj)) {
                    arrayList.add(obj);
                }
            }
            o oVar = (o) C42745f0.G(arrayList);
            if (oVar != null) {
                return new C44843a(oVar);
            }
            return null;
        }
        if (set2.size() <= set.size()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (!set.contains((o) obj2)) {
                arrayList2.add(obj2);
            }
        }
        o oVar2 = (o) C42745f0.G(arrayList2);
        if (oVar2 != null) {
            return new C44844b(oVar2.f267004b);
        }
        return null;
    }
}
