package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.y6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39260y6 implements A6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a f382220a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final com.yandex.metrica.d f382221b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final A0 f382222c;

    /* renamed from: com.yandex.metrica.impl.ob.y6$a */
    public interface a {
        boolean a(Throwable th2);
    }

    public AbstractC39260y6(@j.N a aVar, @j.P com.yandex.metrica.d dVar, @j.N A0 a02) {
        this.f382220a = aVar;
        this.f382221b = dVar;
        this.f382222c = a02;
    }

    public abstract void a(@j.N H6 h62);

    @Override // com.yandex.metrica.impl.ob.A6
    public void a(@j.P Throwable th2, @j.N C39212w6 c39212w6) {
        if (this.f382220a.a(th2)) {
            com.yandex.metrica.d dVar = this.f382221b;
            if (dVar == null || th2 == null || (th2 = dVar.a()) != null) {
                a(I6.a(th2, c39212w6, null, this.f382222c.a(), this.f382222c.b()));
            }
        }
    }
}
