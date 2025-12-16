package com.avito.android.str_seller_orders.orders_buyer.domain;

import Y61.k;
import Y61.l;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import nz0.C44494a;
import pz0.C47173d;

/* compiled from: LoadBuyerOrdersUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/domain/f;", "Lcom/avito/android/str_seller_orders/orders_buyer/domain/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f288985a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f288986b;

    @Inject
    public f(@k d1 d1Var, @k R0 r02) {
        this.f288985a = d1Var;
        this.f288986b = r02;
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.domain.a
    @k
    public final c a(@k C47173d c47173d, @l C44494a c44494a) {
        return new c(new C43137a0(new e(2, null), new b(C43175k.I(this.f288986b.a(), C43175k.G(new d(this, c44494a, null))))), c44494a, c47173d, this);
    }
}
