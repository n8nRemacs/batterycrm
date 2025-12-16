package com.avito.android.search;

import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: GapSearchItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/d;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f261731b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GapSuggestItem f261732c;

    public d(@Y61.k String str, @Y61.k GapSuggestItem gapSuggestItem) {
        this.f261731b = str;
        this.f261732c = gapSuggestItem;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162223b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173753b() {
        return this.f261731b;
    }
}
