package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zznw {

    /* renamed from: a, reason: collision with root package name */
    public final zzns f351672a;

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznw) && C36727t.a(this.f351672a, ((zznw) obj).f351672a) && C36727t.a(null, null) && C36727t.a(null, null) && C36727t.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f351672a, null, null, null});
    }

    @zzbn(zza = 1)
    @P
    public final zzns zza() {
        return this.f351672a;
    }
}
