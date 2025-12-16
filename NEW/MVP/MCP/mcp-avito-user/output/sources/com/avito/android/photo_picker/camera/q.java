package com.avito.android.photo_picker.camera;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.permissions.G;
import com.avito.android.photo_camera_view.F;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.InterfaceC33232f;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CameraViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/q;", "Landroidx/lifecycle/P0$c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_storage.a f219021a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.x f219022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33232f f219024d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.device_orientation.f f219025e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final N70.b f219026f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f219027g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final F f219028h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final CameraType f219029i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final G f219030j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f219031k;

    @Inject
    public q(@Y61.k N70.b bVar, @Y61.k com.avito.android.device_orientation.f fVar, @Y61.k com.avito.android.permissions.x xVar, @Y61.k G g12, @Y61.k F f12, @Y61.k InterfaceC33232f interfaceC33232f, @Y61.k CameraType cameraType, @Y61.k com.avito.android.photo_storage.a aVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k InterfaceC35745a5 interfaceC35745a5, @com.avito.android.photo_picker.camera.di.d boolean z12) {
        this.f219021a = aVar;
        this.f219022b = xVar;
        this.f219023c = interfaceC35745a5;
        this.f219024d = interfaceC33232f;
        this.f219025e = fVar;
        this.f219026f = bVar;
        this.f219027g = sharedPhotosStorage;
        this.f219028h = f12;
        this.f219029i = cameraType;
        this.f219030j = g12;
        this.f219031k = z12;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(i.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        G g12 = this.f219030j;
        com.avito.android.permissions.x xVar = this.f219022b;
        InterfaceC35745a5 interfaceC35745a5 = this.f219023c;
        N70.b bVar = this.f219026f;
        SharedPhotosStorage sharedPhotosStorage = this.f219027g;
        F f12 = this.f219028h;
        boolean z12 = this.f219031k;
        com.avito.android.photo_storage.a aVar = this.f219021a;
        return cls.cast(new i(bVar, this.f219025e, xVar, g12, f12, this.f219024d, this.f219029i, aVar, sharedPhotosStorage, interfaceC35745a5, z12));
    }
}
