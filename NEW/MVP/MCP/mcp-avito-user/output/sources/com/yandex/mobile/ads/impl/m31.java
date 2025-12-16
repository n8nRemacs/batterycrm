package com.yandex.mobile.ads.impl;

import okhttp3.internal.http2.Settings;

/* loaded from: classes8.dex */
public final class m31 {

    /* renamed from: a, reason: collision with root package name */
    private int f387839a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final int[] f387840b = new int[10];

    public final int a() {
        if ((this.f387839a & 2) != 0) {
            return this.f387840b[1];
        }
        return -1;
    }

    public final int b() {
        return (this.f387839a & 128) != 0 ? this.f387840b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final boolean c(int i12) {
        return ((1 << i12) & this.f387839a) != 0;
    }

    public final int d() {
        return Integer.bitCount(this.f387839a);
    }

    @Y61.k
    public final void a(int i12, int i13) {
        if (i12 >= 0) {
            int[] iArr = this.f387840b;
            if (i12 >= iArr.length) {
                return;
            }
            this.f387839a = (1 << i12) | this.f387839a;
            iArr[i12] = i13;
        }
    }

    public final int b(int i12) {
        return (this.f387839a & 32) != 0 ? this.f387840b[5] : i12;
    }

    public final int c() {
        if ((this.f387839a & 16) != 0) {
            return this.f387840b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int a(int i12) {
        return this.f387840b[i12];
    }

    public final void a(@Y61.k m31 m31Var) {
        for (int i12 = 0; i12 < 10; i12++) {
            if (m31Var.c(i12)) {
                a(i12, m31Var.f387840b[i12]);
            }
        }
    }
}
