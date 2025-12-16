package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: ScreenMviTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/E;", "Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/D;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E extends Y implements D {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90708c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90709d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f90710e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final M f90711f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f90712g;

    public E(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k Dc.b bVar, @Y61.k Screen screen, @Y61.k String str, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        super(bVar, cVar);
        this.f90708c = g12;
        this.f90709d = g13;
        this.f90710e = str;
        this.f90711f = m12;
        this.f90712g = screen.f90471b;
    }

    @Override // com.avito.android.analytics.screens.tracker.D
    public final void a(boolean z12) {
        long jB2 = this.f90796a.f3261a.b();
        G g12 = this.f90708c;
        String str = this.f90710e;
        String str2 = this.f90712g;
        com.avito.android.analytics.screens.G g13 = this.f90709d;
        if (z12) {
            if (g12.b(new y.c(g13.getF90370a() + ".absolute." + str2 + ".mvi-important." + str, Long.valueOf(jB2), null))) {
                this.f90711f.d(jB2, this.f90712g, this.f90710e, "mvi-important");
            }
        }
        if (g12.b(new y.c(g13.getF90370a() + '.' + str2 + ".mvi." + str, Long.valueOf(jB2), null))) {
            this.f90711f.d(jB2, this.f90712g, this.f90710e, "mvi");
        }
        this.f90797b.h();
    }
}
