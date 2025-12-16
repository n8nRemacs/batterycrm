package com.avito.android.calendar_select.presentation.mvicalendarselect;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: CalendarSelectFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/mvicalendarselect/b;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f113404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CalendarSelectFragment f113405f;

    public b(com.avito.konveyor.adapter.a aVar, CalendarSelectFragment calendarSelectFragment) {
        this.f113404e = aVar;
        this.f113405f = calendarSelectFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f113404e.b(i12);
        CalendarSelectFragment calendarSelectFragment = this.f113405f;
        com.avito.konveyor.a aVar = calendarSelectFragment.f113385n0;
        if (aVar == null) {
            aVar = null;
        }
        if (iB2 == aVar.Y(com.avito.android.calendar_select.presentation.view.konveyor.items.month.c.class)) {
            return 7;
        }
        com.avito.konveyor.a aVar2 = calendarSelectFragment.f113385n0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (iB2 != aVar2.Y(com.avito.android.calendar_select.presentation.view.konveyor.items.day.b.class)) {
            com.avito.konveyor.a aVar3 = calendarSelectFragment.f113385n0;
            if (iB2 != (aVar3 != null ? aVar3 : null).Y(com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c.class)) {
                throw new UnsupportedOperationException("Unknown view type");
            }
        }
        return 1;
    }
}
