package com.avito.android.str_calendar.seller.calendar.konveyor;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrSellerCalendarSpanSizeLookup.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/g;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f287611e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f287612f;

    @Inject
    public g(@k com.avito.konveyor.adapter.a aVar, @k com.avito.konveyor.a aVar2) {
        this.f287611e = aVar;
        this.f287612f = aVar2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f287611e.b(i12);
        com.avito.konveyor.a aVar = this.f287612f;
        if (iB2 == aVar.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.month.b.class)) {
            return 7;
        }
        if (iB2 == aVar.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.day.b.class) || iB2 == aVar.Y(com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.b.class)) {
            return 1;
        }
        throw new UnsupportedOperationException("Unknown view type");
    }
}
