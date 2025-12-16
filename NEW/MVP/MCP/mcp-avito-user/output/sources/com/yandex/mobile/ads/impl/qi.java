package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x21;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class qi {

    /* renamed from: a, reason: collision with root package name */
    protected final x91 f389192a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389193b;

    /* renamed from: c, reason: collision with root package name */
    private final int f389194c;

    /* renamed from: d, reason: collision with root package name */
    private final long f389195d;

    /* renamed from: e, reason: collision with root package name */
    private final int f389196e;

    /* renamed from: f, reason: collision with root package name */
    private int f389197f;

    /* renamed from: g, reason: collision with root package name */
    private int f389198g;

    /* renamed from: h, reason: collision with root package name */
    private int f389199h;

    /* renamed from: i, reason: collision with root package name */
    private int f389200i;

    /* renamed from: j, reason: collision with root package name */
    private int f389201j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f389202k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f389203l;

    public qi(int i12, int i13, long j12, int i14, x91 x91Var) {
        boolean z12 = true;
        if (i13 != 1 && i13 != 2) {
            z12 = false;
        }
        db.a(z12);
        this.f389195d = j12;
        this.f389196e = i14;
        this.f389192a = x91Var;
        this.f389193b = a(i12, i13 == 2 ? 1667497984 : 1651965952);
        this.f389194c = i13 == 2 ? a(i12, 1650720768) : -1;
        this.f389202k = new long[512];
        this.f389203l = new int[512];
    }

    public final void a(long j12) {
        if (this.f389201j == this.f389203l.length) {
            long[] jArr = this.f389202k;
            this.f389202k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f389203l;
            this.f389203l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f389202k;
        int i12 = this.f389201j;
        jArr2[i12] = j12;
        this.f389203l[i12] = this.f389200i;
        this.f389201j = i12 + 1;
    }

    public final void b() {
        this.f389200i++;
    }

    public final void c(long j12) {
        if (this.f389201j == 0) {
            this.f389199h = 0;
        } else {
            this.f389199h = this.f389203l[pc1.b(this.f389202k, j12, true)];
        }
    }

    public final void b(int i12) {
        this.f389197f = i12;
        this.f389198g = i12;
    }

    public final x21.a b(long j12) {
        long j13 = 1;
        int i12 = (int) (j12 / ((this.f389195d * j13) / this.f389196e));
        int iA2 = pc1.a(this.f389203l, i12, true, true);
        int i13 = this.f389203l[iA2];
        if (i13 == i12) {
            z21 z21Var = new z21(((this.f389195d * j13) / this.f389196e) * i13, this.f389202k[iA2]);
            return new x21.a(z21Var, z21Var);
        }
        long j14 = i13;
        long j15 = (this.f389195d * j13) / this.f389196e;
        long[] jArr = this.f389202k;
        z21 z21Var2 = new z21(j14 * j15, jArr[iA2]);
        int i14 = iA2 + 1;
        if (i14 < jArr.length) {
            return new x21.a(z21Var2, new z21(j15 * r0[i14], jArr[i14]));
        }
        return new x21.a(z21Var2, z21Var2);
    }

    public final void a() {
        this.f389202k = Arrays.copyOf(this.f389202k, this.f389201j);
        this.f389203l = Arrays.copyOf(this.f389203l, this.f389201j);
    }

    public final boolean a(int i12) {
        return this.f389193b == i12 || this.f389194c == i12;
    }

    public final boolean a(to toVar) {
        int i12 = this.f389198g;
        int iB2 = i12 - this.f389192a.b(toVar, i12, false);
        this.f389198g = iB2;
        boolean z12 = iB2 == 0;
        if (z12) {
            if (this.f389197f > 0) {
                x91 x91Var = this.f389192a;
                int i13 = this.f389199h;
                x91Var.a((this.f389195d * i13) / this.f389196e, Arrays.binarySearch(this.f389203l, i13) >= 0 ? 1 : 0, this.f389197f, 0, null);
            }
            this.f389199h++;
        }
        return z12;
    }

    private static int a(int i12, int i13) {
        return (((i12 % 10) + 48) << 8) | ((i12 / 10) + 48) | i13;
    }
}
