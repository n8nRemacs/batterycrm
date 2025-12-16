package com.avito.android.location.perf_location;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.time.DurationUnit;

/* compiled from: PerformanceRegionLocationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/perf_location/f;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f181822a;

    /* renamed from: b, reason: collision with root package name */
    public final long f181823b;

    public f(String str, long j12, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            com.avito.android.time.c.f301452a.getClass();
            j12 = com.avito.android.time.c.f301453b.a() + kotlin.time.e.e(kotlin.time.g.g(15, DurationUnit.f410635g));
        }
        this.f181822a = str;
        this.f181823b = j12;
    }
}
