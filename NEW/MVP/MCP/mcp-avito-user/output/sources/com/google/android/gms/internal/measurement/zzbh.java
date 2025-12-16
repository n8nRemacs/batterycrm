package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzbh implements Comparator<zzaq> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzal f350584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzh f350585c;

    public zzbh(zzal zzalVar, zzh zzhVar) {
        this.f350584b = zzalVar;
        this.f350585c = zzhVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaq zzaqVar, zzaq zzaqVar2) {
        zzaq zzaqVar3 = zzaqVar;
        zzaq zzaqVar4 = zzaqVar2;
        if (zzaqVar3 instanceof zzax) {
            return !(zzaqVar4 instanceof zzax) ? 1 : 0;
        }
        if (zzaqVar4 instanceof zzax) {
            return -1;
        }
        zzal zzalVar = this.f350584b;
        return zzalVar == null ? zzaqVar3.zzf().compareTo(zzaqVar4.zzf()) : (int) zzg.zza(zzalVar.zza(this.f350585c, Arrays.asList(zzaqVar3, zzaqVar4)).zze().doubleValue());
    }
}
