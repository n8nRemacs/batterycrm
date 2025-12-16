package com.avito.android.service_booking_settings.work_hours.item.schedule;

import TV0.g;
import Ut0.C15567b;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingWorkHourDayBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/a;", "LTV0/b;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/h;", "LUt0/b;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<h, C15567b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.format.c f277978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f277979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f277980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h.b f277981d;

    /* compiled from: ServiceBookingWorkHourDayBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_settings/work_hours/item/schedule/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_settings.work_hours.item.schedule.a$a, reason: collision with other inner class name */
    public static final class C8257a extends N implements p<ViewGroup, View, l> {
        public C8257a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new l(view, aVar.f277978a, aVar.f277981d, aVar.f277979b);
        }
    }

    @Inject
    public a(@com.avito.android.service_booking_settings.di.work_hours.p @Y61.k org.threeten.bp.format.c cVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k c cVar2, @Y61.k h.b bVar) {
        this.f277978a = cVar;
        this.f277979b = interfaceC28373a;
        this.f277980c = cVar2;
        this.f277981d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f277980c;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.item_service_booking_work_hours_day, new C8257a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C15567b;
    }
}
