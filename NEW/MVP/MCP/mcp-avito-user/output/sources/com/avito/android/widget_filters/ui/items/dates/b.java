package com.avito.android.widget_filters.ui.items.dates;

import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/dates/b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330363a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final a f330364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f330365c;

    public b(@Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, @Y61.l Boolean bool) {
        this.f330363a = dVar;
        this.f330364b = aVar;
        this.f330365c = bool;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f330363a, bVar.f330363a) && L.f(this.f330364b, bVar.f330364b) && L.f(this.f330365c, bVar.f330365c);
    }

    public final int hashCode() {
        com.avito.android.widget_filters.ui.items.d dVar = this.f330363a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        a aVar = this.f330364b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f330365c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersDatesItemPayload(title=");
        sb2.append(this.f330363a);
        sb2.append(", placeholder=");
        sb2.append(this.f330364b);
        sb2.append(", isExpanded=");
        return C0.g(sb2, this.f330365c, ')');
    }
}
