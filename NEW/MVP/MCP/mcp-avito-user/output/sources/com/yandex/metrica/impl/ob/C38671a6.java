package com.yandex.metrica.impl.ob;

import okhttp3.internal.connection.RealConnection;

/* renamed from: com.yandex.metrica.impl.ob.a6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38671a6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38698b8 f380109a;

    public C38671a6(@j.N C38698b8 c38698b8) {
        this.f380109a = c38698b8;
    }

    public long a() {
        long jH2 = this.f380109a.h();
        long j12 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        if (jH2 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j12 = 1 + jH2;
        }
        this.f380109a.a(j12);
        return j12;
    }
}
