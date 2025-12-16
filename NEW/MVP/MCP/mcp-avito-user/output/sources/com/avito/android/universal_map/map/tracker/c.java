package com.avito.android.universal_map.map.tracker;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28493o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.tracker.fps.h;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapScreenPerformanceTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/tracker/c;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements ScreenPerformanceTracker {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f305947a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f305948b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f305949c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public n f305950d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f305951e;

    public c(@k ScreenPerformanceTracker screenPerformanceTracker, @k UniversalMapParams.TrackerSettings trackerSettings) {
        this.f305947a = screenPerformanceTracker;
        this.f305948b = trackerSettings instanceof UniversalMapParams.TrackerSettings.TrackByUniversalMap;
        this.f305949c = new a(screenPerformanceTracker);
        this.f305951e = screenPerformanceTracker.getF305951e();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void A(@k String str, boolean z12) {
        this.f305947a.A(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void B(@k com.avito.android.analytics.screens.image.c cVar, @k InterfaceC22983P interfaceC22983P) {
        this.f305947a.B(cVar, interfaceC22983P);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void D(@k String str, boolean z12) {
        this.f305947a.D(str, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void E(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, long j13) {
        this.f305947a.E(str, loadingType, j12, j13);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final C34244a F(@k String str, @l AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a, boolean z12) {
        return this.f305947a.F(str, abstractC23662a, z12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void G(@l SerpResultCategoryDetails serpResultCategoryDetails) {
        this.f305947a.G(serpResultCategoryDetails);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @l
    public final Long H(@k String str) {
        return this.f305947a.H(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    /* renamed from: O, reason: from getter */
    public final String getF305951e() {
        return this.f305951e;
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void P(@k String str, @k J j12, @l Integer num) {
        this.f305947a.P(str, j12, num);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void a(long j12) {
        this.f305947a.a(j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void b(@k RecyclerView recyclerView) {
        this.f305947a.b(recyclerView);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
        this.f305947a.c(interfaceC22983P, aVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void d() {
        n nVar = this.f305948b ? this.f305949c : this.f305950d;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void e() {
        n nVar = this.f305948b ? this.f305949c : this.f305950d;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void f() {
        this.f305947a.f();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void l() {
        this.f305947a.l();
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void m(@k String str) {
        this.f305947a.m(str);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    @k
    public final C28493o o(@l AbstractC23662a.b bVar) {
        return this.f305947a.o(bVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void p(@k h hVar) {
        this.f305947a.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void r(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, @l Integer num) {
        n nVar = this.f305948b ? this.f305949c : this.f305950d;
        if (nVar != null) {
            nVar.r(str, loadingType, j12, num);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void s(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType) {
        n nVar = this.f305948b ? this.f305949c : this.f305950d;
        if (nVar != null) {
            nVar.s(str, loadingType);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker
    public final void t(long j12) {
        this.f305947a.t(j12);
    }
}
