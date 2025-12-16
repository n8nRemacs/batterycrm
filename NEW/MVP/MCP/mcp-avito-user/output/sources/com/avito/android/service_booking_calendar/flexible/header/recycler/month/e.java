package com.avito.android.service_booking_calendar.flexible.header.recycler.month;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.header.recycler.j;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LastWeekOfMonthItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/recycler/month/e;", "LTV0/b;", "Lcom/avito/android/service_booking_calendar/flexible/header/recycler/j;", "Lcom/avito/android/service_booking_calendar/flexible/data/domain/WeekItem;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.b<j, WeekItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.f f276065a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f276066b = new g.a<>(R.layout.item_week, a.f276067l);

    /* compiled from: LastWeekOfMonthItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_booking_calendar/flexible/header/recycler/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_booking_calendar/flexible/header/recycler/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f276067l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    @Inject
    public e(@k com.avito.android.service_booking_calendar.flexible.header.recycler.f fVar) {
        this.f276065a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f276065a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f276066b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof WeekItem) {
            WeekItem weekItem = (WeekItem) aVar;
            if (weekItem.L() && !weekItem.f()) {
                return true;
            }
        }
        return false;
    }
}
