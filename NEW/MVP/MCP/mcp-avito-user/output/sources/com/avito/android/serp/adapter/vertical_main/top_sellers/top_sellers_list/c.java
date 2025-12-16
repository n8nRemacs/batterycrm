package com.avito.android.serp.adapter.vertical_main.top_sellers.top_sellers_list;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: TopSellerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/top_sellers_list/c;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/top_sellers_list/e;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/top_sellers_list/TopSellerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<e, TopSellerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f273274b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f273275c;

    @Inject
    public c(@k g gVar, @k h31.e eVar) {
        this.f273274b = eVar;
        this.f273275c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        TopSellerItem topSellerItem = (TopSellerItem) aVar;
        C c12 = new C(this, topSellerItem, i12, 17);
        C35949t5.c(eVar2.f273280d, com.avito.android.image_loader.b.b(topSellerItem.f273264d), null, null, null, 14);
        eVar2.f273279c.setText(topSellerItem.f273265e);
        eVar2.f273278b.setOnClickListener(c12);
    }
}
