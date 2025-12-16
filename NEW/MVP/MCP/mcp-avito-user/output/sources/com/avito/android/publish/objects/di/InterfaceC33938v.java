package com.avito.android.publish.objects.di;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.publish.objects.ObjectFillFormFragment;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import cv.InterfaceC39417a;
import h31.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: ObjectFillFormComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/objects/di/v;", "", "a", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.publish.objects.di.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33938v {

    /* compiled from: ObjectFillFormComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/di/v$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.objects.di.v$a */
    public interface a {
        @Y61.k
        InterfaceC33938v a(@h31.b @Y61.k Resources resources, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k ObjectFillFormFragment objectFillFormFragment, @Z @h31.b @Y61.k String str, @a0 @h31.b @Y61.l Integer num, @h31.b @Y61.l ObjectFillFormScreenParams.SelectedValue selectedValue, @h31.b @Y61.l Bundle bundle, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b boolean z12, @Y61.k InterfaceC33935s interfaceC33935s, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    /* compiled from: ObjectFillFormComponent.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/objects/di/v$b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    /* renamed from: com.avito.android.publish.objects.di.v$b */
    public @interface b {
    }

    void a(@Y61.k ObjectFillFormFragment objectFillFormFragment);
}
