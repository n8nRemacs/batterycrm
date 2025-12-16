package com.avito.android.search_suggest.adapter.grid_snippet;

import Pp0.InterfaceC14824b;
import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.list.grid_snippet.item.d;
import com.avito.android.list.grid_snippet.item.h;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GridSnippetPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/grid_snippet/b;", "Lcom/avito/android/list/grid_snippet/item/d;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264152b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar) {
        this.f264152b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        com.avito.android.list.grid_snippet.item.c cVar = (com.avito.android.list.grid_snippet.item.c) aVar;
        hVar.P7();
        GridSuggestSnippetItem gridSuggestSnippetItem = cVar.f181579c;
        hVar.i(gridSuggestSnippetItem.getImage());
        hVar.e(gridSuggestSnippetItem.getTitle());
        hVar.p(gridSuggestSnippetItem.getPrice());
        hVar.T4(gridSuggestSnippetItem.getOldPrice());
        hVar.p4(gridSuggestSnippetItem.getAdditionalInfo());
        hVar.a(new a(this, gridSuggestSnippetItem, cVar));
    }
}
