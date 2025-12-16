package com.avito.android.safedeal.delivery.order_cancellation.data;

import Y61.k;
import Y61.l;
import ck0.C27212a;
import com.avito.android.remote.model.OrderCancellationReasons;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RdsOrderCancellationRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/data/a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: RdsOrderCancellationRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.safedeal.delivery.order_cancellation.data.a$a, reason: collision with other inner class name */
    public static final class C7669a {
    }

    @l
    Object a(@k String str, @k Continuation continuation);

    @l
    Object b(@k Continuation<? super TypedResult<C27212a>> continuation);

    @l
    Object c(@k String str, @k Continuation<? super TypedResult<OrderCancellationReasons>> continuation);
}
