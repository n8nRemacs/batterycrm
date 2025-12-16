package com.avito.android.widget_filters.ui.items;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/d;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f330358a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final a f330359b;

    public d(@l String str, @l a aVar) {
        this.f330358a = str;
        this.f330359b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f330358a, dVar.f330358a) && L.f(this.f330359b, dVar.f330359b);
    }

    public final int hashCode() {
        String str = this.f330358a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.f330359b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TitleWithBadge(title=" + this.f330358a + ", badge=" + this.f330359b + ')';
    }
}
