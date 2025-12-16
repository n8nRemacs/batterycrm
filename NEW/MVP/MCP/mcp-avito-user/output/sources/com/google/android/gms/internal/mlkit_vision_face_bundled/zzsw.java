package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.C36729v;
import com.google.firebase.encoders.json.d;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzsw implements zzsl {

    /* renamed from: a, reason: collision with root package name */
    public final zznx f353988a;

    /* renamed from: b, reason: collision with root package name */
    public zzrl f353989b = new zzrl();

    /* renamed from: c, reason: collision with root package name */
    public final int f353990c;

    public zzsw(zznx zznxVar, int i12) {
        this.f353988a = zznxVar;
        zztc.zza();
        this.f353990c = i12;
    }

    public static zzsl zzf(zznx zznxVar, int i12) {
        return new zzsw(zznxVar, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
    public final int zza() {
        return this.f353990c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
    public final zzsl zzb(zznw zznwVar) {
        this.f353988a.zze(zznwVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
    public final zzsl zzc(zzrl zzrlVar) {
        this.f353989b = zzrlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
    public final String zzd() {
        String strZzk;
        zzrn zzrnVarZzd = this.f353988a.zzh().zzd();
        if (zzrnVarZzd == null || (strZzk = zzrnVarZzd.zzk()) == null || strZzk.isEmpty()) {
            return "NA";
        }
        String strZzk2 = zzrnVarZzd.zzk();
        C36729v.j(strZzk2);
        return strZzk2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzsl
    public final byte[] zze(int i12, boolean z12) {
        this.f353989b.zzf(Boolean.valueOf(1 == (i12 ^ 1)));
        this.f353989b.zze(Boolean.FALSE);
        zzrn zzrnVarZzm = this.f353989b.zzm();
        zznx zznxVar = this.f353988a;
        zznxVar.zzg(zzrnVarZzm);
        try {
            zztc.zza();
            if (i12 != 0) {
                zznz zznzVarZzh = zznxVar.zzh();
                zzcf zzcfVar = new zzcf();
                zzlq.zza.configure(zzcfVar);
                return zzcfVar.zza().zza(zznzVarZzh);
            }
            zznz zznzVarZzh2 = zznxVar.zzh();
            d dVar = new d();
            zzlq.zza.configure(dVar);
            dVar.f361556d = true;
            return dVar.a().a(zznzVarZzh2).getBytes("utf-8");
        } catch (UnsupportedEncodingException e12) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
        }
    }
}
