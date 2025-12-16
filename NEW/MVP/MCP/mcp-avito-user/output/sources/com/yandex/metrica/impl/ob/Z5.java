package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class Z5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final EnumC38796f6 f379981a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final Integer f379982b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private EnumC38796f6 f379983a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private Integer f379984b;

        private b(EnumC38796f6 enumC38796f6) {
            this.f379983a = enumC38796f6;
        }

        public b a(int i12) {
            this.f379984b = Integer.valueOf(i12);
            return this;
        }

        public Z5 a() {
            return new Z5(this);
        }
    }

    public static final b a(EnumC38796f6 enumC38796f6) {
        return new b(enumC38796f6);
    }

    @j.N
    public EnumC38796f6 b() {
        return this.f379981a;
    }

    private Z5(b bVar) {
        this.f379981a = bVar.f379983a;
        this.f379982b = bVar.f379984b;
    }

    @j.P
    public Integer a() {
        return this.f379982b;
    }
}
