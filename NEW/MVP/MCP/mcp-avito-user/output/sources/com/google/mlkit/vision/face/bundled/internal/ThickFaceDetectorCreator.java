package com.google.mlkit.vision.face.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzti;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztn;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztp;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@RX0.a
@DynamiteApi
/* loaded from: classes6.dex */
public class ThickFaceDetectorCreator extends zztp {
    static {
        System.loadLibrary("face_detector_v2_jni");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztq
    public zztn newFaceDetector(d dVar, zzti zztiVar) {
        return new a((Context) f.g4(dVar), zztiVar, new FaceDetectorV2Jni());
    }
}
