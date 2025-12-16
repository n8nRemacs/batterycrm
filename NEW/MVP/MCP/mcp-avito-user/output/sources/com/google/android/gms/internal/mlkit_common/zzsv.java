package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.encoders.json.d;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzsv implements zzsj {

    /* renamed from: a, reason: collision with root package name */
    public final zznh f351736a;

    /* renamed from: b, reason: collision with root package name */
    public zzre f351737b = new zzre();

    public zzsv(zznh zznhVar) {
        this.f351736a = zznhVar;
        zztg.zza();
    }

    public static zzsj zzf(zznh zznhVar) {
        return new zzsv(zznhVar);
    }

    public static zzsj zzg() {
        return new zzsv(new zznh());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zza(zzng zzngVar) {
        this.f351736a.zzf(zzngVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zzb(zznn zznnVar) {
        this.f351736a.zzi(zznnVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zzc(zzre zzreVar) {
        this.f351737b = zzreVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zzd() {
        zzrg zzrgVarZzf = this.f351736a.zzk().zzf();
        if (zzrgVarZzf == null || zzaf.zzc(zzrgVarZzf.zzk())) {
            return "NA";
        }
        String strZzk = zzrgVarZzf.zzk();
        C36729v.j(strZzk);
        return strZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final byte[] zze(int i12, boolean z12) {
        this.f351737b.zzf(Boolean.valueOf(1 == (i12 ^ 1)));
        this.f351737b.zze(Boolean.FALSE);
        zzrg zzrgVarZzm = this.f351737b.zzm();
        zznh zznhVar = this.f351736a;
        zznhVar.zzj(zzrgVarZzm);
        try {
            zztg.zza();
            if (i12 != 0) {
                zznj zznjVarZzk = zznhVar.zzk();
                zzbr zzbrVar = new zzbr();
                zzlc.zza.configure(zzbrVar);
                return zzbrVar.zza().zza(zznjVarZzk);
            }
            zznj zznjVarZzk2 = zznhVar.zzk();
            d dVar = new d();
            zzlc.zza.configure(dVar);
            dVar.f361556d = true;
            return dVar.a().a(zznjVarZzk2).getBytes("utf-8");
        } catch (UnsupportedEncodingException e12) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
        }
    }
}
