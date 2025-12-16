package com.avito.android.widget_filters.ui.items.category;

import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/category/b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final a f330325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Boolean f330326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<NP0.c> f330327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<NP0.c> f330328e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f330329f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f330330g;

    public b(@Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, @Y61.l Boolean bool, @Y61.l List<NP0.c> list, @Y61.l List<NP0.c> list2, @Y61.l Boolean bool2, @Y61.l String str) {
        this.f330324a = dVar;
        this.f330325b = aVar;
        this.f330326c = bool;
        this.f330327d = list;
        this.f330328e = list2;
        this.f330329f = bool2;
        this.f330330g = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f330324a, bVar.f330324a) && L.f(this.f330325b, bVar.f330325b) && L.f(this.f330326c, bVar.f330326c) && L.f(this.f330327d, bVar.f330327d) && L.f(this.f330328e, bVar.f330328e) && L.f(this.f330329f, bVar.f330329f) && L.f(this.f330330g, bVar.f330330g);
    }

    public final int hashCode() {
        com.avito.android.widget_filters.ui.items.d dVar = this.f330324a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        a aVar = this.f330325b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f330326c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<NP0.c> list = this.f330327d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<NP0.c> list2 = this.f330328e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.f330329f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f330330g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersCategoryItemPayload(title=");
        sb2.append(this.f330324a);
        sb2.append(", placeholder=");
        sb2.append(this.f330325b);
        sb2.append(", isExpanded=");
        sb2.append(this.f330326c);
        sb2.append(", categories=");
        sb2.append(this.f330327d);
        sb2.append(", selectedCategories=");
        sb2.append(this.f330328e);
        sb2.append(", isMultiselect=");
        sb2.append(this.f330329f);
        sb2.append(", hintText=");
        return C22026a.c(sb2, this.f330330g, ')');
    }
}
