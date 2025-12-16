package com.avito.android.search.subscriptions.sync;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionSyncInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f264014b;

    public e(b bVar) {
        this.f264014b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = b.f264007f;
        b bVar = this.f264014b;
        bVar.getClass();
        bVar.f264009b.k(new TV.i());
        V2.f318762a.a("SavedSearchService", "Failed to update search subscriptions", (Throwable) obj);
    }
}
