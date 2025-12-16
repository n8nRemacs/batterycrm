package com.avito.android.search.subscriptions;

import com.avito.android.util.K5;
import com.avito.android.util.V2;
import kotlin.Metadata;
import pu.C47140a;

/* compiled from: SearchSubscriptionSyncService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchSubscriptionSyncService f264002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47140a f264003c;

    public r(SearchSubscriptionSyncService searchSubscriptionSyncService, C47140a c47140a) {
        this.f264002b = searchSubscriptionSyncService;
        this.f264003c = c47140a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (!K5.b(th2)) {
            V2.f318762a.a("SavedSearchSyncService", "failed to save subscription to server, will upload next time", th2);
            return;
        }
        com.avito.android.db.l lVar = this.f264002b.f263852e;
        if (lVar == null) {
            lVar = null;
        }
        C47140a c47140a = this.f264003c;
        lVar.getClass();
        lVar.f132678a.getWritableDatabase().delete("saved_searches", "_id=?", new String[]{String.valueOf(c47140a.f428823a)});
    }
}
