package com.google.android.gms.internal.mlkit_common;

import I41.a;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzy {

    /* renamed from: a, reason: collision with root package name */
    public final String f351748a;

    /* renamed from: b, reason: collision with root package name */
    public final zzw f351749b;

    /* renamed from: c, reason: collision with root package name */
    public zzw f351750c;

    public /* synthetic */ zzy(String str, zzx zzxVar) {
        zzw zzwVar = new zzw();
        this.f351749b = zzwVar;
        this.f351750c = zzwVar;
        str.getClass();
        this.f351748a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f351748a);
        sb2.append('{');
        zzw zzwVar = this.f351749b.f351747c;
        String str = "";
        while (zzwVar != null) {
            Object obj = zzwVar.f351746b;
            sb2.append(str);
            String str2 = zzwVar.f351745a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzwVar = zzwVar.f351747c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzy zza(String str, @a Object obj) {
        zzw zzwVar = new zzw();
        this.f351750c.f351747c = zzwVar;
        this.f351750c = zzwVar;
        zzwVar.f351746b = obj;
        zzwVar.f351745a = str;
        return this;
    }

    public final zzy zzb(String str, boolean z12) {
        String strValueOf = String.valueOf(z12);
        zzv zzvVar = new zzv(null);
        this.f351750c.f351747c = zzvVar;
        this.f351750c = zzvVar;
        zzvVar.f351746b = strValueOf;
        zzvVar.f351745a = "isManifestFile";
        return this;
    }
}
