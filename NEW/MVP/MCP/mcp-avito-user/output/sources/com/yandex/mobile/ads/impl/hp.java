package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class hp {

    /* renamed from: a, reason: collision with root package name */
    private int f386197a;

    /* renamed from: b, reason: collision with root package name */
    private int f386198b;

    /* renamed from: c, reason: collision with root package name */
    private final int f386199c;

    /* renamed from: d, reason: collision with root package name */
    private final float f386200d;

    public hp() {
        this(1.0f, 2500, 1);
    }

    public final int a() {
        return this.f386197a;
    }

    public hp(float f12, int i12, int i13) {
        this.f386197a = i12;
        this.f386199c = i13;
        this.f386200d = f12;
    }

    public final void a(ok1 ok1Var) throws ok1 {
        int i12 = this.f386198b + 1;
        this.f386198b = i12;
        int i13 = this.f386197a;
        this.f386197a = i13 + ((int) (i13 * this.f386200d));
        if (i12 > this.f386199c) {
            throw ok1Var;
        }
    }
}
