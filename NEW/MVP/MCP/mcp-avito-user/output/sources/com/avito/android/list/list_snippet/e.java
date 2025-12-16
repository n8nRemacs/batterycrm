package com.avito.android.list.list_snippet;

import Y61.k;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import com.avito.android.search.l;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: ListSnippetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/list_snippet/e;", "Lcom/avito/android/search/l;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f181602b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SuggestSnippetItem f181603c;

    public e(@k String str, @k SuggestSnippetItem suggestSnippetItem) {
        this.f181602b = str;
        this.f181603c = suggestSnippetItem;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF181602b() {
        return this.f181602b;
    }
}
