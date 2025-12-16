package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzkf implements zzlm {

    /* renamed from: b, reason: collision with root package name */
    public static final zzki f350912b = new zzki();

    /* renamed from: a, reason: collision with root package name */
    public final zzkk f350913a;

    public zzkf() {
        zzks zzksVar;
        zzjg zzjgVarZza = zzjg.zza();
        try {
            zzksVar = (zzks) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzksVar = f350912b;
        }
        zzkk zzkkVar = new zzkk();
        zzkkVar.f350918a = new zzks[]{zzjgVarZza, zzksVar};
        Charset charset = zzjh.f350896a;
        this.f350913a = zzkkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final <T> zzlj<T> zza(Class<T> cls) {
        zzll.zza(cls);
        zzkp zzkpVarZza = this.f350913a.zza(cls);
        if (zzkpVarZza.zzc()) {
            if (zzjf.class.isAssignableFrom(cls)) {
                return new zzkx(zzll.zzb(), zziv.f350876a, zzkpVarZza.zza());
            }
            zzmi<?, ?> zzmiVarZza = zzll.zza();
            zziu<?> zziuVar = zziv.f350877b;
            if (zziuVar != null) {
                return new zzkx(zzmiVarZza, zziuVar, zzkpVarZza.zza());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzjf.class.isAssignableFrom(cls)) {
            return zzkh.f350917a[zzkpVarZza.zzb().ordinal()] != 1 ? zzkv.d(zzkpVarZza, zzlb.f350948b, zzka.f350911b, zzll.zzb(), zziv.f350876a, zzkq.f350922b) : zzkv.d(zzkpVarZza, zzlb.f350948b, zzka.f350911b, zzll.zzb(), null, zzkq.f350922b);
        }
        if (zzkh.f350917a[zzkpVarZza.zzb().ordinal()] == 1) {
            return zzkv.d(zzkpVarZza, zzlb.f350947a, zzka.f350910a, zzll.zza(), null, zzkq.f350921a);
        }
        zzkz zzkzVar = zzlb.f350947a;
        zzjz zzjzVar = zzka.f350910a;
        zzmi<?, ?> zzmiVarZza2 = zzll.zza();
        zziu<?> zziuVar2 = zziv.f350877b;
        if (zziuVar2 != null) {
            return zzkv.d(zzkpVarZza, zzkzVar, zzjzVar, zzmiVarZza2, zziuVar2, zzkq.f350921a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
