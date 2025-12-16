package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CameraReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/CameraState;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements u<com.avito.android.photo_picker.camera_mvi.mvi.entity.a, CameraState> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CameraState a(com.avito.android.photo_picker.camera_mvi.mvi.entity.a aVar, CameraState cameraState) {
        com.avito.android.photo_picker.camera_mvi.mvi.entity.a aVar2 = aVar;
        CameraState cameraState2 = cameraState;
        if (aVar2 instanceof a.d) {
            a.d dVar = (a.d) aVar2;
            return CameraState.a(cameraState2, null, dVar.f219183a, dVar.f219184b, null, null, false, null, null, false, 4089);
        }
        if (aVar2 instanceof a.c) {
            return CameraState.a(cameraState2, null, null, null, ((a.c) aVar2).f219182a, null, false, null, null, false, 4087);
        }
        if (aVar2 instanceof a.b) {
            return CameraState.a(cameraState2, null, null, null, null, ((a.b) aVar2).f219181a, false, null, null, false, 4079);
        }
        if (aVar2 instanceof a.l) {
            return CameraState.a(cameraState2, null, null, null, null, null, false, null, null, ((a.l) aVar2).f219195c, 3839);
        }
        if (aVar2 instanceof a.p) {
            a.p pVar = (a.p) aVar2;
            return CameraState.a(cameraState2, null, null, null, null, null, !pVar.f219202c, pVar.f219201b, pVar.f219200a, false, 3871);
        }
        if (aVar2 instanceof a.e) {
            return CameraState.a(cameraState2, null, null, null, null, null, false, null, null, false, 2527);
        }
        if (aVar2 instanceof a.k) {
            return CameraState.a(cameraState2, null, null, null, null, null, false, null, null, false, 2047);
        }
        if (aVar2 instanceof a.j) {
            return CameraState.a(cameraState2, new CameraState.a.c(((a.j) aVar2).f219191a), null, null, null, null, false, null, null, false, 4094);
        }
        if (!(aVar2 instanceof a.n)) {
            return aVar2 instanceof a.C6587a ? CameraState.a(cameraState2, CameraState.a.b.f219174a, null, null, null, null, false, null, null, false, 4094) : aVar2 instanceof a.m ? CameraState.a(cameraState2, CameraState.a.d.f219176a, null, null, null, null, false, null, null, false, 4094) : cameraState2;
        }
        a.n nVar = (a.n) aVar2;
        return CameraState.a(cameraState2, new CameraState.a.C6586a(nVar.f219197a, nVar.f219198b), null, null, null, null, false, null, null, false, 4094);
    }
}
