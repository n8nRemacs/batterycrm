package com.avito.android.str_calendar.booking_calendar;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: StrBookingCalendarActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/a;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StrBookingCalendarActivity f286228b;

    public a(StrBookingCalendarActivity strBookingCalendarActivity) {
        this.f286228b = strBookingCalendarActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@Y61.k View view, int i12) {
        if (i12 == 5) {
            StrBookingCalendarActivity strBookingCalendarActivity = this.f286228b;
            strBookingCalendarActivity.setResult(-1);
            strBookingCalendarActivity.finish();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@Y61.k View view, float f12) {
    }
}
