package com.avito.android.beduin.common.container.card_item;

import Y61.k;
import android.view.View;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: CardItemViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/j;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f102961b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.container.componentsPool.e f102962c;

    public j(@k h hVar, @k Wh.c cVar) {
        this.f102961b = hVar;
        this.f102962c = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new com.avito.android.beduin.common.container.componentsPool.i(hVar.getContentContainer()));
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot */
    public final View getF101723b() {
        return this.f102961b;
    }
}
