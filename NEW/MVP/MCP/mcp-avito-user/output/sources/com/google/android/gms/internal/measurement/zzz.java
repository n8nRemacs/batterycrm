package com.google.android.gms.internal.measurement;

import XY0.e;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzz extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final zzl f351175d;

    /* renamed from: e, reason: collision with root package name */
    @e
    public final HashMap f351176e;

    public zzz(zzl zzlVar) {
        super("require");
        this.f351176e = new HashMap();
        this.f351175d = zzlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza("require", 1, list);
        String strZzf = zzhVar.zza(list.get(0)).zzf();
        HashMap map = this.f351176e;
        if (map.containsKey(strZzf)) {
            return (zzaq) map.get(strZzf);
        }
        zzaq zzaqVarZza = this.f351175d.zza(strZzf);
        if (zzaqVarZza instanceof zzal) {
            map.put(strZzf, (zzal) zzaqVarZza);
        }
        return zzaqVarZza;
    }
}
