package com.avito.android.widget_filters.ui.items.guests;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersGuestsWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/guests/b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final PrintableText f330402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PrintableText f330403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final PrintableText f330404c;

    public b(@Y61.l PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.l PrintableText printableText3) {
        this.f330402a = printableText;
        this.f330403b = printableText2;
        this.f330404c = printableText3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f330402a, bVar.f330402a) && L.f(this.f330403b, bVar.f330403b) && L.f(this.f330404c, bVar.f330404c);
    }

    public final int hashCode() {
        PrintableText printableText = this.f330402a;
        int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
        PrintableText printableText2 = this.f330403b;
        int iHashCode2 = (iHashCode + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        PrintableText printableText3 = this.f330404c;
        return iHashCode2 + (printableText3 != null ? printableText3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsPlaceholderText(adults=");
        sb2.append(this.f330402a);
        sb2.append(", children=");
        sb2.append(this.f330403b);
        sb2.append(", withAnimal=");
        return AK.c.m(sb2, this.f330404c, ')');
    }
}
