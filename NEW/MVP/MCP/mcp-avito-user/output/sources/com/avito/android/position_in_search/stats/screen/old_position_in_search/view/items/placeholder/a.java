package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.placeholder;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PlaceholderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/placeholder/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WU.a f221051c;

    public a(@k String str, @k WU.a aVar) {
        this.f221050b = str;
        this.f221051c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221050b, aVar.f221050b) && L.f(this.f221051c, aVar.f221051c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217853b() {
        return this.f221050b;
    }

    public final int hashCode() {
        return this.f221051c.hashCode() + (this.f221050b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PlaceholderItem(stringId=" + this.f221050b + ", placeholderState=" + this.f221051c + ')';
    }
}
