package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzff extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final zzff f352466c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f352467b = true;

    static {
        zzff zzffVar = new zzff();
        f352466c = zzffVar;
        zzffVar.f352467b = false;
    }

    public static zzff zza() {
        return f352466c;
    }

    public final void a() {
        if (!this.f352467b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Iterator it = entrySet().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                iHashCode = zzel.zzb((byte[]) key);
            } else {
                if (key instanceof zzee) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                iHashCode2 = zzel.zzb((byte[]) value);
            } else {
                if (value instanceof zzee) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i12 += iHashCode2 ^ iHashCode;
        }
        return i12;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = zzel.f352447a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = zzel.f352447a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public final zzff zzb() {
        if (isEmpty()) {
            return new zzff();
        }
        zzff zzffVar = new zzff(this);
        zzffVar.f352467b = true;
        return zzffVar;
    }

    public final void zzc() {
        this.f352467b = false;
    }

    public final void zzd(zzff zzffVar) {
        a();
        if (zzffVar.isEmpty()) {
            return;
        }
        putAll(zzffVar);
    }

    public final boolean zze() {
        return this.f352467b;
    }
}
