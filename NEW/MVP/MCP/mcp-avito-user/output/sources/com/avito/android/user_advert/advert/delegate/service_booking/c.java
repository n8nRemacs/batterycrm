package com.avito.android.user_advert.advert.delegate.service_booking;

import Y61.k;
import com.avito.android.user_advert.advert.delegate.service_booking.b;
import fH0.AbstractC40291a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingReminderDelegate.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/service_booking/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/service_booking/a;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements a {
    @Inject
    public c() {
    }

    @Override // com.avito.android.user_advert.advert.delegate.service_booking.a
    public final void j(@k com.avito.android.user_advert.advert.items.service_booking_reminder.c cVar) {
        this.f395801b.accept(new b.a(cVar));
    }
}
