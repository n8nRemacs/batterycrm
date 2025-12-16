package com.google.mlkit.vision.face.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.common.sdkinternal.AbstractC37639h;
import com.google.mlkit.common.sdkinternal.C37640i;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.vision.face.internal.h;
import com.google.mlkit.vision.face.internal.i;
import j.N;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class i extends AbstractC37639h {

    /* renamed from: j, reason: collision with root package name */
    @k0
    public static final AtomicBoolean f362480j = new AtomicBoolean(true);

    /* renamed from: k, reason: collision with root package name */
    public static final SZ0.e f362481k = SZ0.e.f15073a;

    /* renamed from: d, reason: collision with root package name */
    public final TZ0.e f362482d;

    /* renamed from: e, reason: collision with root package name */
    public final zzoc f362483e;

    /* renamed from: f, reason: collision with root package name */
    public final zzoe f362484f;

    /* renamed from: g, reason: collision with root package name */
    public final c f362485g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f362486h;

    /* renamed from: i, reason: collision with root package name */
    public final SZ0.b f362487i = new SZ0.b();

    @k0
    public i(@N zzoc zzocVar, @N TZ0.e eVar, @N c cVar) {
        C36729v.k(eVar, "FaceDetectorOptions can not be null");
        this.f362482d = eVar;
        this.f362483e = zzocVar;
        this.f362485g = cVar;
        this.f362484f = zzoe.zza(C37642k.c().b());
    }

    public static void e(@N ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TZ0.a) it.next()).f15705b = -1;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC37645n
    @l0
    public final synchronized void b() {
        this.f362486h = this.f362485g.zzd();
    }

    @Override // com.google.mlkit.common.sdkinternal.AbstractC37645n
    @l0
    public final synchronized void c() {
        try {
            this.f362485g.zzb();
            f362480j.set(true);
            zzoc zzocVar = this.f362483e;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.f362486h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127 A[Catch: all -> 0x002d, MlKitException -> 0x00ee, TryCatch #2 {MlKitException -> 0x00ee, blocks: (B:54:0x0121, B:61:0x0135, B:60:0x0130, B:57:0x0127, B:36:0x00b6, B:38:0x00ce, B:39:0x00d6, B:41:0x00dc, B:48:0x00fb, B:51:0x010e, B:53:0x0118), top: B:77:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[Catch: all -> 0x002d, MlKitException -> 0x00ee, TryCatch #2 {MlKitException -> 0x00ee, blocks: (B:54:0x0121, B:61:0x0135, B:60:0x0130, B:57:0x0127, B:36:0x00b6, B:38:0x00ce, B:39:0x00d6, B:41:0x00dc, B:48:0x00fb, B:51:0x010e, B:53:0x0118), top: B:77:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:4:0x0007, B:5:0x0010, B:9:0x0023, B:10:0x002c, B:16:0x0038, B:54:0x0121, B:61:0x0135, B:60:0x0130, B:57:0x0127, B:19:0x0046, B:20:0x004a, B:21:0x0053, B:23:0x0059, B:24:0x0064, B:26:0x006a, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x00a9, B:36:0x00b6, B:38:0x00ce, B:39:0x00d6, B:41:0x00dc, B:48:0x00fb, B:65:0x0147, B:67:0x014d, B:70:0x0154, B:71:0x015e, B:69:0x0151, B:51:0x010e, B:53:0x0118), top: B:79:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151 A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:4:0x0007, B:5:0x0010, B:9:0x0023, B:10:0x002c, B:16:0x0038, B:54:0x0121, B:61:0x0135, B:60:0x0130, B:57:0x0127, B:19:0x0046, B:20:0x004a, B:21:0x0053, B:23:0x0059, B:24:0x0064, B:26:0x006a, B:28:0x0074, B:30:0x0078, B:32:0x007e, B:34:0x00a9, B:36:0x00b6, B:38:0x00ce, B:39:0x00d6, B:41:0x00dc, B:48:0x00fb, B:65:0x0147, B:67:0x014d, B:70:0x0154, B:71:0x015e, B:69:0x0151, B:51:0x010e, B:53:0x0118), top: B:79:0x0007 }] */
    @Override // com.google.mlkit.common.sdkinternal.AbstractC37639h
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(@j.N com.google.mlkit.common.sdkinternal.InterfaceC37641j r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.face.internal.i.d(com.google.mlkit.common.sdkinternal.j):java.util.List");
    }

    @l0
    public final synchronized void f(final zzks zzksVar, long j12, final com.google.mlkit.vision.common.a aVar, final int i12, final int i13) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j12;
        this.f362483e.zzf(new zzoa() { // from class: com.google.mlkit.vision.face.internal.g
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                i iVar = this.f362473a;
                iVar.getClass();
                zzlj zzljVar = new zzlj();
                zzkj zzkjVar = new zzkj();
                zzkjVar.zzc(Long.valueOf(jElapsedRealtime));
                zzkjVar.zzd(zzksVar);
                zzkjVar.zze(Boolean.valueOf(i.f362480j.get()));
                Boolean bool = Boolean.TRUE;
                zzkjVar.zza(bool);
                zzkjVar.zzb(bool);
                zzljVar.zzg(zzkjVar.zzf());
                zzljVar.zze(k.a(iVar.f362482d));
                zzljVar.zzd(Integer.valueOf(i12));
                zzljVar.zzh(Integer.valueOf(i13));
                i.f362481k.getClass();
                com.google.mlkit.vision.common.a aVar2 = aVar;
                int i14 = aVar2.f362449g;
                int iB2 = SZ0.e.b(aVar2);
                zzke zzkeVar = new zzke();
                zzkeVar.zza(i14 != -1 ? i14 != 35 ? i14 != 842094169 ? i14 != 16 ? i14 != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21 : zzkf.NV16 : zzkf.YV12 : zzkf.YUV_420_888 : zzkf.BITMAP);
                zzkeVar.zzb(Integer.valueOf(iB2));
                zzljVar.zzf(zzkeVar.zzd());
                zzll zzllVarZzi = zzljVar.zzi();
                zzku zzkuVar = new zzku();
                zzkuVar.zze(iVar.f362486h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzkuVar.zzg(zzllVarZzi);
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f362480j.get()));
        zzdlVar.zza(Integer.valueOf(i12));
        zzdlVar.zze(Integer.valueOf(i13));
        zzdlVar.zzb(k.a(this.f362482d));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final h hVar = new h(this);
        final zzoc zzocVar = this.f362483e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        C37640i.c().execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, hVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ h zze;

            @Override // java.lang.Runnable
            public final void run() {
                final zzoc zzocVar2 = this.zza;
                final zzkt zzktVar2 = this.zzb;
                Object obj = this.zzc;
                long j13 = this.zzd;
                final h hVar2 = this.zze;
                HashMap map = zzocVar2.f353440j;
                if (!map.containsKey(zzktVar2)) {
                    map.put(zzktVar2, zzas.zzr());
                }
                ((zzbs) map.get(zzktVar2)).zzo(obj, Long.valueOf(j13));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (zzocVar2.c(zzktVar2, jElapsedRealtime2)) {
                    zzocVar2.f353439i.put(zzktVar2, Long.valueOf(jElapsedRealtime2));
                    final byte[] bArr2 = null;
                    C37640i.c().execute(new Runnable(zzktVar2, hVar2, bArr2) { // from class: com.google.android.gms.internal.mlkit_vision_face.zznz
                        public final /* synthetic */ zzkt zzb;
                        public final /* synthetic */ h zzc;

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzoc zzocVar3 = this.zza;
                            zzkt zzktVar3 = this.zzb;
                            h hVar3 = this.zzc;
                            HashMap map2 = zzocVar3.f353440j;
                            zzbs zzbsVar = (zzbs) map2.get(zzktVar3);
                            if (zzbsVar != null) {
                                for (Object obj2 : zzbsVar.zzq()) {
                                    ArrayList arrayList = new ArrayList(zzbsVar.zzc(obj2));
                                    Collections.sort(arrayList);
                                    zzjt zzjtVar = new zzjt();
                                    Iterator it = arrayList.iterator();
                                    long jLongValue = 0;
                                    while (it.hasNext()) {
                                        jLongValue += ((Long) it.next()).longValue();
                                    }
                                    zzjtVar.zza(Long.valueOf(jLongValue / arrayList.size()));
                                    zzjtVar.zzc(Long.valueOf(zzoc.a(arrayList, 100.0d)));
                                    zzjtVar.zzf(Long.valueOf(zzoc.a(arrayList, 75.0d)));
                                    zzjtVar.zzd(Long.valueOf(zzoc.a(arrayList, 50.0d)));
                                    zzjtVar.zzb(Long.valueOf(zzoc.a(arrayList, 25.0d)));
                                    zzjtVar.zze(Long.valueOf(zzoc.a(arrayList, 0.0d)));
                                    zzjv zzjvVarZzg = zzjtVar.zzg();
                                    int size = arrayList.size();
                                    hVar3.getClass();
                                    zzdn zzdnVar = (zzdn) obj2;
                                    i iVar = hVar3.f362479a;
                                    iVar.getClass();
                                    zzku zzkuVar = new zzku();
                                    zzkuVar.zze(iVar.f362486h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                                    zzdk zzdkVar = new zzdk();
                                    zzdkVar.zza(Integer.valueOf(size));
                                    zzdkVar.zzc(zzdnVar);
                                    zzdkVar.zzb(zzjvVarZzg);
                                    zzkuVar.zzd(zzdkVar.zze());
                                    zzocVar3.zze(zzof.zzf(zzkuVar), zzktVar3, zzocVar3.b());
                                }
                                map2.remove(zzktVar3);
                            }
                        }
                    });
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f362484f.zzc(true != this.f362486h ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
