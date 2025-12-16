package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.service_booking_calendar.view.day.DayItemContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DayContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/a;", "Lcom/avito/android/service_booking_calendar/view/day/DayItemContent;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements DayItemContent {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f277635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.EventType f277636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.DayType f277637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DayItemContent.HighlightType f277638d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f277639e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f277640f;

    public a(@Y61.k String str, @Y61.k DayItemContent.EventType eventType, @Y61.k DayItemContent.DayType dayType, @Y61.k DayItemContent.HighlightType highlightType, boolean z12, @l Long l12) {
        this.f277635a = str;
        this.f277636b = eventType;
        this.f277637c = dayType;
        this.f277638d = highlightType;
        this.f277639e = z12;
        this.f277640f = l12;
    }

    public static a e(a aVar, boolean z12) {
        return new a(aVar.f277635a, aVar.f277636b, aVar.f277637c, aVar.f277638d, z12, aVar.f277640f);
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    /* renamed from: a, reason: from getter */
    public final boolean getF277639e() {
        return this.f277639e;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final DayItemContent.HighlightType getF277638d() {
        return this.f277638d;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final DayItemContent.DayType getF277637c() {
        return this.f277637c;
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DayItemContent.EventType getF277636b() {
        return this.f277636b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f277635a, aVar.f277635a) && this.f277636b == aVar.f277636b && this.f277637c == aVar.f277637c && this.f277638d == aVar.f277638d && this.f277639e == aVar.f277639e && L.f(this.f277640f, aVar.f277640f);
    }

    @Override // com.avito.android.service_booking_calendar.view.day.DayItemContent
    @Y61.k
    /* renamed from: getText, reason: from getter */
    public final String getF277635a() {
        return this.f277635a;
    }

    public final int hashCode() {
        int i12 = r.i((this.f277638d.hashCode() + ((this.f277637c.hashCode() + ((this.f277636b.hashCode() + (this.f277635a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f277639e);
        Long l12 = this.f277640f;
        return i12 + (l12 == null ? 0 : l12.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DayContent(text=");
        sb2.append(this.f277635a);
        sb2.append(", eventType=");
        sb2.append(this.f277636b);
        sb2.append(", dayType=");
        sb2.append(this.f277637c);
        sb2.append(", highlightType=");
        sb2.append(this.f277638d);
        sb2.append(", isFocused=");
        sb2.append(this.f277639e);
        sb2.append(", time=");
        return m.m(sb2, this.f277640f, ')');
    }

    public /* synthetic */ a(String str, DayItemContent.EventType eventType, DayItemContent.DayType dayType, DayItemContent.HighlightType highlightType, boolean z12, Long l12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? DayItemContent.EventType.f276176b : eventType, (i12 & 4) != 0 ? DayItemContent.DayType.f276172c : dayType, (i12 & 8) != 0 ? DayItemContent.HighlightType.f276183c : highlightType, (i12 & 16) != 0 ? false : z12, l12);
    }
}
