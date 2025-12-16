package com.avito.android.service_booking_settings.work_hours.item.booking_restrictions;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: BookingTimeRestrictionItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/booking_restrictions/d;", "Lcom/avito/android/service_booking_settings/work_hours/item/booking_restrictions/a;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f277945b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f277946c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f277947d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f277948e;

    @Inject
    public d() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f277945b = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, null, 5);
        this.f277946c = e2VarB2;
        this.f277947d = e2VarB;
        this.f277948e = e2VarB2;
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a
    @k
    /* renamed from: A2, reason: from getter */
    public final e2 getF277948e() {
        return this.f277948e;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        Ut0.k kVar = (Ut0.k) aVar;
        hVar.setTitle(kVar.f16763g);
        hVar.setHint(kVar.f16765i);
        hVar.f(kVar.f16764h);
        hVar.HA(kVar.f16766j);
        hVar.setEnabled(kVar.f16768l);
        hVar.setInputClickListener(new b(this, kVar));
        hVar.hn(new c(this));
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF277947d() {
        return this.f277947d;
    }
}
