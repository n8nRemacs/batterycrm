package com.avito.android.vas_planning_calendar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.vas_planning_calendar.PlanCalendarFragment;
import com.avito.android.vas_planning_calendar.model.DateRange;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_planning_calendar/PlanCalendarActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlanCalendarActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f322592m = new a(null);

    /* compiled from: PlanCalendarActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_planning_calendar/PlanCalendarActivity$a;", "", "<init>", "()V", "", "CALENDAR_SELECTION_TYPE_EXTRA", "Ljava/lang/String;", "CALENDAR_TITLE_EXTRA", "SELECTED_DATE_EXTRA", "SELECTED_DATE_RANGE_EXTRA", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        Object serializableExtra3;
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33) {
                serializableExtra = intent.getSerializableExtra("SELECTED_DATE_EXTRA", Date.class);
            } else {
                Object serializableExtra4 = intent.getSerializableExtra("SELECTED_DATE_EXTRA");
                if (!(serializableExtra4 instanceof Date)) {
                    serializableExtra4 = null;
                }
                serializableExtra = (Date) serializableExtra4;
            }
            Date date = (Date) serializableExtra;
            Intent intent2 = getIntent();
            DateRange dateRange = (DateRange) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("SELECTED_DATE_RANGE_EXTRA", DateRange.class) : intent2.getParcelableExtra("SELECTED_DATE_RANGE_EXTRA"));
            Intent intent3 = getIntent();
            if (i12 >= 33) {
                serializableExtra2 = intent3.getSerializableExtra("CALENDAR_SELECTION_TYPE_EXTRA", CalendarSelectionType.class);
            } else {
                Object serializableExtra5 = intent3.getSerializableExtra("CALENDAR_SELECTION_TYPE_EXTRA");
                if (!(serializableExtra5 instanceof CalendarSelectionType)) {
                    serializableExtra5 = null;
                }
                serializableExtra2 = (CalendarSelectionType) serializableExtra5;
            }
            CalendarSelectionType calendarSelectionType = (CalendarSelectionType) serializableExtra2;
            if (calendarSelectionType == null) {
                calendarSelectionType = CalendarSelectionType.f220022b;
            }
            Intent intent4 = getIntent();
            if (i12 >= 33) {
                serializableExtra3 = intent4.getSerializableExtra("CALENDAR_TITLE_EXTRA", String.class);
            } else {
                Object serializableExtra6 = intent4.getSerializableExtra("CALENDAR_TITLE_EXTRA");
                if (!(serializableExtra6 instanceof String)) {
                    serializableExtra6 = null;
                }
                serializableExtra3 = (String) serializableExtra6;
            }
            new PlanCalendarFragment.a();
            Bundle bundle2 = new Bundle(4);
            bundle2.putSerializable("SELECTED_DATE_EXTRA", date);
            bundle2.putParcelable("SELECTED_DATE_RANGE_EXTRA", dateRange);
            bundle2.putSerializable("CALENDAR_SELECTION_TYPE_EXTRA", calendarSelectionType);
            bundle2.putString("CALENDAR_TITLE_EXTRA", (String) serializableExtra3);
            PlanCalendarFragment planCalendarFragment = new PlanCalendarFragment();
            planCalendarFragment.setArguments(bundle2);
            planCalendarFragment.show(getSupportFragmentManager(), (String) null);
        }
    }
}
