package com.avito.android.service_booking_calendar.domain;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import it0.C42107b;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/b;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f275542a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f275543b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f275544c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f275545d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f275546e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C42107b f275547f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f275548g;

    public b(@l String str, @k String str2, @l String str3, @l DeepLink deepLink, @InterfaceC42150f @l Integer num, @l C42107b c42107b, @l String str4) {
        this.f275542a = str;
        this.f275543b = str2;
        this.f275544c = str3;
        this.f275545d = deepLink;
        this.f275546e = num;
        this.f275547f = c42107b;
        this.f275548g = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f275542a, bVar.f275542a) && L.f(this.f275543b, bVar.f275543b) && L.f(this.f275544c, bVar.f275544c) && L.f(this.f275545d, bVar.f275545d) && L.f(this.f275546e, bVar.f275546e) && L.f(this.f275547f, bVar.f275547f) && L.f(this.f275548g, bVar.f275548g);
    }

    public final int hashCode() {
        String str = this.f275542a;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f275543b);
        String str2 = this.f275544c;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f275545d;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Integer num = this.f275546e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C42107b c42107b = this.f275547f;
        int iHashCode4 = (iHashCode3 + (c42107b == null ? 0 : c42107b.hashCode())) * 31;
        String str3 = this.f275548g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleInfo(title=");
        sb2.append(this.f275542a);
        sb2.append(", subtitle=");
        sb2.append(this.f275543b);
        sb2.append(", actionTitle=");
        sb2.append(this.f275544c);
        sb2.append(", uri=");
        sb2.append(this.f275545d);
        sb2.append(", actionStyleAttr=");
        sb2.append(this.f275546e);
        sb2.append(", tooltip=");
        sb2.append(this.f275547f);
        sb2.append(", breakTime=");
        return C22026a.c(sb2, this.f275548g, ')');
    }

    public /* synthetic */ b(String str, String str2, String str3, DeepLink deepLink, Integer num, C42107b c42107b, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, deepLink, num, c42107b, (i12 & 64) != 0 ? null : str4);
    }
}
