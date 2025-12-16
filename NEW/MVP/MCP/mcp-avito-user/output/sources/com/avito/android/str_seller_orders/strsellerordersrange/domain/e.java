package com.avito.android.str_seller_orders.strsellerordersrange.domain;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import ez0.InterfaceC40183a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrSellerOrdersRangeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/domain/e;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/domain/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f290255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40183a f290256b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f290257c;

    @Inject
    public e(@k InterfaceC28373a interfaceC28373a, @k InterfaceC40183a interfaceC40183a, @k R0 r02) {
        this.f290255a = interfaceC28373a;
        this.f290256b = interfaceC40183a;
        this.f290257c = r02;
    }

    @Override // com.avito.android.str_seller_orders.strsellerordersrange.domain.b
    @l
    public final InterfaceC43160i a(@k String str, @k String str2, @k String str3) {
        return C43175k.I(this.f290257c.a(), new C43152f0(C43175k.G(new c(this, str3, str, str2, null)), new d(this, null)));
    }
}
