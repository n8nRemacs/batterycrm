package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class h40 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f385901b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile h40 f385902c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakHashMap f385903a = new WeakHashMap();

    private h40() {
    }

    @j.N
    public static h40 a() {
        if (f385902c == null) {
            synchronized (f385901b) {
                try {
                    if (f385902c == null) {
                        f385902c = new h40();
                    }
                } finally {
                }
            }
        }
        return f385902c;
    }

    @j.P
    public final InstreamAdBinder a(@j.N View view) {
        InstreamAdBinder instreamAdBinder;
        synchronized (f385901b) {
            instreamAdBinder = (InstreamAdBinder) this.f385903a.get(view);
        }
        return instreamAdBinder;
    }

    public final void a(@j.N View view, @j.N InstreamAdBinder instreamAdBinder) {
        synchronized (f385901b) {
            this.f385903a.put(view, instreamAdBinder);
        }
    }

    public final boolean a(@j.N InstreamAdBinder instreamAdBinder) {
        boolean z12;
        synchronized (f385901b) {
            try {
                Iterator it = this.f385903a.entrySet().iterator();
                z12 = false;
                while (it.hasNext()) {
                    if (instreamAdBinder == ((InstreamAdBinder) ((Map.Entry) it.next()).getValue())) {
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
