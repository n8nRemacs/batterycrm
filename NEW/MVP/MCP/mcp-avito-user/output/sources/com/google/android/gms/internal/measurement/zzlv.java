package com.google.android.gms.internal.measurement;

import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzlv implements Comparable, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f350977b;

    /* renamed from: c, reason: collision with root package name */
    public Object f350978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzlo f350979d;

    public zzlv(zzlo zzloVar, Comparable comparable, Object obj) {
        this.f350979d = zzloVar;
        this.f350977b = comparable;
        this.f350978c = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzlv) obj).getKey());
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
        Comparable comparable = this.f350977b;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f350978c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f350977b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f350978c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f350977b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f350978c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i12 = zzlo.f350963i;
        this.f350979d.d();
        Object obj2 = this.f350978c;
        this.f350978c = obj;
        return obj2;
    }

    public final String toString() {
        return r.r(String.valueOf(this.f350977b), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f350978c));
    }
}
