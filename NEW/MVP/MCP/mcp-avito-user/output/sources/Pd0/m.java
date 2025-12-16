package Pd0;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InformationWithUserIdSlotTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPd0/m;", "LPd0/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f13170a;

    @Inject
    public m(@Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f13170a = screenPerformanceTracker;
    }

    @Override // Pd0.l
    public final void q() {
        ScreenPerformanceTracker.a.c(this.f13170a, "information-with-user-id-slot", null, null, 6);
    }

    @Override // Pd0.l
    public final void t() {
        this.f13170a.m("information-with-user-id-slot");
    }
}
