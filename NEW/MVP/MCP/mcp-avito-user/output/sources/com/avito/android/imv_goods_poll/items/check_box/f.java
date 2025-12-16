package com.avito.android.imv_goods_poll.items.check_box;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckboxItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/check_box/f;", "Lcom/avito/android/imv_goods_poll/items/check_box/d;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_goods_poll.mvi.a f170642b;

    @Inject
    public f(@Y61.k com.avito.android.imv_goods_poll.mvi.a aVar) {
        this.f170642b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.I5(new e(this, aVar2), aVar2.f170633b);
        String str = aVar2.f170634c;
        if (str != null) {
            hVar.setError(str);
        }
    }
}
