package com.avito.android.bbl.screens.limit_increase.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.bbl.screens.limit_increase.ui.LimitIncreaseFragment;
import com.avito.android.di.B;
import com.avito.android.paid_services.PaidServicesResultRepository;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: LimitIncreaseComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/di/d;", "", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: LimitIncreaseComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/di/d$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        d a(@h31.b @c long j12, @com.avito.android.bbl.screens.limit_increase.di.a @h31.b boolean z12, @m @h31.b @Y61.k String str, @h31.b @Y61.k PaidServicesResultRepository paidServicesResultRepository, @h31.b @Y61.k r rVar, @Y61.k g gVar, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k LimitIncreaseFragment limitIncreaseFragment);
}
