package com.avito.android.related_products.bottom_sheet.di;

import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.related_products.bottom_sheet.RelatedProductsPageFragment;
import com.avito.android.related_products.perf_const.RelatedProductsBottomSheetBeduinV2Screen;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import ux.InterfaceC49123a;

/* compiled from: RelatedProductsBottomSheetComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/di/b;", "", "a", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: RelatedProductsBottomSheetComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/di/b$a;", "", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @InterfaceC49123a @k RelatedProductsBottomSheetBeduinV2Screen relatedProductsBottomSheetBeduinV2Screen, @h31.b @InterfaceC49123a @k r rVar, @k C31138n0 c31138n0, @k f fVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k RelatedProductsPageFragment relatedProductsPageFragment);
}
