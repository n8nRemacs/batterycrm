package com.avito.android.sbc.create.mvi.util;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.calendar_select.CalendarSelectionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarParams.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/b;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f259897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f259898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f259899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f259900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f259901e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f259902f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f259903g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f259904h;

    public b() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f259897a, bVar.f259897a) && L.f(this.f259898b, bVar.f259898b) && L.f(this.f259899c, bVar.f259899c) && L.f(this.f259900d, bVar.f259900d) && L.f(this.f259901e, bVar.f259901e) && L.f(this.f259902f, bVar.f259902f) && L.f(this.f259903g, bVar.f259903g) && this.f259904h == bVar.f259904h;
    }

    public final int hashCode() {
        String str = this.f259897a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f259898b;
        int iE2 = H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f259899c);
        String str3 = this.f259900d;
        int iE3 = H.e((iE2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f259901e);
        String str4 = this.f259902f;
        int iHashCode2 = (iE3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f259903g;
        return this.f259904h.hashCode() + ((iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "CalendarParams(dateFrom=" + this.f259897a + ", dateTo=" + this.f259898b + ", selectedDates=" + this.f259899c + ", title=" + this.f259900d + ", blockedDates=" + this.f259901e + ", buttonTitle=" + this.f259902f + ", settingsPath=" + this.f259903g + ", selectionType=" + this.f259904h + ')';
    }

    public b(@Y61.l String str, @Y61.l String str2, @Y61.k List<String> list, @Y61.l String str3, @Y61.k List<String> list2, @Y61.l String str4, @Y61.l String str5, @Y61.k CalendarSelectionType calendarSelectionType) {
        this.f259897a = str;
        this.f259898b = str2;
        this.f259899c = list;
        this.f259900d = str3;
        this.f259901e = list2;
        this.f259902f = str4;
        this.f259903g = str5;
        this.f259904h = calendarSelectionType;
    }

    public b(String str, String str2, List list, String str3, List list2, String str4, String str5, CalendarSelectionType calendarSelectionType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? C42784z0.f406748b : list2, (i12 & 32) != 0 ? null : str4, (i12 & 64) == 0 ? str5 : null, (i12 & 128) != 0 ? CalendarSelectionType.f113306b : calendarSelectionType);
    }
}
