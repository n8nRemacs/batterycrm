package com.avito.android.analytics.screens.tracker.trace;

import Y61.k;
import com.avito.android.analytics.screens.Screen;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qd.C47379a;

/* compiled from: PerfMetricsPerfettoTracer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/trace/b;", "Lcom/avito/android/analytics/screens/tracker/trace/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Screen f90915a;

    public b(@k Screen screen) {
        this.f90915a = screen;
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.a
    public final void a(long j12, @k String str) {
        C47379a.f429325a.getClass();
        C47379a.a(f(str, "avito-perf.%s.drawing.step"), j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.a
    public final void b(long j12, @k String str) {
        C47379a.f429325a.getClass();
        C47379a.a(f(str, "avito-perf.%s.loading.step"), j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.a
    public final void c(long j12, @k String str) {
        C47379a.f429325a.getClass();
        C47379a.a(f(str, "avito-perf.%s.drawing.total"), j12);
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.a
    public final void d(@k String str, double d12, double d13, double d14, @k ArrayList arrayList) {
        if (str.equals("scroll")) {
            double size = arrayList.size();
            C47379a c47379a = C47379a.f429325a;
            String strF = f(null, "avito-perf.%s.scroll.jank-frames-count");
            c47379a.getClass();
            C47379a.a(strF, size);
            String strF2 = f(null, "avito-perf.%s.scroll.jank-frames-percentage");
            c47379a.getClass();
            C47379a.a(strF2, d14);
            String strF3 = f(null, "avito-perf.%s.scroll.avg-hitch-size");
            c47379a.getClass();
            C47379a.a(strF3, d13);
            String strF4 = f(null, "avito-perf.%s.scroll.hitch-time-ratio");
            c47379a.getClass();
            C47379a.a(strF4, d12);
        }
    }

    @Override // com.avito.android.analytics.screens.tracker.trace.a
    public final void e(long j12, @k String str) {
        C47379a.f429325a.getClass();
        C47379a.a(f(str, "avito-perf.%s.local-loading.step"), j12);
    }

    public final String f(String str, String str2) {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90915a.f90471b);
        if (str == null || (strConcat = ".".concat(str)) == null) {
            strConcat = "";
        }
        sb2.append(strConcat);
        return String.format(str2, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
    }
}
