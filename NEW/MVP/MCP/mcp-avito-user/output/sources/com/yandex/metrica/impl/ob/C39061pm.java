package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import com.avito.android.remote.model.ProfileTab;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressLint({ProfileTab.ALL})
/* renamed from: com.yandex.metrica.impl.ob.pm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39061pm<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f381380a;

    /* renamed from: b, reason: collision with root package name */
    private int f381381b;

    /* renamed from: c, reason: collision with root package name */
    private int f381382c;

    /* renamed from: d, reason: collision with root package name */
    private int f381383d;

    /* renamed from: e, reason: collision with root package name */
    private int f381384e;

    /* renamed from: f, reason: collision with root package name */
    private int f381385f;

    /* renamed from: g, reason: collision with root package name */
    private int f381386g;

    public C39061pm(int i12) {
        if (i12 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f381382c = i12;
        this.f381380a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int b(K k12, V v12) {
        int length = C38689b.b(((C39226wk) k12).f382142b).length + 12;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k12 + ContainerUtils.KEY_VALUE_DELIMITER + v12);
    }

    public final synchronized V a(K k12) {
        V v12 = this.f381380a.get(k12);
        if (v12 != null) {
            this.f381385f++;
            return v12;
        }
        this.f381386g++;
        return null;
    }

    public final synchronized String toString() {
        int i12;
        int i13;
        try {
            i12 = this.f381385f;
            i13 = this.f381386g + i12;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f381382c), Integer.valueOf(this.f381385f), Integer.valueOf(this.f381386g), Integer.valueOf(i13 != 0 ? (i12 * 100) / i13 : 0));
    }

    public final synchronized V a(K k12, V v12) {
        V vPut;
        try {
            this.f381383d++;
            this.f381381b += b(k12, v12);
            vPut = this.f381380a.put(k12, v12);
            if (vPut != null) {
                this.f381381b -= b(k12, vPut);
            }
            a(this.f381382c);
        } catch (Throwable th2) {
            throw th2;
        }
        return vPut;
    }

    private void a(int i12) {
        Map.Entry<K, V> next;
        while (this.f381381b > i12 && !this.f381380a.isEmpty() && (next = this.f381380a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f381380a.remove(key);
            this.f381381b -= b(key, value);
            this.f381384e++;
        }
        if (this.f381381b < 0 || (this.f381380a.isEmpty() && this.f381381b != 0)) {
            throw new IllegalStateException(getClass().getName().concat(".sizeOf() is reporting inconsistent results!"));
        }
    }

    public final synchronized void a() {
        a(-1);
    }
}
