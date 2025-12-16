package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di;

import Y61.k;
import com.avito.android.analytics.screens.s;
import com.avito.android.di.C29972i;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.p;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.w;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionFragment;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di.a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @k
    public static final b a(@k SearchPositionFragment searchPositionFragment, @k p.a aVar, @k w.b bVar) {
        d dVar = (d) C29972i.a(C29972i.b(searchPositionFragment), d.class);
        com.avito.android.position_in_search.storage.provider.c cVarA = ((com.avito.android.position_in_search.storage.provider.d) dVar.u3()).a(dVar);
        new a.b();
        return new a.c(dVar, cv.c.b(searchPositionFragment), cVarA, aVar, bVar, s.c(searchPositionFragment), null);
    }
}
