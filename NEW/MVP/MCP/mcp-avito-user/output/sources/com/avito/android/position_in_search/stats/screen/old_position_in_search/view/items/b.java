package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionItemCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<a<?>> f220854a;

    /* compiled from: SearchPositionItemCallback.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "T", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a<T extends com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a> {
        @l
        Object a(@k T t12, @k T t13);

        boolean b(@k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar, @k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar2);
    }

    @Inject
    public b(@k Set<a<?>> set) {
        this.f220854a = set;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return (aVar3 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) && (aVar4 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) && aVar3.equals(aVar4);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return (aVar3 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) && (aVar4 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) && aVar3.getF207385b() == aVar4.getF207385b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        Object next;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!((aVar3 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) && (aVar4 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a))) {
            return null;
        }
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) aVar4;
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a aVar6 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a) aVar3;
        Iterator<T> it = this.f220854a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a) next).b(aVar6, aVar5)) {
                break;
            }
        }
        a aVar7 = (a) next;
        if (aVar7 == null) {
            aVar7 = null;
        }
        if (aVar7 != null) {
            return aVar7.a(aVar6, aVar5);
        }
        return null;
    }
}
