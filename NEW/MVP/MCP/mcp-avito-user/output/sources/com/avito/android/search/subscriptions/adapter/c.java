package com.avito.android.search.subscriptions.adapter;

import com.avito.android.saved_searches.model.SearchSubscription;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionDataSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/subscriptions/adapter/c;", "LUV0/a;", "Lcom/avito/android/search/subscriptions/adapter/d;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements UV0.a<d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UV0.c f263863b;

    public c(@Y61.k UV0.c cVar) {
        this.f263863b = cVar;
    }

    @Override // UV0.a
    public final int getCount() {
        return this.f263863b.getCount();
    }

    @Override // UV0.a
    public final d getItem(int i12) {
        SearchSubscription searchSubscription = (SearchSubscription) this.f263863b.f16399b.get(i12);
        return new d(searchSubscription.f258373b, searchSubscription.f258374c, searchSubscription.f258375d, searchSubscription.f258376e, searchSubscription.f258377f, searchSubscription.f258379h, searchSubscription.f258381j, searchSubscription.f258382k);
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        return this.f263863b.f16399b.isEmpty();
    }
}
