package com.avito.android.passport.auth_suggest.di;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestFragment;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: PassportAuthSuggestComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/auth_suggest/di/b;", "", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PassportAuthSuggestComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/auth_suggest/di/b$a;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k PassportAuthSuggestOpenParams passportAuthSuggestOpenParams, @h31.b @k ScreenPerformanceTracker screenPerformanceTracker, @k C31138n0 c31138n0, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k PassportAuthSuggestFragment passportAuthSuggestFragment);
}
