package com.avito.android.search.filter.tracker;

import Y61.k;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/tracker/b;", "Lcom/avito/android/search/filter/tracker/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f263802a;

    @Inject
    public b(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f263802a = screenPerformanceTracker;
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void a(long j12) {
        this.f263802a.a(j12);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void b() {
        ScreenPerformanceTracker.a.d(this.f263802a, "filters-tree", null, J.b.f90385a, null, 10);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void c() {
        ScreenPerformanceTracker.a.b(this.f263802a, "filters-tree", 2);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void d() {
        this.f263802a.d();
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void e() {
        this.f263802a.e();
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void f(@k ApiError apiError) {
        ScreenPerformanceTracker.a.d(this.f263802a, "filters-tree", null, new J.a(apiError), null, 10);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void g(@k Throwable th2) {
        ScreenPerformanceTracker.a.c(this.f263802a, "filters-tree", new J.a(th2), null, 4);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void h(@k ApiError apiError) {
        ScreenPerformanceTracker.a.c(this.f263802a, "filters-tree", new J.a(apiError), null, 4);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void i(@k Throwable th2) {
        ScreenPerformanceTracker.a.d(this.f263802a, "filters-tree", null, new J.a(th2), null, 10);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void j() {
        this.f263802a.m("filters-tree");
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void k() {
        ScreenPerformanceTracker.a.c(this.f263802a, "filters-tree", null, null, 6);
    }

    @Override // com.avito.android.search.filter.tracker.a
    public final void l(@k f.a aVar, @k Fragment fragment) {
        this.f263802a.c(fragment, aVar);
    }
}
