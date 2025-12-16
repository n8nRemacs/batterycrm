package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class E4 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private Long f378002a;

    /* renamed from: b, reason: collision with root package name */
    private int f378003b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private com.yandex.metrica.coreutils.services.f f378004c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f378005a;

        /* renamed from: b, reason: collision with root package name */
        public final long f378006b;

        /* renamed from: c, reason: collision with root package name */
        public final int f378007c;

        public a(long j12, long j13, int i12) {
            this.f378005a = j12;
            this.f378007c = i12;
            this.f378006b = j13;
        }
    }

    public E4() {
        this(new com.yandex.metrica.coreutils.services.e());
    }

    public a a() {
        if (this.f378002a == null) {
            this.f378002a = Long.valueOf(this.f378004c.c());
        }
        long jLongValue = this.f378002a.longValue();
        long jLongValue2 = this.f378002a.longValue();
        int i12 = this.f378003b;
        a aVar = new a(jLongValue, jLongValue2, i12);
        this.f378003b = i12 + 1;
        return aVar;
    }

    public E4(@j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f378004c = fVar;
    }
}
