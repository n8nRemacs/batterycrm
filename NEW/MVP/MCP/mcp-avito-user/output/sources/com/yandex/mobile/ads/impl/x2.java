package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    private final zy0 f391523a = zy0.a();

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<re<?>> f391524b;

    public x2(re<?> reVar) {
        this.f391524b = new WeakReference<>(reVar);
    }

    public static w2 a(@j.P n2 n2Var, int i12) {
        switch (i12) {
            case 2:
                return i5.f386315g;
            case 3:
            default:
                return i5.f386327s;
            case 4:
            case 10:
                return i5.a(n2Var != null ? n2Var.c() : null);
            case 5:
                return i5.f386312d;
            case 6:
                return i5.f386320l;
            case 7:
                return i5.f386321m;
            case 8:
                return i5.f386314f;
            case 9:
                return i5.f386316h;
            case 11:
                return i5.f386323o;
            case 12:
                return i5.f386326r;
        }
    }

    public final void b() {
        a();
        this.f391524b.clear();
    }

    public final void a() {
        re<?> reVar = this.f391524b.get();
        if (reVar != null) {
            zy0 zy0Var = this.f391523a;
            Context context = reVar.f389494b;
            int i12 = g7.f385602b;
            String string = reVar.toString();
            zy0Var.getClass();
            zy0.a(context, string);
        }
    }

    public final void a(@j.N oe oeVar) {
        re<?> reVar = this.f391524b.get();
        if (reVar != null) {
            zy0 zy0Var = this.f391523a;
            Context context = reVar.f389494b;
            synchronized (zy0Var) {
                jp0.a(context).a(oeVar);
            }
        }
    }
}
