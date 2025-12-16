package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.camera2.internal.G;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgi implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f352518b;

    /* renamed from: c, reason: collision with root package name */
    public Object f352519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzgl f352520d;

    public zzgi(zzgl zzglVar, Comparable comparable, Object obj) {
        this.f352520d = zzglVar;
        this.f352518b = comparable;
        this.f352519c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f352518b.compareTo(((zzgi) obj).f352518b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f352518b;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f352519c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f352518b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f352519c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f352518b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f352519c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i12 = zzgl.f352526h;
        this.f352520d.d();
        Object obj2 = this.f352519c;
        this.f352519c = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f352518b);
        String strValueOf2 = String.valueOf(this.f352519c);
        return G.g(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf2);
    }

    public final Comparable zza() {
        return this.f352518b;
    }
}
