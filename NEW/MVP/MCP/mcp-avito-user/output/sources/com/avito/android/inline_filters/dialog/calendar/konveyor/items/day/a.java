package com.avito.android.inline_filters.dialog.calendar.konveyor.items.day;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.inline_filters.dialog.calendar.models.FiltersCalendarPickerItemState;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FiltersCalendarDayItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/day/a;", "LTV0/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f171217b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f171218c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FiltersCalendarPickerItemState f171219d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Date f171220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f171221f;

    public a(long j12, @k String str, @k FiltersCalendarPickerItemState filtersCalendarPickerItemState, @k Date date, boolean z12) {
        this.f171217b = j12;
        this.f171218c = str;
        this.f171219d = filtersCalendarPickerItemState;
        this.f171220e = date;
        this.f171221f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f171217b == aVar.f171217b && L.f(this.f171218c, aVar.f171218c) && this.f171219d == aVar.f171219d && L.f(this.f171220e, aVar.f171220e) && this.f171221f == aVar.f171221f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF395939g() {
        return this.f171217b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f171221f) + m.f(this.f171220e, (this.f171219d.hashCode() + H.d(Long.hashCode(this.f171217b) * 31, 31, this.f171218c)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersCalendarDayItem(id=");
        sb2.append(this.f171217b);
        sb2.append(", text=");
        sb2.append(this.f171218c);
        sb2.append(", state=");
        sb2.append(this.f171219d);
        sb2.append(", date=");
        sb2.append(this.f171220e);
        sb2.append(", isToday=");
        return r.x(sb2, this.f171221f, ')');
    }

    public /* synthetic */ a(long j12, String str, FiltersCalendarPickerItemState filtersCalendarPickerItemState, Date date, boolean z12, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? FiltersCalendarPickerItemState.f171257b : filtersCalendarPickerItemState, date, z12);
    }
}
