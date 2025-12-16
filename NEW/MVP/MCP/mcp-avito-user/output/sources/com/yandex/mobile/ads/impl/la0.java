package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class la0 {

    /* renamed from: a, reason: collision with root package name */
    private int f387408a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f387409b;

    public la0() {
        this(0);
    }

    public final void a(long j12) {
        int i12 = this.f387408a;
        long[] jArr = this.f387409b;
        if (i12 == jArr.length) {
            this.f387409b = Arrays.copyOf(jArr, i12 * 2);
        }
        long[] jArr2 = this.f387409b;
        int i13 = this.f387408a;
        this.f387408a = i13 + 1;
        jArr2[i13] = j12;
    }

    public final long[] b() {
        return Arrays.copyOf(this.f387409b, this.f387408a);
    }

    public la0(int i12) {
        this.f387409b = new long[32];
    }

    public final long a(int i12) {
        if (i12 >= 0 && i12 < this.f387408a) {
            return this.f387409b[i12];
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Invalid index ", ", size is ");
        sbJ.append(this.f387408a);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public final int a() {
        return this.f387408a;
    }
}
