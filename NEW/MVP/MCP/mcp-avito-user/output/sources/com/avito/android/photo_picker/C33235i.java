package com.avito.android.photo_picker;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import org.funktionale.option.a;

/* compiled from: CameraOpenInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/i;", "Lcom/avito/android/photo_picker/f;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33235i implements InterfaceC33232f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33237k f219571a;

    @Inject
    public C33235i(@Y61.k InterfaceC33237k interfaceC33237k) {
        this.f219571a = interfaceC33237k;
    }

    @Override // com.avito.android.photo_picker.InterfaceC33232f
    @Y61.k
    public final List<CameraType> a() {
        return this.f219571a.a();
    }

    @Override // com.avito.android.photo_picker.InterfaceC33232f
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U b(@Y61.k CameraType cameraType) {
        return this.f219571a.b(cameraType).r(new C33233g(cameraType)).i(C33234h.f219570b).v(a.b.f420401b);
    }
}
