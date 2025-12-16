package com.avito.android.search.subscriptions.adapter;

import com.avito.android.search.subscriptions.adapter.e;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/subscriptions/adapter/i;", "Lcom/avito/android/search/subscriptions/adapter/e;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<e.a> f263879b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<Long> f263880c;

    @Inject
    public i(@Y61.k h31.e<e.a> eVar, @Y61.k InterfaceC35945t1<Long> interfaceC35945t1) {
        this.f263879b = eVar;
        this.f263880c = interfaceC35945t1;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        d dVar = (d) aVar;
        kVar.setTitle(dVar.f263865c);
        kVar.h(dVar.f263866d);
        if (dVar.f263868f) {
            kVar.t50(true);
            kVar.VR(true);
        } else {
            kVar.t50(false);
            kVar.VR(false);
        }
        long j12 = dVar.f263867e;
        if (j12 > 0) {
            kVar.b0(this.f263880c.a(Long.valueOf(j12)));
        } else {
            kVar.b0(null);
        }
        kVar.J0(new f(dVar, this, kVar));
        kVar.VQ(new g(this, dVar));
        kVar.ig(new h(this, dVar));
    }
}
