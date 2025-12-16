package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class oo {

    /* renamed from: c, reason: collision with root package name */
    public static final oo f388598c = new oo(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    private int f388599a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f388600b;

    public oo() {
        this(Collections.emptyMap());
    }

    public final oo a(tl tlVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f388600b);
        List<String> listB = tlVar.b();
        for (int i12 = 0; i12 < listB.size(); i12++) {
            map.remove(listB.get(i12));
        }
        for (Map.Entry<String, Object> entry : tlVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(oi.f388554c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(key, bytes);
        }
        Map<String, byte[]> map2 = this.f388600b;
        if (map2.size() == map.size()) {
            for (Map.Entry<String, byte[]> entry2 : map2.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            return this;
        }
        return new oo(map);
    }

    public final long b() {
        byte[] bArr = this.f388600b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    @j.P
    public final String c() {
        byte[] bArr = this.f388600b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, oi.f388554c);
        }
        return null;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oo.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f388600b;
        Map<String, byte[]> map2 = ((oo) obj).f388600b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f388599a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f388600b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f388599a = iHashCode;
        }
        return this.f388599a;
    }

    public oo(Map<String, byte[]> map) {
        this.f388600b = Collections.unmodifiableMap(map);
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.f388600b.entrySet();
    }
}
