package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.impl.tm;
import j.P;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public interface e {

    public static class a extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f382910a;

        public a(Throwable th2, int i12) {
            super(th2);
            this.f382910a = i12;
        }
    }

    void a(@P f.a aVar);

    boolean a(String str);

    void b(@P f.a aVar);

    int c();

    default boolean d() {
        return false;
    }

    @P
    Map<String, String> e();

    UUID f();

    @P
    a g();

    @P
    tm h();
}
