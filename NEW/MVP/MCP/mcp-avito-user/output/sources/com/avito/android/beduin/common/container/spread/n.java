package com.avito.android.beduin.common.container.spread;

import android.view.View;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: SpreadViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/n;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BeduinSpreadLayout f103212b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.container.componentsPool.e f103213c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.container.componentsPool.e f103214d;

    public n(@Y61.k BeduinSpreadLayout beduinSpreadLayout, @Y61.k Wh.c cVar) {
        this.f103212b = beduinSpreadLayout;
        this.f103213c = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new com.avito.android.beduin.common.container.componentsPool.i(beduinSpreadLayout.getLeftPart()));
        this.f103214d = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new com.avito.android.beduin.common.container.componentsPool.i(beduinSpreadLayout.getRightPart()));
    }

    @Override // ej.InterfaceC40116e
    @Y61.k
    /* renamed from: getRoot */
    public final View getF103243b() {
        return this.f103212b;
    }
}
