package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PanelFlatCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/d;", "LTV0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/f;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        fVar.f313742b.setText(aVar2.getHeader().k0(fVar.itemView.getContext()));
        fVar.f313743c.setText(aVar2.getValue().k0(fVar.itemView.getContext()));
    }
}
