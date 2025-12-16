package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzww implements zzxf {

    /* renamed from: a, reason: collision with root package name */
    public final zzws f354102a;

    /* renamed from: b, reason: collision with root package name */
    public final zzxw f354103b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f354104c;

    /* renamed from: d, reason: collision with root package name */
    public final zzuz f354105d;

    public zzww(zzxw zzxwVar, zzuz zzuzVar, zzws zzwsVar) {
        this.f354103b = zzxwVar;
        this.f354104c = zzuzVar.g(zzwsVar);
        this.f354105d = zzuzVar;
        this.f354102a = zzwsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final int zza(Object obj) {
        zzxw zzxwVar = this.f354103b;
        int iB2 = zzxwVar.b(zzxwVar.d(obj));
        return this.f354104c ? iB2 + this.f354105d.b(obj).zzb() : iB2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final int zzb(Object obj) {
        int iHashCode = this.f354103b.d(obj).hashCode();
        return this.f354104c ? (iHashCode * 53) + this.f354105d.b(obj).f354050a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final Object zze() {
        zzws zzwsVar = this.f354102a;
        return zzwsVar instanceof zzvn ? (zzvn) ((zzvn) zzwsVar).h(4, null) : zzwsVar.zzK().zzp();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final void zzf(Object obj) {
        this.f354103b.g(obj);
        this.f354105d.e(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final void zzg(Object obj, Object obj2) {
        Class cls = zzxh.f354117a;
        zzxw zzxwVar = this.f354103b;
        zzxwVar.h(obj, zzxwVar.e(zzxwVar.d(obj), zzxwVar.d(obj2)));
        if (this.f354104c) {
            zzuz zzuzVar = this.f354105d;
            zzvd zzvdVarB = zzuzVar.b(obj2);
            if (zzvdVarB.f354050a.isEmpty()) {
                return;
            }
            zzuzVar.c(obj).zzi(zzvdVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.mlkit_vision_face_bundled.zzty r21) throws com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r20
            r9 = r21
            r1 = r17
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn r1 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn) r1
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxx r2 = r1.zzc
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxx r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzxx.zzc()
            if (r2 != r3) goto L1a
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxx r2 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzxx.a()
            r1.zzc = r2
        L1a:
            r10 = r2
            r1 = r17
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvj r1 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzvj) r1
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvd r11 = r1.k()
            r1 = r19
            r2 = 0
        L26:
            if (r1 >= r8) goto Ld2
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.i(r7, r1, r9)
            int r1 = r9.zza
            r4 = 11
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzws r5 = r0.f354102a
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzuz r6 = r0.f354105d
            r13 = 2
            if (r1 == r4) goto L71
            r4 = r1 & 7
            if (r4 != r13) goto L6c
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzuy r2 = r9.zzd
            int r4 = r1 >>> 3
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvl r13 = r6.d(r2, r5, r4)
            if (r13 == 0) goto L60
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb.zza()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzws r2 = r13.f354063c
            java.lang.Class r2 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf r1 = r1.zzb(r2)
            int r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.d(r1, r7, r3, r8, r9)
            java.lang.Object r2 = r9.zzc
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvk r3 = r13.f354064d
            r11.zzj(r3, r2)
        L5e:
            r2 = r13
            goto L26
        L60:
            r2 = r18
            r4 = r20
            r5 = r10
            r6 = r21
            int r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.h(r1, r2, r3, r4, r5, r6)
            goto L5e
        L6c:
            int r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.o(r1, r7, r3, r8, r9)
            goto L26
        L71:
            r1 = 0
            r4 = 0
        L73:
            if (r3 >= r8) goto Lc6
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.i(r7, r3, r9)
            int r14 = r9.zza
            int r15 = r14 >>> 3
            r12 = r14 & 7
            if (r15 == r13) goto Lae
            r13 = 3
            if (r15 == r13) goto L85
            goto Lbd
        L85:
            if (r2 == 0) goto La2
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb r12 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb.zza()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzws r13 = r2.f354063c
            java.lang.Class r13 = r13.getClass()
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf r12 = r12.zzb(r13)
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.d(r12, r7, r3, r8, r9)
            java.lang.Object r12 = r9.zzc
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvk r13 = r2.f354064d
            r11.zzj(r13, r12)
        La0:
            r13 = 2
            goto L73
        La2:
            r13 = 2
            if (r12 != r13) goto Lbd
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.a(r7, r3, r9)
            java.lang.Object r4 = r9.zzc
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzul r4 = (com.google.android.gms.internal.mlkit_vision_face_bundled.zzul) r4
            goto La0
        Lae:
            if (r12 != 0) goto Lbd
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.i(r7, r3, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzuy r2 = r9.zzd
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvl r2 = r6.d(r2, r5, r1)
            goto La0
        Lbd:
            r12 = 12
            if (r14 == r12) goto Lc6
            int r3 = com.google.android.gms.internal.mlkit_vision_face_bundled.zztz.o(r14, r7, r3, r8, r9)
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
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv r1 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv.c()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzww.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_face_bundled.zzty):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final void zzi(Object obj, zzyo zzyoVar) {
        Iterator itZzf = this.f354105d.b(obj).zzf();
        if (!itZzf.hasNext()) {
            zzxw zzxwVar = this.f354103b;
            zzxwVar.i(zzxwVar.d(obj), zzyoVar);
        } else {
            zzvc zzvcVar = (zzvc) ((Map.Entry) itZzf.next()).getKey();
            if (zzvcVar.zzc() == zzyn.MESSAGE) {
                zzvcVar.zze();
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final boolean zzj(Object obj, Object obj2) {
        zzxw zzxwVar = this.f354103b;
        if (!zzxwVar.d(obj).equals(zzxwVar.d(obj2))) {
            return false;
        }
        if (!this.f354104c) {
            return true;
        }
        zzuz zzuzVar = this.f354105d;
        return zzuzVar.b(obj).equals(zzuzVar.b(obj2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxf
    public final boolean zzk(Object obj) {
        return this.f354105d.b(obj).zzl();
    }
}
