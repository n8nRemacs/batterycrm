package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37646o;
import j.P;
import j.l0;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f362438a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f362439b;

    /* renamed from: c, reason: collision with root package name */
    public final zzad f362440c;

    /* renamed from: d, reason: collision with root package name */
    public final zznm f362441d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public zzaf f362442e;

    public o(Context context, OZ0.b bVar, zznm zznmVar) {
        zzad zzadVar = new zzad();
        this.f362440c = zzadVar;
        this.f362439b = context;
        zzadVar.zza = bVar.f12323a;
        this.f362441d = zznmVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final ArrayList a(com.google.mlkit.vision.common.a aVar) throws MlKitException {
        zzq[] zzqVarArrZzf;
        if (this.f362442e == null) {
            zzc();
        }
        zzaf zzafVar = this.f362442e;
        if (zzafVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar = new zzaj(aVar.f362446d, aVar.f362447e, 0, 0L, SZ0.c.a(aVar.f362448f));
        try {
            int i12 = aVar.f362449g;
            if (i12 == -1) {
                zzqVarArrZzf = zzafVar.zzf(new com.google.android.gms.dynamic.f(aVar.f362443a), zzajVar);
            } else if (i12 == 17) {
                zzqVarArrZzf = zzafVar.zze(new com.google.android.gms.dynamic.f(aVar.f362444b), zzajVar);
            } else if (i12 == 35) {
                Image.Plane[] planeArrC = aVar.c();
                C36729v.j(planeArrC);
                zzajVar.zza = planeArrC[0].getRowStride();
                zzqVarArrZzf = zzafVar.zze(new com.google.android.gms.dynamic.f(planeArrC[0].getBuffer()), zzajVar);
            } else {
                if (i12 != 842094169) {
                    int i13 = aVar.f362449g;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(i13);
                    throw new MlKitException(sb2.toString(), 3);
                }
                SZ0.d.f15072a.getClass();
                zzqVarArrZzf = zzafVar.zze(new com.google.android.gms.dynamic.f(SZ0.d.a(aVar)), zzajVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzq zzqVar : zzqVarArrZzf) {
                arrayList.add(new QZ0.a(new n(zzqVar)));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException(13, "Failed to detect with legacy barcode detector", e12);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final void zzb() {
        zzaf zzafVar = this.f362442e;
        if (zzafVar != null) {
            try {
                zzafVar.zzd();
            } catch (RemoteException unused) {
            }
            this.f362442e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final boolean zzc() throws MlKitException {
        Context context = this.f362439b;
        if (this.f362442e != null) {
            return false;
        }
        try {
            zzaf zzafVarZzd = zzah.zza(DynamiteModule.c(context, DynamiteModule.f349661b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(new com.google.android.gms.dynamic.f(context), this.f362440c);
            this.f362442e = zzafVarZzd;
            zznm zznmVar = this.f362441d;
            if (zzafVarZzd == null && !this.f362438a) {
                Feature[] featureArr = C37646o.f362376a;
                C37646o.a(context, zzaq.zzh("barcode"));
                this.f362438a = true;
                c.b(zznmVar, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            c.b(zznmVar, zzkj.NO_ERROR);
            return false;
        } catch (RemoteException e12) {
            throw new MlKitException(13, "Failed to create legacy barcode detector.", e12);
        } catch (DynamiteModule.LoadingException e13) {
            throw new MlKitException(13, "Failed to load deprecated vision dynamite module.", e13);
        }
    }
}
