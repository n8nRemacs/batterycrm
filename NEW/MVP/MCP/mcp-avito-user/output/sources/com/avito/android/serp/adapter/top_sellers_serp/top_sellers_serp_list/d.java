package com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: TopSellerSerpPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/top_sellers_serp_list/d;", "LTV0/d;", "Lcom/avito/android/serp/adapter/top_sellers_serp/top_sellers_serp_list/f;", "Lcom/avito/android/serp/adapter/top_sellers_serp/top_sellers_serp_list/TopSellerSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, TopSellerSerpItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272497b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f272498c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.a f272499d;

    @Inject
    public d(@k h31.e<InterfaceC47690b> eVar, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.analytics.provider.a aVar) {
        this.f272497b = eVar;
        this.f272498c = interfaceC28373a;
        this.f272499d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        TopSellerSerpItem topSellerSerpItem = (TopSellerSerpItem) aVar;
        c cVar = new c(this, topSellerSerpItem);
        C35949t5.c(fVar.f272506d, com.avito.android.image_loader.b.b(topSellerSerpItem.f272488d), null, null, null, 14);
        fVar.f272505c.setText(topSellerSerpItem.f272489e);
        fVar.f272504b.setOnClickListener(new i(14, cVar));
    }
}
