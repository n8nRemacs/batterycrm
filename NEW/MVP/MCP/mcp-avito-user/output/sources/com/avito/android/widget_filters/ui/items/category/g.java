package com.avito.android.widget_filters.ui.items.category;

import androidx.appcompat.app.r;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryWidgetItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/g;", "Lcom/avito/android/widget_filters/ui/items/i;", "Lcom/avito/android/widget_filters/ui/items/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements com.avito.android.widget_filters.ui.items.i, com.avito.android.widget_filters.ui.items.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330337b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330338c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final a f330339d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f330340e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final NP0.d f330341f;

    public g(@Y61.l String str, @Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, boolean z12, @Y61.l NP0.d dVar2) {
        this.f330337b = str;
        this.f330338c = dVar;
        this.f330339d = aVar;
        this.f330340e = z12;
        this.f330341f = dVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return L.f(this.f330337b, gVar.f330337b) && this.f330338c.equals(gVar.f330338c) && L.f(this.f330339d, gVar.f330339d) && this.f330340e == gVar.f330340e && L.f(this.f330341f, gVar.f330341f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF314301b() {
        return "categoryId";
    }

    public final int hashCode() {
        String str = this.f330337b;
        int iHashCode = (this.f330338c.hashCode() + ((1537759335 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        a aVar = this.f330339d;
        int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f330340e);
        NP0.d dVar = this.f330341f;
        return i12 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetFiltersCategoryWidgetItem(stringId=categoryId, widgetId=" + this.f330337b + ", title=" + this.f330338c + ", placeholder=" + this.f330339d + ", isExpanded=" + this.f330340e + ", categoryParameter=" + this.f330341f + ')';
    }
}
