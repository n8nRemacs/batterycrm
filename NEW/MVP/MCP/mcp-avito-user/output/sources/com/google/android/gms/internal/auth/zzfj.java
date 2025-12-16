package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfj extends zzfl {
    public /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void a(long j12, Object obj) {
        ((zzez) zzhj.d(j12, obj)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void b(Object obj, long j12, Object obj2) {
        zzez zzezVarZzd = (zzez) zzhj.d(j12, obj);
        zzez zzezVar = (zzez) zzhj.d(j12, obj2);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.m(obj, j12, zzezVar);
    }

    public zzfj() {
        super(null);
    }
}
