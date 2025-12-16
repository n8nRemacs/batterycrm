package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ud, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39171ud implements InterfaceC39219wd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39219wd f381932a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39219wd f381933b;

    /* renamed from: com.yandex.metrica.impl.ob.ud$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private InterfaceC39219wd f381934a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private InterfaceC39219wd f381935b;

        public a(@j.N InterfaceC39219wd interfaceC39219wd, @j.N InterfaceC39219wd interfaceC39219wd2) {
            this.f381934a = interfaceC39219wd;
            this.f381935b = interfaceC39219wd2;
        }

        public a a(@j.N C39057pi c39057pi) {
            this.f381935b = new Fd(c39057pi.E());
            return this;
        }

        public a a(boolean z12) {
            this.f381934a = new C39243xd(z12);
            return this;
        }

        public C39171ud a() {
            return new C39171ud(this.f381934a, this.f381935b);
        }
    }

    @j.k0
    public C39171ud(@j.N InterfaceC39219wd interfaceC39219wd, @j.N InterfaceC39219wd interfaceC39219wd2) {
        this.f381932a = interfaceC39219wd;
        this.f381933b = interfaceC39219wd2;
    }

    public static a b() {
        return new a(new C39243xd(false), new Fd(null));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39219wd
    public boolean a(@j.N String str) {
        return this.f381933b.a(str) && this.f381932a.a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f381932a + ", mStartupStateStrategy=" + this.f381933b + '}';
    }

    public a a() {
        return new a(this.f381932a, this.f381933b);
    }
}
