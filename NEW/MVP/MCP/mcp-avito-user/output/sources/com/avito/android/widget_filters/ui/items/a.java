package com.avito.android.widget_filters.ui.items;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/a;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f330319a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f330320b;

    public a(@k PrintableText printableText, boolean z12) {
        this.f330319a = z12;
        this.f330320b = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f330319a == aVar.f330319a && L.f(this.f330320b, aVar.f330320b);
    }

    public final int hashCode() {
        return this.f330320b.hashCode() + (Boolean.hashCode(this.f330319a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Badge(isVisible=");
        sb2.append(this.f330319a);
        sb2.append(", text=");
        return AK.c.m(sb2, this.f330320b, ')');
    }
}
