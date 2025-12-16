package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public interface dk {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f384623a = a.f384624a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        private static volatile fk f384625b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f384624a = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private static final Object f384626c = new Object();

        private a() {
        }

        @X41.n
        @Y61.k
        public static dk a(@Y61.k Context context) {
            if (f384625b == null) {
                synchronized (f384626c) {
                    try {
                        if (f384625b == null) {
                            f384625b = ek.a(context);
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            fk fkVar = f384625b;
            if (fkVar != null) {
                return fkVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
