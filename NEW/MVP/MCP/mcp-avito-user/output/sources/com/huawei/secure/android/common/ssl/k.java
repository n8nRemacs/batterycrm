package com.huawei.secure.android.common.ssl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile l f363736a;

    @SuppressLint({"NewApi"})
    public static l a(Context context) {
        System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        if (V01.e.f16866a == null) {
            V01.e.f16866a = context.getApplicationContext();
        }
        if (f363736a == null) {
            synchronized (k.class) {
                try {
                    if (f363736a == null) {
                        InputStream inputStreamI = V01.a.i(context);
                        if (inputStreamI == null) {
                            inputStreamI = context.getAssets().open("hmsrootcas.bks");
                        }
                        f363736a = new l(inputStreamI);
                        new V01.f().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                } finally {
                }
            }
        }
        System.currentTimeMillis();
        return f363736a;
    }
}
