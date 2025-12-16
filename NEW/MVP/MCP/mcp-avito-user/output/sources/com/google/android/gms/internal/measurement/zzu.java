package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzu extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f351170d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f351171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzr f351172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzr zzrVar, boolean z12, boolean z13) {
        super("log");
        this.f351172f = zzrVar;
        this.f351170d = z12;
        this.f351171e = z13;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zzb("log", 1, list);
        int size = list.size();
        zzr zzrVar = this.f351172f;
        if (size == 1) {
            zzrVar.f351168d.zza(zzs.zzc, zzhVar.zza(list.get(0)).zzf(), Collections.emptyList(), this.f351170d, this.f351171e);
            return zzaq.zzc;
        }
        zzs zzsVarZza = zzs.zza(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()));
        String strZzf = zzhVar.zza(list.get(1)).zzf();
        if (list.size() == 2) {
            zzrVar.f351168d.zza(zzsVarZza, strZzf, Collections.emptyList(), this.f351170d, this.f351171e);
            return zzaq.zzc;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
            arrayList.add(zzhVar.zza(list.get(i12)).zzf());
        }
        zzrVar.f351168d.zza(zzsVarZza, strZzf, arrayList, this.f351170d, this.f351171e);
        return zzaq.zzc;
    }
}
