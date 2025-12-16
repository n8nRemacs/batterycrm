package com.avito.android.inline_filters.dialog.calendar.view;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/view/u;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f171355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f171356f;

    public u(com.avito.konveyor.adapter.a aVar, w wVar) {
        this.f171355e = aVar;
        this.f171356f = wVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f171355e.b(i12);
        w wVar = this.f171356f;
        com.avito.konveyor.a aVar = wVar.f171365h;
        if (aVar == null) {
            aVar = null;
        }
        if (iB2 == aVar.Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.b.class)) {
            return 7;
        }
        com.avito.konveyor.a aVar2 = wVar.f171365h;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (iB2 != aVar2.Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.b.class)) {
            com.avito.konveyor.a aVar3 = wVar.f171365h;
            if (iB2 != (aVar3 != null ? aVar3 : null).Y(com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.b.class)) {
                throw new UnsupportedOperationException("Unknown view type");
            }
        }
        return 1;
    }
}
