package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class za0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f392212b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile za0 f392213c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakHashMap f392214a = new WeakHashMap();

    private za0() {
    }

    @j.N
    public static za0 a() {
        if (f392213c == null) {
            synchronized (f392212b) {
                try {
                    if (f392213c == null) {
                        f392213c = new za0();
                    }
                } finally {
                }
            }
        }
        return f392213c;
    }

    @j.P
    public final ta0 a(@j.N lu luVar) {
        ta0 ta0Var;
        synchronized (f392212b) {
            ta0Var = (ta0) this.f392214a.get(luVar);
        }
        return ta0Var;
    }

    public final void a(@j.N lu luVar, @j.N ta0 ta0Var) {
        synchronized (f392212b) {
            this.f392214a.put(luVar, ta0Var);
        }
    }

    public final boolean a(@j.N ta0 ta0Var) {
        boolean z12;
        synchronized (f392212b) {
            try {
                Iterator it = this.f392214a.entrySet().iterator();
                z12 = false;
                while (it.hasNext()) {
                    if (ta0Var == ((ta0) ((Map.Entry) it.next()).getValue())) {
                        it.remove();
                        z12 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }
}
