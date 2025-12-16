package com.avito.android.list.grid_snippet.item;

import Y61.k;
import com.avito.android.C31100l2;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GridSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/grid_snippet/item/f;", "Lcom/avito/android/list/grid_snippet/item/d;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31100l2 f181582b;

    @Inject
    public f(@k C31100l2 c31100l2) {
        this.f181582b = c31100l2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        hVar.P7();
        GridSuggestSnippetItem gridSuggestSnippetItem = ((c) aVar).f181579c;
        hVar.i(gridSuggestSnippetItem.getImage());
        hVar.e(gridSuggestSnippetItem.getTitle());
        hVar.p(gridSuggestSnippetItem.getPrice());
        hVar.T4(gridSuggestSnippetItem.getOldPrice());
        hVar.p4(gridSuggestSnippetItem.getAdditionalInfo());
        hVar.a(new e(this, gridSuggestSnippetItem));
    }
}
