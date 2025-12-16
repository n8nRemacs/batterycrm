package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.encoders.json.d;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zznp {

    /* renamed from: a, reason: collision with root package name */
    public final zzkl f352216a;

    /* renamed from: b, reason: collision with root package name */
    public zzmc f352217b = new zzmc();

    /* renamed from: c, reason: collision with root package name */
    public final int f352218c;

    public zznp(zzkl zzklVar, int i12) {
        this.f352216a = zzklVar;
        zzny.zza();
        this.f352218c = i12;
    }

    public static zznp zzd(zzkl zzklVar) {
        return new zznp(zzklVar, 0);
    }

    public static zznp zze(zzkl zzklVar, int i12) {
        return new zznp(zzklVar, 1);
    }

    public final int zza() {
        return this.f352218c;
    }

    public final String zzb() {
        zzme zzmeVarZzf = this.f352216a.zzj().zzf();
        if (zzmeVarZzf == null || zzar.zzb(zzmeVarZzf.zzk())) {
            return "NA";
        }
        String strZzk = zzmeVarZzf.zzk();
        C36729v.j(strZzk);
        return strZzk;
    }

    public final byte[] zzc(int i12, boolean z12) {
        this.f352217b.zzf(Boolean.valueOf(1 == (i12 ^ 1)));
        this.f352217b.zze(Boolean.FALSE);
        zzme zzmeVarZzm = this.f352217b.zzm();
        zzkl zzklVar = this.f352216a;
        zzklVar.zzi(zzmeVarZzm);
        try {
            zzny.zza();
            if (i12 != 0) {
                zzkn zzknVarZzj = zzklVar.zzj();
                zzdn zzdnVar = new zzdn();
                zziu.zza.configure(zzdnVar);
                return zzdnVar.zza().zza(zzknVarZzj);
            }
            zzkn zzknVarZzj2 = zzklVar.zzj();
            d dVar = new d();
            zziu.zza.configure(dVar);
            dVar.f361556d = true;
            return dVar.a().a(zzknVarZzj2).getBytes("utf-8");
        } catch (UnsupportedEncodingException e12) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
        }
    }

    public final zznp zzf(zzkk zzkkVar) {
        this.f352216a.zzf(zzkkVar);
        return this;
    }

    public final zznp zzg(zzmc zzmcVar) {
        this.f352217b = zzmcVar;
        return this;
    }
}
