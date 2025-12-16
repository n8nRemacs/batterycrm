package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzno;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.AbstractC37639h;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.InterfaceC37641j;
import j.N;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class j extends AbstractC37639h {

    /* renamed from: j, reason: collision with root package name */
    public static final SZ0.e f362420j = SZ0.e.f15073a;

    /* renamed from: k, reason: collision with root package name */
    @k0
    public static boolean f362421k = true;

    /* renamed from: d, reason: collision with root package name */
    public final OZ0.b f362422d;

    /* renamed from: e, reason: collision with root package name */
    public final k f362423e;

    /* renamed from: f, reason: collision with root package name */
    public final zznm f362424f;

    /* renamed from: g, reason: collision with root package name */
    public final zzno f362425g;

    /* renamed from: h, reason: collision with root package name */
    public final SZ0.b f362426h = new SZ0.b();

    /* renamed from: i, reason: collision with root package name */
    public boolean f362427i;

    public j(C37642k c37642k, OZ0.b bVar, k kVar, zznm zznmVar) {
        C36729v.k(c37642k, "MlKitContext can not be null");
        C36729v.k(bVar, "BarcodeScannerOptions can not be null");
        this.f362422d = bVar;
        this.f362423e = kVar;
        this.f362424f = zznmVar;
        this.f362425g = zzno.zza(c37642k.b());
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC37645n
    @l0
    public final synchronized void b() {
        this.f362427i = this.f362423e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC37645n
    @l0
    public final synchronized void c() {
        this.f362423e.zzb();
        f362421k = true;
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC37639h
    @l0
    public final List d(@N InterfaceC37641j interfaceC37641j) {
        ArrayList arrayListA;
        com.google.mlkit.vision.common.a aVar = (com.google.mlkit.vision.common.a) interfaceC37641j;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f362426h.a(aVar);
            try {
                arrayListA = this.f362423e.a(aVar);
                e(zzkj.NO_ERROR, jElapsedRealtime, aVar, arrayListA);
                f362421k = false;
            } catch (MlKitException e12) {
                e(e12.f362288b == 14 ? zzkj.MODEL_NOT_DOWNLOADED : zzkj.UNKNOWN_ERROR, jElapsedRealtime, aVar, null);
                throw e12;
            }
        }
        return arrayListA;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC] */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(final com.google.android.gms.internal.mlkit_vision_barcode.zzkj r29, long r30, @j.N final com.google.mlkit.vision.common.a r32, @j.P java.util.List r33) {
        /*
            r28 = this;
            r8 = r28
            com.google.android.gms.internal.mlkit_vision_barcode.zzbz r9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzbz
            r9.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zzbz r10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzbz
            r10.<init>()
            if (r33 == 0) goto L53
            java.util.Iterator r0 = r33.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            QZ0.a r1 = (QZ0.a) r1
            RZ0.a r2 = r1.f13761a
            int r2 = r2.w()
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = -1
            if (r2 > r3) goto L2c
            if (r2 != 0) goto L2d
            goto L2e
        L2c:
            r2 = r4
        L2d:
            r4 = r2
        L2e:
            android.util.SparseArray r2 = com.google.mlkit.vision.barcode.internal.c.f362404a
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.mlkit_vision_barcode.zzkv r2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzkv) r2
            if (r2 != 0) goto L3a
            com.google.android.gms.internal.mlkit_vision_barcode.zzkv r2 = com.google.android.gms.internal.mlkit_vision_barcode.zzkv.FORMAT_UNKNOWN
        L3a:
            r9.zzd(r2)
            RZ0.a r1 = r1.f13761a
            int r1 = r1.A()
            android.util.SparseArray r2 = com.google.mlkit.vision.barcode.internal.c.f362405b
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzkw r1 = (com.google.android.gms.internal.mlkit_vision_barcode.zzkw) r1
            if (r1 != 0) goto L4f
            com.google.android.gms.internal.mlkit_vision_barcode.zzkw r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzkw.TYPE_UNKNOWN
        L4f:
            r10.zzd(r1)
            goto L12
        L53:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r19 = r0 - r30
            com.google.mlkit.vision.barcode.internal.i r11 = new com.google.mlkit.vision.barcode.internal.i
            r0 = r11
            r1 = r28
            r2 = r19
            r4 = r29
            r5 = r9
            r6 = r10
            r7 = r32
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zznm r0 = r8.f362424f
            com.google.android.gms.internal.mlkit_vision_barcode.zzkk r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzkk.ON_DEVICE_BARCODE_DETECT
            r0.zzb(r11, r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdw r0 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdw
            r0.<init>()
            r1 = r29
            r0.zze(r1)
            boolean r2 = com.google.mlkit.vision.barcode.internal.j.f362421k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zzf(r2)
            OZ0.b r2 = r8.f362422d
            com.google.android.gms.internal.mlkit_vision_barcode.zzmy r2 = com.google.mlkit.vision.barcode.internal.c.a(r2)
            r0.zzg(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcc r2 = r9.zzf()
            r0.zzc(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcc r2 = r10.zzf()
            r0.zzd(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdy r14 = r0.zzh()
            com.google.mlkit.vision.barcode.internal.h r0 = new com.google.mlkit.vision.barcode.internal.h
            r0.<init>(r8)
            com.google.android.gms.internal.mlkit_vision_barcode.zzkk r13 = com.google.android.gms.internal.mlkit_vision_barcode.zzkk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION
            java.util.concurrent.Executor r2 = com.google.mlkit.common.sdkinternal.C37640i.c()
            com.google.android.gms.internal.mlkit_vision_barcode.zzng r3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzng
            r18 = 0
            com.google.android.gms.internal.mlkit_vision_barcode.zznm r12 = r8.f362424f
            r11 = r3
            r15 = r19
            r17 = r0
            r11.<init>(r13, r14, r15, r17, r18)
            r2.execute(r3)
            long r26 = java.lang.System.currentTimeMillis()
            boolean r0 = r8.f362427i
            long r24 = r26 - r19
            r2 = 1
            if (r2 == r0) goto Lca
            r0 = 24301(0x5eed, float:3.4053E-41)
        Lc7:
            r22 = r0
            goto Lcd
        Lca:
            r0 = 24302(0x5eee, float:3.4054E-41)
            goto Lc7
        Lcd:
            int r23 = r29.zza()
            com.google.android.gms.internal.mlkit_vision_barcode.zzno r0 = r8.f362425g
            r21 = r0
            r21.zzc(r22, r23, r24, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.internal.j.e(com.google.android.gms.internal.mlkit_vision_barcode.zzkj, long, com.google.mlkit.vision.common.a, java.util.List):void");
    }
}
