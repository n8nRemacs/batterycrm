package com.avito.android.db;

import com.avito.android.saved_searches.model.SearchSubscription;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionDao.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/db/n;", "", "_avito-discouraged_persistence_search-subscription"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface n {
    void a();

    void k(@Y61.k String str);

    void p(@Y61.k SearchSubscription searchSubscription);

    int q();

    void s(@Y61.k List<SearchSubscription> list);
}
