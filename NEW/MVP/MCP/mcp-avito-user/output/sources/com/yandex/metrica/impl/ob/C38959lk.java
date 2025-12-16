package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.lk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38959lk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38699b9 f380987a;

    /* renamed from: b, reason: collision with root package name */
    private long f380988b;

    public C38959lk(@j.N C38699b9 c38699b9) {
        this.f380987a = c38699b9;
        this.f380988b = c38699b9.c(-1L);
    }

    public long a() {
        C38699b9 c38699b9 = this.f380987a;
        long j12 = this.f380988b + 1;
        this.f380988b = j12;
        c38699b9.f(j12);
        return this.f380988b;
    }
}
