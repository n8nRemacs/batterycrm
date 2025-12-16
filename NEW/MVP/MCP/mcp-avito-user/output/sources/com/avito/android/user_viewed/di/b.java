package com.avito.android.user_viewed.di;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.user_viewed.screen.ui.UserViewedFragment;
import cv.InterfaceC39417a;
import fK0.InterfaceC40305b;
import h31.d;
import kotlin.Metadata;

/* compiled from: UserViewedComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/di/b;", "", "a", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: UserViewedComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/di/b$a;", "", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k InterfaceC40305b interfaceC40305b, @k InterfaceC39417a interfaceC39417a, @h31.b @k Resources resources, @h31.b @k C28478k c28478k, @h31.b @k l lVar);
    }

    void a(@k UserViewedFragment userViewedFragment);
}
