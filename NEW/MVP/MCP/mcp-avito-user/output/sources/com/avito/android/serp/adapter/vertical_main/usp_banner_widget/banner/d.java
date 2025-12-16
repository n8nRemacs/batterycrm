package com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UspBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/d;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<UspBannerItem, G0> f273332b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super UspBannerItem, G0> lVar) {
        this.f273332b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UspBannerItem uspBannerItem = (UspBannerItem) aVar;
        ((e) eVar).a40(new c(this, uspBannerItem), uspBannerItem);
    }
}
