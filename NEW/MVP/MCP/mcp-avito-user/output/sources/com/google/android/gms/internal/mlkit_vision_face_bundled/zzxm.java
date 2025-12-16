package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxm implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f354122b;

    /* renamed from: c, reason: collision with root package name */
    public Object f354123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzxs f354124d;

    public zzxm(zzxs zzxsVar, Comparable comparable, Object obj) {
        this.f354124d = zzxsVar;
        this.f354122b = comparable;
        this.f354123c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f354122b.compareTo(((zzxm) obj).f354122b);
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
        Comparable comparable = this.f354122b;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f354123c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f354122b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f354123c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f354122b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f354123c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i12 = zzxs.f354130h;
        this.f354124d.d();
        Object obj2 = this.f354123c;
        this.f354123c = obj;
        return obj2;
    }

    public final String toString() {
        return r.r(String.valueOf(this.f354122b), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f354123c));
    }

    public final Comparable zza() {
        return this.f354122b;
    }
}
