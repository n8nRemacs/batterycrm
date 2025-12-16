package com.avito.android.libs.saved_searches.domain;

import TV.e;
import com.avito.android.saved_searches.model.SubscriptionResult;
import com.avito.android.util.P2;
import com.avito.android.util.T2;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T> implements l41.g {
    @Override // l41.g
    public final void accept(Object obj) {
        SubscriptionResult subscriptionResult = (SubscriptionResult) T2.a((P2) obj);
        String filterId = subscriptionResult != null ? subscriptionResult.getFilterId() : null;
        if (filterId != null) {
            new e.a(filterId);
            throw null;
        }
        new e.b(null);
        throw null;
    }
}
