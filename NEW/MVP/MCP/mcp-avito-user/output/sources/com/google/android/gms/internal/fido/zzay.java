package com.google.android.gms.internal.fido;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzay {

    /* renamed from: a, reason: collision with root package name */
    public final Set f350261a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350262b;

    public zzay(Set set, boolean z12) {
        this.f350261a = set;
        this.f350262b = z12;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j12) {
        Long lValueOf = Long.valueOf(j12);
        zzav zzavVar = new zzax() { // from class: com.google.android.gms.internal.fido.zzav
        };
        final Class<Long> cls = Long.class;
        new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        };
        return new zzaq(lValueOf);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        zzat zzatVar = new zzax() { // from class: com.google.android.gms.internal.fido.zzat
        };
        final Class<String> cls = String.class;
        new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        };
        return new zzaq(str2);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        zzar zzarVar = new zzax() { // from class: com.google.android.gms.internal.fido.zzar
        };
        final Class<Boolean> cls = Boolean.class;
        new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        };
        return new zzaq(boolValueOf);
    }

    public final zzay zzd() {
        return new zzay(this.f350261a, true);
    }

    public final zzay zze(Set set) {
        return new zzay(set, this.f350262b);
    }

    public zzay(String str) {
        this(zzcf.zzk(), false);
    }
}
