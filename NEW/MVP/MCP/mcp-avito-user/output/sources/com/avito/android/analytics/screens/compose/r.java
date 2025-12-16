package com.avito.android.analytics.screens.compose;

import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.tracker.fps.f;
import com.avito.android.analytics.screens.tracker.fps.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollableTracker.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/r;", "Lcom/avito/android/analytics/screens/tracker/fps/h;", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class r implements com.avito.android.analytics.screens.tracker.fps.h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f90596a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f90597b;

    public r(@Y61.k a aVar) {
        aVar.g(this);
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.h
    public final void a(@Y61.k f.d dVar) {
        this.f90596a.add(dVar);
    }

    public final void b(boolean z12, @Y61.k UUID uuid) {
        if (this.f90597b == z12) {
            return;
        }
        this.f90597b = z12;
        ArrayList arrayList = this.f90596a;
        if (z12) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((h.a) it.next()).b(uuid);
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((h.a) it2.next()).a(uuid);
            }
        }
    }
}
