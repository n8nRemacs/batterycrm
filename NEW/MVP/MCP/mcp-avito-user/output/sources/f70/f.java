package F70;

import android.app.Application;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraItemPresenterModule_ProvideGalleryInteractor$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.android.photo_storage.a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final u f4568b;

    public f(a aVar, u uVar) {
        this.f4567a = aVar;
        this.f4568b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f4568b.get();
        this.f4567a.getClass();
        return new com.avito.android.photo_storage.b(application.getContentResolver());
    }
}
