package com.avito.android.seller_room.di;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.seller_room.ui.SellerRoomFragment;
import com.avito.android.seller_room.ui.SellerRoomOpenParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SellerRoomComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_room/di/b;", "", "a", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SellerRoomComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/di/b$a;", "", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @k SellerRoomOpenParams sellerRoomOpenParams, @k C31138n0 c31138n0, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k SellerRoomFragment sellerRoomFragment);
}
