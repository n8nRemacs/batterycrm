package com.avito.android.mall.di;

import Y61.k;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.di.B;
import com.avito.android.mall.MallFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import nU.InterfaceC44331a;

/* compiled from: MallComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mall/di/b;", "", "a", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: MallComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/di/b$a;", "", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k InterfaceC39417a interfaceC39417a);

        @k
        a b(@k InterfaceC44331a interfaceC44331a);

        @k
        b build();

        @h31.b
        @k
        a c(@k ActivityC22955m activityC22955m);

        @h31.b
        @k
        a d(@k MallFragment mallFragment);

        @k
        a e(@k c cVar);
    }

    void a(@k MallFragment mallFragment);
}
