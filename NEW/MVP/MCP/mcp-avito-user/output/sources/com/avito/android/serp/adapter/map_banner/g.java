package com.avito.android.serp.adapter.map_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: MapBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/map_banner/g;", "Lcom/avito/android/serp/adapter/map_banner/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f270298b;

    @Inject
    public g(@k h31.e<InterfaceC47690b> eVar) {
        this.f270298b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        MapBannerItem mapBannerItem = (MapBannerItem) aVar;
        iVar.i(mapBannerItem.f270289g);
        iVar.setTitle(mapBannerItem.f270288f);
        iVar.Wb(mapBannerItem.f270286d, new f(this, mapBannerItem));
    }
}
