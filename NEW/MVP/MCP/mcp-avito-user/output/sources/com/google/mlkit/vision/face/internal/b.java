package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37646o;
import j.P;
import j.l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f362462a;

    /* renamed from: b, reason: collision with root package name */
    public final TZ0.e f362463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f362464c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f362465d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362466e;

    /* renamed from: f, reason: collision with root package name */
    public final zzoc f362467f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public zzoy f362468g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public zzoy f362469h;

    public b(Context context, TZ0.e eVar, zzoc zzocVar) {
        this.f362462a = context;
        this.f362463b = eVar;
        this.f362467f = zzocVar;
    }

    public static ArrayList d(zzoy zzoyVar, com.google.mlkit.vision.common.a aVar) throws MlKitException {
        if (aVar.f362449g == -1) {
            SZ0.d.f15072a.getClass();
            ByteBuffer byteBufferA = SZ0.d.a(aVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i12 = aVar.f362446d;
            int i13 = aVar.f362447e;
            int i14 = aVar.f362448f;
            com.google.mlkit.vision.common.a aVar2 = new com.google.mlkit.vision.common.a(i12, byteBufferA, i13, i14);
            zzli.zza(zzlg.zzb("vision-common"), 17, 3, jElapsedRealtime, i13, i12, byteBufferA.limit(), i14);
            aVar = aVar2;
        }
        int iA2 = SZ0.c.a(aVar.f362448f);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        zzoq zzoqVar = new zzoq(aVar.f362449g, aVar.f362446d, aVar.f362447e, iA2, jElapsedRealtime2);
        SZ0.e.f15073a.getClass();
        try {
            List listZzd = zzoyVar.zzd(SZ0.e.a(aVar), zzoqVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new TZ0.a((zzow) it.next()));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException(13, "Failed to run face detector.", e12);
        }
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final Pair a(com.google.mlkit.vision.common.a aVar) throws MlKitException, NoSuchFieldException, ClassNotFoundException {
        ArrayList arrayListD;
        if (this.f362469h == null && this.f362468g == null) {
            zzd();
        }
        if (!this.f362464c) {
            try {
                zzoy zzoyVar = this.f362469h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f362468g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f362464c = true;
            } catch (RemoteException e12) {
                throw new MlKitException(13, "Failed to init face detector.", e12);
            }
        }
        zzoy zzoyVar3 = this.f362469h;
        ArrayList arrayListD2 = null;
        if (zzoyVar3 != null) {
            arrayListD = d(zzoyVar3, aVar);
            if (!this.f362463b.f15720e) {
                i.e(arrayListD);
            }
        } else {
            arrayListD = null;
        }
        zzoy zzoyVar4 = this.f362468g;
        if (zzoyVar4 != null) {
            arrayListD2 = d(zzoyVar4, aVar);
            i.e(arrayListD2);
        }
        return new Pair(arrayListD, arrayListD2);
    }

    public final void b() {
        TZ0.e eVar = this.f362463b;
        if (eVar.f15717b != 2) {
            if (this.f362469h == null) {
                this.f362469h = c(new zzou(eVar.f15719d, eVar.f15716a, eVar.f15718c, 1, eVar.f15720e, eVar.f15721f));
                return;
            }
            return;
        }
        if (this.f362468g == null) {
            this.f362468g = c(new zzou(eVar.f15719d, 1, 1, 2, false, eVar.f15721f));
        }
        if ((eVar.f15716a == 2 || eVar.f15718c == 2 || eVar.f15719d == 2) && this.f362469h == null) {
            this.f362469h = c(new zzou(eVar.f15719d, eVar.f15716a, eVar.f15718c, 1, eVar.f15720e, eVar.f15721f));
        }
    }

    public final zzoy c(zzou zzouVar) {
        boolean z12 = this.f362465d;
        Context context = this.f362462a;
        return z12 ? zzpa.zza(DynamiteModule.c(context, DynamiteModule.f349662c, ModuleDescriptor.MODULE_ID).b("com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator")).zzd(new com.google.android.gms.dynamic.f(context), zzouVar) : zzpa.zza(DynamiteModule.c(context, DynamiteModule.f349661b, "com.google.android.gms.vision.face").b("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(new com.google.android.gms.dynamic.f(context), zzouVar);
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f362469h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f362469h = null;
            }
            zzoy zzoyVar2 = this.f362468g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f362468g = null;
            }
        } catch (RemoteException unused) {
        }
        this.f362464c = false;
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final boolean zzd() throws MlKitException, NoSuchFieldException, ClassNotFoundException {
        if (this.f362469h != null || this.f362468g != null) {
            return this.f362465d;
        }
        Context context = this.f362462a;
        int iA2 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
        zzoc zzocVar = this.f362467f;
        if (iA2 > 0) {
            this.f362465d = true;
            try {
                b();
            } catch (RemoteException e12) {
                throw new MlKitException(13, "Failed to create thick face detector.", e12);
            } catch (DynamiteModule.LoadingException e13) {
                throw new MlKitException(13, "Failed to load the bundled face module.", e13);
            }
        } else {
            this.f362465d = false;
            try {
                b();
            } catch (RemoteException e14) {
                boolean z12 = this.f362465d;
                zzks zzksVar = zzks.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference = k.f362490a;
                zzocVar.zzf(new j(z12, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(13, "Failed to create thin face detector.", e14);
            } catch (DynamiteModule.LoadingException e15) {
                if (!this.f362466e) {
                    Feature[] featureArr = C37646o.f362376a;
                    C37646o.a(context, zzaq.zzh("face"));
                    this.f362466e = true;
                }
                boolean z13 = this.f362465d;
                zzks zzksVar2 = zzks.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference2 = k.f362490a;
                zzocVar.zzf(new j(z13, zzksVar2), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(14, "Waiting for the face module to be downloaded. Please wait.", e15);
            }
        }
        boolean z14 = this.f362465d;
        zzks zzksVar3 = zzks.NO_ERROR;
        AtomicReference atomicReference3 = k.f362490a;
        zzocVar.zzf(new j(z14, zzksVar3), zzkt.ON_DEVICE_FACE_LOAD);
        return this.f362465d;
    }
}
