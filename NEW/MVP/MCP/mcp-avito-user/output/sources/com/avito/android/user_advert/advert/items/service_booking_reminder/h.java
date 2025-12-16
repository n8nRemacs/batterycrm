package com.avito.android.user_advert.advert.items.service_booking_reminder;

import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingReminderItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking_reminder/h;", "Lcom/avito/android/user_advert/advert/items/service_booking_reminder/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MH0.c f310168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310169c;

    @Inject
    public h(@Y61.k MH0.c cVar) {
        this.f310168b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        jVar.U60(cVar.f310153f);
        jVar.d70(cVar.f310151d, cVar.f310150c, cVar.f310152e);
        jVar.tu(new e(this, cVar), cVar.f310155h);
        jVar.j60(cVar.f310154g, new f(this, cVar));
        jVar.mS(cVar.f310158k, new g(this, cVar));
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.d
    public final void c0() {
        this.f310169c = null;
    }

    @Override // com.avito.android.user_advert.advert.items.service_booking_reminder.d
    public final void l5(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310169c = myAdvertDetailsActivity;
    }
}
