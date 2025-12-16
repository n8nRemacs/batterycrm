package com.avito.android.wallet.page.history.details.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.wallet.page.di.component.e;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsFragment;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsOpenParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: HistoryDetailsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/details/di/b;", "", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: HistoryDetailsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/di/b$a;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k e eVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k PaymentHistoryDetailsOpenParams paymentHistoryDetailsOpenParams, @h31.b @k l lVar);
    }

    void a(@k PaymentHistoryDetailsFragment paymentHistoryDetailsFragment);
}
