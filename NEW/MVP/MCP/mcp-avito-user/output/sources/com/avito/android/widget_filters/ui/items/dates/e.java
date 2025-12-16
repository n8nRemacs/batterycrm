package com.avito.android.widget_filters.ui.items.dates;

import androidx.appcompat.app.r;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersDatesWidgetItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/dates/e;", "Lcom/avito/android/widget_filters/ui/items/i;", "Lcom/avito/android/widget_filters/ui/items/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements com.avito.android.widget_filters.ui.items.i, com.avito.android.widget_filters.ui.items.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330372b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330373c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final a f330374d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f330375e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final NP0.g f330376f;

    public e(@Y61.l String str, @Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, boolean z12, @Y61.l NP0.g gVar) {
        this.f330372b = str;
        this.f330373c = dVar;
        this.f330374d = aVar;
        this.f330375e = z12;
        this.f330376f = gVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return L.f(this.f330372b, eVar.f330372b) && this.f330373c.equals(eVar.f330373c) && L.f(this.f330374d, eVar.f330374d) && this.f330375e == eVar.f330375e && L.f(this.f330376f, eVar.f330376f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF296143b() {
        return "datesId";
    }

    public final int hashCode() {
        String str = this.f330372b;
        int iHashCode = (this.f330373c.hashCode() + ((1793641856 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        a aVar = this.f330374d;
        int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f330375e);
        NP0.g gVar = this.f330376f;
        return i12 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetFiltersDatesWidgetItem(stringId=datesId, widgetId=" + this.f330372b + ", title=" + this.f330373c + ", placeholder=" + this.f330374d + ", isExpanded=" + this.f330375e + ", datesRangeParameter=" + this.f330376f + ')';
    }
}
