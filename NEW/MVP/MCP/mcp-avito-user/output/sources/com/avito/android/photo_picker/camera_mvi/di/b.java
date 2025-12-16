package com.avito.android.photo_picker.camera_mvi.di;

import Y61.k;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.permissions.G;
import com.avito.android.permissions.u;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import kotlin.Metadata;

/* compiled from: CameraDependencies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/di/b;", "Lcom/avito/android/di/h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b extends InterfaceC29971h {
    @k
    N70.c B7();

    @k
    G N();

    @k
    u V();

    @k
    InterfaceC28373a a();

    @k
    SharedPhotosStorage b2();

    @k
    R0 c();

    @k
    Context g();
}
