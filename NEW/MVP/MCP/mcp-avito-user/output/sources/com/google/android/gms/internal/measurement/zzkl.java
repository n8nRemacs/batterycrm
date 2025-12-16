package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzkl<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final zzkl<?, ?> f350919c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f350920b = true;

    static {
        zzkl<?, ?> zzklVar = new zzkl<>();
        f350919c = zzklVar;
        zzklVar.f350920b = false;
    }

    public static <K, V> zzkl<K, V> zza() {
        return (zzkl<K, V>) f350919c;
    }

    public final void a() {
        if (!this.f350920b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkl.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i12 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            K key = entry.getKey();
            if (key instanceof byte[]) {
                iHashCode = zzjh.zza((byte[]) key);
            } else {
                if (key instanceof zzjk) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            V value = entry.getValue();
            if (value instanceof byte[]) {
                iHashCode2 = zzjh.zza((byte[]) value);
            } else {
                if (value instanceof zzjk) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i12 += iHashCode2 ^ iHashCode;
        }
        return i12;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k12, V v12) {
        a();
        Charset charset = zzjh.f350896a;
        k12.getClass();
        v12.getClass();
        return (V) super.put(k12, v12);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        a();
        for (K k12 : map.keySet()) {
            Charset charset = zzjh.f350896a;
            k12.getClass();
            map.get(k12).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        return (V) super.remove(obj);
    }

    public final zzkl<K, V> zzb() {
        if (isEmpty()) {
            return new zzkl<>();
        }
        zzkl<K, V> zzklVar = new zzkl<>(this);
        zzklVar.f350920b = true;
        return zzklVar;
    }

    public final void zzc() {
        this.f350920b = false;
    }

    public final boolean zzd() {
        return this.f350920b;
    }

    public final void zza(zzkl<K, V> zzklVar) {
        a();
        if (zzklVar.isEmpty()) {
            return;
        }
        putAll(zzklVar);
    }
}
