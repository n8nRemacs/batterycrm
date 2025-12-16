package com.avito.android.analytics.screens.compose;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import arrow.core.AbstractC23662a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.memory.consumption.f;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeScreenTracker.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/compose/b;", "Lcom/avito/android/analytics/screens/compose/a;", "a", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.analytics.screens.compose.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC23662a.c f90572b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f90573c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f90574d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90575e;

    /* compiled from: ComposeScreenTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/b$a;", "", "_avito_analytics-screens-compose_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "TrackersList(drawTracker=null, fpsTracker=null)";
        }
    }

    public b(@Y61.k AbstractC23662a.c cVar) {
        this.f90572b = cVar;
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void a(long j12) {
        ((ScreenPerformanceTracker) this.f90572b.f56269b).a(j12);
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void c(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k f.a aVar) {
        if (this.f90575e) {
            return;
        }
        this.f90575e = true;
        ((ScreenPerformanceTracker) this.f90572b.f56269b).c(interfaceC22983P, aVar);
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void d() {
        ((ScreenPerformanceTracker) this.f90572b.f56269b).d();
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void e() {
        ((ScreenPerformanceTracker) this.f90572b.f56269b).e();
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void f() {
        if (this.f90574d) {
            this.f90574d = false;
            ((ScreenPerformanceTracker) this.f90572b.f56269b).f();
        }
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void g(@Y61.k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        ((ScreenPerformanceTracker) this.f90572b.f56269b).p(hVar);
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void l() {
        if (this.f90574d) {
            return;
        }
        this.f90574d = true;
        ((ScreenPerformanceTracker) this.f90572b.f56269b).l();
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void m(@Y61.k String str) {
        LinkedHashSet linkedHashSet = this.f90573c;
        if (linkedHashSet.contains(str)) {
            return;
        }
        linkedHashSet.add(str);
        ((ScreenPerformanceTracker) this.f90572b.f56269b).m(str);
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void n(@Y61.k String str, @Y61.k J j12, @Y61.l Integer num) {
        LinkedHashSet linkedHashSet = this.f90573c;
        if (linkedHashSet.contains(str)) {
            ((ScreenPerformanceTracker) this.f90572b.f56269b).P(str, j12, num);
            linkedHashSet.remove(str);
        }
    }
}
