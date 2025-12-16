package com.avito.android.photo_picker.camera_mvi.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.photo_picker.camera_mvi.CameraFragment;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: CameraComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/di/a;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: CameraComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/di/a$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.camera_mvi.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC6582a {
        @k
        a a(@k b bVar, @h31.b @k CameraFragment cameraFragment, @h31.b @Named("max_photo_count") int i12);
    }

    void a(@k CameraFragment cameraFragment);
}
