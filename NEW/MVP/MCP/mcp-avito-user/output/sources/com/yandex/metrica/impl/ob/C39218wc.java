package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* renamed from: com.yandex.metrica.impl.ob.wc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39218wc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final IHandlerExecutor f382117a = F0.g().q().b();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final U7 f382118b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final T7 f382119c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ed f382120d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39267yd f382121e;

    public C39218wc(@j.N Context context) {
        this.f382118b = C38899ja.a(context).f();
        this.f382119c = C38899ja.a(context).e();
        Ed ed2 = new Ed();
        this.f382120d = ed2;
        this.f382121e = new C39267yd(ed2.a());
    }

    @j.N
    public IHandlerExecutor a() {
        return this.f382117a;
    }

    @j.N
    public T7 b() {
        return this.f382119c;
    }

    @j.N
    public U7 c() {
        return this.f382118b;
    }

    @j.N
    public C39267yd d() {
        return this.f382121e;
    }

    @j.N
    public Ed e() {
        return this.f382120d;
    }
}
