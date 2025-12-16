package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzmk extends zzmi<zzmh, zzmh> {
    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ int a(zzmh zzmhVar) {
        return zzmhVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzmh b() {
        return new zzmh();
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzmh c(Object obj, Object obj2) {
        zzmh zzmhVar = (zzmh) obj;
        zzmh zzmhVar2 = (zzmh) obj2;
        if (zzmh.zzc().equals(zzmhVar2)) {
            return zzmhVar;
        }
        if (zzmh.zzc().equals(zzmhVar)) {
            int i12 = zzmhVar.f350988a + zzmhVar2.f350988a;
            int[] iArrCopyOf = Arrays.copyOf(zzmhVar.f350989b, i12);
            System.arraycopy(zzmhVar2.f350989b, 0, iArrCopyOf, zzmhVar.f350988a, zzmhVar2.f350988a);
            Object[] objArrCopyOf = Arrays.copyOf(zzmhVar.f350990c, i12);
            System.arraycopy(zzmhVar2.f350990c, 0, objArrCopyOf, zzmhVar.f350988a, zzmhVar2.f350988a);
            return new zzmh(i12, iArrCopyOf, objArrCopyOf, true);
        }
        zzmhVar.getClass();
        if (!zzmhVar2.equals(zzmh.f350987f)) {
            if (!zzmhVar.f350992e) {
                throw new UnsupportedOperationException();
            }
            int i13 = zzmhVar.f350988a + zzmhVar2.f350988a;
            zzmhVar.a(i13);
            System.arraycopy(zzmhVar2.f350989b, 0, zzmhVar.f350989b, zzmhVar.f350988a, zzmhVar2.f350988a);
            System.arraycopy(zzmhVar2.f350990c, 0, zzmhVar.f350990c, zzmhVar.f350988a, zzmhVar2.f350988a);
            zzmhVar.f350988a = i13;
        }
        return zzmhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void d(int i12, int i13, Object obj) {
        ((zzmh) obj).b((i12 << 3) | 5, Integer.valueOf(i13));
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void e(int i12, long j12, Object obj) {
        ((zzmh) obj).b((i12 << 3) | 1, Long.valueOf(j12));
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void f(zzmh zzmhVar, int i12, zzhu zzhuVar) {
        zzmhVar.b((i12 << 3) | 2, zzhuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void g(zzmh zzmhVar, int i12, zzmh zzmhVar2) {
        zzmhVar.b((i12 << 3) | 3, zzmhVar2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void h(zzmh zzmhVar, zzne zzneVar) {
        zzmh zzmhVar2 = zzmhVar;
        zzmhVar2.getClass();
        if (zzneVar.zza() == zznh.zzb) {
            for (int i12 = zzmhVar2.f350988a - 1; i12 >= 0; i12--) {
                zzneVar.zza(zzmhVar2.f350989b[i12] >>> 3, zzmhVar2.f350990c[i12]);
            }
            return;
        }
        for (int i13 = 0; i13 < zzmhVar2.f350988a; i13++) {
            zzneVar.zza(zzmhVar2.f350989b[i13] >>> 3, zzmhVar2.f350990c[i13]);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ int j(zzmh zzmhVar) {
        return zzmhVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void k(int i12, long j12, Object obj) {
        ((zzmh) obj).b(i12 << 3, Long.valueOf(j12));
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ void l(zzmh zzmhVar, zzne zzneVar) {
        zzmhVar.zzb(zzneVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void m(Object obj, zzmh zzmhVar) {
        ((zzjf) obj).zzb = zzmhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzmh n(Object obj) {
        zzjf zzjfVar = (zzjf) obj;
        zzmh zzmhVar = zzjfVar.zzb;
        if (zzmhVar != zzmh.zzc()) {
            return zzmhVar;
        }
        zzmh zzmhVar2 = new zzmh();
        zzjfVar.zzb = zzmhVar2;
        return zzmhVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void o(Object obj, zzmh zzmhVar) {
        ((zzjf) obj).zzb = zzmhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh p(Object obj) {
        return ((zzjf) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh q(Object obj) {
        zzmh zzmhVar = (zzmh) obj;
        zzmhVar.zze();
        return zzmhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void r(Object obj) {
        ((zzjf) obj).zzb.zze();
    }
}
