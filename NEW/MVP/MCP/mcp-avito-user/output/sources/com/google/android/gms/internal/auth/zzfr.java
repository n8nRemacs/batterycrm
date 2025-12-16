package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzfr extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final zzfr f350117c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350118b = true;

    static {
        zzfr zzfrVar = new zzfr();
        f350117c = zzfrVar;
        zzfrVar.f350118b = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzex) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzfa.f350106a;
        int length = bArr.length;
        for (byte b12 : bArr) {
            length = (length * 31) + b12;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static zzfr zza() {
        return f350117c;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f350118b) {
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
        Charset charset = zzfa.f350106a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e();
        for (Object obj : map.keySet()) {
            Charset charset = zzfa.f350106a;
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

    public final zzfr zzb() {
        if (isEmpty()) {
            return new zzfr();
        }
        zzfr zzfrVar = new zzfr(this);
        zzfrVar.f350118b = true;
        return zzfrVar;
    }

    public final void zzc() {
        this.f350118b = false;
    }

    public final void zzd(zzfr zzfrVar) {
        e();
        if (zzfrVar.isEmpty()) {
            return;
        }
        putAll(zzfrVar);
    }

    public final boolean zze() {
        return this.f350118b;
    }
}
