package com.avito.android.advert.deeplinks.delivery_order;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.B;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryOrderCreateResponse;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryOrderCreateInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery_order/m;", "Lcom/avito/android/advert/deeplinks/delivery_order/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<B> f69006a;

    @Inject
    public m(@Y61.k h31.e<B> eVar) {
        this.f69006a = eVar;
    }

    @Override // com.avito.android.advert.deeplinks.delivery_order.l
    @Y61.l
    public final Object a(@Y61.l Map<String, String> map, @Y61.k Continuation<? super TypedResult<DeliveryOrderCreateResponse>> continuation) {
        B b12 = this.f69006a.get();
        if (map == null) {
            map = P0.c();
        }
        return b12.a(map, continuation);
    }
}
