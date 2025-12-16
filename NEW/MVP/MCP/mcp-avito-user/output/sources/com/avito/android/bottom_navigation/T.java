package com.avito.android.bottom_navigation;

import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabTooltipData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/T;", "", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f106986a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PrintableText f106987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final PrintableText f106988c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ButtonAction f106989d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f106990e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f106991f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f106992g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f106993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f106994i;

    public T() {
        throw null;
    }

    public T(NavigationTabSetItem navigationTabSetItem, PrintableText printableText, PrintableText printableText2, ButtonAction buttonAction, Boolean bool, Y41.a aVar, Integer num, Integer num2, Integer num3, int i12, C42822w c42822w) {
        printableText = (i12 & 2) != 0 ? null : printableText;
        printableText2 = (i12 & 4) != 0 ? null : printableText2;
        buttonAction = (i12 & 8) != 0 ? null : buttonAction;
        bool = (i12 & 16) != 0 ? Boolean.TRUE : bool;
        aVar = (i12 & 32) != 0 ? null : aVar;
        num = (i12 & 64) != 0 ? null : num;
        num2 = (i12 & 128) != 0 ? null : num2;
        num3 = (i12 & 256) != 0 ? null : num3;
        this.f106986a = navigationTabSetItem;
        this.f106987b = printableText;
        this.f106988c = printableText2;
        this.f106989d = buttonAction;
        this.f106990e = bool;
        this.f106991f = aVar;
        this.f106992g = num;
        this.f106993h = num2;
        this.f106994i = num3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t12 = (T) obj;
        return kotlin.jvm.internal.L.f(this.f106986a, t12.f106986a) && kotlin.jvm.internal.L.f(this.f106987b, t12.f106987b) && kotlin.jvm.internal.L.f(this.f106988c, t12.f106988c) && kotlin.jvm.internal.L.f(this.f106989d, t12.f106989d) && kotlin.jvm.internal.L.f(this.f106990e, t12.f106990e) && kotlin.jvm.internal.L.f(this.f106991f, t12.f106991f) && kotlin.jvm.internal.L.f(this.f106992g, t12.f106992g) && kotlin.jvm.internal.L.f(this.f106993h, t12.f106993h) && kotlin.jvm.internal.L.f(this.f106994i, t12.f106994i);
    }

    public final int hashCode() {
        int iHashCode = this.f106986a.hashCode() * 31;
        PrintableText printableText = this.f106987b;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f106988c;
        int iHashCode3 = (iHashCode2 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        ButtonAction buttonAction = this.f106989d;
        int iHashCode4 = (iHashCode3 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Boolean bool = this.f106990e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Y41.a<G0> aVar = this.f106991f;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f106992g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f106993h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f106994i;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabTooltipData(tab=");
        sb2.append(this.f106986a);
        sb2.append(", title=");
        sb2.append(this.f106987b);
        sb2.append(", description=");
        sb2.append(this.f106988c);
        sb2.append(", buttonAction=");
        sb2.append(this.f106989d);
        sb2.append(", tooltipCloseButtonVisible=");
        sb2.append(this.f106990e);
        sb2.append(", tooltipCloseListener=");
        sb2.append(this.f106991f);
        sb2.append(", size=");
        sb2.append(this.f106992g);
        sb2.append(", anchorOffsetDp=");
        sb2.append(this.f106993h);
        sb2.append(", style=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f106994i, ')');
    }
}
