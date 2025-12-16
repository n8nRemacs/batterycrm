package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.encoders.json.d;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzof implements zznr {

    /* renamed from: a, reason: collision with root package name */
    public final zzku f353443a;

    /* renamed from: b, reason: collision with root package name */
    public zzmt f353444b = new zzmt();

    /* renamed from: c, reason: collision with root package name */
    public final int f353445c;

    public zzof(zzku zzkuVar, int i12) {
        this.f353443a = zzkuVar;
        zzoo.zza();
        this.f353445c = i12;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i12) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.f353445c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.f353443a.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.f353444b = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.f353443a.zzj().zzf();
        if (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) {
            return "NA";
        }
        String strZzk = zzmvVarZzf.zzk();
        C36729v.j(strZzk);
        return strZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i12, boolean z12) {
        this.f353444b.zzf(Boolean.valueOf(1 == (i12 ^ 1)));
        this.f353444b.zze(Boolean.FALSE);
        zzmv zzmvVarZzm = this.f353444b.zzm();
        zzku zzkuVar = this.f353443a;
        zzkuVar.zzi(zzmvVarZzm);
        try {
            zzoo.zza();
            if (i12 != 0) {
                zzkw zzkwVarZzj = zzkuVar.zzj();
                zzcy zzcyVar = new zzcy();
                zzix.zza.configure(zzcyVar);
                return zzcyVar.zza().zza(zzkwVarZzj);
            }
            zzkw zzkwVarZzj2 = zzkuVar.zzj();
            d dVar = new d();
            zzix.zza.configure(dVar);
            dVar.f361556d = true;
            return dVar.a().a(zzkwVarZzj2).getBytes("utf-8");
        } catch (UnsupportedEncodingException e12) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
        }
    }
}
