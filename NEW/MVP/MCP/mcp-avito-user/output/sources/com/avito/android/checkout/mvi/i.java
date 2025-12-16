package com.avito.android.checkout.mvi;

import com.avito.android.checkout.mvi.entity.CheckoutInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CheckoutBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/checkout/mvi/entity/CheckoutInternalAction;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements com.avito.android.arch.mvi.b<CheckoutInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.checkout.domain.j f118381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f118382b;

    @Inject
    public i(@Y61.k com.avito.android.checkout.domain.j jVar, @Y61.k @com.avito.android.checkout.di.q String str) {
        this.f118381a = jVar;
        this.f118382b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CheckoutInternalAction> a() {
        return this.f118381a.a(this.f118382b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
