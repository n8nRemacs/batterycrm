package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ie1 implements Comparable<ie1> {

    /* renamed from: a, reason: collision with root package name */
    private final int f386482a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386483b;

    /* renamed from: c, reason: collision with root package name */
    private final int f386484c;

    public ie1(int i12, int i13, int i14) {
        this.f386482a = i12;
        this.f386483b = i13;
        this.f386484c = i14;
    }

    public final int a() {
        return this.f386482a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@Y61.k ie1 ie1Var) {
        int i12 = this.f386482a;
        int i13 = ie1Var.f386482a;
        if (i12 != i13) {
            return kotlin.jvm.internal.L.g(i12, i13);
        }
        int i14 = this.f386483b;
        int i15 = ie1Var.f386483b;
        return i14 != i15 ? kotlin.jvm.internal.L.g(i14, i15) : kotlin.jvm.internal.L.g(this.f386484c, ie1Var.f386484c);
    }
}
