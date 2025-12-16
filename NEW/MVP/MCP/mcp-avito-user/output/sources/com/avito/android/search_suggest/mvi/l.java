package com.avito.android.search_suggest.mvi;

import Pp0.InterfaceC14825c;
import com.avito.android.arch.mvi.t;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSuggestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search_suggest/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "LPp0/c;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements t<SearchSuggestInternalAction, InterfaceC14825c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14825c b(SearchSuggestInternalAction searchSuggestInternalAction) {
        InterfaceC14825c c0870c;
        SearchSuggestInternalAction searchSuggestInternalAction2 = searchSuggestInternalAction;
        if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.CancelClicked) {
            return InterfaceC14825c.a.f13316a;
        }
        if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.DeeplinkAsNavigation) {
            c0870c = new InterfaceC14825c.b(((SearchSuggestInternalAction.DeeplinkAsNavigation) searchSuggestInternalAction2).f264328b);
        } else {
            if (!(searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.DeeplinkAsResult)) {
                if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.SearchDeeplinkLoadingFailed) {
                    return InterfaceC14825c.f.f13321a;
                }
                if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.RequestInputFocus) {
                    return InterfaceC14825c.d.f13319a;
                }
                if (searchSuggestInternalAction2 instanceof SearchSuggestInternalAction.SearchSuggestLoaded) {
                    return InterfaceC14825c.e.f13320a;
                }
                return null;
            }
            c0870c = new InterfaceC14825c.C0870c(((SearchSuggestInternalAction.DeeplinkAsResult) searchSuggestInternalAction2).f264329b);
        }
        return c0870c;
    }
}
