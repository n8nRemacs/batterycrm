package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzah;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzas;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuy;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public class FaceDetectorV2Jni {

    /* renamed from: a, reason: collision with root package name */
    public final zzuy f355697a;

    public FaceDetectorV2Jni() {
        zzuy zzuyVarZza = zzuy.zza();
        this.f355697a = zzuyVarZza;
        zzuyVarZza.zzc(zzas.zza);
    }

    @Keep
    private native void closeDetectorJni(long j12);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j12, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr4);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j12, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    public final long a(zzah zzahVar, AssetManager assetManager) {
        return initDetectorJni(zzahVar.zzr(), assetManager);
    }

    @P
    public final zzaf b(long j12, byte[] bArr, zzp zzpVar) {
        try {
            byte[] bArrDetectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j12, bArr, zzpVar.zzr());
            if (bArrDetectFacesImageByteArrayJni == null || bArrDetectFacesImageByteArrayJni.length <= 0) {
                return null;
            }
            return zzaf.zzb(bArrDetectFacesImageByteArrayJni, this.f355697a);
        } catch (zzvv e12) {
            "detectFacesImageByteArray failed to parse result: ".concat(String.valueOf(e12.getMessage()));
            return null;
        }
    }

    @P
    public final zzaf c(long j12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i12, int i13, int i14, int i15, int i16, int i17, zzp zzpVar) {
        try {
            byte[] bArrDetectFacesImageByteArrayMultiPlanesJni = detectFacesImageByteArrayMultiPlanesJni(j12, bArr, bArr2, bArr3, i12, i13, i14, i15, i16, i17, zzpVar.zzr());
            if (bArrDetectFacesImageByteArrayMultiPlanesJni != null) {
                if (bArrDetectFacesImageByteArrayMultiPlanesJni.length > 0) {
                    try {
                        return zzaf.zzb(bArrDetectFacesImageByteArrayMultiPlanesJni, this.f355697a);
                    } catch (zzvv e12) {
                        e = e12;
                        "detectFacesImageByteArrayMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage()));
                        return null;
                    }
                }
            }
            return null;
        } catch (zzvv e13) {
            e = e13;
        }
    }

    @P
    public final zzaf d(long j12, ByteBuffer byteBuffer, zzp zzpVar) {
        try {
            byte[] bArrDetectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j12, byteBuffer, zzpVar.zzr());
            if (bArrDetectFacesImageByteBufferJni == null || bArrDetectFacesImageByteBufferJni.length <= 0) {
                return null;
            }
            return zzaf.zzb(bArrDetectFacesImageByteBufferJni, this.f355697a);
        } catch (zzvv e12) {
            "detectFacesImageByteBuffer failed to parse result: ".concat(String.valueOf(e12.getMessage()));
            return null;
        }
    }

    @P
    public final zzaf e(long j12, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, zzp zzpVar) {
        try {
            byte[] bArrDetectFacesImageByteBufferMultiPlanesJni = detectFacesImageByteBufferMultiPlanesJni(j12, byteBuffer, byteBuffer2, byteBuffer3, i12, i13, i14, i15, i16, i17, zzpVar.zzr());
            if (bArrDetectFacesImageByteBufferMultiPlanesJni != null) {
                if (bArrDetectFacesImageByteBufferMultiPlanesJni.length > 0) {
                    try {
                        return zzaf.zzb(bArrDetectFacesImageByteBufferMultiPlanesJni, this.f355697a);
                    } catch (zzvv e12) {
                        e = e12;
                        "detectFacesImageByteBufferMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage()));
                        return null;
                    }
                }
            }
            return null;
        } catch (zzvv e13) {
            e = e13;
        }
    }

    public final void f(long j12) {
        closeDetectorJni(j12);
    }
}
