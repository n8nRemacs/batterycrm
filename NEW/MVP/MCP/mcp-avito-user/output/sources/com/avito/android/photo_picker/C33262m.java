package com.avito.android.photo_picker;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CameraSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/m;", "Lcom/avito/android/photo_picker/k;", "<init>", "()V", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"Deprecation"})
/* renamed from: com.avito.android.photo_picker.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33262m implements InterfaceC33237k {
    @Inject
    public C33262m() {
    }

    @Override // com.avito.android.photo_picker.InterfaceC33237k
    @Y61.k
    public final List<CameraType> a() {
        List<CameraType> list = C33264o.f219915a;
        return list.subList(0, Math.min(Camera.getNumberOfCameras(), list.size()));
    }

    @Override // com.avito.android.photo_picker.InterfaceC33237k
    @Y61.k
    public final C42006d b(@Y61.k final CameraType cameraType) {
        return new C42006d(new io.reactivex.rxjava3.core.M() { // from class: com.avito.android.photo_picker.l
            @Override // io.reactivex.rxjava3.core.M
            public final void j(io.reactivex.rxjava3.core.K k12) {
                try {
                    k12.onSuccess(Camera.open(cameraType.f218739b));
                } catch (Exception e12) {
                    k12.onError(e12);
                }
            }
        });
    }
}
