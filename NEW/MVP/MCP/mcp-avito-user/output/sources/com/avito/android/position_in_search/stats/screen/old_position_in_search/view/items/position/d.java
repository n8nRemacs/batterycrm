package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.position.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionItemPayloadFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/position/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements b.a<a> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b.a
    public final Object a(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2) {
        a aVar3 = (a) aVar;
        a aVar4 = (a) aVar2;
        ArrayList arrayList = new ArrayList();
        if (!L.f(aVar3.f221059e, aVar4.f221059e)) {
            arrayList.add(a.c.b.f221067a);
        }
        if (!aVar3.f221057c.equals(aVar4.f221057c)) {
            arrayList.add(a.c.d.f221069a);
        }
        if (!L.f(aVar3.f221058d, aVar4.f221058d)) {
            arrayList.add(a.c.C6683a.f221066a);
        }
        if (!aVar3.f221060f.equals(aVar4.f221060f)) {
            arrayList.add(a.c.C6684c.f221068a);
        }
        return new a.b(arrayList);
    }

    @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b.a
    public final boolean b(@k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, @k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2) {
        return (aVar instanceof a) && (aVar2 instanceof a);
    }
}
