package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes7.dex */
public class U {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f379559f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile U f379560g;

    /* renamed from: a, reason: collision with root package name */
    public final String f379561a = Build.MANUFACTURER;

    /* renamed from: b, reason: collision with root package name */
    public final String f379562b = Build.MODEL;

    /* renamed from: c, reason: collision with root package name */
    public final String f379563c = Build.VERSION.RELEASE;

    /* renamed from: d, reason: collision with root package name */
    public final int f379564d = Build.VERSION.SDK_INT;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final String f379565e = String.valueOf(X1.a());

    public class a extends ArrayList<String> {
        public a(U u12) {
            if (X1.b()) {
                add("Superuser.apk");
            }
            if (X1.c()) {
                add("su.so");
            }
        }
    }

    @j.k0
    public U() {
        Collections.unmodifiableList(new a(this));
    }

    public static U a() {
        if (f379560g == null) {
            synchronized (f379559f) {
                try {
                    if (f379560g == null) {
                        f379560g = new U();
                    }
                } finally {
                }
            }
        }
        return f379560g;
    }
}
