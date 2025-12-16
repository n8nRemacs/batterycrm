package com.avito.android.order.feature.data;

import Y61.k;
import Y61.l;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OrderRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/data/a;", "", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {
    @l
    Object a(@k String str, @k ContinuationImpl continuationImpl);

    @l
    Object b(@k String str, @k String str2, @k OrderScreenSegment orderScreenSegment, @k Continuation<? super TypedResult<O40.b>> continuation);

    @l
    Object c(@k String str, @k String str2, @k OrderScreenSegment orderScreenSegment, @k Continuation continuation);
}
