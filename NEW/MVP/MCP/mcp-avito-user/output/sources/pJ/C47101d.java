package pj;

import Y61.k;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;

/* compiled from: ExecuteRequestScreenPerformanceTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpj/d;", "Lpj/c;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pj.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47101d implements InterfaceC47100c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f428744a;

    public C47101d(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f428744a = screenPerformanceTracker;
    }

    @Override // pj.InterfaceC47100c
    public final void J(@k String str, @k J j12) {
        ScreenPerformanceTracker.a.d(this.f428744a, str, null, j12, null, 10);
    }

    @Override // pj.InterfaceC47100c
    public final void h(@k String str) {
        ScreenPerformanceTracker.a.b(this.f428744a, str, 2);
    }
}
