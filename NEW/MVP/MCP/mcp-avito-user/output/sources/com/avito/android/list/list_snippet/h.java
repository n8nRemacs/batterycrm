package com.avito.android.list.list_snippet;

import Y61.k;
import com.avito.android.C31100l2;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ListSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/list_snippet/h;", "Lcom/avito/android/list/list_snippet/f;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31100l2 f181606b;

    @Inject
    public h(@k C31100l2 c31100l2) {
        this.f181606b = c31100l2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.P7();
        SuggestSnippetItem suggestSnippetItem = ((e) aVar).f181603c;
        iVar.i(suggestSnippetItem.getImage());
        iVar.e(suggestSnippetItem.getTitle());
        iVar.p(suggestSnippetItem.getPrice());
        iVar.T4(suggestSnippetItem.getOldPrice());
        iVar.p4(suggestSnippetItem.getAdditionalInfo());
        iVar.a(new g(this, suggestSnippetItem));
    }
}
