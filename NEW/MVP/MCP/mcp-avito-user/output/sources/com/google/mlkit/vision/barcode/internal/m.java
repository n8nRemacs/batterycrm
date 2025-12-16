package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.A;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzon;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzox;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpg;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37646o;
import j.P;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class m implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final zzcc f362429h = zzcc.zzi("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    public boolean f362430a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f362432c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f362433d;

    /* renamed from: e, reason: collision with root package name */
    public final OZ0.b f362434e;

    /* renamed from: f, reason: collision with root package name */
    public final zznm f362435f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public zzox f362436g;

    public m(Context context, OZ0.b bVar, zznm zznmVar) {
        this.f362433d = context;
        this.f362434e = bVar;
        this.f362435f = zznmVar;
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final ArrayList a(com.google.mlkit.vision.common.a aVar) throws Throwable {
        if (this.f362436g == null) {
            zzc();
        }
        zzox zzoxVar = this.f362436g;
        C36729v.j(zzoxVar);
        if (!this.f362430a) {
            try {
                zzoxVar.zze();
                this.f362430a = true;
            } catch (RemoteException e12) {
                throw new MlKitException(13, "Failed to init barcode scanner.", e12);
            }
        }
        int rowStride = aVar.f362446d;
        if (aVar.f362449g == 35) {
            Image.Plane[] planeArrC = aVar.c();
            C36729v.j(planeArrC);
            rowStride = planeArrC[0].getRowStride();
        }
        int iA2 = SZ0.c.a(aVar.f362448f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzpg zzpgVar = new zzpg(aVar.f362449g, rowStride, aVar.f362447e, iA2, jElapsedRealtime);
        SZ0.e.f15073a.getClass();
        try {
            List listZzd = zzoxVar.zzd(SZ0.e.a(aVar), zzpgVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new QZ0.a(new l((zzon) it.next())));
            }
            return arrayList;
        } catch (RemoteException e13) {
            throw new MlKitException(13, "Failed to run barcode scanner.", e13);
        }
    }

    @k0
    public final zzox b(DynamiteModule.a aVar, String str, String str2) {
        Context context = this.f362433d;
        return zzoz.zza(DynamiteModule.c(context, aVar, str).b(str2)).zzd(new com.google.android.gms.dynamic.f(context), new zzop(this.f362434e.f12323a));
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final void zzb() {
        zzox zzoxVar = this.f362436g;
        if (zzoxVar != null) {
            try {
                zzoxVar.zzf();
            } catch (RemoteException unused) {
            }
            this.f362436g = null;
            this.f362430a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.k
    @l0
    public final boolean zzc() throws Throwable {
        boolean z12 = false;
        if (this.f362436g != null) {
            return this.f362431b;
        }
        Context context = this.f362433d;
        boolean z13 = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > 0;
        zznm zznmVar = this.f362435f;
        if (z13) {
            this.f362431b = true;
            try {
                this.f362436g = b(DynamiteModule.f349662c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e12) {
                throw new MlKitException(13, "Failed to create thick barcode scanner.", e12);
            } catch (DynamiteModule.LoadingException e13) {
                throw new MlKitException(13, "Failed to load the bundled barcode module.", e13);
            }
        } else {
            this.f362431b = false;
            Feature[] featureArr = C37646o.f362376a;
            C36688g.f349289b.getClass();
            int iA2 = C36688g.a(context);
            zzcc zzccVar = f362429h;
            if (iA2 >= 221500000) {
                final Feature[] featureArrB = C37646o.b(C37646o.f362379d, zzccVar);
                try {
                    z12 = ((ModuleAvailabilityResponse) C37030m.a(new A(context, A.f349511k, C36616a.d.f348913j2, h.a.f348930c).d(new com.google.android.gms.common.api.k() { // from class: com.google.mlkit.common.sdkinternal.H
                        @Override // com.google.android.gms.common.api.k
                        public final Feature[] a() {
                            Feature[] featureArr2 = C37646o.f362376a;
                            return featureArrB;
                        }
                    }).e(new InterfaceC37023f() { // from class: com.google.mlkit.common.sdkinternal.I
                        @Override // com.google.android.gms.tasks.InterfaceC37023f
                        public final void onFailure(Exception exc) {
                        }
                    }))).f349501b;
                } catch (DynamiteModule.LoadingException | InterruptedException | ExecutionException unused) {
                }
            } else {
                Iterator it = zzccVar.iterator();
                while (it.hasNext()) {
                    DynamiteModule.c(context, DynamiteModule.f349661b, (String) it.next());
                }
                z12 = true;
            }
            if (!z12) {
                if (!this.f362432c) {
                    C37646o.a(context, zzcc.zzi("barcode", "tflite_dynamite"));
                    this.f362432c = true;
                }
                c.b(zznmVar, zzkj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f362436g = b(DynamiteModule.f349661b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e14) {
                c.b(zznmVar, zzkj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, "Failed to create thin barcode scanner.", e14);
            }
        }
        c.b(zznmVar, zzkj.NO_ERROR);
        return this.f362431b;
    }
}
