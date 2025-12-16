package com.avito.android.calendar_select;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.CalendarSelectActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalendarSelectIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/c;", "Lcom/avito/android/calendar_select/b;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.calendar_select.b
    @k
    public final Intent a(@k Context context, @l String str, @l String str2, @k List list, @l String str3, @k List list2, @l String str4, @l String str5, @k CalendarSelectionType calendarSelectionType, boolean z12) {
        CalendarSelectActivity.f113382m.getClass();
        Intent intent = new Intent(context, (Class<?>) CalendarSelectActivity.class);
        intent.putExtra("calendarSettings", new CalendarSettings(str, str2, list, str3, list2, new CalendarSettings.Button(str4), str5, calendarSelectionType, z12, null));
        return intent;
    }
}
