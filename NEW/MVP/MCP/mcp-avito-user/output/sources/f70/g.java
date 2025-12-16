package F70;

import com.avito.android.photo_camera_view.C33171b;
import com.avito.android.photo_camera_view.InterfaceC33170a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraItemPresenterModule_ProvidePermissionHandler$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<InterfaceC33170a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4569a;

    /* renamed from: b, reason: collision with root package name */
    public final u f4570b;

    public g(a aVar, u uVar) {
        this.f4569a = aVar;
        this.f4570b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.permissions.x xVar = (com.avito.android.permissions.x) this.f4570b.get();
        this.f4569a.getClass();
        return new C33171b(xVar);
    }
}
