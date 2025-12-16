package com.avito.android.beduin.common.component.grid_snippet;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.n;
import com.avito.android.constructor_advert.ui.serp.constructor.x;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinConstructorAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet/c;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/x;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends x<ConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101382h;

    @Inject
    public c(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k C36135w2 c36135w2, @k InterfaceC28373a interfaceC28373a, @com.avito.android.constructor_advert.ui.serp.constructor.e @k com.avito.android.constructor_advert.ui.serp.constructor.h hVar, @com.avito.android.constructor_advert.ui.serp.constructor.e @k Kundle kundle, @k com.avito.android.player_holder.a aVar) {
        super(c36135w2, interfaceC28373a, hVar, null, kundle, aVar);
        this.f101382h = interfaceC15523b;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void h0(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem, int i12) {
        String string;
        DeepLink deepLink = constructorAdvertItem.getDeepLink();
        if (deepLink == null || (string = deepLink.toString()) == null) {
            return;
        }
        this.f101382h.o(new BeduinOpenLinkAction(string, null, 2, null));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void O(@k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void V(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void i0(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void k(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void n0(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void o0(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void p0(@k n nVar, @k ConstructorAdvertItem constructorAdvertItem) {
    }
}
