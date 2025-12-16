package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public interface cl {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f384324a = a.f384325a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f384325a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private static final Object f384326b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        private static volatile cl f384327c;

        private a() {
        }

        @X41.n
        @Y61.k
        public static cl a(@Y61.k Context context) {
            if (f384327c == null) {
                synchronized (f384326b) {
                    try {
                        if (f384327c == null) {
                            f384327c = new dl(y90.a(context));
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            cl clVar = f384327c;
            if (clVar != null) {
                return clVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Y61.l
    v11 a();

    void a(@Y61.k v11 v11Var);
}
