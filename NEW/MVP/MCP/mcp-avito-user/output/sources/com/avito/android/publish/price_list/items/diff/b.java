package com.avito.android.publish.price_list.items.diff;

import Y61.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListItemComparator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/diff/b;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.recycler.data_aware.b {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF113526b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF113526b()) : null)) {
            return false;
        }
        if ((aVar instanceof com.avito.android.publish.price_list.items.selectable.d) && (aVar2 instanceof com.avito.android.publish.price_list.items.selectable.d)) {
            com.avito.android.publish.price_list.items.selectable.d dVar = (com.avito.android.publish.price_list.items.selectable.d) aVar;
            com.avito.android.publish.price_list.items.selectable.d dVar2 = (com.avito.android.publish.price_list.items.selectable.d) aVar2;
            if (!L.f(dVar.f238674e, dVar2.f238674e) || !L.f(dVar.f238676g, dVar2.f238676g) || !L.f(dVar.f238675f, dVar2.f238675f) || !L.f(dVar.f238672c, dVar2.f238672c)) {
                return false;
            }
        } else {
            if (!(aVar instanceof com.avito.android.publish.price_list.items.group.a) || !(aVar2 instanceof com.avito.android.publish.price_list.items.group.a)) {
                return false;
            }
            com.avito.android.publish.price_list.items.group.a aVar3 = (com.avito.android.publish.price_list.items.group.a) aVar;
            com.avito.android.publish.price_list.items.group.a aVar4 = (com.avito.android.publish.price_list.items.group.a) aVar2;
            if (!L.f(aVar3.f238630c, aVar4.f238630c) || aVar3.f238631d != aVar4.f238631d || !L.f(aVar3.f238632e, aVar4.f238632e)) {
                return false;
            }
        }
        return true;
    }
}
