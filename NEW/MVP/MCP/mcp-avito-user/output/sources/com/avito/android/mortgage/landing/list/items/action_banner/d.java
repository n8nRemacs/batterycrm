package com.avito.android.mortgage.landing.list.items.action_banner;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import w00.InterfaceC49409a;

/* compiled from: ActionBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/action_banner/d;", "LTV0/d;", "Lcom/avito/android/mortgage/landing/list/items/action_banner/f;", "Lcom/avito/android/mortgage/landing/list/items/action_banner/ActionBannerItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.d<f, ActionBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC49409a, G0> f199659b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC49409a, G0> lVar) {
        this.f199659b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ActionBannerItem actionBannerItem = (ActionBannerItem) aVar;
        fVar.e(actionBannerItem.f199646d);
        fVar.g(actionBannerItem.f199647e);
        fVar.i(actionBannerItem.f199645c);
        fVar.lY(actionBannerItem.f199648f.f199651b);
        fVar.a0(new c(actionBannerItem, this));
    }
}
