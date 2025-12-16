package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzdn {

    /* renamed from: a, reason: collision with root package name */
    public final zzks f353059a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f353060b;

    /* renamed from: c, reason: collision with root package name */
    public final zzkd f353061c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f353062d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f353063e;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.f353059a = zzdlVar.f353054a;
        this.f353060b = zzdlVar.f353055b;
        this.f353061c = zzdlVar.f353056c;
        this.f353062d = zzdlVar.f353057d;
        this.f353063e = zzdlVar.f353058e;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return C36727t.a(this.f353059a, zzdnVar.f353059a) && C36727t.a(this.f353060b, zzdnVar.f353060b) && C36727t.a(null, null) && C36727t.a(this.f353061c, zzdnVar.f353061c) && C36727t.a(this.f353062d, zzdnVar.f353062d) && C36727t.a(this.f353063e, zzdnVar.f353063e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f353059a, this.f353060b, null, this.f353061c, this.f353062d, this.f353063e});
    }

    @zzcu(zza = 4)
    @P
    public final zzkd zza() {
        return this.f353061c;
    }

    @zzcu(zza = 1)
    @P
    public final zzks zzb() {
        return this.f353059a;
    }

    @zzcu(zza = 2)
    @P
    public final Boolean zzc() {
        return this.f353060b;
    }

    @zzcu(zza = 5)
    @P
    public final Integer zzd() {
        return this.f353062d;
    }

    @zzcu(zza = 6)
    @P
    public final Integer zze() {
        return this.f353063e;
    }
}
