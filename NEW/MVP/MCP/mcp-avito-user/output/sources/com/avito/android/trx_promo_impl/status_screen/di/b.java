package com.avito.android.trx_promo_impl.status_screen.di;

import Y61.k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.trx_promo_impl.di.l;
import com.avito.android.trx_promo_impl.status_screen.TrxPromoStatusFragment;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import ux.InterfaceC49123a;

/* compiled from: TrxPromoStatusComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/di/b;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TrxPromoStatusComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/di/b$a;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k l lVar, @k InterfaceC39417a interfaceC39417a, @h31.b @InterfaceC49123a @k Screen screen, @h31.b @InterfaceC49123a @k r rVar, @h31.b @InterfaceC49123a @k String str, @com.avito.android.trx_promo_impl.di.f @h31.b @k String str2, @h31.b @com.avito.android.trx_promo_impl.di.d boolean z12, @h31.b @k TrxPromoStatus trxPromoStatus);
    }

    void a(@k TrxPromoStatusFragment trxPromoStatusFragment);
}
