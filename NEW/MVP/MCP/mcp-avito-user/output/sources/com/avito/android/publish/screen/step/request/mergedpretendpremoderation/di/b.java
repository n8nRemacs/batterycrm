package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.MergedPretendPremoderationFragment;
import cv.InterfaceC39417a;
import h31.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: MergedPretendPremoderationComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/di/b;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: MergedPretendPremoderationComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/di/b$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k @InterfaceC7238b MergedPretendPremoderationFragment.Companion.Strategy strategy);
    }

    /* compiled from: MergedPretendPremoderationComponent.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/di/b$b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    /* renamed from: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.di.b$b, reason: collision with other inner class name */
    public @interface InterfaceC7238b {
    }

    void a(@k MergedPretendPremoderationFragment mergedPretendPremoderationFragment);
}
