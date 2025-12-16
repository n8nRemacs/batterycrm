package com.avito.android.publish.input_imei.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.publish.di.W;
import com.avito.android.publish.input_imei.InputImeiFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: InputImeiComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/input_imei/di/b;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: InputImeiComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        b build();

        @h31.b
        @Y61.k
        a c(@Y61.k C28478k c28478k);

        @h31.b
        @Y61.k
        a d(@W int i12);

        @Y61.k
        a e(@Y61.k c cVar);

        @h31.b
        @Y61.k
        a f(@Y61.k InputImeiFragment inputImeiFragment);
    }

    void a(@Y61.k InputImeiFragment inputImeiFragment);
}
