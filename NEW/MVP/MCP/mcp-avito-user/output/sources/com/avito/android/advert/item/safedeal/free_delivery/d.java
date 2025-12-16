package com.avito.android.advert.item.safedeal.free_delivery;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;
import l41.s;

/* compiled from: FreeDeliveryInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/free_delivery/d;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<Z9.a> f78805a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f78806b;

    @Inject
    public d(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f78805a = eVar;
        this.f78806b = interfaceC35745a5;
    }

    @k
    public final W a(@k final String str) {
        return new C42007e(new s() { // from class: com.avito.android.advert.item.safedeal.free_delivery.a
            @Override // l41.s
            public final Object get() {
                return Q.a(EmptyCoroutineContext.INSTANCE, new b(this.f78799b, str, null));
            }
        }).r(c.f78804b).z(this.f78806b.a());
    }
}
