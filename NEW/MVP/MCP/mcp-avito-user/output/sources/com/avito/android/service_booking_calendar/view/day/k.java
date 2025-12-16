package com.avito.android.service_booking_calendar.view.day;

import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.service_booking_calendar.view.day.DayItemContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DayItemContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/k;", "Lcom/avito/android/service_booking_calendar/view/day/DayItemContent;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class k implements DayItemContent {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f276203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.EventType f276204b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.DayType f276205c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.HighlightType f276206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f276207e;

    public k(String str, DayItemContent.EventType eventType, DayItemContent.DayType dayType, DayItemContent.HighlightType highlightType, boolean z12, int i12, C42822w c42822w) {
        eventType = (i12 & 2) != 0 ? DayItemContent.EventType.f276176b : eventType;
        dayType = (i12 & 4) != 0 ? DayItemContent.DayType.f276172c : dayType;
        highlightType = (i12 & 8) != 0 ? DayItemContent.HighlightType.f276183c : highlightType;
        z12 = (i12 & 16) != 0 ? false : z12;
        this.f276203a = str;
        this.f276204b = eventType;
        this.f276205c = dayType;
        this.f276206d = highlightType;
        this.f276207e = z12;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    /* renamed from: a, reason: from getter */
    public final boolean getF276207e() {
        return this.f276207e;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DayItemContent.HighlightType getF276206d() {
        return this.f276206d;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DayItemContent.DayType getF276205c() {
        return this.f276205c;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DayItemContent.EventType getF276204b() {
        return this.f276204b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f276203a, kVar.f276203a) && this.f276204b == kVar.f276204b && this.f276205c == kVar.f276205c && this.f276206d == kVar.f276206d && this.f276207e == kVar.f276207e;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: getText, reason: from getter */
    public final String getF276203a() {
        return this.f276203a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276207e) + ((this.f276206d.hashCode() + ((this.f276205c.hashCode() + ((this.f276204b.hashCode() + (this.f276203a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DayItemTextContent(text=");
        sb2.append(this.f276203a);
        sb2.append(", eventType=");
        sb2.append(this.f276204b);
        sb2.append(", dayType=");
        sb2.append(this.f276205c);
        sb2.append(", highlightType=");
        sb2.append(this.f276206d);
        sb2.append(", isFocused=");
        return r.x(sb2, this.f276207e, ')');
    }
}
