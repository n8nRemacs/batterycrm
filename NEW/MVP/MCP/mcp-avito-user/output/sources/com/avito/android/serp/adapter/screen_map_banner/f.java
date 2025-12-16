package com.avito.android.serp.adapter.screen_map_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: ScreenMapBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/screen_map_banner/f;", "Lcom/avito/android/serp/adapter/screen_map_banner/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f271573b;

    @Inject
    public f(@k h31.e<InterfaceC47690b> eVar) {
        this.f271573b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ScreenMapBannerItem screenMapBannerItem = (ScreenMapBannerItem) aVar;
        hVar.i(screenMapBannerItem.f271563e);
        hVar.a(new e(screenMapBannerItem, this));
    }
}
