package com.avito.android.universal_map.map.tracker;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.universal_map.n;
import kotlin.Metadata;

/* compiled from: UniversalMapScreenPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/tracker/a;", "Lcom/avito/android/universal_map/n;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f305946b;

    public a(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f305946b = screenPerformanceTracker;
    }

    @Override // com.avito.android.universal_map.n
    public final void d() {
        this.f305946b.d();
    }

    @Override // com.avito.android.universal_map.n
    public final void e() {
        this.f305946b.e();
    }

    @Override // com.avito.android.universal_map.n
    public final void r(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType, @k J j12, @l Integer num) {
        this.f305946b.r(str, loadingType, j12, num);
    }

    @Override // com.avito.android.universal_map.n
    public final void s(@k String str, @k ScreenPerformanceTracker.LoadingType loadingType) {
        this.f305946b.s(str, loadingType);
    }
}
