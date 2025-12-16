package com.avito.android.safedeal_checkout.delivery_universal_checkout.common;

import com.avito.android.remote.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: DeliverySavedAddressCheckInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/j;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/i;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f256926a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f256927b;

    @Inject
    public j(@Y61.k E e12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f256926a = e12;
        this.f256927b = interfaceC35745a5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.common.i
    @Y61.k
    public final C42026y a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Map map) {
        if (map == null) {
            map = P0.c();
        }
        return g1.a(this.f256926a.a(str, str2, str3, str4, map).z(this.f256927b.a()));
    }
}
