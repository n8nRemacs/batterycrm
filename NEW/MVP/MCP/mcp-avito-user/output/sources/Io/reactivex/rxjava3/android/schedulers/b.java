package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.util.C35760b5;
import i41.C41224a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.util.h;

/* compiled from: AndroidSchedulers.java */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final H f401941a;

    /* compiled from: AndroidSchedulers.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final H f401942a = new c(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            H h12 = (H) new io.reactivex.rxjava3.android.schedulers.a().call();
            if (h12 == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f401941a = h12;
        } catch (Throwable th2) {
            throw h.f(th2);
        }
    }

    public b() {
        throw new AssertionError("No instances.");
    }

    @SuppressLint({"NewApi"})
    public static H a(Looper looper) {
        if (looper != null) {
            return new c(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }

    public static H b() {
        H h12 = f401941a;
        if (h12 == null) {
            throw new NullPointerException("scheduler == null");
        }
        C35760b5 c35760b5 = C41224a.f398356a;
        if (c35760b5 == null) {
            return h12;
        }
        try {
            return c35760b5.f318828b;
        } catch (Throwable th2) {
            throw h.f(th2);
        }
    }
}
