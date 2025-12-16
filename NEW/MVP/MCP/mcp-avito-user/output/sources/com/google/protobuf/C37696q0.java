package com.google.protobuf;

import com.google.protobuf.C37670d0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* renamed from: com.google.protobuf.q0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37696q0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final C37696q0<?, ?> f362942c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362943b = true;

    static {
        C37696q0<?, ?> c37696q0 = new C37696q0<>();
        f362942c = c37696q0;
        c37696q0.f362943b = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof C37670d0.c) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C37670d0.f362857a;
        int length = bArr.length;
        for (byte b12 : bArr) {
            length = (length * 31) + b12;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f362943b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z12;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        V value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
                z12 = true;
            }
            z12 = false;
            break;
        }
        z12 = true;
        return z12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA2 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iA2 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA2;
    }

    public final C37696q0<K, V> k() {
        if (isEmpty()) {
            return new C37696q0<>();
        }
        C37696q0<K, V> c37696q0 = new C37696q0<>(this);
        c37696q0.f362943b = true;
        return c37696q0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k12, V v12) {
        e();
        Charset charset = C37670d0.f362857a;
        k12.getClass();
        v12.getClass();
        return (V) super.put(k12, v12);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        e();
        for (K k12 : map.keySet()) {
            Charset charset = C37670d0.f362857a;
            k12.getClass();
            map.get(k12).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }
}
