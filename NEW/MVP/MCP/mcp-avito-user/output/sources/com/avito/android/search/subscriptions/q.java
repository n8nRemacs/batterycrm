package com.avito.android.search.subscriptions;

import kotlin.Metadata;
import pu.C47140a;

/* compiled from: SearchSubscriptionSyncService.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchSubscriptionSyncService f264000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47140a f264001c;

    public q(SearchSubscriptionSyncService searchSubscriptionSyncService, C47140a c47140a) {
        this.f264000b = searchSubscriptionSyncService;
        this.f264001c = c47140a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.db.l lVar = this.f264000b.f263852e;
        if (lVar == null) {
            lVar = null;
        }
        C47140a c47140a = this.f264001c;
        lVar.getClass();
        lVar.f132678a.getWritableDatabase().delete("saved_searches", "_id=?", new String[]{String.valueOf(c47140a.f428823a)});
    }
}
