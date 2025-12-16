package Ql;

import Y61.k;
import android.view.View;
import com.avito.android.calendar_select.presentation.CalendarSelectActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: CalendarSelectActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQl/d;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarSelectActivity f13994b;

    public d(CalendarSelectActivity calendarSelectActivity) {
        this.f13994b = calendarSelectActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(@k View view, int i12) {
        if (i12 == 5) {
            CalendarSelectActivity calendarSelectActivity = this.f13994b;
            calendarSelectActivity.setResult(0);
            calendarSelectActivity.finish();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(@k View view, float f12) {
    }
}
