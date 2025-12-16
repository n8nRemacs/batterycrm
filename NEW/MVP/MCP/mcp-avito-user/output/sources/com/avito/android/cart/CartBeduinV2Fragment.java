package com.avito.android.cart;

import Im.InterfaceC14130a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment;
import com.avito.android.beduin.v2.page.impl.D;
import com.avito.android.beduin.v2.page.p;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartBeduinV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart/CartBeduinV2Fragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinV2TabPageFragment;", "<init>", "()V", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartBeduinV2Fragment extends BaseBeduinV2TabPageFragment {

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public D f115288t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final NavigationState f115289u0 = new NavigationState(false, null, 2, null);

    @Override // com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment
    @k
    public final p D5() {
        D d12 = this.f115288t0;
        if (d12 != null) {
            return d12;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        ((InterfaceC14130a.b) C29972i.a(C29972i.b(this), InterfaceC14130a.b.class)).Ce().create().a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF115289u0() {
        return this.f115289u0;
    }
}
