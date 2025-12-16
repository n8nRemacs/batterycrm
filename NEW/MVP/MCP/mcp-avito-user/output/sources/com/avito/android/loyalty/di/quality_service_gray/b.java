package com.avito.android.loyalty.di.quality_service_gray;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: QualityServiceGrayComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/di/quality_service_gray/b;", "", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: QualityServiceGrayComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/di/quality_service_gray/b$a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k C28478k c28478k, @h31.b @k QualityServiceGrayArgs qualityServiceGrayArgs, @h31.b @k com.avito.android.cpt.pre_activation.ui.c cVar, @h31.b @k com.avito.android.auction.details.i iVar, @k c cVar2, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k QualityServiceGrayActivity qualityServiceGrayActivity);
}
