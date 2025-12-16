package com.bumptech.glide.util;

import j.N;
import j.P;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes5.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f339642a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f339643b;

    /* renamed from: c, reason: collision with root package name */
    public long f339644c;

    public h(long j12) {
        this.f339643b = j12;
    }

    public final void a() {
        f(0L);
    }

    @P
    public final synchronized Y b(@N T t12) {
        return (Y) this.f339642a.get(t12);
    }

    public int c(@P Y y12) {
        return 1;
    }

    @P
    public final synchronized Y e(@N T t12, @P Y y12) {
        long jC2 = c(y12);
        if (jC2 >= this.f339643b) {
            d(t12, y12);
            return null;
        }
        if (y12 != null) {
            this.f339644c += jC2;
        }
        Y y13 = (Y) this.f339642a.put(t12, y12);
        if (y13 != null) {
            this.f339644c -= c(y13);
            if (!y13.equals(y12)) {
                d(t12, y13);
            }
        }
        f(this.f339643b);
        return y13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void f(long j12) {
        while (this.f339644c > j12) {
            Iterator it = this.f339642a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f339644c -= c(value);
            Object key = entry.getKey();
            it.remove();
            d(key, value);
        }
    }

    public void d(@N T t12, @P Y y12) {
    }
}
