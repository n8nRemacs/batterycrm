package com.avito.android.list.grid_snippet;

import Y61.k;
import com.avito.android.search.l;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GridSnippetsBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/grid_snippet/d;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f181568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.android.list.grid_snippet.item.c> f181569c;

    public d(@k String str, @k List<com.avito.android.list.grid_snippet.item.c> list) {
        this.f181568b = str;
        this.f181569c = list;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162223b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173753b() {
        return this.f181568b;
    }
}
