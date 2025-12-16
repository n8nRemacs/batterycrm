package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzhb extends zzgz {
    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ zzha a(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarA = zzha.a();
        zzevVar.zzc = zzhaVarA;
        return zzhaVarA;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ zzha b(Object obj) {
        return ((zzev) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final Object c(Object obj, Object obj2) {
        if (zzha.zza().equals(obj2)) {
            return obj;
        }
        if (zzha.zza().equals(obj)) {
            zzha zzhaVar = (zzha) obj2;
            zzha zzhaVar2 = (zzha) obj;
            int i12 = zzhaVar2.f350167a + zzhaVar.f350167a;
            int[] iArrCopyOf = Arrays.copyOf(zzhaVar2.f350168b, i12);
            System.arraycopy(zzhaVar.f350168b, 0, iArrCopyOf, zzhaVar2.f350167a, zzhaVar.f350167a);
            Object[] objArrCopyOf = Arrays.copyOf(zzhaVar2.f350169c, i12);
            System.arraycopy(zzhaVar.f350169c, 0, objArrCopyOf, zzhaVar2.f350167a, zzhaVar.f350167a);
            return new zzha(i12, iArrCopyOf, objArrCopyOf, true);
        }
        zzha zzhaVar3 = (zzha) obj2;
        zzha zzhaVar4 = (zzha) obj;
        zzhaVar4.getClass();
        if (zzhaVar3.equals(zzha.f350166e)) {
            return obj;
        }
        if (!zzhaVar4.f350170d) {
            throw new UnsupportedOperationException();
        }
        int i13 = zzhaVar4.f350167a + zzhaVar3.f350167a;
        zzhaVar4.c(i13);
        System.arraycopy(zzhaVar3.f350168b, 0, zzhaVar4.f350168b, zzhaVar4.f350167a, zzhaVar3.f350167a);
        System.arraycopy(zzhaVar3.f350169c, 0, zzhaVar4.f350169c, zzhaVar4.f350167a, zzhaVar3.f350167a);
        zzhaVar4.f350167a = i13;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ void d(int i12, long j12, Object obj) {
        ((zzha) obj).b(i12 << 3, Long.valueOf(j12));
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final void e(Object obj) {
        ((zzev) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ void f(Object obj, Object obj2) {
        ((zzev) obj).zzc = (zzha) obj2;
    }
}
