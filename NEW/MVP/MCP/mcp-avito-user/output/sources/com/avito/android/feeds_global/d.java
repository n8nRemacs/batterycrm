package com.avito.android.feeds_global;

import androidx.compose.runtime.internal.P;
import com.avito.android.feeds_global.FeedsGlobalWidget;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FeedsConverterImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feeds_global/d;", "Lcom/avito/android/feeds_global/c;", "<init>", "()V", "_avito_bx-content_widget_feeds-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.serp.b
    @Y61.k
    public final Class<FeedsGlobalWidget> a() {
        return FeedsGlobalWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        String feedId;
        List<FeedsGlobalWidget.FeedsTab> listC = ((FeedsGlobalWidget) serpElement).c();
        FeedsGlobalWidget.FeedsTab feedsTab = listC != null ? (FeedsGlobalWidget.FeedsTab) C42745f0.G(listC) : null;
        String title = feedsTab != null ? feedsTab.getTitle() : null;
        if (title == null) {
            title = "";
        }
        if (feedsTab == null || (feedId = feedsTab.getFeedId()) == null) {
            feedId = title;
        }
        return new g(title, feedId);
    }
}
