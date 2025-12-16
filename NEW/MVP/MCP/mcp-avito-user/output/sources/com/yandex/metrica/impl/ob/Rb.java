package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class Rb {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private C38976mc f379292a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final U7 f379293b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final T7 f379294c;

    public Rb(@j.P C38976mc c38976mc, @j.N U7 u72, @j.N T7 t72) {
        this.f379292a = c38976mc;
        this.f379293b = u72;
        this.f379294c = t72;
    }

    public void a() {
        C38976mc c38976mc = this.f379292a;
        if (c38976mc != null) {
            long jC2 = this.f379293b.c();
            int i12 = c38976mc.f381042f;
            if (jC2 > i12) {
                this.f379293b.b((int) (i12 * 0.1f));
            }
            C38976mc c38976mc2 = this.f379292a;
            long jC3 = this.f379294c.c();
            int i13 = c38976mc2.f381042f;
            if (jC3 > i13) {
                this.f379294c.b((int) (i13 * 0.1f));
            }
        }
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f379292a = c38976mc;
    }
}
