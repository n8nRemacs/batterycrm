package com.yandex.metrica.impl.ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.s2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39112s2 {

    /* renamed from: a, reason: collision with root package name */
    private final a f381816a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Boolean f381817b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<String> f381818c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<String> f381819d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.s2$a */
    public interface a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.s2$b */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C38774e9 f381820a;

        public b(@j.N C38774e9 c38774e9) {
            this.f381820a = c38774e9;
        }

        public void a(boolean z12) {
            this.f381820a.b(z12).d();
        }

        @j.P
        public Boolean a() {
            return this.f381820a.f();
        }
    }

    public C39112s2(@j.N a aVar) {
        this.f381816a = aVar;
        this.f381817b = ((b) aVar).a();
    }

    private boolean b() {
        Boolean bool = this.f381817b;
        return bool == null ? !this.f381818c.isEmpty() || this.f381819d.isEmpty() : bool.booleanValue();
    }

    public synchronized void a(@j.P Boolean bool) {
        try {
            if (A2.a(bool) || this.f381817b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f381817b = Boolean.valueOf(zEquals);
                ((b) this.f381816a).a(zEquals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean c() {
        Boolean bool;
        try {
            bool = this.f381817b;
        } finally {
        }
        return bool == null ? this.f381819d.isEmpty() && this.f381818c.isEmpty() : bool.booleanValue();
    }

    public synchronized boolean d() {
        return b();
    }

    public synchronized boolean e() {
        return b();
    }

    public synchronized void a(@j.N String str, @j.P Boolean bool) {
        try {
            if (A2.a(bool) || (!this.f381819d.contains(str) && !this.f381818c.contains(str))) {
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue()) {
                    this.f381819d.add(str);
                    this.f381818c.remove(str);
                } else {
                    this.f381818c.add(str);
                    this.f381819d.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean a() {
        Boolean bool;
        try {
            bool = this.f381817b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f381819d.isEmpty() : bool.booleanValue();
    }
}
