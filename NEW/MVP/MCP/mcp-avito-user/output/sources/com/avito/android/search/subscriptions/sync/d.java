package com.avito.android.search.subscriptions.sync;

import com.avito.android.analytics.event.C28449x0;
import com.avito.android.saved_searches.model.SearchSubscription;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionSyncInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f264013b;

    public d(b bVar) {
        this.f264013b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = b.f264007f;
        b bVar = this.f264013b;
        bVar.getClass();
        TV.i iVar = new TV.i();
        TV.c cVar = bVar.f264009b;
        cVar.k(iVar);
        Iterator it = ((List) obj).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((SearchSubscription) it.next()).f258377f) {
                i13++;
            }
        }
        cVar.e(new C28449x0(i13));
    }
}
