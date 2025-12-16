package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfd implements zzgc {

    /* renamed from: b, reason: collision with root package name */
    public static final zzfb f352464b = new zzfb();

    /* renamed from: a, reason: collision with root package name */
    public final zzfc f352465a;

    public zzfd() {
        zzfj zzfjVar;
        zzdv zzdvVarZza = zzdv.zza();
        try {
            zzfjVar = (zzfj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfjVar = f352464b;
        }
        zzfc zzfcVar = new zzfc(zzdvVarZza, zzfjVar);
        Charset charset = zzel.f352447a;
        this.f352465a = zzfcVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgc
    public final zzgb zza(Class cls) {
        zzgd.zzG(cls);
        zzfi zzfiVarZzb = this.f352465a.zzb(cls);
        if (zzfiVarZzb.zzb()) {
            if (zzec.class.isAssignableFrom(cls)) {
                return new zzfp(zzgd.zzB(), zzdq.f352422a, zzfiVarZzb.zza());
            }
            zzgp zzgpVarZzz = zzgd.zzz();
            zzdo zzdoVar = zzdq.f352423b;
            if (zzdoVar != null) {
                return new zzfp(zzgpVarZzz, zzdoVar, zzfiVarZzb.zza());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzec.class.isAssignableFrom(cls)) {
            if (zzfiVarZzb.zzc() == 1) {
                int i12 = zzfs.f352489a;
                return zzfo.r(zzfiVarZzb, zzez.f352460b, zzgd.zzB(), zzdq.f352422a, zzfh.f352469b);
            }
            int i13 = zzfs.f352489a;
            return zzfo.r(zzfiVarZzb, zzez.f352460b, zzgd.zzB(), null, zzfh.f352469b);
        }
        if (zzfiVarZzb.zzc() != 1) {
            int i14 = zzfs.f352489a;
            return zzfo.r(zzfiVarZzb, zzez.f352459a, zzgd.zzA(), null, zzfh.f352468a);
        }
        int i15 = zzfs.f352489a;
        zzex zzexVar = zzez.f352459a;
        zzgp zzgpVarZzz2 = zzgd.zzz();
        zzdo zzdoVar2 = zzdq.f352423b;
        if (zzdoVar2 != null) {
            return zzfo.r(zzfiVarZzb, zzexVar, zzgpVarZzz2, zzdoVar2, zzfh.f352468a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
