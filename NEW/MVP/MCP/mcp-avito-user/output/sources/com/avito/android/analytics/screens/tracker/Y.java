package com.avito.android.analytics.screens.tracker;

import kotlin.Metadata;

/* compiled from: Tracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/X;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Y implements X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Dc.b f90796a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.trace.c f90797b;

    public Y(@Y61.k Dc.b bVar, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        this.f90796a = bVar;
        this.f90797b = cVar;
    }

    @Override // com.avito.android.analytics.screens.tracker.X
    public final void start() {
        Dc.b bVar = this.f90796a;
        bVar.f3264d.getClass();
        bVar.f3265e = com.avito.android.analytics.screens.u.b();
        bVar.f3261a.c();
        this.f90797b.start();
    }
}
