package F70;

import com.avito.android.photo_camera_view.C;
import com.avito.android.photo_camera_view.C33174e;
import com.avito.android.photo_camera_view.F;
import com.avito.android.photo_camera_view.InterfaceC33170a;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CameraItemPresenterModule_ProvideCameraPresenter$_avito_photo_camera_view_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<InterfaceC33173d> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4554a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33232f> f4555b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_storage.a> f4556c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.device_orientation.e> f4557d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33173d.a> f4558e;

    /* renamed from: f, reason: collision with root package name */
    public final u f4559f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC33170a> f4560g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C> f4561h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.device_orientation.f> f4562i;

    /* renamed from: j, reason: collision with root package name */
    public final u f4563j;

    /* renamed from: k, reason: collision with root package name */
    public final u f4564k;

    public c(a aVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, u uVar, Provider provider5, Provider provider6, Provider provider7, u uVar2, u uVar3) {
        this.f4554a = aVar;
        this.f4555b = provider;
        this.f4556c = provider2;
        this.f4557d = provider3;
        this.f4558e = provider4;
        this.f4559f = uVar;
        this.f4560g = provider5;
        this.f4561h = provider6;
        this.f4562i = provider7;
        this.f4563j = uVar2;
        this.f4564k = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33232f interfaceC33232f = this.f4555b.get();
        com.avito.android.photo_storage.a aVar = this.f4556c.get();
        com.avito.android.device_orientation.e eVar = this.f4557d.get();
        h31.e eVarB = dagger.internal.g.b(this.f4558e);
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f4559f.get();
        InterfaceC33170a interfaceC33170a = this.f4560g.get();
        C c12 = this.f4561h.get();
        com.avito.android.device_orientation.f fVar = this.f4562i.get();
        F f12 = (F) this.f4563j.get();
        SharedPhotosStorage sharedPhotosStorage = (SharedPhotosStorage) this.f4564k.get();
        a aVar2 = this.f4554a;
        boolean z12 = aVar2.f4550e;
        return new C33174e(interfaceC33232f, aVar, eVar, fVar, eVarB, interfaceC35745a5, interfaceC33170a, aVar2.f4548c, aVar2.f4549d, z12, c12, f12, sharedPhotosStorage, aVar2.f4551f);
    }
}
