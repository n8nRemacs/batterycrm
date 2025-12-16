package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AnonymousNumberSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/b;", "LPd0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14771b implements InterfaceC14770a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13166a;

    @Inject
    public C14771b(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13166a = screenPerformanceTracker;
    }

    @Override // Pd0.InterfaceC14770a
    public final void A(@Y61.k ApiError apiError) {
        ScreenPerformanceTracker.a.d(this.f13166a, "anonymous-number-check", null, new J.a(apiError), null, 10);
    }

    @Override // Pd0.InterfaceC14770a
    public final void D() {
        this.f13166a.m("anonymous-number-check");
    }

    @Override // Pd0.InterfaceC14770a
    public final void o() {
        ScreenPerformanceTracker.a.b(this.f13166a, "anonymous-number-check", 2);
    }

    @Override // Pd0.InterfaceC14770a
    public final void v() {
        ScreenPerformanceTracker.a.d(this.f13166a, "anonymous-number-check", null, J.b.f90385a, null, 10);
    }

    @Override // Pd0.InterfaceC14770a
    public final void x() {
        ScreenPerformanceTracker.a.c(this.f13166a, "anonymous-number-check", null, null, 6);
    }
}
