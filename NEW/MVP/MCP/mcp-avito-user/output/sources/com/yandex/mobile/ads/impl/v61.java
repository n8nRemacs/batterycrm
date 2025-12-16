package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts0;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class v61 extends v9 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f390803h = 0;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static v61 a() {
            int i12 = v61.f390803h;
            try {
                return new v61(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            } catch (Exception e12) {
                int i13 = ts0.f390303c;
                ts0.a.b().getClass();
                ts0.a(5, "unable to load android socket classes", e12);
                return null;
            }
        }

        private a() {
        }
    }

    static {
        new a(0);
    }

    public v61(@Y61.k Class<? super SSLSocket> cls, @Y61.k Class<? super SSLSocketFactory> cls2, @Y61.k Class<?> cls3) {
        super(cls);
    }
}
