package F70;

import com.avito.android.photo_picker.C33235i;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_picker.InterfaceC33237k;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CameraItemPresenterModule_ProvideCameraOpenInteractor$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<InterfaceC33232f> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4552a;

    /* renamed from: b, reason: collision with root package name */
    public final u f4553b;

    public b(a aVar, u uVar) {
        this.f4552a = aVar;
        this.f4553b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33237k interfaceC33237k = (InterfaceC33237k) this.f4553b.get();
        this.f4552a.getClass();
        return new C33235i(interfaceC33237k);
    }
}
