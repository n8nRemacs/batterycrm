package com.yandex.div.internal.widget.tabs;

import j.N;

/* compiled from: TabMeasurement.java */
/* loaded from: classes7.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f370506a;

    /* renamed from: b, reason: collision with root package name */
    public int f370507b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f370508c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f370509d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final C38111a f370510e;

    /* compiled from: TabMeasurement.java */
    public interface a {
    }

    public r(int i12, @N C38111a c38111a) {
        this.f370506a = i12;
        this.f370510e = c38111a;
        this.f370509d = new int[i12];
    }

    public final int a() {
        if (this.f370507b < 0) {
            this.f370507b = this.f370510e.a(0);
        }
        return this.f370507b;
    }

    public final int b() {
        if (this.f370508c < 0) {
            int iA2 = a();
            for (int i12 = 1; i12 < this.f370506a; i12++) {
                iA2 = Math.max(iA2, this.f370510e.a(i12));
            }
            this.f370508c = iA2;
        }
        return this.f370508c;
    }

    public final int c(int i12) {
        int i13 = this.f370506a;
        if (i13 == 0) {
            return 0;
        }
        if (i12 < 0) {
            return c(0);
        }
        if (i12 >= i13) {
            return c(i13);
        }
        int[] iArr = this.f370509d;
        if (iArr[i12] <= 0) {
            iArr[i12] = this.f370510e.a(i12);
        }
        return iArr[i12];
    }
}
