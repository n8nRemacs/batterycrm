package com.avito.android.advert_stats.detail.tab.items.button;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import eb.InterfaceC40078a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/d;", "Lcom/avito/android/advert_stats/detail/tab/items/button/c;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40078a, G0> f86252b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f86253c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f86254d = new com.jakewharton.rxrelay3.c<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC40078a, G0> lVar) {
        this.f86252b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).kf(((ButtonItem) aVar).f86245c, this.f86253c, this.f86254d, this.f86252b);
    }
}
