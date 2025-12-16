package com.avito.android.widget_filters.ui.items.guests;

import com.akita.compose.theme.re23.style.C0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersGuestsItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/guests/e;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330410a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f330411b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f330412c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f330413d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f330414e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f330415f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<NP0.f> f330416g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f330417h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f330418i;

    public e(@Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l Boolean bool, @Y61.l a aVar, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l List<NP0.f> list, @Y61.l Boolean bool2, @Y61.l Boolean bool3) {
        this.f330410a = dVar;
        this.f330411b = bool;
        this.f330412c = aVar;
        this.f330413d = num;
        this.f330414e = num2;
        this.f330415f = num3;
        this.f330416g = list;
        this.f330417h = bool2;
        this.f330418i = bool3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f330410a, eVar.f330410a) && L.f(this.f330411b, eVar.f330411b) && L.f(this.f330412c, eVar.f330412c) && L.f(this.f330413d, eVar.f330413d) && L.f(this.f330414e, eVar.f330414e) && L.f(this.f330415f, eVar.f330415f) && L.f(this.f330416g, eVar.f330416g) && L.f(this.f330417h, eVar.f330417h) && L.f(this.f330418i, eVar.f330418i);
    }

    public final int hashCode() {
        com.avito.android.widget_filters.ui.items.d dVar = this.f330410a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Boolean bool = this.f330411b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f330412c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f330413d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f330414e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f330415f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<NP0.f> list = this.f330416g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.f330417h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f330418i;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersGuestsItemPayload(title=");
        sb2.append(this.f330410a);
        sb2.append(", isExpanded=");
        sb2.append(this.f330411b);
        sb2.append(", placeholder=");
        sb2.append(this.f330412c);
        sb2.append(", adultsStepperMinValue=");
        sb2.append(this.f330413d);
        sb2.append(", adultsStepperMaxValue=");
        sb2.append(this.f330414e);
        sb2.append(", selectedAdultsCount=");
        sb2.append(this.f330415f);
        sb2.append(", selectedChildren=");
        sb2.append(this.f330416g);
        sb2.append(", isChildrenPickerButtonEnabled=");
        sb2.append(this.f330417h);
        sb2.append(", isAnimalsSelected=");
        return C0.g(sb2, this.f330418i, ')');
    }
}
