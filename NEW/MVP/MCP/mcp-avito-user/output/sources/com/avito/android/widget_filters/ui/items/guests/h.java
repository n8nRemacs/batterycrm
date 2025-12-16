package com.avito.android.widget_filters.ui.items.guests;

import androidx.appcompat.app.r;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersGuestsWidgetItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/guests/h;", "Lcom/avito/android/widget_filters/ui/items/i;", "Lcom/avito/android/widget_filters/ui/items/b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h implements com.avito.android.widget_filters.ui.items.i, com.avito.android.widget_filters.ui.items.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f330423b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.widget_filters.ui.items.d f330424c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final a f330425d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f330426e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final NP0.j f330427f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final NP0.b f330428g;

    public h(@Y61.l String str, @Y61.l com.avito.android.widget_filters.ui.items.d dVar, @Y61.l a aVar, boolean z12, @Y61.l NP0.j jVar, @Y61.l NP0.b bVar) {
        this.f330423b = str;
        this.f330424c = dVar;
        this.f330425d = aVar;
        this.f330426e = z12;
        this.f330427f = jVar;
        this.f330428g = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        return L.f(this.f330423b, hVar.f330423b) && this.f330424c.equals(hVar.f330424c) && L.f(this.f330425d, hVar.f330425d) && this.f330426e == hVar.f330426e && L.f(this.f330427f, hVar.f330427f) && L.f(this.f330428g, hVar.f330428g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF130049b() {
        return "guestsId";
    }

    public final int hashCode() {
        String str = this.f330423b;
        int iHashCode = (this.f330424c.hashCode() + (((-887298390) + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        a aVar = this.f330425d;
        int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f330426e);
        NP0.j jVar = this.f330427f;
        int iHashCode2 = (i12 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        NP0.b bVar = this.f330428g;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "WidgetFiltersGuestsWidgetItem(stringId=guestsId, widgetId=" + this.f330423b + ", title=" + this.f330424c + ", placeholder=" + this.f330425d + ", isExpanded=" + this.f330426e + ", guestsParameter=" + this.f330427f + ", animalsParameter=" + this.f330428g + ')';
    }
}
