package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bz0;

/* loaded from: classes8.dex */
public final class zy0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile zy0 f392453a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f392454b = new Object();

    public class a implements bz0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f392455a;

        public a(Object obj) {
            this.f392455a = obj;
        }

        @Override // com.yandex.mobile.ads.impl.bz0.b
        public final boolean a(qy0<?> qy0Var) {
            return this.f392455a.equals(qy0Var.j());
        }
    }

    public static zy0 a() {
        if (f392453a == null) {
            synchronized (f392454b) {
                try {
                    if (f392453a == null) {
                        f392453a = new zy0();
                    }
                } finally {
                }
            }
        }
        return f392453a;
    }

    public final synchronized void a(Context context, k71 k71Var) {
        jp0.a(context).a(k71Var);
    }

    public static void a(@j.N Context context, @j.N Object obj) {
        jp0.a(context).a(new a(obj));
    }
}
