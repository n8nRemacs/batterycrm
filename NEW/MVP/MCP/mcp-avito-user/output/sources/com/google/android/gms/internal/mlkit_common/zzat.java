package com.google.android.gms.internal.mlkit_common;

import AK.c;
import I41.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public abstract class zzat implements Map, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient zzau f351194b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzau f351195c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient zzam f351196d;

    public static zzat zzc(Object obj, Object obj2) {
        return zzbb.d(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    public abstract zzam a();

    public abstract zzau b();

    public abstract zzau c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@a Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@a Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @a
    public abstract Object get(@a Object obj);

    @Override // java.util.Map
    @a
    public final Object getOrDefault(@a Object obj, @a Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzau zzauVar = this.f351195c;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarC = c();
        this.f351195c = zzauVarC;
        return zzauVarC;
    }

    @Override // java.util.Map
    @a
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @a
    @Deprecated
    public final Object remove(@a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(c.g(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z12 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z12) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z12 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzam values() {
        zzam zzamVar = this.f351196d;
        if (zzamVar != null) {
            return zzamVar;
        }
        zzam zzamVarA = a();
        this.f351196d = zzamVarA;
        return zzamVarA;
    }

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzau entrySet() {
        zzau zzauVar = this.f351194b;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVarB = b();
        this.f351194b = zzauVarB;
        return zzauVarB;
    }
}
