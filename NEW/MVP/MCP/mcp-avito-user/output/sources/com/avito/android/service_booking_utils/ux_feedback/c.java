package com.avito.android.service_booking_utils.ux_feedback;

import SK0.b;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.service_booking_utils.ux_feedback.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingDetailsFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/ux_feedback/c;", "Lcom/avito/android/service_booking_utils/ux_feedback/a;", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final E f278401a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f278402b;

    @Inject
    public c(@k E e12, @k SK0.b bVar) {
        this.f278401a = e12;
        this.f278402b = bVar;
    }

    @Override // com.avito.android.service_booking_utils.ux_feedback.a
    public final void a() {
        if (this.f278401a.b()) {
            b.a.a(this.f278402b, b.a.f278400b, null, null, null, 14);
        }
    }
}
