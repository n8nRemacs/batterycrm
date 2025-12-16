package com.avito.android.das_date_picker.items.day;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarDayItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/items/day/a;", "Lcom/avito/conveyor_item/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f132315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f132316c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DasCalendarDayState f132317d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132318e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f132319f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Date f132320g;

    public a(@k String str, @k String str2, @k DasCalendarDayState dasCalendarDayState, boolean z12, boolean z13, @k Date date) {
        this.f132315b = str;
        this.f132316c = str2;
        this.f132317d = dasCalendarDayState;
        this.f132318e = z12;
        this.f132319f = z13;
        this.f132320g = date;
    }

    public static a a(a aVar, DasCalendarDayState dasCalendarDayState) {
        String str = aVar.f132315b;
        String str2 = aVar.f132316c;
        boolean z12 = aVar.f132318e;
        boolean z13 = aVar.f132319f;
        Date date = aVar.f132320g;
        aVar.getClass();
        return new a(str, str2, dasCalendarDayState, z12, z13, date);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f132315b, aVar.f132315b) && L.f(this.f132316c, aVar.f132316c) && this.f132317d == aVar.f132317d && this.f132318e == aVar.f132318e && this.f132319f == aVar.f132319f && L.f(this.f132320g, aVar.f132320g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF102477b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF102477b() {
        return this.f132315b;
    }

    public final int hashCode() {
        return this.f132320g.hashCode() + r.i(r.i((this.f132317d.hashCode() + H.d(this.f132315b.hashCode() * 31, 31, this.f132316c)) * 31, 31, this.f132318e), 31, this.f132319f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DasCalendarDayItem(stringId=");
        sb2.append(this.f132315b);
        sb2.append(", text=");
        sb2.append(this.f132316c);
        sb2.append(", dayState=");
        sb2.append(this.f132317d);
        sb2.append(", areClicksAvailable=");
        sb2.append(this.f132318e);
        sb2.append(", isToday=");
        sb2.append(this.f132319f);
        sb2.append(", date=");
        return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f132320g, ')');
    }
}
