package com.avito.android.imv_goods_poll.items.list_radio_button;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RadioButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/list_radio_button/f;", "Lcom/avito/android/imv_goods_poll/items/list_radio_button/d;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.imv_goods_poll.mvi.a f170662b;

    @Inject
    public f(@k com.avito.android.imv_goods_poll.mvi.a aVar) {
        this.f170662b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.I5(new e(this, aVar2), aVar2.f170653b);
        String str = aVar2.f170654c;
        if (str != null) {
            hVar.setError(str);
        }
    }
}
