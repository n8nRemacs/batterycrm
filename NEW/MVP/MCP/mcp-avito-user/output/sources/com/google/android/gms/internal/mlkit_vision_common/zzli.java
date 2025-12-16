package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import j.l0;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzli {
    @l0
    public static void zza(zzkx zzkxVar, int i12, int i13, long j12, int i14, int i15, int i16, int i17) {
        zzkxVar.zzc(new zzlh(i12, i13, i16, i14, i15, SystemClock.elapsedRealtime() - j12, i17), zzhs.INPUT_IMAGE_CONSTRUCTION);
    }

    @l0
    public static void zzb(zzkx zzkxVar, int i12, int i13, long j12, int i14, int i15, int i16, int i17) {
        zzkxVar.zzc(new zzlh(i12, i13, i16, i14, i15, SystemClock.elapsedRealtime() - j12, i17), zzhs.ODML_IMAGE);
    }
}
