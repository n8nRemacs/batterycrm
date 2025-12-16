package com.avito.android.bxcontent.analytics;

import com.avito.konveyor.item_visibility_tracker.b;
import is0.h;
import kotlin.Metadata;

/* compiled from: WidgetsShowingAnalyticsFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/r;", "LWV0/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f109507e;

    public r(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        super(false, true, 0.0f, 0L, 4, null);
        this.f109507e = gVar;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return (interfaceC10495b instanceof is0.h) && !((is0.h) interfaceC10495b).L();
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        if (interfaceC10495b instanceof is0.h) {
            h.b f278898m = ((is0.h) interfaceC10495b).getF278898m();
            this.f109507e.h(i12, f278898m.f405336a, f278898m.f405337b, f278898m.f405338c, f278898m.f405339d, f278898m.f405340e, f278898m.f405341f);
        }
    }
}
