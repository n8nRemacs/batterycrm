package com.avito.android.early_access.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.early_access.EarlyAccessDialog;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: EarlyAccessComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/di/b;", "", "a", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EarlyAccessComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/di/b$a;", "", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC30106l7 interfaceC30106l7, @k InterfaceC39417a interfaceC39417a, @h31.b @k r rVar, @h31.b @k ReEarlyAccessData reEarlyAccessData, @h31.b @k l lVar);
    }

    void a(@k EarlyAccessDialog earlyAccessDialog);
}
