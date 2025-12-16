package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public abstract class h0<T> {

    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        boolean f365655a;

        /* renamed from: b, reason: collision with root package name */
        T f365656b;

        /* renamed from: c, reason: collision with root package name */
        String f365657c;

        private b() {
        }

        public static <T> b<T> c() {
            return new b<>();
        }

        public T a() {
            return this.f365656b;
        }

        public boolean b() {
            return this.f365655a;
        }
    }

    public static h0<String> a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new u0(okHttpClientProvider);
            } catch (Throwable th2) {
                e2.a("HttpRequest error: error while creating OkHttpPostRequest", th2);
            }
        }
        return new f0();
    }

    public abstract b<T> a(String str);

    public static h0<String> a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z12) {
        if (okHttpClientProvider != null) {
            try {
                return new v0(aVar, okHttpClientProvider, z12);
            } catch (Throwable th2) {
                e2.a("HttpRequest error: error while creating OkHttpPostRequest", th2);
            }
        }
        return new g0(aVar, z12);
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }
}
