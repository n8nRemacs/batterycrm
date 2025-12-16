package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzif;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36887h {

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap<zzif.zza, EnumC36901j> f355176a;

    public C36887h() {
        this.f355176a = new EnumMap<>(zzif.zza.class);
    }

    public static C36887h a(String str) {
        EnumC36901j enumC36901j;
        EnumMap enumMap = new EnumMap(zzif.zza.class);
        if (str.length() < zzif.zza.values().length || str.charAt(0) != '1') {
            return new C36887h();
        }
        zzif.zza[] zzaVarArrValues = zzif.zza.values();
        int length = zzaVarArrValues.length;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            zzif.zza zzaVar = zzaVarArrValues[i13];
            int i14 = i12 + 1;
            char cCharAt = str.charAt(i12);
            EnumC36901j[] enumC36901jArrValues = EnumC36901j.values();
            int length2 = enumC36901jArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    enumC36901j = EnumC36901j.UNSET;
                    break;
                }
                enumC36901j = enumC36901jArrValues[i15];
                if (enumC36901j.f355207b == cCharAt) {
                    break;
                }
                i15++;
            }
            enumMap.put((EnumMap) zzaVar, (zzif.zza) enumC36901j);
            i13++;
            i12 = i14;
        }
        return new C36887h(enumMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.gms.measurement.internal.zzif.zza r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC36901j.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC36901j.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC36901j.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC36901j.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.j r0 = com.google.android.gms.measurement.internal.EnumC36901j.TCF
        L20:
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzif$zza, com.google.android.gms.measurement.internal.j> r4 = r2.f355176a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36887h.b(com.google.android.gms.measurement.internal.zzif$zza, int):void");
    }

    public final void c(zzif.zza zzaVar, EnumC36901j enumC36901j) {
        this.f355176a.put((EnumMap<zzif.zza, EnumC36901j>) zzaVar, (zzif.zza) enumC36901j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzif.zza zzaVar : zzif.zza.values()) {
            EnumC36901j enumC36901j = this.f355176a.get(zzaVar);
            if (enumC36901j == null) {
                enumC36901j = EnumC36901j.UNSET;
            }
            sb2.append(enumC36901j.f355207b);
        }
        return sb2.toString();
    }

    public C36887h(EnumMap<zzif.zza, EnumC36901j> enumMap) {
        EnumMap<zzif.zza, EnumC36901j> enumMap2 = new EnumMap<>(zzif.zza.class);
        this.f355176a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
