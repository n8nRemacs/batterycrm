package com.avito.android.photo_picker;

import android.hardware.Camera;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CameraInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_photo-camera-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33231e {
    public static final void a(Camera camera, Y41.l<? super Camera.Parameters, G0> lVar) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            return;
        }
        lVar.invoke(parameters);
        try {
            camera.setParameters(parameters);
        } catch (RuntimeException e12) {
            V2.f318762a.f(e12);
        }
    }
}
