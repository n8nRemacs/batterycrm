package com.avito.android.service_booking_calendar.view.month.redesign;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.view.month.e;
import com.avito.android.service_booking_calendar.view.month.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MonthRedesignBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/month/redesign/a;", "Lcom/avito/android/service_booking_calendar/view/month/a;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.service_booking_calendar.view.month.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f276224a;

    /* compiled from: MonthRedesignBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_calendar/view/month/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_calendar/view/month/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_calendar.view.month.redesign.a$a, reason: collision with other inner class name */
    public static final class C8200a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8200a f276225l = new C8200a();

        public C8200a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f276224a = eVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f276224a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.item_calendar_month_redesigned, C8200a.f276225l);
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.service_booking_calendar.view.month.d;
    }
}
