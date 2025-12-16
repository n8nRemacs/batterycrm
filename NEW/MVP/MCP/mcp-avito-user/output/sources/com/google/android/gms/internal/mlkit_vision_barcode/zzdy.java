package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzdy {

    /* renamed from: a, reason: collision with root package name */
    public final zzkj f351873a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f351874b;

    /* renamed from: c, reason: collision with root package name */
    public final zzmy f351875c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcc f351876d;

    /* renamed from: e, reason: collision with root package name */
    public final zzcc f351877e;

    public /* synthetic */ zzdy(zzdw zzdwVar, zzdx zzdxVar) {
        this.f351873a = zzdwVar.f351868a;
        this.f351874b = zzdwVar.f351869b;
        this.f351875c = zzdwVar.f351870c;
        this.f351876d = zzdwVar.f351871d;
        this.f351877e = zzdwVar.f351872e;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdy)) {
            return false;
        }
        zzdy zzdyVar = (zzdy) obj;
        return C36727t.a(this.f351873a, zzdyVar.f351873a) && C36727t.a(null, null) && C36727t.a(this.f351874b, zzdyVar.f351874b) && C36727t.a(null, null) && C36727t.a(this.f351875c, zzdyVar.f351875c) && C36727t.a(this.f351876d, zzdyVar.f351876d) && C36727t.a(this.f351877e, zzdyVar.f351877e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f351873a, null, this.f351874b, null, this.f351875c, this.f351876d, this.f351877e});
    }

    @zzdj(zza = 6)
    @P
    public final zzcc zza() {
        return this.f351876d;
    }

    @zzdj(zza = 7)
    @P
    public final zzcc zzb() {
        return this.f351877e;
    }

    @zzdj(zza = 1)
    @P
    public final zzkj zzc() {
        return this.f351873a;
    }

    @zzdj(zza = 5)
    @P
    public final zzmy zzd() {
        return this.f351875c;
    }

    @zzdj(zza = 3)
    @P
    public final Boolean zze() {
        return this.f351874b;
    }
}
