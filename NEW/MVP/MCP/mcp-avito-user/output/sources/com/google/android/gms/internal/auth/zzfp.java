package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzfp implements zzgj {

    /* renamed from: b, reason: collision with root package name */
    public static final zzfn f350115b = new zzfn();

    /* renamed from: a, reason: collision with root package name */
    public final zzfo f350116a;

    public zzfp() {
        zzfv zzfvVar;
        zzes zzesVarZza = zzes.zza();
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfvVar = f350115b;
        }
        zzfo zzfoVar = new zzfo(zzesVarZza, zzfvVar);
        Charset charset = zzfa.f350106a;
        this.f350116a = zzfoVar;
    }

    @Override // com.google.android.gms.internal.auth.zzgj
    public final zzgi zza(Class cls) {
        zzgk.zze(cls);
        zzfu zzfuVarZzb = this.f350116a.zzb(cls);
        if (zzfuVarZzb.zzb()) {
            if (zzev.class.isAssignableFrom(cls)) {
                return new zzgb(zzgk.zzb(), zzeo.f350095a, zzfuVarZzb.zza());
            }
            zzgz zzgzVarZza = zzgk.zza();
            zzem zzemVar = zzeo.f350096b;
            if (zzemVar != null) {
                return new zzgb(zzgzVarZza, zzemVar, zzfuVarZzb.zza());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzev.class.isAssignableFrom(cls)) {
            if (zzfuVarZzb.zzc() - 1 == 1) {
                int i12 = zzgd.f350136a;
                zzfj zzfjVar = zzfl.f350111b;
                zzgz zzgzVarZzb = zzgk.zzb();
                int i13 = zzft.f350119a;
                return zzga.h(zzfuVarZzb, zzfjVar, zzgzVarZzb);
            }
            int i14 = zzgd.f350136a;
            zzfj zzfjVar2 = zzfl.f350111b;
            zzgz zzgzVarZzb2 = zzgk.zzb();
            zzen zzenVar = zzeo.f350095a;
            int i15 = zzft.f350119a;
            return zzga.h(zzfuVarZzb, zzfjVar2, zzgzVarZzb2);
        }
        if (zzfuVarZzb.zzc() - 1 == 1) {
            int i16 = zzgd.f350136a;
            zzfh zzfhVar = zzfl.f350110a;
            zzgz zzgzVarZza2 = zzgk.zza();
            int i17 = zzft.f350119a;
            return zzga.h(zzfuVarZzb, zzfhVar, zzgzVarZza2);
        }
        int i18 = zzgd.f350136a;
        zzfh zzfhVar2 = zzfl.f350110a;
        zzgz zzgzVarZza3 = zzgk.zza();
        if (zzeo.f350096b == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        int i19 = zzft.f350119a;
        return zzga.h(zzfuVarZzb, zzfhVar2, zzgzVarZza3);
    }
}
