package F70;

import com.avito.android.photo_camera_view.C;
import com.avito.android.photo_camera_view.D;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraItemPresenterModule_ProvideCameraPresenterResourceProvider$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4565a;

    public d(a aVar) {
        this.f4565a = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f4565a.f4547b);
    }
}
