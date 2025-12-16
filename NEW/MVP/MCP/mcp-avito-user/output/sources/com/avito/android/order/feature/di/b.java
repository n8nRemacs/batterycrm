package com.avito.android.order.feature.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.order.OrderScreenSegment;
import com.avito.android.order.feature.OrderFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: OrderComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/feature/di/b;", "", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: OrderComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/order/feature/di/b$a;", "", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @com.avito.android.order.feature.di.module.b @k String str, @h31.b @k C28478k c28478k, @k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k OrderScreenSegment orderScreenSegment);
    }

    void a(@k OrderFragment orderFragment);
}
