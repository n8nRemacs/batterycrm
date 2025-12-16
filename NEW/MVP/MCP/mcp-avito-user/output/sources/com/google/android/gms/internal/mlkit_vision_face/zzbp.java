package com.google.android.gms.internal.mlkit_vision_face;

import AK.c;
import I41.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public abstract class zzbp implements Map, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient zzbq f353000b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient zzbq f353001c;

    /* renamed from: d, reason: collision with root package name */
    @a
    public transient zzbi f353002d;

    public static zzbp zzc(Object obj, Object obj2) {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        int i12 = zzch.f353021g;
        objArr[0].getClass();
        objArr[1].getClass();
        return new zzch(objArr, 1);
    }

    public abstract zzbi a();

    public abstract zzbq b();

    public abstract zzbq c();

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
        zzbq zzbqVar = this.f353001c;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarC = c();
        this.f353001c = zzbqVarC;
        return zzbqVarC;
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
    public final zzbi values() {
        zzbi zzbiVar = this.f353002d;
        if (zzbiVar != null) {
            return zzbiVar;
        }
        zzbi zzbiVarA = a();
        this.f353002d = zzbiVarA;
        return zzbiVarA;
    }

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbq entrySet() {
        zzbq zzbqVar = this.f353000b;
        if (zzbqVar != null) {
            return zzbqVar;
        }
        zzbq zzbqVarB = b();
        this.f353000b = zzbqVarB;
        return zzbqVarB;
    }
}
