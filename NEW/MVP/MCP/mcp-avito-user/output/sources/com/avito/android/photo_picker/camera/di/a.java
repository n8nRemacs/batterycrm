package com.avito.android.photo_picker.camera.di;

import Y61.k;
import android.content.ContentResolver;
import android.graphics.Point;
import android.view.Display;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.di.B;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.camera.AspectRatio;
import com.avito.android.photo_picker.camera.CameraFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: CameraComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/camera/di/a;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: CameraComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/di/a$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.camera.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC6574a {
        @h31.b
        @k
        InterfaceC6574a a(@d boolean z12);

        @h31.b
        @k
        InterfaceC6574a b(@k Point point);

        @k
        a build();

        @h31.b
        @k
        InterfaceC6574a c(@k Display display);

        @h31.b
        @k
        InterfaceC6574a d(@k ActivityC22955m activityC22955m);

        @h31.b
        @k
        InterfaceC6574a e(@k AspectRatio aspectRatio);

        @h31.b
        @k
        InterfaceC6574a f(@k CameraType cameraType);

        @h31.b
        @k
        InterfaceC6574a g(@k ContentResolver contentResolver);

        @k
        InterfaceC6574a h(@k b bVar);
    }

    void a(@k CameraFragment cameraFragment);
}
