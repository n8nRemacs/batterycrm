package com.avito.android.beduin.common.container.layered;

import android.view.View;
import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: BeduinLayeredViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/i;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ForegroundFrameLayout f103150b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.container.componentsPool.e f103151c;

    public i(@Y61.k ForegroundFrameLayout foregroundFrameLayout, @Y61.k Wh.c cVar) {
        this.f103150b = foregroundFrameLayout;
        this.f103151c = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new com.avito.android.beduin.common.container.componentsPool.i(foregroundFrameLayout));
    }

    @Override // ej.InterfaceC40116e
    @Y61.k
    /* renamed from: getRoot */
    public final View getF101723b() {
        return this.f103150b;
    }
}
