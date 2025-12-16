package com.avito.android.service_booking_day_settings.daysettings.adapter;

import Y41.q;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SettingsBreakItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/adapter/h;", "Lcom/avito/android/service_booking_day_settings/daysettings/adapter/d;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f276741b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q<String, org.threeten.bp.g, org.threeten.bp.g, G0> f276742c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q<String, org.threeten.bp.g, org.threeten.bp.g, G0> f276743d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k @com.avito.android.service_booking_day_settings.di.b q<? super String, ? super org.threeten.bp.g, ? super org.threeten.bp.g, G0> qVar, @com.avito.android.service_booking_day_settings.di.a @Y61.k q<? super String, ? super org.threeten.bp.g, ? super org.threeten.bp.g, G0> qVar2) {
        this.f276741b = lVar;
        this.f276742c = qVar;
        this.f276743d = qVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        SettingsBreakItem settingsBreakItem = (SettingsBreakItem) aVar;
        jVar.Oq(settingsBreakItem.f276724c);
        jVar.g50(settingsBreakItem.f276725d);
        e eVar2 = new e(this, i12);
        boolean z12 = settingsBreakItem.f276727f;
        jVar.Cu(eVar2, z12);
        jVar.kQ(settingsBreakItem.f276726e);
        jVar.setEnabled(z12);
        jVar.zp(new f(this, settingsBreakItem));
        jVar.IM(new g(this, settingsBreakItem));
        jVar.SQ(settingsBreakItem.f276728g);
    }
}
