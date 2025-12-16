package com.avito.android.payment.lib;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: PaymentMethodsViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/A;", "Landroidx/lifecycle/P0$c;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f214518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D f214519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.e f214520c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C33020e f214521d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.processing.y f214522e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PaymentSessionType f214523f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f214524g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f214525h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f214526i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f214527j;

    public A(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k D d12, @Y61.k com.avito.android.payment.e eVar, @Y61.k C33020e c33020e, @Y61.k com.avito.android.payment.processing.y yVar, @Y61.k PaymentSessionType paymentSessionType, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, boolean z12) {
        this.f214518a = interfaceC35745a5;
        this.f214519b = d12;
        this.f214520c = eVar;
        this.f214521d = c33020e;
        this.f214522e = yVar;
        this.f214523f = paymentSessionType;
        this.f214524g = fVar;
        this.f214525h = xVar;
        this.f214526i = aVar;
        this.f214527j = z12;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(t.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new t(this.f214518a, this.f214519b, this.f214520c, this.f214521d, this.f214522e, this.f214523f, this.f214524g, this.f214525h, this.f214526i, this.f214527j);
    }
}
