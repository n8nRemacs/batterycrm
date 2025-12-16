package com.google.android.gms.internal.auth;

import androidx.appcompat.app.r;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgp implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f350151b;

    /* renamed from: c, reason: collision with root package name */
    public Object f350152c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzgv f350153d;

    public zzgp(zzgv zzgvVar, Comparable comparable, Object obj) {
        this.f350153d = zzgvVar;
        this.f350151b = comparable;
        this.f350152c = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f350151b.compareTo(((zzgp) obj).f350151b);
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
        Comparable comparable = this.f350151b;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f350152c;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f350151b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f350152c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f350151b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f350152c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i12 = zzgv.f350159h;
        this.f350153d.d();
        Object obj2 = this.f350152c;
        this.f350152c = obj;
        return obj2;
    }

    public final String toString() {
        return r.r(String.valueOf(this.f350151b), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.f350152c));
    }

    public final Comparable zza() {
        return this.f350151b;
    }
}
