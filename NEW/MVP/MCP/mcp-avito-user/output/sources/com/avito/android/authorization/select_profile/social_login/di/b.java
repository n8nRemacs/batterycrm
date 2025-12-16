package com.avito.android.authorization.select_profile.social_login.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.r;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.select_profile.social_login.SocialRegistrationSuggestsFragment;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/di/b;", "", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: SocialRegistrationSuggestsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/di/b$a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ActivityC22955m activityC22955m, @h31.b @k SocialRegistrationSuggestsParams socialRegistrationSuggestsParams, @h31.b @k Resources resources, @h31.b @k r rVar, @h31.b @l Kundle kundle, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment);
}
