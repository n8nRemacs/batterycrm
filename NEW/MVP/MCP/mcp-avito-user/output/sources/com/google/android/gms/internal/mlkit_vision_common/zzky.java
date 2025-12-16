package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.encoders.json.d;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzky implements zzkp {

    /* renamed from: a, reason: collision with root package name */
    public final zzht f352904a;

    /* renamed from: b, reason: collision with root package name */
    public zzjo f352905b = new zzjo();

    public zzky(zzht zzhtVar) {
        this.f352904a = zzhtVar;
        zzlk.zza();
    }

    public static zzkp zze(zzht zzhtVar) {
        return new zzky(zzhtVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkp
    public final zzkp zza(zzhs zzhsVar) {
        this.f352904a.zzc(zzhsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkp
    public final zzkp zzb(zzjo zzjoVar) {
        this.f352905b = zzjoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkp
    public final String zzc() {
        zzjq zzjqVarZzc = this.f352904a.zzf().zzc();
        if (zzjqVarZzc == null || zzg.zzb(zzjqVarZzc.zzk())) {
            return "NA";
        }
        String strZzk = zzjqVarZzc.zzk();
        C36729v.j(strZzk);
        return strZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkp
    public final byte[] zzd(int i12, boolean z12) {
        this.f352905b.zzf(Boolean.valueOf(1 == (i12 ^ 1)));
        this.f352905b.zze(Boolean.FALSE);
        zzjq zzjqVarZzm = this.f352905b.zzm();
        zzht zzhtVar = this.f352904a;
        zzhtVar.zze(zzjqVarZzm);
        try {
            zzlk.zza();
            if (i12 != 0) {
                zzhv zzhvVarZzf = zzhtVar.zzf();
                zzam zzamVar = new zzam();
                zzgh.zza.configure(zzamVar);
                return zzamVar.zza().zza(zzhvVarZzf);
            }
            zzhv zzhvVarZzf2 = zzhtVar.zzf();
            d dVar = new d();
            zzgh.zza.configure(dVar);
            dVar.f361556d = true;
            return dVar.a().a(zzhvVarZzf2).getBytes("utf-8");
        } catch (UnsupportedEncodingException e12) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
        }
    }
}
