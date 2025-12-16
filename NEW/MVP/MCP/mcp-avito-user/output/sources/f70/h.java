package F70;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraItemPresenterModule_ProvideRotationProvider$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.android.device_orientation.f> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4571a;

    public h(a aVar) {
        this.f4571a = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.device_orientation.g(this.f4571a.f4546a);
    }
}
