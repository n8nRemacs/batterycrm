package com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.day.schedule.view.TimeSlotView;
import dt0.C39802a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BusyTimeSlotItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_busy/g;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Ldt0/a$a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e, C39802a.InterfaceC11044a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f275432f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275433b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TimeSlotView f275434c;

    /* renamed from: d, reason: collision with root package name */
    public int f275435d;

    /* renamed from: e, reason: collision with root package name */
    public long f275436e;

    public g(@k View view) {
        super(view);
        this.f275433b = view;
        View viewFindViewById = view.findViewById(R.id.timeslot_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.service_booking_calendar.day.schedule.view.TimeSlotView");
        }
        this.f275434c = (TimeSlotView) viewFindViewById;
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: JB, reason: from getter */
    public final int getF275435d() {
        return this.f275435d;
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: vQ, reason: from getter */
    public final long getF275436e() {
        return this.f275436e;
    }
}
