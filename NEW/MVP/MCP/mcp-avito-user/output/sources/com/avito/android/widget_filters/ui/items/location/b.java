package com.avito.android.widget_filters.ui.items.location;

import NP0.n;
import NP0.o;
import NP0.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersLocationItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/location/b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330470a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f330471b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final a f330472c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f330473d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<n> f330474e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<o> f330475f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f330476g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final p f330477h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l Boolean bool, @Y61.l a aVar, @Y61.l String str, @Y61.l List<n> list, @Y61.l List<? extends o> list2, @Y61.l Boolean bool2, @Y61.l p pVar) {
        this.f330470a = dVar;
        this.f330471b = bool;
        this.f330472c = aVar;
        this.f330473d = str;
        this.f330474e = list;
        this.f330475f = list2;
        this.f330476g = bool2;
        this.f330477h = pVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f330470a, bVar.f330470a) && L.f(this.f330471b, bVar.f330471b) && L.f(this.f330472c, bVar.f330472c) && L.f(this.f330473d, bVar.f330473d) && L.f(this.f330474e, bVar.f330474e) && L.f(this.f330475f, bVar.f330475f) && L.f(this.f330476g, bVar.f330476g) && L.f(this.f330477h, bVar.f330477h);
    }

    public final int hashCode() {
        com.avito.android.widget_filters.ui.items.d dVar = this.f330470a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Boolean bool = this.f330471b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f330472c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f330473d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<n> list = this.f330474e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<o> list2 = this.f330475f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.f330476g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        p pVar = this.f330477h;
        return iHashCode7 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetFiltersLocationItemPayload(title=" + this.f330470a + ", isExpanded=" + this.f330471b + ", placeholder=" + this.f330472c + ", searchInputText=" + this.f330473d + ", fastRecentSearches=" + this.f330474e + ", suggestedLocations=" + this.f330475f + ", hasSuggestedRecentSearchItem=" + this.f330476g + ", suggestsState=" + this.f330477h + ')';
    }
}
