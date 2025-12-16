package com.avito.android.esia_redirect_screen.di;

import com.avito.android.di.B;
import com.avito.android.esia_redirect_screen.ui.EsiaRedirectActivity;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: EsiaRedirectComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/esia_redirect_screen/di/j;", "", "a", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface j {

    /* compiled from: EsiaRedirectComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/di/j$a;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        j a(@h31.b @Y61.k Y41.l lVar, @h31.b @Y61.k @Named("ON_BACK_PRESSED_ACTION") Y41.a aVar, @Y61.k l lVar2, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k EsiaRedirectActivity esiaRedirectActivity);
}
