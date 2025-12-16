package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.core.content.m;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zze extends zzs {
    @Override // com.google.android.gms.internal.mlkit_common.zzs
    public final int a(Context context, zzr zzrVar) {
        return (zzrVar.zza.getAuthority().lastIndexOf(64) < 0 || m.a(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
