package com.avito.android.photo_camera_view;

import android.net.Uri;
import com.avito.android.photo_camera_view.x;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_camera_view/d;", "Lcom/avito/android/photo_camera_view/x$b;", "Lcom/avito/android/permissions/y;", "a", "b", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_camera_view.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC33173d extends x.b, com.avito.android.permissions.y {

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/d$a;", "", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_camera_view.d$a */
    public interface a {
        void E9(@Y61.k List<? extends Uri> list);
    }

    /* compiled from: CameraItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/d$b;", "", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_camera_view.d$b */
    public interface b {
        void H2();

        void Q4();
    }

    void a();

    void c0();

    void d(@Y61.k b bVar);

    void g();

    @Y61.k
    CameraPresenterState getState();

    void j(@Y61.k x xVar);

    void m();
}
