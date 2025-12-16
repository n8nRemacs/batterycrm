package com.avito.android.orders.feature.beduin_orders_list;

import Y61.k;
import Y61.l;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import n50.InterfaceC44197c;

/* compiled from: GeneralOrdersTabFragmentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/g;", "Ln50/c;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements InterfaceC44197c {
    @Inject
    public g() {
    }

    @Override // n50.InterfaceC44197c
    @k
    public final Fragment a(@l String str, @l String str2) {
        BeduinOrdersFragment.f209960E0.getClass();
        BeduinOrdersFragment beduinOrdersFragment = new BeduinOrdersFragment();
        beduinOrdersFragment.setArguments(C22777e.b(new Q("order_owner_type_key", str2)));
        return beduinOrdersFragment;
    }
}
