package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SortItemPayloadFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        if (!L.f(aVar3.f221169b, aVar4.f221169b)) {
            arrayList.add(a.b.c.f221179a);
        }
        if (aVar3.f221171d != aVar4.f221171d) {
            arrayList.add(a.b.C6690b.f221178a);
        }
        if (aVar3.f221175h != aVar4.f221175h) {
            arrayList.add(a.b.C6689a.f221177a);
        }
        return new a.C6688a(arrayList);
    }

    @Override // com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.b.a
    public final boolean b(@k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, @k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2) {
        return (aVar instanceof a) && (aVar2 instanceof a);
    }
}
