package com.avito.android.bxcontent.last_search_tooltip;

import com.avito.android.bxcontent.last_search_tooltip.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ls0.C43826b;
import ls0.C43827c;

/* compiled from: LastSearchTooltipMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/k;", "Lcom/avito/android/bxcontent/last_search_tooltip/j;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements j {
    @Inject
    public k() {
    }

    @Override // com.avito.android.bxcontent.last_search_tooltip.j
    @Y61.k
    public final a a(@Y61.k C43826b c43826b) {
        String title = c43826b.getTitle();
        String strO = C42745f0.O(c43826b.a(), null, null, null, null, 63);
        C43827c searchButton = c43826b.getSearchButton();
        return new a(title, strO, new a.C3279a(searchButton.getText(), searchButton.getDeeplink()));
    }
}
