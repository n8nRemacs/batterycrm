package com.avito.android.photo_picker;

import android.hardware.Camera;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CameraInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "Lkotlin/G0;", "invoke", "(Landroid/hardware/Camera$Parameters;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33230d extends kotlin.jvm.internal.N implements Y41.l<Camera.Parameters, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FlashMode f219324l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33230d(FlashMode flashMode) {
        super(1);
        this.f219324l = flashMode;
    }

    @Override // Y41.l
    public final G0 invoke(Camera.Parameters parameters) {
        parameters.setFlashMode(this.f219324l.f218746b);
        return G0.f406611a;
    }
}
