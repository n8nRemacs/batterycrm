package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public abstract class k81 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f387071a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f387072b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private n81 f387073c;

    /* renamed from: d, reason: collision with root package name */
    private long f387074d;

    public /* synthetic */ k81(String str) {
        this(str, true);
    }

    public final boolean a() {
        return this.f387072b;
    }

    @Y61.k
    public final String b() {
        return this.f387071a;
    }

    public final long c() {
        return this.f387074d;
    }

    @Y61.l
    public final n81 d() {
        return this.f387073c;
    }

    public abstract long e();

    @Y61.k
    public final String toString() {
        return this.f387071a;
    }

    public k81(@Y61.k String str, boolean z12) {
        this.f387071a = str;
        this.f387072b = z12;
        this.f387074d = -1L;
    }

    public final void a(long j12) {
        this.f387074d = j12;
    }

    public final void a(@Y61.k n81 n81Var) {
        n81 n81Var2 = this.f387073c;
        if (n81Var2 == n81Var) {
            return;
        }
        if (n81Var2 == null) {
            this.f387073c = n81Var;
            return;
        }
        throw new IllegalStateException("task is in multiple queues");
    }
}
