package com.avito.android.lib.beduin_v2.component.date_picker;

import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.ranges.o;

/* compiled from: DatePickerComposeState.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/date_picker/k;", "", "_design-modules_beduin-v2_renderer_component_date-picker"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<o> f175553a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f175554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175555c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f175556d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DatePickerSelectionType f175557e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f175558f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f175559g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f175560h;

    public k() {
        this(null, null, 0, null, null, false, false, false, 255, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f175553a, kVar.f175553a) && L.f(this.f175554b, kVar.f175554b) && this.f175555c == kVar.f175555c && L.f(this.f175556d, kVar.f175556d) && L.f(this.f175557e, kVar.f175557e) && this.f175558f == kVar.f175558f && this.f175559g == kVar.f175559g && this.f175560h == kVar.f175560h;
    }

    public final int hashCode() {
        int iHashCode = this.f175553a.hashCode() * 31;
        Long l12 = this.f175554b;
        int iE2 = r.e(this.f175555c, (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
        Long l13 = this.f175556d;
        return Boolean.hashCode(this.f175560h) + r.i(r.i((this.f175557e.hashCode() + ((iE2 + (l13 != null ? l13.hashCode() : 0)) * 31)) * 31, 31, this.f175558f), 31, this.f175559g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatePickerComposeState(selectedDates=");
        sb2.append(this.f175553a);
        sb2.append(", initialMonthMillis=");
        sb2.append(this.f175554b);
        sb2.append(", countOfDisplayedMonths=");
        sb2.append(this.f175555c);
        sb2.append(", initialDisplayedMonthMillis=");
        sb2.append(this.f175556d);
        sb2.append(", selectionType=");
        sb2.append(this.f175557e);
        sb2.append(", highlightWeekend=");
        sb2.append(this.f175558f);
        sb2.append(", enableBackgroundForDisabledDates=");
        sb2.append(this.f175559g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f175560h, ')');
    }

    public k(@Y61.k List<o> list, @Y61.l Long l12, int i12, @Y61.l Long l13, @Y61.k DatePickerSelectionType datePickerSelectionType, boolean z12, boolean z13, boolean z14) {
        this.f175553a = list;
        this.f175554b = l12;
        this.f175555c = i12;
        this.f175556d = l13;
        this.f175557e = datePickerSelectionType;
        this.f175558f = z12;
        this.f175559g = z13;
        this.f175560h = z14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(List list, Long l12, int i12, Long l13, DatePickerSelectionType datePickerSelectionType, boolean z12, boolean z13, boolean z14, int i13, C42822w c42822w) {
        Long lValueOf;
        List list2 = (i13 & 1) != 0 ? C42784z0.f406748b : list;
        Long l14 = (i13 & 2) != 0 ? null : l12;
        int i14 = (i13 & 4) != 0 ? 12 : i12;
        if ((i13 & 8) != 0) {
            o oVar = (o) C42745f0.G(list2);
            lValueOf = oVar != null ? Long.valueOf(oVar.f406915b) : null;
        } else {
            lValueOf = l13;
        }
        this(list2, l14, i14, lValueOf, (i13 & 16) != 0 ? new DatePickerSelectionType.a(null, 1, null) : datePickerSelectionType, (i13 & 32) != 0 ? false : z12, (i13 & 64) == 0 ? z13 : true, (i13 & 128) == 0 ? z14 : false);
    }
}
