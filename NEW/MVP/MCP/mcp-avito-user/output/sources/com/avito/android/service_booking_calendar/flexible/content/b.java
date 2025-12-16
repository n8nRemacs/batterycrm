package com.avito.android.service_booking_calendar.flexible.content;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;
import com.avito.android.service_booking_calendar.day.schedule.domain.DayItem;
import com.avito.android.util.D6;
import gt0.InterfaceC40733a;
import ht0.InterfaceC40984a;
import i31.InterfaceC41220a;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarContentStateRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/b;", "", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<com.avito.android.service_booking_calendar.flexible.d, G0> f275636a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FragmentManager f275637b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f275638c;

    /* compiled from: CalendarContentStateRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/b$a;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k View view, @k l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar);
    }

    @i31.c
    public b(@InterfaceC41220a @k l lVar, @InterfaceC41220a @k View view, @k FragmentManager fragmentManager) {
        this.f275636a = lVar;
        this.f275637b = fragmentManager;
        g gVar = new g(view);
        this.f275638c = gVar;
        final int i12 = 0;
        gVar.f275645b.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_calendar.flexible.content.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f275635c;

            {
                this.f275635c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f275635c.f275636a.invoke(InterfaceC40733a.b.f396898a);
                        break;
                    default:
                        this.f275635c.f275636a.invoke(new InterfaceC40984a.d(false, 1, null));
                        break;
                }
            }
        });
        final int i13 = 1;
        gVar.f275646c.a(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_calendar.flexible.content.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f275635c;

            {
                this.f275635c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f275635c.f275636a.invoke(InterfaceC40733a.b.f396898a);
                        break;
                    default:
                        this.f275635c.f275636a.invoke(new InterfaceC40984a.d(false, 1, null));
                        break;
                }
            }
        });
    }

    public final void a(DayItem dayItem, Integer num, boolean z12) {
        StringBuilder sb2 = new StringBuilder("sb-day-schedule-");
        dayItem.getClass();
        sb2.append(dayItem.getF248579b().hashCode());
        String string = sb2.toString();
        FragmentManager fragmentManager = this.f275637b;
        Fragment fragmentH = fragmentManager.H(string);
        if (fragmentH == null || !fragmentH.isAdded() || z12) {
            H hE2 = fragmentManager.e();
            DayScheduleFragment.Companion companion = DayScheduleFragment.f275256y0;
            boolean z13 = dayItem.f275357g == DayItem.DayType.f275358b;
            DayScheduleFragment.Companion.ScheduleType[] scheduleTypeArr = DayScheduleFragment.Companion.ScheduleType.f275268b;
            companion.getClass();
            DayScheduleFragment dayScheduleFragment = new DayScheduleFragment();
            Bundle bundle = new Bundle(2);
            bundle.putString("key.day_id", dayItem.f275352b);
            bundle.putBoolean("key.is_day_off", z13);
            bundle.putBoolean("key.is_today", dayItem.f275355e);
            bundle.putInt("key.scroll_offset", num != null ? num.intValue() : -1);
            bundle.putString("key.type", "FLEXIBLE");
            dayScheduleFragment.setArguments(bundle);
            hE2.n(R.id.calendar_day_schedule, dayScheduleFragment, string);
            hE2.e();
        }
    }

    @Y61.l
    public final void b(@k gt0.d dVar) {
        DayItem dayItem = dVar.f396924c;
        Boolean boolValueOf = dayItem != null ? Boolean.valueOf(dayItem.f275355e) : null;
        c cVar = new c(this);
        g gVar = this.f275638c;
        com.avito.android.lib.design.button.b.a(gVar.f275647d, dVar.f396926e, false);
        com.avito.android.serp.adapter.serp_advert_card.i iVar = new com.avito.android.serp.adapter.serp_advert_card.i(25, cVar);
        Button button = gVar.f275647d;
        button.setOnClickListener(iVar);
        D6.G(button, L.f(boolValueOf, Boolean.FALSE));
        C42670a c42670a = gVar.f275646c;
        if (dVar.f396922a) {
            C42670a.d(c42670a);
            G0 g02 = G0.f406611a;
        } else if (dVar.f396923b != null) {
            c42670a.b();
            c42670a.c(null, new d(gVar, dVar));
            G0 g03 = G0.f406611a;
        } else {
            c42670a.b();
            if (dayItem != null) {
                a(dayItem, dVar.f396925d, false);
                G0 g04 = G0.f406611a;
            }
        }
    }
}
