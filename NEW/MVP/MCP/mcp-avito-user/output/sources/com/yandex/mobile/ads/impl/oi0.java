package com.yandex.mobile.ads.impl;

import android.content.Context;
import j.InterfaceC42148d;
import java.util.WeakHashMap;

@j.K
/* loaded from: classes8.dex */
public final class oi0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f388557c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private static volatile oi0 f388558d;

    /* renamed from: a, reason: collision with root package name */
    private final int f388559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<rb0, hi0> f388560b;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @Y61.k
        @InterfaceC42148d
        public final oi0 a(@Y61.k Context context) {
            oi0 oi0Var = oi0.f388558d;
            if (oi0Var == null) {
                synchronized (this) {
                    try {
                        oi0Var = oi0.f388558d;
                        if (oi0Var == null) {
                            v11 v11VarA = q21.b().a(context);
                            oi0 oi0Var2 = new oi0(v11VarA != null ? v11VarA.q() : 0, 0);
                            oi0.f388558d = oi0Var2;
                            oi0Var = oi0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return oi0Var;
        }

        private a() {
        }
    }

    public /* synthetic */ oi0(int i12, int i13) {
        this(i12);
    }

    @Y61.l
    public final hi0 b(@Y61.k rb0 rb0Var) {
        return this.f388560b.remove(rb0Var);
    }

    private oi0(int i12) {
        this.f388559a = i12;
        this.f388560b = new WeakHashMap<>();
    }

    public final boolean b() {
        return this.f388560b.size() == this.f388559a;
    }

    public final void a(@Y61.k hi0 hi0Var, @Y61.k rb0 rb0Var) {
        if (this.f388560b.size() < this.f388559a) {
            this.f388560b.put(rb0Var, hi0Var);
        }
    }

    public final boolean a(@Y61.k rb0 rb0Var) {
        return this.f388560b.containsKey(rb0Var);
    }
}
