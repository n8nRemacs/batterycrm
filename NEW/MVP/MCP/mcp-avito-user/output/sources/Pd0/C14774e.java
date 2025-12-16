package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoPublishSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/e;", "LPd0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pd0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14774e implements InterfaceC14773d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13167a;

    @Inject
    public C14774e(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13167a = screenPerformanceTracker;
    }

    @Override // Pd0.InterfaceC14773d
    public final void B() {
        ScreenPerformanceTracker.a.d(this.f13167a, "auto-publish-check", null, J.b.f90385a, null, 10);
    }

    @Override // Pd0.InterfaceC14773d
    public final void i() {
        ScreenPerformanceTracker.a.c(this.f13167a, "auto-publish-check", null, null, 6);
    }

    @Override // Pd0.InterfaceC14773d
    public final void l() {
        this.f13167a.m("auto-publish-check");
    }

    @Override // Pd0.InterfaceC14773d
    public final void p() {
        ScreenPerformanceTracker.a.b(this.f13167a, "auto-publish-check", 2);
    }

    @Override // Pd0.InterfaceC14773d
    public final void z(@Y61.k Throwable th2) {
        ScreenPerformanceTracker.a.d(this.f13167a, "auto-publish-check", null, new J.a(th2), null, 10);
    }
}
