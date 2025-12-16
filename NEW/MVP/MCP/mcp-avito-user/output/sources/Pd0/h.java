package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactInfoSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/h;", "LPd0/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13168a;

    @Inject
    public h(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13168a = screenPerformanceTracker;
    }

    @Override // Pd0.g
    public final void j() {
        ScreenPerformanceTracker.a.c(this.f13168a, "contact-info-slot", null, null, 6);
    }

    @Override // Pd0.g
    public final void r() {
        this.f13168a.m("contact-info-slot");
    }
}
