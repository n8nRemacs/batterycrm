package com.avito.android.search_suggest.mvi;

import Op0.C14723a;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import com.avito.android.remote.model.search.suggest.BubblesSuggestItem;
import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestBubbleItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import com.avito.android.remote.model.search.suggest.SuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.TextSuggestItem;
import com.avito.android.remote.model.search.suggest.TitleSuggestItem;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import com.avito.android.search.q;
import com.avito.android.search.r;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSuggestReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search_suggest/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "LPp0/d;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements u<SearchSuggestInternalAction, Pp0.d> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Pp0.d a(SearchSuggestInternalAction searchSuggestInternalAction, Pp0.d dVar) {
        Object next;
        List<SuggestBubbleItem> items;
        Object next2;
        SearchSuggestInternalAction searchSuggestInternalAction2 = searchSuggestInternalAction;
        Pp0.d dVar2 = dVar;
        if (!(searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.SearchSuggestLoaded)) {
            if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.SuggestNewQuery) {
                SearchSuggestInternalAction.SuggestNewQuery suggestNewQuery = (SearchSuggestInternalAction.SuggestNewQuery) searchSuggestInternalAction2;
                return Pp0.d.a(dVar2, suggestNewQuery.f264334b, null, null, null, suggestNewQuery.f264334b.length() > 0 && (suggestNewQuery.f264335c || dVar2.f13327f), null, 46);
            }
            if (!(searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.RemoveHistorySearch)) {
                return dVar2;
            }
            HistorySuggestItem historySuggestItem = dVar2.f13326e;
            List<SuggestHistoryItem> items2 = historySuggestItem.getItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : items2) {
                if (!L.f(((SuggestHistoryItem) obj).getText(), ((SearchSuggestInternalAction.RemoveHistorySearch) searchSuggestInternalAction2).f264330b)) {
                    arrayList.add(obj);
                }
            }
            return Pp0.d.a(dVar2, null, null, null, new HistorySuggestItem(arrayList, historySuggestItem.getRowLimit()), false, null, 55);
        }
        com.avito.android.search.o oVar = ((SearchSuggestInternalAction.SearchSuggestLoaded) searchSuggestInternalAction2).f264333b;
        ArrayList arrayList2 = oVar.f263832b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                C14723a c14723a = new C14723a();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next instanceof BubblesSuggestItem) {
                        break;
                    }
                }
                if (!(next instanceof BubblesSuggestItem)) {
                    next = null;
                }
                BubblesSuggestItem bubblesSuggestItem = (BubblesSuggestItem) next;
                if (bubblesSuggestItem == null || (items = bubblesSuggestItem.getItems()) == null) {
                    items = C42784z0.f406748b;
                }
                Q q12 = new Q(c14723a, items);
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (next2 instanceof HistorySuggestItem) {
                        break;
                    }
                }
                HistorySuggestItem historySuggestItem2 = (HistorySuggestItem) (next2 instanceof HistorySuggestItem ? next2 : null);
                return Pp0.d.a(dVar2, null, arrayList3, q12, historySuggestItem2 == null ? new HistorySuggestItem(C42784z0.f406748b, 0) : historySuggestItem2, false, oVar.f263831a.f263833a, 17);
            }
            Object next3 = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SuggestItem suggestItem = (SuggestItem) next3;
            String strValueOf = String.valueOf(i12);
            if (suggestItem instanceof TextSuggestItem) {
                arrayList3.add(new q(strValueOf, (TextSuggestItem) suggestItem));
            } else if (suggestItem instanceof RedesignTextSuggestItem) {
                arrayList3.add(new com.avito.android.list.new_text_suggest.a(strValueOf, (RedesignTextSuggestItem) suggestItem));
            } else if (suggestItem instanceof GapSuggestItem) {
                arrayList3.add(new com.avito.android.search.d(strValueOf, (GapSuggestItem) suggestItem));
            } else if (suggestItem instanceof TitleSuggestItem) {
                arrayList3.add(new r(strValueOf, (TitleSuggestItem) suggestItem));
            } else if (suggestItem instanceof BannerSuggestItem) {
                arrayList3.add(new com.avito.android.search.a(strValueOf, (BannerSuggestItem) suggestItem));
            } else if (suggestItem instanceof ToggleSuggestItem) {
                arrayList3.add(new com.avito.android.list.toggle.d(strValueOf, (ToggleSuggestItem) suggestItem));
            } else if (suggestItem instanceof SuggestSnippetItem) {
                arrayList3.add(new com.avito.android.list.list_snippet.e(strValueOf, (SuggestSnippetItem) suggestItem));
            } else if (suggestItem instanceof GridSuggestSnippetItem) {
                com.avito.android.search.l lVar = (com.avito.android.search.l) C42745f0.Q(arrayList3);
                if (lVar instanceof com.avito.android.list.grid_snippet.d) {
                    ArrayList arrayList4 = new ArrayList(((com.avito.android.list.grid_snippet.d) lVar).f181569c);
                    arrayList4.add(new com.avito.android.list.grid_snippet.item.c(strValueOf, (GridSuggestSnippetItem) suggestItem));
                    arrayList3.remove(lVar);
                    arrayList3.add(new com.avito.android.list.grid_snippet.d(strValueOf, arrayList4));
                } else {
                    arrayList3.add(new com.avito.android.list.grid_snippet.d(strValueOf, Collections.singletonList(new com.avito.android.list.grid_snippet.item.c(strValueOf, (GridSuggestSnippetItem) suggestItem))));
                }
            }
            i12 = i13;
        }
    }
}
