package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzjy {

    /* renamed from: a, reason: collision with root package name */
    public final zzjw f352122a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f352123b;

    public /* synthetic */ zzjy(zzjv zzjvVar, zzjx zzjxVar) {
        this.f352122a = zzjvVar.f352118a;
        this.f352123b = zzjvVar.f352119b;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjy)) {
            return false;
        }
        zzjy zzjyVar = (zzjy) obj;
        return C36727t.a(this.f352122a, zzjyVar.f352122a) && C36727t.a(this.f352123b, zzjyVar.f352123b) && C36727t.a(null, null) && C36727t.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f352122a, this.f352123b, null, null});
    }

    @zzdj(zza = 1)
    @P
    public final zzjw zza() {
        return this.f352122a;
    }

    @zzdj(zza = 2)
    @P
    public final Integer zzb() {
        return this.f352123b;
    }
}
