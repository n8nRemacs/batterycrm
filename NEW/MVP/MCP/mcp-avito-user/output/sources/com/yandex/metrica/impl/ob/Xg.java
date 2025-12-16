package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Xg implements A6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.rtm.wrapper.e f379926a;

    public Xg(@j.N com.yandex.metrica.rtm.wrapper.e eVar) {
        this.f379926a = eVar;
    }

    @Override // com.yandex.metrica.impl.ob.A6
    public void a(@j.P Throwable th2, @j.N C39212w6 c39212w6) {
        this.f379926a.reportException(th2 == null ? "" : th2.getClass().getName(), th2);
    }
}
