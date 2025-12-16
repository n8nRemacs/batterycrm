package com.google.android.exoplayer2.upstream.cache;

import com.google.common.base.C37262f;
import j.P;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultContentMetadata.java */
/* loaded from: classes6.dex */
public final class l implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final l f347883c = new l(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public int f347884a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f347885b;

    public l() {
        this(Collections.emptyMap());
    }

    public static boolean c(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final l a(k kVar) {
        byte[] bytes;
        Map<String, byte[]> map = this.f347885b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(kVar.f347882b));
        for (int i12 = 0; i12 < listUnmodifiableList.size(); i12++) {
            map2.remove(listUnmodifiableList.get(i12));
        }
        HashMap map3 = new HashMap(kVar.f347881a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(C37262f.f359034c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new l(map2);
    }

    public final long b() {
        byte[] bArr = this.f347885b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return c(this.f347885b, ((l) obj).f347885b);
    }

    public final int hashCode() {
        if (this.f347884a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f347885b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f347884a = iHashCode;
        }
        return this.f347884a;
    }

    public l(Map<String, byte[]> map) {
        this.f347885b = Collections.unmodifiableMap(map);
    }
}
