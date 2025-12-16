package com.google.android.gms.internal.fido;

import AK.c;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzhi extends zzhp {

    /* renamed from: b, reason: collision with root package name */
    public final zzgx f350416b;

    public zzhi(zzgx zzgxVar) {
        this.f350416b = zzgxVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int iZza = zzhpVar.zza();
        int iC2 = zzhp.c((byte) 64);
        if (iC2 != iZza) {
            return iC2 - zzhpVar.zza();
        }
        zzgx zzgxVar = this.f350416b;
        int iZzd = zzgxVar.zzd();
        zzgx zzgxVar2 = ((zzhi) zzhpVar).f350416b;
        if (iZzd != zzgxVar2.zzd()) {
            return zzgxVar.zzd() - zzgxVar2.zzd();
        }
        return zzgm.zza().compare(zzgxVar.zzm(), zzgxVar2.zzm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhi.class == obj.getClass()) {
            return this.f350416b.equals(((zzhi) obj).f350416b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) 64)), this.f350416b});
    }

    public final String toString() {
        zzgf zzgfVarZzd = zzgf.zzf().zzd();
        byte[] bArrZzm = this.f350416b.zzm();
        return c.k("h'", zzgfVarZzd.zzg(bArrZzm, 0, bArrZzm.length), "'");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) 64);
    }

    public final zzgx zzc() {
        return this.f350416b;
    }
}
