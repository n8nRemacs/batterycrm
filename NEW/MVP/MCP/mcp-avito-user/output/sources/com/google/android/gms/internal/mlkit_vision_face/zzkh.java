package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzkh {

    /* renamed from: a, reason: collision with root package name */
    public final zzkf f353357a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f353358b;

    public /* synthetic */ zzkh(zzke zzkeVar, zzkg zzkgVar) {
        this.f353357a = zzkeVar.f353353a;
        this.f353358b = zzkeVar.f353354b;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj;
        return C36727t.a(this.f353357a, zzkhVar.f353357a) && C36727t.a(this.f353358b, zzkhVar.f353358b) && C36727t.a(null, null) && C36727t.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f353357a, this.f353358b, null, null});
    }

    @zzcu(zza = 1)
    @P
    public final zzkf zza() {
        return this.f353357a;
    }

    @zzcu(zza = 2)
    @P
    public final Integer zzb() {
        return this.f353358b;
    }
}
