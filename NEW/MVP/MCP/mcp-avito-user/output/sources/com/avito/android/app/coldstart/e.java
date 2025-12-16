package com.avito.android.app.coldstart;

import Ec.C13472a;
import Y61.k;
import Y61.l;
import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.view.Window;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.coldstart.j;
import com.avito.android.util.V2;
import java.util.concurrent.TimeUnit;
import kd.C42669a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: ApplicationColdStartupTimeMeasureTask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/coldstart/e;", "Lid/i;", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends id.i {

    /* renamed from: b, reason: collision with root package name */
    public boolean f91349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f91351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a f91352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f91353f;

    /* compiled from: ApplicationColdStartupTimeMeasureTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.a f91355m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Bundle f91356n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ f f91357o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f91358p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar, Bundle bundle, f fVar, long j12) {
            super(0);
            this.f91355m = aVar;
            this.f91356n = bundle;
            this.f91357o = fVar;
            this.f91358p = j12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            e eVar = e.this;
            if (!eVar.f91350c) {
                eVar.f91350c = true;
                if (!eVar.f91349b && this.f91355m.f406838b && this.f91356n == null) {
                    f fVar = this.f91357o;
                    long startUptimeMillis = Process.getStartUptimeMillis();
                    com.avito.android.time.c.f301452a.getClass();
                    long jA2 = com.avito.android.time.c.f301453b.a();
                    long j12 = this.f91358p;
                    long j13 = Math.abs(j12 - startUptimeMillis) < TimeUnit.MINUTES.toMillis(1L) ? jA2 - startUptimeMillis : jA2 - j12;
                    DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroup = fVar.f91361c;
                    long jC2 = kotlin.math.b.c(j13 * degradeApplicationColdStartTestGroup.f67805c);
                    C13472a.f4111a.getClass();
                    y.c cVar = new y.c("application_start.cold_startup_time.degradation.".concat(degradeApplicationColdStartTestGroup.f67804b), Long.valueOf(jC2), null);
                    InterfaceC28373a interfaceC28373a = fVar.f91359a;
                    interfaceC28373a.c(cVar);
                    long jMin = Math.min(jC2, 4999L);
                    if (jMin != 0) {
                        try {
                            Thread.sleep(jMin);
                            V2.f318762a.g("DegradeAb", "application cold startup time - degraded for " + jMin);
                        } catch (Throwable th2) {
                            V2.f318762a.a("DegradeAb", "application cold startup time", th2);
                        }
                    }
                    interfaceC28373a.c(new C42669a(j13 + jMin));
                }
            }
            return G0.f406611a;
        }
    }

    public e(f fVar, l0.a aVar, long j12) {
        this.f91351d = fVar;
        this.f91352e = aVar;
        this.f91353f = j12;
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
        j jVar;
        f fVar = this.f91351d;
        fVar.f91360b.unregisterActivityLifecycleCallbacks(this);
        if (this.f91350c) {
            return;
        }
        a aVar = new a(this.f91352e, bundle, fVar, this.f91353f);
        j.a aVar2 = j.f91370d;
        Window window = activity.getWindow();
        b bVar = new b(activity, aVar);
        aVar2.getClass();
        if (window.peekDecorView() != null) {
            bVar.invoke();
            return;
        }
        i iVar = new i(bVar);
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            jVar = (j) callback;
        } else {
            j jVar2 = new j(callback);
            window.setCallback(jVar2);
            jVar = jVar2;
        }
        jVar.f91372c.add(iVar);
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@k Activity activity) {
        this.f91349b = true;
    }
}
