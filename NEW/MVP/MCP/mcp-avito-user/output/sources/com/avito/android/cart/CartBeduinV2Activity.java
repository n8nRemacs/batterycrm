package com.avito.android.cart;

import Im.InterfaceC14130a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.e;
import com.avito.android.beduin.v2.page.impl.i;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartBeduinV2Activity.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart/CartBeduinV2Activity;", "Lcom/avito/android/beduin/v2/page/e;", "<init>", "()V", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartBeduinV2Activity extends e {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public i f115287m;

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        ((InterfaceC14130a.b) C29972i.a(C29972i.b(this), InterfaceC14130a.b.class)).Ce().create().b(this);
    }

    @Override // com.avito.android.beduin.v2.page.e
    @k
    public final com.avito.android.beduin.v2.page.l a2() {
        i iVar = this.f115287m;
        if (iVar != null) {
            return iVar;
        }
        return null;
    }
}
