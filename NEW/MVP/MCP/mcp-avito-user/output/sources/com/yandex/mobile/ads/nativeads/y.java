package com.yandex.mobile.ads.nativeads;

import android.view.View;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
final class y {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f392895b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile y f392896c;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final WeakHashMap f392897a = new WeakHashMap();

    @N
    public static y a() {
        if (f392896c == null) {
            synchronized (f392895b) {
                try {
                    if (f392896c == null) {
                        f392896c = new y();
                    }
                } finally {
                }
            }
        }
        return f392896c;
    }

    @P
    public final j0 a(@N View view) {
        j0 j0Var;
        synchronized (f392895b) {
            j0Var = (j0) this.f392897a.get(view);
        }
        return j0Var;
    }

    public final void a(@N View view, @N j0 j0Var) {
        synchronized (f392895b) {
            this.f392897a.put(view, j0Var);
        }
    }

    public final boolean a(@N j0 j0Var) {
        Iterator it = this.f392897a.entrySet().iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (((j0) ((Map.Entry) it.next()).getValue()) == j0Var) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }
}
