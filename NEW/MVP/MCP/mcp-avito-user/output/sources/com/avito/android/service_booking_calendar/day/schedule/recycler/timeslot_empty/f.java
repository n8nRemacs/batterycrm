package com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import dt0.C39802a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyTimeSlotItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/recycler/timeslot_empty/f;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Ldt0/a$a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e, C39802a.InterfaceC11044a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f275442b;

    /* renamed from: c, reason: collision with root package name */
    public int f275443c;

    /* renamed from: d, reason: collision with root package name */
    public long f275444d;

    /* renamed from: e, reason: collision with root package name */
    public final int f275445e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f275446f;

    public f(@k View view) {
        super(view);
        this.f275442b = view;
        this.f275445e = view.getResources().getDimensionPixelSize(R.dimen.day_schedule_timeslot_height);
        View viewFindViewById = view.findViewById(R.id.timeslot_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f275446f = viewFindViewById;
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: JB, reason: from getter */
    public final int getF275435d() {
        return this.f275443c;
    }

    @Override // dt0.C39802a.InterfaceC11044a
    /* renamed from: vQ, reason: from getter */
    public final long getF275436e() {
        return this.f275444d;
    }
}
