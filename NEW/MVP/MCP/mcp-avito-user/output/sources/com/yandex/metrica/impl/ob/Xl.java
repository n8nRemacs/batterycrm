package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;

/* loaded from: classes7.dex */
public class Xl implements InterfaceC38712bm {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f379941a;

    public String b() {
        if (this.f379941a != null) {
            return this.f379941a;
        }
        synchronized (this) {
            try {
                if (this.f379941a == null) {
                    this.f379941a = a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f379941a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PrivateApi"})
    public String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }
}
