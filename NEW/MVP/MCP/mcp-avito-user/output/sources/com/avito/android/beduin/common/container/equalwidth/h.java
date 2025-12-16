package com.avito.android.beduin.common.container.equalwidth;

import Y61.k;
import android.view.View;
import com.avito.android.beduin.common.container.componentsPool.i;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: EqualWidthViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/h;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f103033b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.container.componentsPool.e f103034c;

    public h(@k g gVar, @k Wh.c cVar) {
        this.f103033b = gVar;
        this.f103034c = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new i(gVar));
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot */
    public final View getF101723b() {
        return this.f103033b;
    }
}
