package Vv;

import C11.b;
import Sv.h;
import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import com.avito.android.delivery_tarifikator.presentation.region_screen.TarifikatorRegionFragment;
import com.avito.android.di.InterfaceC29971h;
import cv.d;
import kotlin.Metadata;

/* compiled from: TarifikatorRegionFragmentComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LVv/a;", "", "a", "b", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* renamed from: Vv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15719a {

    /* compiled from: TarifikatorRegionFragmentComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv/a$a;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vv.a$a, reason: collision with other inner class name */
    public interface InterfaceC1211a {
        @k
        InterfaceC15719a a(@h31.b @k RegionScreenParams regionScreenParams, @h31.b @k DeliveryTarifikatorParams deliveryTarifikatorParams, @h31.b @k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @k TarifikatorRegionFragment tarifikatorRegionFragment, @h31.b @k TarifikatorRegionFragment tarifikatorRegionFragment2, @k d dVar);
    }

    /* compiled from: TarifikatorRegionFragmentComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVv/a$b;", "Lcom/avito/android/di/h;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: Vv.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC1211a Wl();
    }

    void a(@k TarifikatorRegionFragment tarifikatorRegionFragment);
}
