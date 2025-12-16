package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class q71 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile q71 f389100b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f389101c = new Object();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f389102a = new HashMap();

    private q71() {
    }

    @j.N
    public static q71 a() {
        if (f389100b == null) {
            synchronized (f389101c) {
                try {
                    if (f389100b == null) {
                        f389100b = new q71();
                    }
                } finally {
                }
            }
        }
        return f389100b;
    }

    public final void b(@j.N n80 n80Var, @j.N Object obj) {
        synchronized (f389101c) {
            try {
                Set hashSet = (Set) this.f389102a.get(n80Var);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.f389102a.put(n80Var, hashSet);
                }
                hashSet.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@j.N n80 n80Var, @j.N Object obj) {
        synchronized (f389101c) {
            try {
                Set set = (Set) this.f389102a.get(n80Var);
                if (set != null) {
                    set.remove(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
