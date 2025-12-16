package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class B7 {

    /* renamed from: c, reason: collision with root package name */
    private static final B7 f377821c = new B7(new C38697b7());

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38697b7 f377822a;

    /* renamed from: b, reason: collision with root package name */
    private a f377823b = a.BLANK;

    public enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    @j.k0
    public B7(@j.N C38697b7 c38697b7) {
        this.f377822a = c38697b7;
    }

    public static B7 a() {
        return f377821c;
    }

    public synchronized boolean b() {
        a aVar = this.f377823b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            this.f377822a.getClass();
            System.loadLibrary("appmetrica-service-native");
            this.f377823b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.f377823b = a.LOADING_ERROR;
            return false;
        }
    }
}
