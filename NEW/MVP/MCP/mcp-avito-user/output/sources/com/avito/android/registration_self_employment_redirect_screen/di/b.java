package com.avito.android.registration_self_employment_redirect_screen.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.registration_self_employment_redirect_screen.ui.SelfEmploymentRedirectActivity;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: SelfEmploymentRedirectComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/di/b;", "", "a", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: SelfEmploymentRedirectComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/di/b$a;", "", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k @Named("ON_BACK_PRESSED_ACTION") Y41.a aVar, @k d dVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k SelfEmploymentRedirectActivity selfEmploymentRedirectActivity);
}
