package com.avito.android.user_address.map.di;

import Y61.k;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.UserAddressMapFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: UserAddressMapComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/di/b;", "", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: UserAddressMapComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/di/b$a;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map map, @h31.b @k com.avito.android.user_address.g gVar, @h31.b @k ActivityC22955m activityC22955m, @h31.b @k UserAddressMapFragment userAddressMapFragment, @h31.b @k Resources resources, @h31.b @k r rVar, @k c cVar, @k com.avito.android.user_address.di.b bVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k UserAddressMapFragment userAddressMapFragment);
}
