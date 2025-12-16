package com.avito.android.widget_filters.ui.items.location;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationWidgetItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/location/e;", "Lcom/avito/android/widget_filters/ui/items/i;", "Lcom/avito/android/widget_filters/ui/items/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements com.avito.android.widget_filters.ui.items.i, com.avito.android.widget_filters.ui.items.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330483c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final a f330484d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f330485e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final NP0.m f330486f;

    public e(@Y61.l String str, @Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, boolean z12, @Y61.l NP0.m mVar) {
        this.f330482b = str;
        this.f330483c = dVar;
        this.f330484d = aVar;
        this.f330485e = z12;
        this.f330486f = mVar;
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
        return L.f(this.f330482b, eVar.f330482b) && this.f330483c.equals(eVar.f330483c) && L.f(this.f330484d, eVar.f330484d) && this.f330485e == eVar.f330485e && L.f(this.f330486f, eVar.f330486f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF270463j() {
        return SearchParamsConverterKt.LOCATION_ID;
    }

    public final int hashCode() {
        String str = this.f330482b;
        int iHashCode = (this.f330483c.hashCode() + ((552298064 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        a aVar = this.f330484d;
        int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f330485e);
        NP0.m mVar = this.f330486f;
        return i12 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetFiltersLocationWidgetItem(stringId=locationId, widgetId=" + this.f330482b + ", title=" + this.f330483c + ", placeholder=" + this.f330484d + ", isExpanded=" + this.f330485e + ", locationParameter=" + this.f330486f + ')';
    }
}
