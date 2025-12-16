package com.avito.android.bbl.screens.configure.v4.di;

import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.bbl.screens.configure.v4.ui.BblConfigureV4Fragment;
import com.avito.android.di.B;
import com.avito.android.paid_services.PaidServicesResultRepository;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: BblConfigureV4Component.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/di/a;", "", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BblConfigureV4Component.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/di/a$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bbl.screens.configure.v4.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2996a {
        @k
        a a(@g @h31.b @k String str, @h31.b @k PaidServicesResultRepository paidServicesResultRepository, @h31.b @k r rVar, @k b bVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k BblConfigureV4Fragment bblConfigureV4Fragment);
}
