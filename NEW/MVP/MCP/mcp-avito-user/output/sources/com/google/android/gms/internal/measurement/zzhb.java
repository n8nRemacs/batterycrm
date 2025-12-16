package com.google.android.gms.internal.measurement;

import I41.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzhb extends zzgv<Double> {
    @Override // com.google.android.gms.internal.measurement.zzgv
    @h
    public final Double b(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        zzb();
        String.valueOf(obj);
        return null;
    }
}
