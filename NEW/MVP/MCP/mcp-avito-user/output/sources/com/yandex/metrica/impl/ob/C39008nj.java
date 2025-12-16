package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39008nj implements S0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f381198a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381199b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381200c;

    @j.k0
    public C39008nj(@j.N ICommonExecutor iCommonExecutor, @j.N Handler handler, @j.N ICommonExecutor iCommonExecutor2, @j.N Q q12) {
        this.f381199b = iCommonExecutor;
        this.f381198a = handler;
        this.f381200c = iCommonExecutor2;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(@j.N com.yandex.metrica.j jVar, @j.N O0 o02) {
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public ICommonExecutor b() {
        return this.f381199b;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public Handler c() {
        return this.f381198a;
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public Eb d() {
        return new C39265yb();
    }

    @Override // com.yandex.metrica.impl.ob.S0
    public void a(@j.P Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.impl.ob.S0
    @j.N
    public C39157u a() {
        return new C39157u(this.f381200c);
    }
}
