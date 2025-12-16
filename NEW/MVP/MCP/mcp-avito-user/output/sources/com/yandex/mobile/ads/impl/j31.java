package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public interface j31 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f386757a = a.f386758a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        private static volatile k31 f386759b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f386758a = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private static final Object f386760c = new Object();

        private a() {
        }

        @X41.n
        @Y61.k
        public static j31 a(@Y61.k Context context) {
            if (f386759b == null) {
                synchronized (f386760c) {
                    try {
                        if (f386759b == null) {
                            f386759b = new k31(y90.a(context));
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            k31 k31Var = f386759b;
            if (k31Var != null) {
                return k31Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @X41.n
    @Y61.k
    static j31 a(@Y61.k Context context) {
        f386757a.getClass();
        return a.a(context);
    }

    @Y61.l
    String a();

    void a(@Y61.l String str);
}
