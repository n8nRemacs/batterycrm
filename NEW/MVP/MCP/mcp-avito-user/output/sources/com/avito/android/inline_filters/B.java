package com.avito.android.inline_filters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.Header;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.shortcut_navigation_bar.C34991h;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/search/InlineFilters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f170979b;

    public B(z zVar) {
        this.f170979b = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InlineActions inlineActionsC;
        DeepLink uri;
        Header header;
        Filter actionHorizontalBlock;
        InlineFilters inlineFilters = (InlineFilters) obj;
        z zVar = this.f170979b;
        zVar.f172432z = false;
        Boolean bool = Boolean.FALSE;
        zVar.f172394K.accept(bool);
        zVar.m1(inlineFilters);
        Result result = inlineFilters.getResult();
        List<String> inlinesOrder = null;
        if (result == null || (actionHorizontalBlock = result.getActionHorizontalBlock()) == null) {
            inlineActionsC = null;
        } else {
            InlineActions inlineActions = zVar.f172426t;
            inlineActionsC = C34991h.c(actionHorizontalBlock, inlineActions != null ? inlineActions.f283129e : true, zVar.f172429w);
        }
        zVar.f172426t = inlineActionsC;
        zVar.g(inlineFilters);
        Result result2 = inlineFilters.getResult();
        if (result2 != null && (header = result2.getHeader()) != null) {
            inlinesOrder = header.getInlinesOrder();
        }
        zVar.f172428v = inlinesOrder;
        Result result3 = inlineFilters.getResult();
        if (result3 != null && (uri = result3.getUri()) != null) {
            zVar.f172392I.accept(new kotlin.Q<>(uri, bool));
        }
        z.b(zVar);
        zVar.s1();
    }
}
