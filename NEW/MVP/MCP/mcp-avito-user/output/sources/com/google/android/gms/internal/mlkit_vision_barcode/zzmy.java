package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzmy {

    /* renamed from: a, reason: collision with root package name */
    public final zzcc f352193a;

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzmy) {
            return C36727t.a(this.f352193a, ((zzmy) obj).f352193a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f352193a});
    }

    @zzdj(zza = 1)
    @P
    public final zzcc zza() {
        return this.f352193a;
    }
}
