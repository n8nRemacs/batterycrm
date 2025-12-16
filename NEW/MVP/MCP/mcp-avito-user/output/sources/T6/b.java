package T6;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingTooltipStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT6/b;", "LT6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f15380a;

    @Inject
    public b(@k l lVar) {
        this.f15380a = lVar;
    }

    @Override // T6.a
    public final void a(@Y61.l String str) {
        boolean z12 = str == null || str.length() == 0 || "isServiceBookingButtonTooltip".equals(str);
        l lVar = this.f15380a;
        if (z12) {
            lVar.putBoolean("service_booking_tooltip_was_shown", true);
            return;
        }
        lVar.putBoolean("SERVICE_BOOKING_" + str, true);
    }

    @Override // T6.a
    public final boolean b(@Y61.l String str) {
        boolean z12 = str == null || str.length() == 0 || "isServiceBookingButtonTooltip".equals(str);
        l lVar = this.f15380a;
        if (z12) {
            return lVar.c("service_booking_tooltip_was_shown");
        }
        return lVar.c("SERVICE_BOOKING_" + str);
    }
}
