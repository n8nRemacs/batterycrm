package com.avito.android.inline_filters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_inline-filters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class S {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.remote.model.search.Filter.Onboarding a(com.avito.android.remote.model.search.InlineFilters r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L5
            goto L66
        L5:
            if (r4 == 0) goto L43
            com.avito.android.remote.model.search.Result r1 = r4.getResult()
            if (r1 == 0) goto L43
            java.util.List r1 = r1.getFilters()
            if (r1 == 0) goto L43
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.avito.android.remote.model.search.Filter r3 = (com.avito.android.remote.model.search.Filter) r3
            com.avito.android.remote.model.search.Filter$Onboarding r3 = c(r3)
            if (r3 == 0) goto L31
            java.lang.String r3 = r3.getOnceShowId()
            goto L32
        L31:
            r3 = r0
        L32:
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 == 0) goto L19
            goto L3a
        L39:
            r2 = r0
        L3a:
            com.avito.android.remote.model.search.Filter r2 = (com.avito.android.remote.model.search.Filter) r2
            if (r2 == 0) goto L43
            com.avito.android.remote.model.search.Filter$Onboarding r1 = c(r2)
            goto L44
        L43:
            r1 = r0
        L44:
            if (r4 == 0) goto L5d
            com.avito.android.remote.model.search.Result r4 = r4.getResult()
            if (r4 == 0) goto L5d
            com.avito.android.remote.model.search.Filter$Onboarding r4 = r4.getFiltersButtonOnboarding()
            if (r4 == 0) goto L5d
            java.lang.String r2 = r4.getOnceShowId()
            boolean r5 = kotlin.jvm.internal.L.f(r2, r5)
            if (r5 == 0) goto L5d
            goto L5e
        L5d:
            r4 = r0
        L5e:
            if (r1 != 0) goto L65
            if (r4 != 0) goto L63
            goto L66
        L63:
            r0 = r4
            goto L66
        L65:
            r0 = r1
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.S.a(com.avito.android.remote.model.search.InlineFilters, java.lang.String):com.avito.android.remote.model.search.Filter$Onboarding");
    }

    public static final SerpSpaceType b(InlineFilters inlineFilters) {
        Result result;
        DeepLink uri = (inlineFilters == null || (result = inlineFilters.getResult()) == null) ? null : result.getUri();
        ItemsSearchLink itemsSearchLink = uri instanceof ItemsSearchLink ? (ItemsSearchLink) uri : null;
        if (itemsSearchLink != null) {
            return itemsSearchLink.f133416o;
        }
        return null;
    }

    public static final Filter.Onboarding c(Filter filter) {
        Filter.Config config;
        Filter.Displaying displaying;
        Filter.Widget widget = filter.getWidget();
        if (widget == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null) {
            return null;
        }
        return displaying.getOnboarding();
    }
}
