package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzbf implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@a Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzam.zza(getKey(), entry.getKey()) && zzam.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return G.g(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
    }
}
