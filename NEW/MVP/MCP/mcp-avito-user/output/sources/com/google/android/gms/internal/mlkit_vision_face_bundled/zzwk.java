package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzwk implements zzxg {

    /* renamed from: b, reason: collision with root package name */
    public static final zzwi f354082b = new zzwi();

    /* renamed from: a, reason: collision with root package name */
    public final zzwj f354083a;

    public zzwk() {
        zzwq zzwqVar;
        zzvg zzvgVarZza = zzvg.zza();
        try {
            zzwqVar = (zzwq) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzwqVar = f354082b;
        }
        zzwj zzwjVar = new zzwj(zzvgVarZza, zzwqVar);
        Charset charset = zzvt.f354067a;
        this.f354083a = zzwjVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxg
    public final zzxf zza(Class cls) {
        zzxh.zzr(cls);
        zzwp zzwpVarZzb = this.f354083a.zzb(cls);
        if (zzwpVarZzb.zzb()) {
            if (zzvn.class.isAssignableFrom(cls)) {
                return new zzww(zzxh.zzn(), zzvb.f354047a, zzwpVarZzb.zza());
            }
            zzxw zzxwVarZzm = zzxh.zzm();
            zzuz zzuzVar = zzvb.f354048b;
            if (zzuzVar != null) {
                return new zzww(zzxwVarZzm, zzuzVar, zzwpVarZzb.zza());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        if (zzvn.class.isAssignableFrom(cls)) {
            if (zzwpVarZzb.zzc() - 1 == 1) {
                int i12 = zzwz.f354106a;
                zzwe zzweVar = zzwg.f354078b;
                zzxw zzxwVarZzn = zzxh.zzn();
                int i13 = zzwo.f354086a;
                return zzwv.m(zzwpVarZzb, zzweVar, zzxwVarZzn, null);
            }
            int i14 = zzwz.f354106a;
            zzwe zzweVar2 = zzwg.f354078b;
            zzxw zzxwVarZzn2 = zzxh.zzn();
            zzva zzvaVar = zzvb.f354047a;
            int i15 = zzwo.f354086a;
            return zzwv.m(zzwpVarZzb, zzweVar2, zzxwVarZzn2, zzvaVar);
        }
        if (zzwpVarZzb.zzc() - 1 == 1) {
            int i16 = zzwz.f354106a;
            zzwc zzwcVar = zzwg.f354077a;
            zzxw zzxwVarZzm2 = zzxh.zzm();
            int i17 = zzwo.f354086a;
            return zzwv.m(zzwpVarZzb, zzwcVar, zzxwVarZzm2, null);
        }
        int i18 = zzwz.f354106a;
        zzwc zzwcVar2 = zzwg.f354077a;
        zzxw zzxwVarZzm3 = zzxh.zzm();
        zzuz zzuzVar2 = zzvb.f354048b;
        if (zzuzVar2 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        int i19 = zzwo.f354086a;
        return zzwv.m(zzwpVarZzb, zzwcVar2, zzxwVarZzm3, zzuzVar2);
    }
}
