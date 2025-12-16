package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.h1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38841h1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final M0 f380672a;

    public C38841h1() {
        this(C39031oh.a());
    }

    public void a(@j.P Map<String, Object> map) {
        this.f380672a.reportEvent("login_sdk", map);
    }

    @j.k0
    public C38841h1(@j.N M0 m02) {
        this.f380672a = m02;
    }
}
