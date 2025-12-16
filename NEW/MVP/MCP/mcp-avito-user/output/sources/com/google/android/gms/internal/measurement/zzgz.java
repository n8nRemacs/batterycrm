package com.google.android.gms.internal.measurement;

import I41.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzgz extends zzgv<Long> {
    @Override // com.google.android.gms.internal.measurement.zzgv
    @h
    public final Long b(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        zzb();
        String.valueOf(obj);
        return null;
    }
}
