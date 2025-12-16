package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzp extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzo f351112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzo zzoVar) {
        super("getValue");
        this.f351112d = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza("getValue", 2, list);
        zzaq zzaqVarZza = zzhVar.zza(list.get(0));
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(1));
        String strZza = this.f351112d.zza(zzaqVarZza.zzf());
        return strZza != null ? new zzas(strZza) : zzaqVarZza2;
    }
}
