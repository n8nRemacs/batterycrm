package com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty;

import Y61.k;
import Y61.l;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.inline_filters.dialog.calendar.models.FiltersCalendarPickerItemState;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarEmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/empty/a;", "LTV0/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f171235b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f171236c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerItemState f171237d;

    public a(long j12, @k Date date, @k FiltersCalendarPickerItemState filtersCalendarPickerItemState) {
        this.f171235b = j12;
        this.f171236c = date;
        this.f171237d = filtersCalendarPickerItemState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f171235b == aVar.f171235b && L.f(this.f171236c, aVar.f171236c) && this.f171237d == aVar.f171237d;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f171235b;
    }

    public final int hashCode() {
        return this.f171237d.hashCode() + m.f(this.f171236c, Long.hashCode(this.f171235b) * 31, 31);
    }

    @k
    public final String toString() {
        return "FiltersCalendarEmptyItem(id=" + this.f171235b + ", nextDate=" + this.f171236c + ", state=" + this.f171237d + ')';
    }

    public /* synthetic */ a(long j12, Date date, FiltersCalendarPickerItemState filtersCalendarPickerItemState, int i12, C42822w c42822w) {
        this(j12, date, (i12 & 4) != 0 ? FiltersCalendarPickerItemState.f171257b : filtersCalendarPickerItemState);
    }
}
