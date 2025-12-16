package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzwm extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final zzwm f354084c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f354085b = true;

    static {
        zzwm zzwmVar = new zzwm();
        f354084c = zzwmVar;
        zzwmVar.f354085b = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzvp) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzvt.f354067a;
        int length = bArr.length;
        for (byte b12 : bArr) {
            length = (length * 31) + b12;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static zzwm zza() {
        return f354084c;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f354085b) {
            throw new UnsupportedOperationException();
        }
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
        Iterator it = entrySet().iterator();
        int iA2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iA2 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        e();
        Charset charset = zzvt.f354067a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e();
        for (Object obj : map.keySet()) {
            Charset charset = zzvt.f354067a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    public final zzwm zzb() {
        if (isEmpty()) {
            return new zzwm();
        }
        zzwm zzwmVar = new zzwm(this);
        zzwmVar.f354085b = true;
        return zzwmVar;
    }

    public final void zzc() {
        this.f354085b = false;
    }

    public final void zzd(zzwm zzwmVar) {
        e();
        if (zzwmVar.isEmpty()) {
            return;
        }
        putAll(zzwmVar);
    }

    public final boolean zze() {
        return this.f354085b;
    }
}
