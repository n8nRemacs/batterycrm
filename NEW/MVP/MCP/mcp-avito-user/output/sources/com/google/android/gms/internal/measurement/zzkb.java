package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkb extends zzka {
    @Override // com.google.android.gms.internal.measurement.zzka
    public final List a(long j12, Object obj) {
        zzjn zzjnVar = (zzjn) zzmo.r(j12, obj);
        if (zzjnVar.zzc()) {
            return zzjnVar;
        }
        int size = zzjnVar.size();
        zzjn zzjnVarZza = zzjnVar.zza(size == 0 ? 10 : size << 1);
        zzmo.g(obj, j12, zzjnVarZza);
        return zzjnVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void b(Object obj, long j12, Object obj2) {
        zzjn zzjnVarZza = (zzjn) zzmo.r(j12, obj);
        zzjn zzjnVar = (zzjn) zzmo.r(j12, obj2);
        int size = zzjnVarZza.size();
        int size2 = zzjnVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzjnVarZza.zzc()) {
                zzjnVarZza = zzjnVarZza.zza(size2 + size);
            }
            zzjnVarZza.addAll(zzjnVar);
        }
        if (size > 0) {
            zzjnVar = zzjnVarZza;
        }
        zzmo.g(obj, j12, zzjnVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void c(long j12, Object obj) {
        ((zzjn) zzmo.r(j12, obj)).i_();
    }

    public zzkb() {
        super();
    }
}
