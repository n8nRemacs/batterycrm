package com.avito.android.service_booking_schedule_repetition_impl;

import Nt0.InterfaceC14610a;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.CalendarView;
import com.avito.android.service_booking_schedule_repetition_impl.ServiceBookingScheduleRepetitionSheet;
import i31.InterfaceC41220a;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import nt0.C44475a;

/* compiled from: ServiceBookingScheduleRepetitionRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/e;", "", "c", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14610a, G0> f277590a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f277591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f277592c;

    /* renamed from: d, reason: collision with root package name */
    public final Resources f277593d;

    /* compiled from: ServiceBookingScheduleRepetitionRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/konveyor/a;", "binder", "Landroidx/recyclerview/widget/RecyclerView$l;", "invoke", "(Lcom/avito/konveyor/a;)Landroidx/recyclerview/widget/RecyclerView$l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.konveyor.a, RecyclerView.l> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final RecyclerView.l invoke(com.avito.konveyor.a aVar) throws Resources.NotFoundException {
            e eVar = e.this;
            int dimensionPixelSize = eVar.f277593d.getDimensionPixelSize(R.dimen.repetition_sheet_month_first_top_offset);
            Resources resources = eVar.f277593d;
            return new C44475a(aVar, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.repetition_sheet_month_not_first_top_offset), resources.getDimensionPixelSize(R.dimen.repetition_sheet_month_bottom_offset), resources.getDimensionPixelSize(R.dimen.repetition_sheet_calendar_bottom_offset));
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_calendar/view/day/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.service_booking_calendar.view.day.d, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.service_booking_calendar.view.day.d dVar) {
            ((ServiceBookingScheduleRepetitionSheet.b) e.this.f277590a).invoke(new InterfaceC14610a.c(dVar));
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/e$c;", "", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @Y61.k
        e a(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.android.lib.design.bottom_sheet.d dVar);
    }

    @i31.c
    public e(@InterfaceC41220a @Y61.k Y41.l lVar, @InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f277590a = lVar;
        this.f277591b = dVar;
        q qVar = new q(view);
        this.f277592c = qVar;
        this.f277593d = view.getResources();
        C42670a c42670a = qVar.f277753c;
        C42670a.d(c42670a);
        c42670a.a(new com.avito.android.review_gallery.g(this, 27));
        a aVar = new a();
        CalendarView calendarView = qVar.f277754d;
        calendarView.setDecoration(aVar);
        calendarView.setOnDayClickListener(new b());
    }
}
