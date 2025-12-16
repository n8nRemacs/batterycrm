package com.avito.android.calendar_select.presentation;

import Ql.c;
import Ql.d;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.mvicalendarselect.CalendarSelectFragment;
import com.avito.android.util.C35835l0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CalendarSelectActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/calendar_select/presentation/CalendarSelectActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "LQl/c;", "<init>", "()V", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CalendarSelectActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, c {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f113382m = new a(null);

    /* compiled from: CalendarSelectActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/presentation/CalendarSelectActivity$a;", "", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // Ql.c
    public final void onCancel() {
        setResult(0);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar_select);
        if (bundle == null) {
            Intent intent = getIntent();
            CalendarSettings calendarSettings = (CalendarSettings) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("calendarSettings", CalendarSettings.class) : intent.getParcelableExtra("calendarSettings"));
            if (calendarSettings == null) {
                CalendarSettings.f113312l.getClass();
                C42784z0 c42784z0 = C42784z0.f406748b;
                calendarSettings = new CalendarSettings(null, null, c42784z0, null, c42784z0, null, null, CalendarSelectionType.f113306b, false, null);
            }
            H hE2 = getSupportFragmentManager().e();
            CalendarSelectFragment.f113383x0.getClass();
            hE2.j(R.id.fragment_container, CalendarSelectFragment.a.a(calendarSettings), null, 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (getResources().getBoolean(R.bool.calendar_select_show_bottom_sheet)) {
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(findViewById(R.id.bottom_sheet));
            bottomSheetBehaviorB.M(true);
            bottomSheetBehaviorB.N(C35835l0.i(this).heightPixels, false);
            bottomSheetBehaviorB.v(new d(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // Ql.c
    public final void w(@k List<LocalDate> list) {
        Intent intent = new Intent();
        intent.putExtra("selectedDates", (Serializable) list.toArray(new LocalDate[0]));
        setResult(-1, intent);
        finish();
    }
}
