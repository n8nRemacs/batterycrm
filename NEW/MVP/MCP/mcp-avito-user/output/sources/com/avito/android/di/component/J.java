package com.avito.android.di.component;

import android.content.ContentResolver;
import com.avito.android.photo_picker.legacy.provider.PhotoContentProvider;
import h31.d;
import kotlin.Metadata;

/* compiled from: PhotoContentProviderComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/di/component/J;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.di.A
@h31.d
/* loaded from: classes13.dex */
public interface J {

    /* compiled from: PhotoContentProviderComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/component/J$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k ContentResolver contentResolver);

        @Y61.k
        a b(@Y61.k com.avito.android.photo_picker.legacy.di.c cVar);

        @Y61.k
        J build();
    }

    void a(@Y61.k PhotoContentProvider photoContentProvider);
}
