package com.avito.android.favorite_sellers.adapter.loading;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: LoadingItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/loading/d;", "Lcom/avito/android/favorite_sellers/adapter/loading/c;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<vC.b> f155580b;

    @Inject
    public d(@k Y1<vC.b> y12) {
        this.f155580b = y12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f155580b.K5(new vC.c(((LoadingItem) aVar).f155575b));
    }
}
