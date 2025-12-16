package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.yandex.metrica.impl.ob.mk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38984mk implements InterfaceC39251xl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final M0 f381135a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f381136b;

    /* renamed from: c, reason: collision with root package name */
    private Map<Long, Long> f381137c;

    public C38984mk() {
        this(C39031oh.a(), new com.yandex.metrica.coreutils.services.e());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39251xl
    public void a(@j.N Activity activity, boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public void a(@j.N Throwable th2, @j.N C39227wl c39227wl) {
    }

    @j.k0
    public C38984mk(@j.N M0 m02, @j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f381137c = new HashMap();
        this.f381135a = m02;
        this.f381136b = fVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public boolean a(@j.N C38811fl c38811fl) {
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39251xl
    public synchronized void a(@j.N Activity activity, long j12) {
        this.f381137c.put(Long.valueOf(j12), Long.valueOf(this.f381136b.b()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public synchronized void a(long j12, @j.N Activity activity, @j.N C38761dl c38761dl, @j.N List<C39107rl> list, @j.N C38811fl c38811fl, @j.N Bk bk2) {
        try {
            this.f381136b.b();
            if (this.f381137c.get(Long.valueOf(j12)) != null) {
                this.f381137c.remove(Long.valueOf(j12));
            } else {
                this.f381135a.reportError("ui_parsing_diagnostics", new IllegalStateException("Unexpected situation: no start time"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
