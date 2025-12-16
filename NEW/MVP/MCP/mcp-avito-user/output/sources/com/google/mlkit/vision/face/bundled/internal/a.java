package com.google.mlkit.vision.face.bundled.internal;

import AK.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import androidx.compose.foundation.H;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzag;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzah;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzai;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaj;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzao;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzaq;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzar;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzd;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzs;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzt;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzte;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzti;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zztm;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class a extends zztm {

    /* renamed from: a, reason: collision with root package name */
    public final Context f362457a;

    /* renamed from: b, reason: collision with root package name */
    public final zzah f362458b;

    /* renamed from: p, reason: collision with root package name */
    public final FaceDetectorV2Jni f362459p;

    /* renamed from: q, reason: collision with root package name */
    public long f362460q = -1;

    public a(Context context, zzti zztiVar, FaceDetectorV2Jni faceDetectorV2Jni) {
        this.f362457a = context;
        int iZzc = zztiVar.zzc();
        zzaq zzaqVarZza = zzar.zza();
        zzaqVarZza.zzb("models_bundled");
        zzar zzarVar = (zzar) zzaqVarZza.zzn();
        int iZze = zztiVar.zze();
        zzai zzaiVarZza = zzaj.zza();
        zzaq zzaqVarZza2 = zzar.zza();
        zzaqVarZza2.zzb("models_bundled");
        zzaqVarZza2.zza(iZze == 2 ? "fssd_medium_8bit_v5.tflite" : "fssd_25_8bit_v2.tflite");
        zzaiVarZza.zzc((zzar) zzaqVarZza2.zzn());
        zzaq zzaqVarZza3 = zzar.zza();
        zzaqVarZza3.zzb("models_bundled");
        zzaqVarZza3.zza(iZze == 2 ? "fssd_medium_8bit_gray_v5.tflite" : "fssd_25_8bit_gray_v2.tflite");
        zzaiVarZza.zzb((zzar) zzaqVarZza3.zzn());
        zzaq zzaqVarZza4 = zzar.zza();
        zzaqVarZza4.zzb("models_bundled");
        zzaqVarZza4.zza(iZze == 2 ? "fssd_anchors_v5.pb" : "fssd_anchors_v2.pb");
        zzaiVarZza.zza((zzar) zzaqVarZza4.zzn());
        zzaiVarZza.zzd(zzarVar);
        zzaj zzajVar = (zzaj) zzaiVarZza.zzn();
        zzag zzagVarZza = zzah.zza();
        zzagVarZza.zzd(zzajVar);
        zzs zzsVarZza = zzt.zza();
        zzsVarZza.zza(zzarVar);
        zzsVarZza.zzb(zzarVar);
        zzagVarZza.zza(zzsVarZza);
        zzan zzanVarZza = zzao.zza();
        zzanVarZza.zzb(zzarVar);
        zzanVarZza.zzc(zzarVar);
        zzanVarZza.zzd(zzarVar);
        zzanVarZza.zza(zzarVar);
        zzagVarZza.zze(zzanVarZza);
        boolean z12 = false;
        boolean z13 = iZzc == 2;
        zzagVarZza.zzg(z13);
        if (!z13 && zztiVar.zzf()) {
            z12 = true;
        }
        zzagVarZza.zzb(z12);
        zzagVarZza.zzf(zztiVar.zza());
        zzagVarZza.zzh(true);
        if (z13) {
            zzagVarZza.zzk(4);
            zzagVarZza.zzj(4);
        } else {
            int iZze2 = zztiVar.zze();
            if (iZze2 == 1) {
                zzagVarZza.zzk(2);
            } else if (iZze2 == 2) {
                zzagVarZza.zzk(3);
            }
            int iZzd = zztiVar.zzd();
            if (iZzd == 1) {
                zzagVarZza.zzj(2);
            } else if (iZzd == 2) {
                zzagVarZza.zzj(3);
            }
            int iZzb = zztiVar.zzb();
            if (iZzb == 1) {
                zzagVarZza.zzi(2);
            } else if (iZzb == 2) {
                zzagVarZza.zzi(3);
            }
        }
        this.f362458b = (zzah) zzagVarZza.zzn();
        this.f362459p = faceDetectorV2Jni;
    }

    public static int g4(int i12) {
        if (i12 == 0) {
            return 1;
        }
        if (i12 == 1) {
            return 4;
        }
        if (i12 == 2) {
            return 3;
        }
        if (i12 == 3) {
            return 2;
        }
        throw new IllegalArgumentException(c.g(i12, "Unsupported rotation degree: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f4(com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf r30) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.bundled.internal.a.f4(com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf):java.util.ArrayList");
    }

    public final ArrayList h4(ByteBuffer byteBuffer, zzte zzteVar, int i12) {
        zzaf zzafVarB;
        zzo zzoVarZza = zzp.zza();
        zzoVarZza.zzc(zzteVar.zzd());
        zzoVarZza.zza(zzteVar.zza());
        zzoVarZza.zze(g4(zzteVar.zzc()));
        zzoVarZza.zzd(i12);
        if (zzteVar.zze() > 0) {
            zzoVarZza.zzb(zzteVar.zze() * 1000);
        }
        zzp zzpVar = (zzp) zzoVarZza.zzn();
        boolean zIsDirect = byteBuffer.isDirect();
        FaceDetectorV2Jni faceDetectorV2Jni = this.f362459p;
        if (zIsDirect) {
            zzafVarB = faceDetectorV2Jni.d(this.f362460q, byteBuffer, zzpVar);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            zzafVarB = faceDetectorV2Jni.b(this.f362460q, byteBuffer.array(), zzpVar);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            zzafVarB = faceDetectorV2Jni.b(this.f362460q, bArr, zzpVar);
        }
        return zzafVarB != null ? f4(zzafVarB) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final List zzb(d dVar, zzte zzteVar) throws RemoteException {
        zzaf zzafVarC;
        int iZzb = zzteVar.zzb();
        if (iZzb == -1) {
            return h4(zzd.zza((Bitmap) f.g4(dVar), true), zzteVar, 2);
        }
        if (iZzb == 17) {
            return h4((ByteBuffer) f.g4(dVar), zzteVar, 2);
        }
        if (iZzb != 35) {
            if (iZzb == 842094169) {
                return h4((ByteBuffer) f.g4(dVar), zzteVar, 7);
            }
            throw new RemoteException(H.j(zzteVar.zzb(), Build.VERSION.SDK_INT, "Unsupported image format ", " at API "));
        }
        Image.Plane[] planes = ((Image) f.g4(dVar)).getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        zzo zzoVarZza = zzp.zza();
        zzoVarZza.zzc(zzteVar.zzd());
        zzoVarZza.zza(zzteVar.zza());
        zzoVarZza.zze(g4(zzteVar.zzc()));
        if (zzteVar.zze() > 0) {
            zzoVarZza.zzb(zzteVar.zze() * 1000);
        }
        zzp zzpVar = (zzp) zzoVarZza.zzn();
        if (buffer.isDirect()) {
            zzafVarC = this.f362459p.e(this.f362460q, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
        } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
            zzafVarC = this.f362459p.c(this.f362460q, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
        } else {
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            byte[] bArr2 = new byte[buffer2.remaining()];
            buffer.get(bArr);
            byte[] bArr3 = new byte[buffer3.remaining()];
            buffer.get(bArr);
            zzafVarC = this.f362459p.c(this.f362460q, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
        }
        return zzafVarC != null ? f4(zzafVarC) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final void zzc() {
        this.f362460q = this.f362459p.a(this.f362458b, this.f362457a.getAssets());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final void zzd() {
        long j12 = this.f362460q;
        if (j12 > 0) {
            this.f362459p.f(j12);
            this.f362460q = -1L;
        }
    }
}
