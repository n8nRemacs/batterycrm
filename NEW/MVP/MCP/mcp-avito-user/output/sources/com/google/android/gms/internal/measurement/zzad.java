package com.google.android.gms.internal.measurement;

import androidx.appcompat.app.r;
import com.google.common.collect.H1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzad {

    /* renamed from: d, reason: collision with root package name */
    public static final H1<String> f350546d = H1.K("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f350547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f350548b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f350549c;

    public zzad(String str, long j12, Map<String, Object> map) {
        this.f350547a = str;
        this.f350548b = j12;
        HashMap map2 = new HashMap();
        this.f350549c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final /* synthetic */ Object clone() {
        return new zzad(this.f350547a, this.f350548b, new HashMap(this.f350549c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.f350548b == zzadVar.f350548b && this.f350547a.equals(zzadVar.f350547a)) {
            return this.f350549c.equals(zzadVar.f350549c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f350547a.hashCode() * 31;
        long j12 = this.f350548b;
        return this.f350549c.hashCode() + ((iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f350547a;
        String strValueOf = String.valueOf(this.f350549c);
        StringBuilder sbA = r.A("Event{name='", str, "', timestamp=");
        sbA.append(this.f350548b);
        sbA.append(", params=");
        sbA.append(strValueOf);
        sbA.append("}");
        return sbA.toString();
    }

    public final long zza() {
        return this.f350548b;
    }

    public final String zzb() {
        return this.f350547a;
    }

    public final Map<String, Object> zzc() {
        return this.f350549c;
    }

    public final Object zza(String str) {
        HashMap map = this.f350549c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        this.f350547a = str;
    }

    public static Object zza(String str, Object obj, Object obj2) {
        if (f350546d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            return ((obj instanceof String) || obj == null) ? obj2 : obj;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        return obj instanceof String ? obj2.toString() : obj2;
    }

    public final void zza(String str, Object obj) {
        HashMap map = this.f350549c;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, zza(str, map.get(str), obj));
        }
    }
}
