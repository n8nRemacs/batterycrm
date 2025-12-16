package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.y;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zznv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zznw;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzti;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztn;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztp;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@y
@RX0.a
@DynamiteApi
/* loaded from: classes6.dex */
public class FaceDetectorCreator extends zztp {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztq
    public zztn newFaceDetector(com.google.android.gms.dynamic.d dVar, zzti zztiVar) throws RemoteException {
        SystemClock.elapsedRealtime();
        Context context = (Context) f.g4(dVar);
        b bVar = new b(context);
        d dVar2 = bVar.f355706a;
        try {
            System.loadLibrary("face_detector_v2_jni");
            SystemClock.elapsedRealtime();
            dVar2.a(zztiVar, zznw.OPTIONAL_MODULE_FACE_DETECTION_CREATE, zznv.NO_ERROR);
            return new a(context, zztiVar, new FaceDetectorV2Jni(), bVar);
        } catch (UnsatisfiedLinkError e12) {
            SystemClock.elapsedRealtime();
            dVar2.a(zztiVar, zznw.OPTIONAL_MODULE_FACE_DETECTION_CREATE, zznv.OPTIONAL_MODULE_CREATE_ERROR);
            throw ((RemoteException) new RemoteException("Failed to load library face_detector_v2_jni").initCause(e12));
        }
    }
}
