package com.avito.android.seller_promotions.di.component;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.seller_promotions.SellerPromotionsFragment;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SellerPromotionsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/di/component/b;", "", "a", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: SellerPromotionsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/di/component/b$a;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k SellerPromotionsArguments sellerPromotionsArguments, @h31.b @k Resources resources, @h31.b @k SellerPromotionsFragment sellerPromotionsFragment, @h31.b @k l lVar, @h31.b @k C28478k c28478k, @k c cVar, @k InterfaceC39417a interfaceC39417a, @k InterfaceC30106l7 interfaceC30106l7);
    }

    void a(@k SellerPromotionsFragment sellerPromotionsFragment);
}
