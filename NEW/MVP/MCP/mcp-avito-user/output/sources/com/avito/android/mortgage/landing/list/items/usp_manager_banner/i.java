package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import w00.InterfaceC49409a;

/* compiled from: UspManagerBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/i;", "LTV0/d;", "Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/k;", "Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/UspManagerBannerItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements TV0.d<k, UspManagerBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49409a, G0> f200049b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC49409a, G0> lVar) {
        this.f200049b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        kVar.mF((UspManagerBannerItem) aVar);
        kVar.O2(new h(this));
    }
}
