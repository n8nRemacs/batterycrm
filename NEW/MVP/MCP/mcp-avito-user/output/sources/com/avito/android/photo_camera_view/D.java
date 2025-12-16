package com.avito.android.photo_camera_view;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CameraPresenterResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/D;", "Lcom/avito/android/photo_camera_view/C;", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f216367a;

    public D(@Y61.k Resources resources) {
        this.f216367a = resources;
    }

    @Override // com.avito.android.photo_camera_view.C
    @Y61.k
    public final String a() {
        return this.f216367a.getString(R.string.camera_unknown_error);
    }

    @Override // com.avito.android.photo_camera_view.C
    @Y61.k
    public final String b() {
        return this.f216367a.getString(R.string.go_to_settings);
    }

    @Override // com.avito.android.photo_camera_view.C
    @Y61.k
    public final String c() {
        return this.f216367a.getString(R.string.no_place_for_snapshot);
    }

    @Override // com.avito.android.photo_camera_view.C
    @Y61.k
    public final String d() {
        return this.f216367a.getString(R.string.allow_access);
    }
}
