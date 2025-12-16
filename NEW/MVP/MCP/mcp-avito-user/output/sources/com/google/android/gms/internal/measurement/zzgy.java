package com.google.android.gms.internal.measurement;

import I41.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzgy extends zzgv<Boolean> {
    @Override // com.google.android.gms.internal.measurement.zzgv
    @h
    public final /* synthetic */ Boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfu.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfu.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        zzb();
        String.valueOf(obj);
        return null;
    }
}
