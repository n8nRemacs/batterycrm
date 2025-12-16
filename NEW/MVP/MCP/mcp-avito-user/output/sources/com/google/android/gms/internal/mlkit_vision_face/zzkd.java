package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzkd {

    /* renamed from: a, reason: collision with root package name */
    public final zzka f353347a;

    /* renamed from: b, reason: collision with root package name */
    public final zzjy f353348b;

    /* renamed from: c, reason: collision with root package name */
    public final zzkb f353349c;

    /* renamed from: d, reason: collision with root package name */
    public final zzjz f353350d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f353351e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f353352f;

    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        this.f353347a = zzjxVar.f353333a;
        this.f353348b = zzjxVar.f353334b;
        this.f353349c = zzjxVar.f353335c;
        this.f353350d = zzjxVar.f353336d;
        this.f353351e = zzjxVar.f353337e;
        this.f353352f = zzjxVar.f353338f;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj;
        return C36727t.a(this.f353347a, zzkdVar.f353347a) && C36727t.a(this.f353348b, zzkdVar.f353348b) && C36727t.a(this.f353349c, zzkdVar.f353349c) && C36727t.a(this.f353350d, zzkdVar.f353350d) && C36727t.a(this.f353351e, zzkdVar.f353351e) && C36727t.a(this.f353352f, zzkdVar.f353352f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f353347a, this.f353348b, this.f353349c, this.f353350d, this.f353351e, this.f353352f});
    }

    @zzcu(zza = 2)
    @P
    public final zzjy zza() {
        return this.f353348b;
    }

    @zzcu(zza = 4)
    @P
    public final zzjz zzb() {
        return this.f353350d;
    }

    @zzcu(zza = 1)
    @P
    public final zzka zzc() {
        return this.f353347a;
    }

    @zzcu(zza = 3)
    @P
    public final zzkb zzd() {
        return this.f353349c;
    }

    @zzcu(zza = 5)
    @P
    public final Boolean zze() {
        return this.f353351e;
    }

    @zzcu(zza = 6)
    @P
    public final Float zzf() {
        return this.f353352f;
    }
}
