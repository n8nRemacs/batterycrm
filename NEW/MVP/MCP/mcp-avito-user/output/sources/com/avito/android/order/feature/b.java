package com.avito.android.order.feature;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.order.OrderScreenSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_order_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {
    @k
    public static final Intent a(@k Context context, @k String str, boolean z12, @k OrderScreenSegment orderScreenSegment) {
        return new Intent(context, (Class<?>) OrderActivity.class).putExtra("open_params", new OrderScreenParams(str, z12, orderScreenSegment));
    }
}
