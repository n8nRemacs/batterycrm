package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.zk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39298zk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Tk f382323a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38885il f382324b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38885il f382325c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38885il f382326d;

    public C39298zk(@j.P C38811fl c38811fl) {
        this(new Tk(c38811fl == null ? null : c38811fl.f380601e), new C38885il(c38811fl == null ? null : c38811fl.f380602f), new C38885il(c38811fl == null ? null : c38811fl.f380604h), new C38885il(c38811fl != null ? c38811fl.f380603g : null));
    }

    public void a(@j.N C38811fl c38811fl) {
        this.f382323a.d(c38811fl.f380601e);
        this.f382324b.d(c38811fl.f380602f);
        this.f382325c.d(c38811fl.f380604h);
        this.f382326d.d(c38811fl.f380603g);
    }

    @j.N
    public AbstractC39274yk<?> b() {
        return this.f382324b;
    }

    @j.N
    public AbstractC39274yk<?> c() {
        return this.f382323a;
    }

    @j.N
    public AbstractC39274yk<?> d() {
        return this.f382325c;
    }

    @j.N
    public synchronized AbstractC39274yk<?> a() {
        return this.f382326d;
    }

    @j.k0
    public C39298zk(@j.N Tk tk2, @j.N C38885il c38885il, @j.N C38885il c38885il2, @j.N C38885il c38885il3) {
        this.f382323a = tk2;
        this.f382324b = c38885il;
        this.f382325c = c38885il2;
        this.f382326d = c38885il3;
    }
}
