package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Ec<T> implements InterfaceC39051pc<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Dc<T> f378040a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Lb<T> f378041b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Gc f378042c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Qb<T> f378043d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Runnable f378044e = new a();

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private T f378045f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Ec.this.b();
        }
    }

    public Ec(@j.N Dc<T> dc2, @j.N Lb<T> lb2, @j.N Gc gc2, @j.N Qb<T> qb2, @j.P T t12) {
        this.f378040a = dc2;
        this.f378041b = lb2;
        this.f378042c = gc2;
        this.f378043d = qb2;
        this.f378045f = t12;
    }

    public void a() {
        T t12 = this.f378045f;
        if (t12 != null && this.f378041b.a(t12) && this.f378040a.a(this.f378045f)) {
            this.f378042c.a();
            this.f378043d.a(this.f378044e, this.f378045f);
        }
    }

    public void b() {
        this.f378043d.a();
        this.f378040a.a();
    }

    public void c() {
        T t12 = this.f378045f;
        if (t12 != null && this.f378041b.b(t12)) {
            this.f378040a.b();
        }
        a();
    }

    public void a(@j.P T t12) {
        if (A2.a(this.f378045f, t12)) {
            return;
        }
        this.f378045f = t12;
        b();
        a();
    }
}
