package com.avito.android.adaptive.image.di;

import Y61.k;
import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import h31.d;
import javax.inject.Singleton;
import kotlin.Metadata;
import u3.l;

/* compiled from: AdaptiveImagePickerComponent.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/adaptive/image/di/a;", "", "a", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdaptiveImagePickerComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/di/a$a;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.adaptive.image.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2144a {
        @k
        a a(@k b bVar);
    }

    @k
    l<AdaptiveImageLoadingAbTestGroup> a();

    @k
    Q3.c b();

    @k
    com.avito.android.adaptive.image.a c();
}
