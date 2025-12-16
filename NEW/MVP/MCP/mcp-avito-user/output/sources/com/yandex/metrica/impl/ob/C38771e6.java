package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Tl;

/* renamed from: com.yandex.metrica.impl.ob.e6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38771e6 implements InterfaceC38746d6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f380437a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    protected final C38724c9 f380438b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Tl.a f380439c;

    public C38771e6(@j.N C38724c9 c38724c9, @j.N String str) {
        this.f380438b = c38724c9;
        this.f380437a = str;
        Tl.a aVar = new Tl.a();
        try {
            String strG = c38724c9.g(str);
            if (!TextUtils.isEmpty(strG)) {
                aVar = new Tl.a(strG);
            }
        } catch (Throwable unused) {
        }
        this.f380439c = aVar;
    }

    public C38771e6 a(long j12) {
        a("SESSION_INIT_TIME", Long.valueOf(j12));
        return this;
    }

    public C38771e6 b(long j12) {
        a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j12));
        return this;
    }

    @j.P
    public Long c() {
        return this.f380439c.a("SESSION_INIT_TIME");
    }

    public C38771e6 d(long j12) {
        a("SESSION_ID", Long.valueOf(j12));
        return this;
    }

    @j.P
    public Long e() {
        return this.f380439c.a("SESSION_COUNTER_ID");
    }

    @j.P
    public Long f() {
        return this.f380439c.a("SESSION_ID");
    }

    @j.P
    public Long g() {
        return this.f380439c.a("SESSION_SLEEP_START");
    }

    public boolean h() {
        return this.f380439c.length() > 0;
    }

    @j.P
    public Boolean i() {
        Tl.a aVar = this.f380439c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C38771e6 a(boolean z12) {
        a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z12));
        return this;
    }

    public void b() {
        this.f380438b.c(this.f380437a, this.f380439c.toString());
        this.f380438b.d();
    }

    public C38771e6 c(long j12) {
        a("SESSION_COUNTER_ID", Long.valueOf(j12));
        return this;
    }

    @j.P
    public Long d() {
        return this.f380439c.a("SESSION_LAST_EVENT_OFFSET");
    }

    public C38771e6 e(long j12) {
        a("SESSION_SLEEP_START", Long.valueOf(j12));
        return this;
    }

    private void a(String str, Object obj) {
        try {
            this.f380439c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        this.f380439c = new Tl.a();
        b();
    }
}
