package com.avito.android.analytics.screens.tracker;

import Fc1.G3;
import android.os.Handler;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ScreenMviRedrawTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/C;", "Lcom/avito/android/analytics/screens/tracker/Y;", "Lcom/avito/android/analytics/screens/tracker/B;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C extends Y implements B {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final G f90703c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.G f90704d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Handler f90705e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final M f90706f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f90707g;

    public C(@Y61.k G g12, @Y61.k com.avito.android.analytics.screens.G g13, @Y61.k Dc.b bVar, @Y61.k Screen screen, @Y61.k Handler handler, @Y61.k M m12, @Y61.k com.avito.android.analytics.screens.tracker.trace.c cVar) {
        super(bVar, cVar);
        this.f90703c = g12;
        this.f90704d = g13;
        this.f90705e = handler;
        this.f90706f = m12;
        this.f90707g = screen.f90471b;
    }

    @Override // com.avito.android.analytics.screens.tracker.B
    public final void f() {
        this.f90705e.post(new G3(this, 29));
    }
}
