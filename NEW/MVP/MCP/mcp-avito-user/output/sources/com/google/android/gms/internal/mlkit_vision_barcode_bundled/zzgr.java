package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgr extends zzgp {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ int a(Object obj) {
        return ((zzgq) obj).zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ int b(Object obj) {
        return ((zzgq) obj).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ zzgq c(Object obj) {
        return ((zzec) obj).zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final Object d(Object obj, Object obj2) {
        zzgq zzgqVar = (zzgq) obj2;
        if (zzgqVar.equals(zzgq.zzc())) {
            return obj;
        }
        zzgq zzgqVar2 = (zzgq) obj;
        int i12 = zzgqVar2.f352534a + zzgqVar.f352534a;
        int[] iArrCopyOf = Arrays.copyOf(zzgqVar2.f352535b, i12);
        System.arraycopy(zzgqVar.f352535b, 0, iArrCopyOf, zzgqVar2.f352534a, zzgqVar.f352534a);
        Object[] objArrCopyOf = Arrays.copyOf(zzgqVar2.f352536c, i12);
        System.arraycopy(zzgqVar.f352536c, 0, objArrCopyOf, zzgqVar2.f352534a, zzgqVar.f352534a);
        return new zzgq(i12, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ zzgq e() {
        return zzgq.a();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* bridge */ /* synthetic */ void f(int i12, long j12, Object obj) {
        ((zzgq) obj).b(i12 << 3, Long.valueOf(j12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final void g(Object obj) {
        ((zzec) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((zzec) obj).zzc = (zzgq) obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final void i(Object obj, zzdj zzdjVar) {
        zzgq zzgqVar = (zzgq) obj;
        for (int i12 = 0; i12 < zzgqVar.f352534a; i12++) {
            zzdjVar.zzw(zzgqVar.f352535b[i12] >>> 3, zzgqVar.f352536c[i12]);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp
    public final /* synthetic */ void j(Object obj, zzdj zzdjVar) {
        ((zzgq) obj).zzj(zzdjVar);
    }
}
