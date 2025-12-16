package com.avito.android.calendar_select;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CalendarSelectIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/b;", "", "a", "_avito_calendar-select_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: CalendarSelectIntentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/b$a;", "", "<init>", "()V", "_avito_calendar-select_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    @k
    Intent a(@k Context context, @l String str, @l String str2, @k List list, @l String str3, @k List list2, @l String str4, @l String str5, @k CalendarSelectionType calendarSelectionType, boolean z12);
}
