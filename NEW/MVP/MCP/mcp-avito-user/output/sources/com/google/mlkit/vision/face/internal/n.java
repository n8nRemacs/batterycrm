package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37646o;
import j.P;
import j.l0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f362493a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f362494b;

    /* renamed from: c, reason: collision with root package name */
    public final TZ0.e f362495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362496d;

    /* renamed from: e, reason: collision with root package name */
    public final zzoc f362497e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public zzj f362498f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public zzj f362499g;

    public n(Context context, TZ0.e eVar, zzoc zzocVar) {
        this.f362494b = context;
        this.f362495c = eVar;
        C36688g.f349289b.getClass();
        this.f362496d = C36688g.a(context);
        this.f362497e = zzocVar;
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final Pair a(com.google.mlkit.vision.common.a aVar) throws MlKitException {
        ArrayList arrayListB;
        if (this.f362498f == null && this.f362499g == null) {
            zzd();
        }
        zzj zzjVar = this.f362498f;
        if (zzjVar == null && this.f362499g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayListB2 = null;
        if (zzjVar != null) {
            arrayListB = b(zzjVar, aVar);
            if (!this.f362495c.f15720e) {
                i.e(arrayListB);
            }
        } else {
            arrayListB = null;
        }
        zzj zzjVar2 = this.f362499g;
        if (zzjVar2 != null) {
            arrayListB2 = b(zzjVar2, aVar);
            i.e(arrayListB2);
        }
        return new Pair(arrayListB, arrayListB2);
    }

    public final ArrayList b(zzj zzjVar, com.google.mlkit.vision.common.a aVar) throws MlKitException {
        zzf[] zzfVarArrZze;
        try {
            zzp zzpVar = new zzp(aVar.f362446d, aVar.f362447e, 0, SystemClock.elapsedRealtime(), SZ0.c.a(aVar.f362448f));
            if (aVar.f362449g != 35 || this.f362496d < 201500000) {
                SZ0.d.f15072a.getClass();
                zzfVarArrZze = zzjVar.zze(new com.google.android.gms.dynamic.f(SZ0.d.a(aVar)), zzpVar);
            } else {
                Image.Plane[] planeArrC = aVar.c();
                C36729v.j(planeArrC);
                zzfVarArrZze = zzjVar.zzf(new com.google.android.gms.dynamic.f(planeArrC[0].getBuffer()), new com.google.android.gms.dynamic.f(planeArrC[1].getBuffer()), new com.google.android.gms.dynamic.f(planeArrC[2].getBuffer()), planeArrC[0].getPixelStride(), planeArrC[1].getPixelStride(), planeArrC[2].getPixelStride(), planeArrC[0].getRowStride(), planeArrC[1].getRowStride(), planeArrC[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zzfVarArrZze) {
                arrayList.add(new TZ0.a(zzfVar));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException(13, "Failed to detect with legacy face detector", e12);
        }
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final void zzb() {
        zzj zzjVar = this.f362498f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f362498f = null;
        }
        zzj zzjVar2 = this.f362499g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException unused2) {
            }
            this.f362499g = null;
        }
    }

    @Override // com.google.mlkit.vision.face.internal.c
    @l0
    public final boolean zzd() throws MlKitException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Context context = this.f362494b;
        TZ0.e eVar = this.f362495c;
        boolean z12 = false;
        if (this.f362498f != null || this.f362499g != null) {
            return false;
        }
        try {
            zzm zzmVarZza = zzl.zza(DynamiteModule.c(context, DynamiteModule.f349661b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            com.google.android.gms.dynamic.f fVar = new com.google.android.gms.dynamic.f(context);
            int i18 = eVar.f15717b;
            int i19 = eVar.f15719d;
            int i22 = eVar.f15718c;
            int i23 = eVar.f15716a;
            if (i18 == 2) {
                if (this.f362499g == null) {
                    this.f362499g = zzmVarZza.zzd(fVar, new zzh(2, 2, 0, true, false, eVar.f15721f));
                }
                if ((i23 == 2 || i22 == 2 || i19 == 2) && this.f362498f == null) {
                    if (i19 == 1) {
                        i15 = 0;
                    } else {
                        if (i19 != 2) {
                            throw new IllegalArgumentException("Invalid mode type: " + i19);
                        }
                        i15 = 1;
                    }
                    if (i23 == 1) {
                        i16 = 0;
                    } else {
                        if (i23 != 2) {
                            throw new IllegalArgumentException("Invalid landmark type: " + i23);
                        }
                        i16 = 1;
                    }
                    if (i22 == 1) {
                        i17 = 0;
                    } else {
                        if (i22 != 2) {
                            throw new IllegalArgumentException("Invalid classification type: " + i22);
                        }
                        i17 = 1;
                    }
                    this.f362498f = zzmVarZza.zzd(fVar, new zzh(i15, i16, i17, false, eVar.f15720e, eVar.f15721f));
                }
            } else if (this.f362498f == null) {
                if (i19 == 1) {
                    i12 = 0;
                } else {
                    if (i19 != 2) {
                        throw new IllegalArgumentException("Invalid mode type: " + i19);
                    }
                    i12 = 1;
                }
                if (i23 == 1) {
                    i13 = 0;
                } else {
                    if (i23 != 2) {
                        throw new IllegalArgumentException("Invalid landmark type: " + i23);
                    }
                    i13 = 1;
                }
                if (i22 == 1) {
                    i14 = 0;
                } else {
                    if (i22 != 2) {
                        throw new IllegalArgumentException("Invalid classification type: " + i22);
                    }
                    i14 = 1;
                }
                this.f362498f = zzmVarZza.zzd(fVar, new zzh(i12, i13, i14, false, eVar.f15720e, eVar.f15721f));
            }
            if (this.f362498f == null && this.f362499g == null && !this.f362493a) {
                Feature[] featureArr = C37646o.f362376a;
                C37646o.a(context, zzaq.zzh("barcode"));
                this.f362493a = true;
            }
            zzks zzksVar = zzks.NO_ERROR;
            AtomicReference atomicReference = k.f362490a;
            this.f362497e.zzf(new j(z12, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e12) {
            throw new MlKitException(13, "Failed to create legacy face detector.", e12);
        } catch (DynamiteModule.LoadingException e13) {
            throw new MlKitException(13, "Failed to load deprecated vision dynamite module.", e13);
        }
    }
}
