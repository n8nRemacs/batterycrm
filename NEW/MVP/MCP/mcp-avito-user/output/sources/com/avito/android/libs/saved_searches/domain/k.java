package com.avito.android.libs.saved_searches.domain;

import com.avito.android.saved_searches.model.SearchSubscription;
import com.avito.android.saved_searches.model.SubscriptionResult;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", "it", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class k<T, R> implements l41.o {
    static {
        new k();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        SearchSubscription searchSubscription = (SearchSubscription) obj;
        return new SubscriptionResult(searchSubscription.f258373b, searchSubscription.f258381j, null, 4, null);
    }
}
