package com.avito.android.service_booking_calendar.day.schedule;

import androidx.recyclerview.widget.RecyclerView;
import bt0.InterfaceC25710b;
import com.avito.android.R;
import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f275292b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25710b f275293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DayScheduleFragment f275294d;

    public /* synthetic */ b(InterfaceC25710b interfaceC25710b, DayScheduleFragment dayScheduleFragment) {
        this.f275293c = interfaceC25710b;
        this.f275294d = dayScheduleFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight;
        DayScheduleFragment dayScheduleFragment = this.f275294d;
        InterfaceC25710b interfaceC25710b = this.f275293c;
        switch (this.f275292b) {
            case 0:
                l lVar = dayScheduleFragment.f275260q0;
                if (lVar == null) {
                    lVar = null;
                }
                RecyclerView recyclerView = lVar.f275384b;
                int i12 = ((InterfaceC25710b.a) interfaceC25710b).f57520a;
                recyclerView.scrollBy(0, i12);
                com.avito.android.service_booking_calendar.b bVar = dayScheduleFragment.f275257n0;
                (bVar != null ? bVar : null).P2(i12);
                break;
            default:
                DayScheduleFragment.Companion companion = DayScheduleFragment.f275256y0;
                if (((InterfaceC25710b.C2022b) interfaceC25710b).f57522b) {
                    l lVar2 = dayScheduleFragment.f275260q0;
                    if (lVar2 == null) {
                        lVar2 = null;
                    }
                    measuredHeight = lVar2.f275384b.getMeasuredHeight() / 4;
                } else {
                    measuredHeight = 0;
                }
                l lVar3 = dayScheduleFragment.f275260q0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                int iMax = Math.max((((int) (r3.f57521a.J() / 900)) * lVar3.f275384b.getContext().getResources().getDimensionPixelSize(R.dimen.day_schedule_timeslot_section_height)) - measuredHeight, 0);
                l lVar4 = dayScheduleFragment.f275260q0;
                if (lVar4 == null) {
                    lVar4 = null;
                }
                lVar4.f275384b.scrollBy(0, iMax);
                com.avito.android.service_booking_calendar.b bVar2 = dayScheduleFragment.f275257n0;
                (bVar2 != null ? bVar2 : null).P2(iMax);
                break;
        }
    }

    public /* synthetic */ b(DayScheduleFragment dayScheduleFragment, InterfaceC25710b interfaceC25710b) {
        this.f275294d = dayScheduleFragment;
        this.f275293c = interfaceC25710b;
    }
}
