package com.avito.android.search_suggest;

import Pp0.InterfaceC14824b;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import com.avito.android.search_suggest.SearchSuggestFragment;
import kotlin.Metadata;

/* compiled from: SearchSuggestView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/u;", "Lcom/avito/android/lib/design/chips/Chips$e;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements Chips.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f264368a;

    public u(v vVar) {
        this.f264368a = vVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.e
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        SuggestHistoryItem suggestHistoryItem;
        String hideLink;
        if (!(hVar instanceof com.avito.android.search.e) || (hideLink = (suggestHistoryItem = ((com.avito.android.search.e) hVar).f261733b).getHideLink()) == null) {
            return;
        }
        ((SearchSuggestFragment.c) this.f264368a.f264372d).invoke(new InterfaceC14824b.d(suggestHistoryItem.getText(), hideLink));
    }
}
