package com.avito.android.analytics.screens.tracker;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: ScreenStepsAnalyticsFacade.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/G;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90731a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I1 f90732b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f90733c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final V f90734d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.u f90735e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Screen f90736f;

    public G(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k I1 i12, @Y61.k com.avito.android.util.C c12, @Y61.k V v12, @Y61.k com.avito.android.analytics.screens.u uVar, @Y61.k Screen screen) {
        this.f90731a = interfaceC28373a;
        this.f90732b = i12;
        this.f90733c = c12;
        this.f90734d = v12;
        this.f90735e = uVar;
        this.f90736f = screen;
    }

    public final void a(@Y61.k com.avito.android.analytics.screens.J j12, @Y61.k com.avito.android.analytics.provider.clickstream.a aVar) {
        com.avito.android.analytics.screens.u uVar = this.f90735e;
        V v12 = this.f90734d;
        v12.getClass();
        if (Math.min(com.avito.android.analytics.screens.u.b(), uVar.f90959a) < v12.f90794a) {
            return;
        }
        if (this.f90732b.w().invoke().booleanValue() || com.avito.android.util.E.a(this.f90733c.getF125491k()) || this.f90736f.f90472c || (j12 instanceof J.a)) {
            this.f90731a.c(aVar);
        }
    }

    public final boolean b(@Y61.k y.c cVar) {
        com.avito.android.analytics.screens.u uVar = this.f90735e;
        V v12 = this.f90734d;
        v12.getClass();
        if (Math.min(com.avito.android.analytics.screens.u.b(), uVar.f90959a) < v12.f90794a) {
            return false;
        }
        I1 i12 = this.f90732b;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[4];
        if (!((Boolean) i12.f67312e.a().invoke()).booleanValue() && !com.avito.android.util.E.a(this.f90733c.getF125491k()) && !this.f90736f.f90472c) {
            return false;
        }
        this.f90731a.c(cVar);
        return true;
    }
}
