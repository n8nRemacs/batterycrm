package one.me.search.usecase;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/search/usecase/InvalidSearchResultMarkerException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "search_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InvalidSearchResultMarkerException extends IllegalStateException {
    public InvalidSearchResultMarkerException(String str) {
        super("invalid search result marker: ".concat(str));
    }
}
