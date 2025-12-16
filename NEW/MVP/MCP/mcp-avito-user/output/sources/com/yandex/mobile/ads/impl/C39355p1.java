package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39355p1 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final Object f388688c = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w90 f388689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private volatile C39346m1 f388690b;

    public C39355p1(@Y61.k w90 w90Var) {
        this.f388689a = w90Var;
    }

    @Y61.k
    public final C39346m1 a() {
        synchronized (f388688c) {
            try {
                if (this.f388690b == null) {
                    this.f388690b = new C39346m1(this.f388689a.a("AdBlockerLastUpdate"), this.f388689a.getBoolean("AdBlockerDetected", false));
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C39346m1 c39346m1 = this.f388690b;
        if (c39346m1 != null) {
            return c39346m1;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void a(@Y61.k C39346m1 c39346m1) {
        synchronized (f388688c) {
            this.f388690b = c39346m1;
            this.f388689a.putLong("AdBlockerLastUpdate", c39346m1.a());
            this.f388689a.putBoolean("AdBlockerDetected", c39346m1.b());
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
