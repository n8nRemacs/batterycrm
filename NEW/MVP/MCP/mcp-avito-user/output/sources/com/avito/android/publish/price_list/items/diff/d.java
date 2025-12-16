package com.avito.android.publish.price_list.items.diff;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.price_list.items.selectable.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectPriceListItemPayloadCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/diff/d;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.recycler.data_aware.a {
    @Inject
    public d() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        Object aVar3;
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF222246b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF222246b()) : null)) {
            return null;
        }
        if ((aVar instanceof com.avito.android.publish.price_list.items.selectable.d) && (aVar2 instanceof com.avito.android.publish.price_list.items.selectable.d)) {
            com.avito.android.publish.price_list.items.selectable.d dVar = (com.avito.android.publish.price_list.items.selectable.d) aVar2;
            t tVar = dVar.f238676g;
            String str = dVar.f238672c;
            String str2 = dVar.f238675f;
            aVar3 = new f(tVar, str2, str);
            com.avito.android.publish.price_list.items.selectable.d dVar2 = (com.avito.android.publish.price_list.items.selectable.d) aVar;
            if (tVar.equals(dVar2.f238676g) && L.f(str2, dVar2.f238675f) && L.f(dVar.f238672c, dVar2.f238672c)) {
                return null;
            }
        } else {
            if (!(aVar instanceof com.avito.android.publish.price_list.items.group.a) || !(aVar2 instanceof com.avito.android.publish.price_list.items.group.a)) {
                return null;
            }
            boolean z12 = ((com.avito.android.publish.price_list.items.group.a) aVar2).f238631d;
            aVar3 = new a(z12);
            if (z12 == ((com.avito.android.publish.price_list.items.group.a) aVar).f238631d) {
                return null;
            }
        }
        return aVar3;
    }
}
