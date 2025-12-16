package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class a21 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f383389b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a21 f383390c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f383391a = new HashMap();

    private a21() {
    }

    public static a21 a() {
        if (f383390c == null) {
            synchronized (f383389b) {
                try {
                    if (f383390c == null) {
                        f383390c = new a21();
                    }
                } finally {
                }
            }
        }
        return f383390c;
    }

    public final void a(@j.N x11 x11Var) {
        synchronized (f383389b) {
            try {
                if (!this.f383391a.containsKey(x11Var)) {
                    this.f383391a.put(x11Var, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(@j.N Context context, @j.N v11 v11Var) {
        HashSet hashSet;
        synchronized (f383389b) {
            hashSet = new HashSet(this.f383391a.keySet());
            q21.b().a(context, v11Var);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((i21) it.next()).a(context, v11Var);
        }
    }
}
