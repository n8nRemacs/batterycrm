package com.avito.android.widget_filters.ui.items.guests;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersGuestsWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/guests/a;", "Lcom/avito/android/widget_filters/ui/items/c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.widget_filters.ui.items.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final b f330399a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330400b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f330401c;

    public a(@Y61.l b bVar, @Y61.l String str, boolean z12) {
        this.f330399a = bVar;
        this.f330400b = str;
        this.f330401c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f330399a, aVar.f330399a) && L.f(this.f330400b, aVar.f330400b) && this.f330401c == aVar.f330401c;
    }

    public final int hashCode() {
        b bVar = this.f330399a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f330400b;
        return Boolean.hashCode(this.f330401c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsPlaceholder(text=");
        sb2.append(this.f330399a);
        sb2.append(", defaultText=");
        sb2.append(this.f330400b);
        sb2.append(", isDefault=");
        return r.x(sb2, this.f330401c, ')');
    }
}
