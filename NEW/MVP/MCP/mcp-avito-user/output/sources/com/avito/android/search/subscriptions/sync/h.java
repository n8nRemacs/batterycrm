package com.avito.android.search.subscriptions.sync;

import Y61.k;
import android.content.Context;
import androidx.work.C23544h;
import androidx.work.J;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import androidx.work.impl.utils.C23593c;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionSyncRunnerImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/subscriptions/sync/h;", "LVV/a;", "<init>", "()V", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements VV.a {
    @Inject
    public h() {
    }

    @Override // VV.a
    public final void a(@k Context context) {
        SearchSubscriptionWorker.f264004c.getClass();
        Context applicationContext = context.getApplicationContext();
        J.a aVar = new J.a(SearchSubscriptionWorker.class);
        C23544h.a aVar2 = new C23544h.a();
        aVar2.c("updateMode", 2L);
        J jB2 = aVar.h(aVar2.a()).a("SearchSubscriptionWorker").b();
        WorkManager.f55428a.getClass();
        Y yF2 = Y.f(applicationContext);
        C23593c.e(yF2, "SearchSubscriptionWorker");
        yF2.e(Collections.singletonList(jB2));
    }
}
