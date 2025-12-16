package com.avito.android.authorization.login.di;

import K60.a;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: LoginComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/login/di/b;", "", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: LoginComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/login/di/b$a;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k c cVar, @h31.b @Y61.k LoginActivity loginActivity, @h31.b @a.b @Y61.k r rVar, @h31.b @Y61.k Resources resources, @h31.b @l @k Kundle kundle, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k @Named("suggest_key") String str, @h31.b @Y61.k r rVar2);
    }

    void a(@Y61.k LoginActivity loginActivity);
}
