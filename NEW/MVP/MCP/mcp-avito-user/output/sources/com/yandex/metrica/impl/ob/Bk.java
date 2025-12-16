package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class Bk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Ak f377854a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Ak f377855b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Ak f377856c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ak f377857d;

    public static class a {
    }

    public Bk(@j.N C39298zk c39298zk, @j.N C38811fl c38811fl) {
        this(new Ak(c39298zk.c(), a(c38811fl.f380601e)), new Ak(c39298zk.b(), a(c38811fl.f380602f)), new Ak(c39298zk.d(), a(c38811fl.f380604h)), new Ak(c39298zk.a(), a(c38811fl.f380603g)));
    }

    @j.N
    public Ak a() {
        return this.f377857d;
    }

    @j.N
    public Ak b() {
        return this.f377855b;
    }

    @j.N
    public Ak c() {
        return this.f377854a;
    }

    @j.N
    public Ak d() {
        return this.f377856c;
    }

    private static int a(@j.P Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @j.k0
    public Bk(@j.N Ak ak2, @j.N Ak ak3, @j.N Ak ak4, @j.N Ak ak5) {
        this.f377854a = ak2;
        this.f377855b = ak3;
        this.f377856c = ak4;
        this.f377857d = ak5;
    }
}
