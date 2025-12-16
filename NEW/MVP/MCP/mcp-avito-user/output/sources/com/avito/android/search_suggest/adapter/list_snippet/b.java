package com.avito.android.search_suggest.adapter.list_snippet;

import Pp0.InterfaceC14824b;
import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.list.list_snippet.f;
import com.avito.android.list.list_snippet.i;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ListSnippetPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/list_snippet/b;", "Lcom/avito/android/list/list_snippet/f;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264157b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar) {
        this.f264157b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.list.list_snippet.e eVar2 = (com.avito.android.list.list_snippet.e) aVar;
        iVar.P7();
        SuggestSnippetItem suggestSnippetItem = eVar2.f181603c;
        iVar.i(suggestSnippetItem.getImage());
        iVar.e(suggestSnippetItem.getTitle());
        iVar.p(suggestSnippetItem.getPrice());
        iVar.T4(suggestSnippetItem.getOldPrice());
        iVar.p4(suggestSnippetItem.getAdditionalInfo());
        iVar.a(new a(this, suggestSnippetItem, eVar2));
    }
}
