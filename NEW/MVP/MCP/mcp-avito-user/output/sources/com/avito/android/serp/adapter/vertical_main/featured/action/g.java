package com.avito.android.serp.adapter.vertical_main.featured.action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import js0.d;
import kotlin.Metadata;

/* compiled from: FeaturedActionPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/action/g;", "Lcom/avito/android/serp/adapter/vertical_main/featured/action/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272823b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f272824c = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g(@k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f272823b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((i) eVar).Dw((FeaturedActionItem) aVar, i12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.action.d
    public final void k(@k FeaturedActionItem featuredActionItem, int i12) {
        d.a.a(this.f272823b, Integer.valueOf(i12), featuredActionItem.f272809j, featuredActionItem.f272801b + ", " + featuredActionItem.f272802c, null, null, null, featuredActionItem.f272810k, featuredActionItem.f272811l, 56);
        this.f272824c.accept(featuredActionItem.f272803d);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.action.f
    @k
    public final z<DeepLink> v4() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f272824c;
        return l.l(cVar, cVar);
    }
}
