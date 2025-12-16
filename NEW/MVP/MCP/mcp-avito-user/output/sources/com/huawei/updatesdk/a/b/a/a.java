package com.huawei.updatesdk.a.b.a;

import android.content.Context;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f363784b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static a f363785c;

    /* renamed from: a, reason: collision with root package name */
    private Context f363786a;

    public a(Context context) {
        this.f363786a = context.getApplicationContext();
    }

    public static a c() {
        a aVar;
        synchronized (f363784b) {
            aVar = f363785c;
        }
        return aVar;
    }

    public Context a() {
        return this.f363786a;
    }

    public String b() {
        Context context = this.f363786a;
        return (context == null || context.getFilesDir() == null) ? "" : this.f363786a.getFilesDir().getAbsolutePath();
    }

    public static void a(Context context) {
        synchronized (f363784b) {
            try {
                if (f363785c == null) {
                    f363785c = new a(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
