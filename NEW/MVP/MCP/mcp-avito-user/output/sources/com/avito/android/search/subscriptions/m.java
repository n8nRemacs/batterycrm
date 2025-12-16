package com.avito.android.search.subscriptions;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionServiceInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/subscriptions/m;", "Lcom/avito/android/search/subscriptions/l;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f263994a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VV.a f263995b;

    @Inject
    public m(@Y61.k Context context, @Y61.k VV.a aVar) {
        this.f263994a = context;
        this.f263995b = aVar;
    }

    @Override // com.avito.android.search.subscriptions.l
    public final void a() {
        this.f263995b.a(this.f263994a);
    }
}
