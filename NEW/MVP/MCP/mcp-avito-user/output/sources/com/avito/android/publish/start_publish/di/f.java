package com.avito.android.publish.start_publish.di;

import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.publish.start_publish.StartPublishFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: StartPublishComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/di/f;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface f {

    /* compiled from: StartPublishComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/di/f$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        f build();

        @e
        @h31.b
        @Y61.k
        a c(@Y61.l String str);

        @Y61.k
        a d(@Y61.k g gVar);

        @h31.b
        @Y61.k
        a e(@Y61.k StartPublishFragment startPublishFragment);
    }

    void a(@Y61.k StartPublishFragment startPublishFragment);
}
