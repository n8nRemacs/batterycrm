package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2Fragment;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: BrandspaceBeduinV2Component.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/di/a;", "", "a", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BrandspaceBeduinV2Component.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/di/a$a;", "", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.brandspace.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3220a {
        @Y61.k
        a a(@h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k C31138n0 c31138n0, @Y61.k InterfaceC30106l7 interfaceC30106l7, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k Fu.d dVar);
    }

    void a(@Y61.k BrandspaceBeduinV2Fragment brandspaceBeduinV2Fragment);
}
