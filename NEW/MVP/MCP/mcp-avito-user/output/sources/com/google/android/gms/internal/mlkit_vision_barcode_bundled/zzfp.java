package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfp implements zzgb {

    /* renamed from: a, reason: collision with root package name */
    public final zzfl f352485a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgp f352486b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352487c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdo f352488d;

    public zzfp(zzgp zzgpVar, zzdo zzdoVar, zzfl zzflVar) {
        this.f352486b = zzgpVar;
        this.f352487c = zzdoVar.f(zzflVar);
        this.f352488d = zzdoVar;
        this.f352485a = zzflVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zza(Object obj) {
        zzgp zzgpVar = this.f352486b;
        int iB2 = zzgpVar.b(zzgpVar.c(obj));
        return this.f352487c ? iB2 + this.f352488d.b(obj).zzb() : iB2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zzb(Object obj) {
        int iHashCode = this.f352486b.c(obj).hashCode();
        return this.f352487c ? (iHashCode * 53) + this.f352488d.b(obj).f352425a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final Object zze() {
        return this.f352485a.zzU().zzm();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzf(Object obj) {
        this.f352486b.g(obj);
        this.f352488d.e(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzg(Object obj, Object obj2) {
        Class cls = zzgd.f352512a;
        zzgp zzgpVar = this.f352486b;
        zzgpVar.h(obj, zzgpVar.d(zzgpVar.c(obj), zzgpVar.c(obj2)));
        if (this.f352487c) {
            zzdo zzdoVar = this.f352488d;
            zzds zzdsVarB = zzdoVar.b(obj2);
            if (zzdsVarB.f352425a.isEmpty()) {
                return;
            }
            zzdoVar.c(obj).zzh(zzdsVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r21) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r20
            r9 = r21
            r1 = r17
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r2 = r1.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq.zzc()
            if (r2 != r3) goto L1a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgq.a()
            r1.zzc = r2
        L1a:
            r10 = r2
            r1 = r17
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdy r1 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdy) r1
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r11 = r1.n()
            r1 = r19
            r2 = 0
        L26:
            if (r1 >= r8) goto Ld2
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.j(r7, r1, r9)
            int r1 = r9.zza
            r4 = 11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r5 = r0.f352485a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r6 = r0.f352488d
            r13 = 2
            if (r1 == r4) goto L71
            r4 = r1 & 7
            if (r4 != r13) goto L6c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn r2 = r9.zzd
            int r4 = r1 >>> 3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzea r13 = r6.d(r2, r5, r4)
            if (r13 == 0) goto L60
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r2 = r13.f352442c
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r1 = r1.zzb(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.d(r1, r7, r3, r8, r9)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r2 = r13.f352443d
            java.lang.Object r3 = r9.zzc
            r11.zzi(r2, r3)
        L5e:
            r2 = r13
            goto L26
        L60:
            r2 = r18
            r4 = r20
            r5 = r10
            r6 = r21
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.i(r1, r2, r3, r4, r5, r6)
            goto L5e
        L6c:
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.n(r1, r7, r3, r8, r9)
            goto L26
        L71:
            r1 = 0
            r4 = 0
        L73:
            if (r3 >= r8) goto Lc6
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.j(r7, r3, r9)
            int r14 = r9.zza
            r15 = r14 & 7
            int r12 = r14 >>> 3
            if (r12 == r13) goto Lae
            r13 = 3
            if (r12 == r13) goto L85
            goto Lbd
        L85:
            if (r2 == 0) goto La2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu r12 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu.zza()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl r13 = r2.f352442c
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb r12 = r12.zzb(r13)
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.d(r12, r7, r3, r8, r9)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r12 = r2.f352443d
            java.lang.Object r13 = r9.zzc
            r11.zzi(r12, r13)
        La0:
            r13 = 2
            goto L73
        La2:
            r12 = 2
            if (r15 != r12) goto Lbd
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.a(r7, r3, r9)
            java.lang.Object r4 = r9.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r4
            goto La0
        Lae:
            if (r15 != 0) goto Lbd
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.j(r7, r3, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn r2 = r9.zzd
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzea r2 = r6.d(r2, r5, r1)
            goto La0
        Lbd:
            r12 = 12
            if (r14 == r12) goto Lc6
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcp.n(r14, r7, r3, r8, r9)
            goto La0
        Lc6:
            if (r4 == 0) goto Lcf
            int r1 = r1 << 3
            r5 = 2
            r1 = r1 | r5
            r10.b(r1, r4)
        Lcf:
            r1 = r3
            goto L26
        Ld2:
            if (r1 != r8) goto Ld5
            return
        Ld5:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.c()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final boolean zzi(Object obj, Object obj2) {
        zzgp zzgpVar = this.f352486b;
        if (!zzgpVar.c(obj).equals(zzgpVar.c(obj2))) {
            return false;
        }
        if (!this.f352487c) {
            return true;
        }
        zzdo zzdoVar = this.f352488d;
        return zzdoVar.b(obj).equals(zzdoVar.b(obj2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final boolean zzj(Object obj) {
        return this.f352488d.b(obj).zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzm(Object obj, zzdj zzdjVar) {
        Iterator itZzf = this.f352488d.b(obj).zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzdr zzdrVar = (zzdr) entry.getKey();
            if (zzdrVar.zze() != zzhg.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzdrVar.zzg();
            zzdrVar.zzf();
            if (entry instanceof zzeq) {
                zzdjVar.zzw(zzdrVar.zza(), ((zzeq) entry).zza().zzb());
            } else {
                zzdjVar.zzw(zzdrVar.zza(), entry.getValue());
            }
        }
        zzgp zzgpVar = this.f352486b;
        zzgpVar.i(zzgpVar.c(obj), zzdjVar);
    }
}
