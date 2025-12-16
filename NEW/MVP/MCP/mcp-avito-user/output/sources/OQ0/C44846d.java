package oq0;

import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsItemComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq0/d;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oq0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44846d implements com.avito.android.recycler.data_aware.b {
    @Inject
    public C44846d() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF222258b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF222258b()) : null)) {
            return false;
        }
        if ((aVar instanceof com.avito.android.select_districts.items.selectable.c) && (aVar2 instanceof com.avito.android.select_districts.items.selectable.c)) {
            com.avito.android.select_districts.items.selectable.c cVar = (com.avito.android.select_districts.items.selectable.c) aVar;
            com.avito.android.select_districts.items.selectable.c cVar2 = (com.avito.android.select_districts.items.selectable.c) aVar2;
            if (!L.f(cVar.f266967c, cVar2.f266967c) || cVar.f266968d != cVar2.f266968d) {
                return false;
            }
        } else if (!(aVar instanceof com.avito.android.select_districts.items.selected.e) || !(aVar2 instanceof com.avito.android.select_districts.items.selected.e) || ((com.avito.android.select_districts.items.selected.e) aVar).f266984e.size() != ((com.avito.android.select_districts.items.selected.e) aVar2).f266984e.size()) {
            return false;
        }
        return true;
    }
}
