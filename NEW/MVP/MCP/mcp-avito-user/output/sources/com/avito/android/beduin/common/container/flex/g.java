package com.avito.android.beduin.common.container.flex;

import Y61.k;
import android.view.View;
import com.avito.android.beduin.common.container.componentsPool.i;
import com.google.android.flexbox.FlexboxLayout;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: BeduinFlexViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/g;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final FlexboxLayout f103057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.container.componentsPool.e f103058c;

    public g(@k FlexboxLayout flexboxLayout, @k Wh.c cVar) {
        this.f103057b = flexboxLayout;
        this.f103058c = new com.avito.android.beduin.common.container.componentsPool.e(cVar, new i(flexboxLayout));
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot */
    public final View getF101723b() {
        return this.f103057b;
    }
}
