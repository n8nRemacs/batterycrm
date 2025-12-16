package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class X5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final EnumC38796f6 f379852a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final Long f379853b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Long f379854c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final Integer f379855d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final Long f379856e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final Boolean f379857f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final Long f379858g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private final Long f379859h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public Long f379860a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private EnumC38796f6 f379861b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private Long f379862c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private Long f379863d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private Integer f379864e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private Long f379865f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private Boolean f379866g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private Long f379867h;

        private b(Z5 z52) {
            this.f379861b = z52.b();
            this.f379864e = z52.a();
        }

        public b a(Long l12) {
            this.f379863d = l12;
            return this;
        }

        public b b(Long l12) {
            this.f379865f = l12;
            return this;
        }

        public b c(Long l12) {
            this.f379862c = l12;
            return this;
        }

        public b d(Long l12) {
            this.f379867h = l12;
            return this;
        }

        public b a(Boolean bool) {
            this.f379866g = bool;
            return this;
        }
    }

    public EnumC38796f6 a() {
        return this.f379852a;
    }

    public long b(long j12) {
        Long l12 = this.f379856e;
        return l12 == null ? j12 : l12.longValue();
    }

    public long c(long j12) {
        Long l12 = this.f379853b;
        return l12 == null ? j12 : l12.longValue();
    }

    public long d(long j12) {
        Long l12 = this.f379859h;
        return l12 == null ? j12 : l12.longValue();
    }

    public long e(long j12) {
        Long l12 = this.f379858g;
        return l12 == null ? j12 : l12.longValue();
    }

    private X5(b bVar) {
        this.f379852a = bVar.f379861b;
        this.f379855d = bVar.f379864e;
        this.f379853b = bVar.f379862c;
        this.f379854c = bVar.f379863d;
        this.f379856e = bVar.f379865f;
        this.f379857f = bVar.f379866g;
        this.f379858g = bVar.f379867h;
        this.f379859h = bVar.f379860a;
    }

    public long a(long j12) {
        Long l12 = this.f379854c;
        return l12 == null ? j12 : l12.longValue();
    }

    public int a(int i12) {
        Integer num = this.f379855d;
        return num == null ? i12 : num.intValue();
    }

    public boolean a(boolean z12) {
        Boolean bool = this.f379857f;
        return bool == null ? z12 : bool.booleanValue();
    }
}
