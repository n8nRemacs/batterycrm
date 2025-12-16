package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.compose.foundation.H;
import com.google.android.gms.common.internal.C36713l;
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
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zznv;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zznw;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzs;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzsv;
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

    /* renamed from: u, reason: collision with root package name */
    public static final C36713l f355698u = new C36713l("FaceDetector", "");

    /* renamed from: a, reason: collision with root package name */
    public final Context f355699a;

    /* renamed from: b, reason: collision with root package name */
    public final zzti f355700b;

    /* renamed from: p, reason: collision with root package name */
    public final zzah f355701p;

    /* renamed from: q, reason: collision with root package name */
    public final FaceDetectorV2Jni f355702q;

    /* renamed from: r, reason: collision with root package name */
    public final b f355703r;

    /* renamed from: s, reason: collision with root package name */
    public final zzsv f355704s;

    /* renamed from: t, reason: collision with root package name */
    public long f355705t = -1;

    public a(Context context, zzti zztiVar, FaceDetectorV2Jni faceDetectorV2Jni, b bVar) {
        this.f355699a = context;
        this.f355700b = zztiVar;
        int iZzc = zztiVar.zzc();
        zzaq zzaqVarZza = zzar.zza();
        zzaqVarZza.zzb("models");
        zzar zzarVar = (zzar) zzaqVarZza.zzn();
        zzag zzagVarZza = zzah.zza();
        zzai zzaiVarZza = zzaj.zza();
        zzaiVarZza.zzc(zzarVar);
        zzaiVarZza.zzb(zzarVar);
        zzaiVarZza.zzd(zzarVar);
        zzagVarZza.zzc(zzaiVarZza);
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
            int iZze = zztiVar.zze();
            if (iZze == 1) {
                zzagVarZza.zzk(2);
            } else if (iZze == 2) {
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
        this.f355701p = (zzah) zzagVarZza.zzn();
        this.f355702q = faceDetectorV2Jni;
        this.f355703r = bVar;
        this.f355704s = zzsv.zza(context);
        zzj.zza(context);
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
        throw new IllegalArgumentException(AK.c.g(i12, "Unsupported rotation degree: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f4(com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf r30) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.mlkit.a.f4(com.google.android.gms.internal.mlkit_vision_face_bundled.zzaf):java.util.ArrayList");
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
        FaceDetectorV2Jni faceDetectorV2Jni = this.f355702q;
        if (zIsDirect) {
            zzafVarB = faceDetectorV2Jni.d(this.f355705t, byteBuffer, zzpVar);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            zzafVarB = faceDetectorV2Jni.b(this.f355705t, byteBuffer.array(), zzpVar);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            zzafVarB = faceDetectorV2Jni.b(this.f355705t, bArr, zzpVar);
        }
        return zzafVarB != null ? f4(zzafVarB) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final List zzb(com.google.android.gms.dynamic.d dVar, zzte zzteVar) throws RemoteException {
        ArrayList arrayListH4;
        zzaf zzafVarC;
        SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iZzb = zzteVar.zzb();
        if (iZzb == -1) {
            arrayListH4 = h4(zzd.zza((Bitmap) f.g4(dVar), true), zzteVar, 2);
        } else if (iZzb == 17) {
            arrayListH4 = h4((ByteBuffer) f.g4(dVar), zzteVar, 2);
        } else if (iZzb == 35) {
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
                zzafVarC = this.f355702q.e(this.f355705t, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
            } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
                zzafVarC = this.f355702q.c(this.f355705t, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
            } else {
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                byte[] bArr2 = new byte[buffer2.remaining()];
                buffer.get(bArr);
                byte[] bArr3 = new byte[buffer3.remaining()];
                buffer.get(bArr);
                zzafVarC = this.f355702q.c(this.f355705t, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), zzpVar);
            }
            arrayListH4 = zzafVarC != null ? f4(zzafVarC) : new ArrayList();
        } else {
            if (iZzb != 842094169) {
                String strJ = H.j(zzteVar.zzb(), Build.VERSION.SDK_INT, "Unsupported image format ", " at API ");
                this.f355704s.zzc(25503, 1, jCurrentTimeMillis, System.currentTimeMillis());
                throw new RemoteException(strJ);
            }
            arrayListH4 = h4((ByteBuffer) f.g4(dVar), zzteVar, 7);
        }
        ArrayList arrayList = arrayListH4;
        SystemClock.elapsedRealtime();
        b bVar = this.f355703r;
        bVar.getClass();
        bVar.f355706a.a(this.f355700b, zznw.OPTIONAL_MODULE_FACE_DETECTION_INFERENCE, zznv.NO_ERROR);
        this.f355704s.zzc(25503, 0, jCurrentTimeMillis, System.currentTimeMillis());
        return arrayList;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final void zzc() {
        this.f355705t = this.f355702q.a(this.f355701p, this.f355699a.getAssets());
        b bVar = this.f355703r;
        bVar.getClass();
        bVar.f355706a.a(this.f355700b, zznw.OPTIONAL_MODULE_FACE_DETECTION_INIT, zznv.NO_ERROR);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztn
    public final void zzd() {
        long j12 = this.f355705t;
        if (j12 > 0) {
            this.f355702q.f(j12);
            this.f355705t = -1L;
        }
    }
}
