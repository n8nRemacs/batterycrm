package com.avito.android.widget_filters.ui.items.category;

import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/a;", "Lcom/avito/android/widget_filters/ui/items/c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.widget_filters.ui.items.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final PrintableText f330321a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330322b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f330323c;

    public a(@Y61.l PrintableText printableText, @Y61.l String str, boolean z12) {
        this.f330321a = printableText;
        this.f330322b = str;
        this.f330323c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f330321a, aVar.f330321a) && L.f(this.f330322b, aVar.f330322b) && this.f330323c == aVar.f330323c;
    }

    public final int hashCode() {
        PrintableText printableText = this.f330321a;
        int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
        String str = this.f330322b;
        return Boolean.hashCode(this.f330323c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryPlaceholder(text=");
        sb2.append(this.f330321a);
        sb2.append(", defaultText=");
        sb2.append(this.f330322b);
        sb2.append(", isDefault=");
        return r.x(sb2, this.f330323c, ')');
    }
}
