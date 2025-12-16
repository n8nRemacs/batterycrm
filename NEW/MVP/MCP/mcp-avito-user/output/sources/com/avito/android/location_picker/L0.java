package com.avito.android.location_picker;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationPickerPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/L0;", "Lcom/avito/android/location_picker/K0;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class L0 implements K0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f182140a;

    @Inject
    public L0(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f182140a = screenPerformanceTracker;
    }

    @Override // com.avito.android.location_picker.K0
    public final void a(long j12) {
        this.f182140a.a(j12);
    }

    @Override // com.avito.android.location_picker.K0
    public final void b() {
        ScreenPerformanceTracker.a.c(this.f182140a, "locationPicker", null, null, 6);
    }

    @Override // com.avito.android.location_picker.K0
    public final void c(@Y61.k f.a aVar, @Y61.k LocationPickerFragment locationPickerFragment) {
        this.f182140a.c(locationPickerFragment, aVar);
    }

    @Override // com.avito.android.location_picker.K0
    public final void d() {
        this.f182140a.d();
    }

    @Override // com.avito.android.location_picker.K0
    public final void e() {
        this.f182140a.e();
    }

    @Override // com.avito.android.location_picker.K0
    public final void f() {
        this.f182140a.m("locationPicker");
    }
}
