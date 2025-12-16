package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class h91<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f385937a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f385938b;

    /* renamed from: c, reason: collision with root package name */
    private int f385939c;

    /* renamed from: d, reason: collision with root package name */
    private int f385940d;

    public h91() {
        this(0);
    }

    public final synchronized void a() {
        this.f385939c = 0;
        this.f385940d = 0;
        Arrays.fill(this.f385938b, (Object) null);
    }

    @j.P
    public final synchronized V b(long j12) {
        V v12;
        v12 = null;
        while (true) {
            int i12 = this.f385940d;
            if (i12 <= 0 || j12 - this.f385937a[this.f385939c] < 0) {
                break;
            }
            db.b(i12 > 0);
            V[] vArr = this.f385938b;
            int i13 = this.f385939c;
            V v13 = vArr[i13];
            vArr[i13] = null;
            this.f385939c = (i13 + 1) % vArr.length;
            this.f385940d--;
            v12 = v13;
        }
        return v12;
    }

    @j.P
    public final synchronized V c() {
        V v12;
        int i12 = this.f385940d;
        v12 = null;
        if (i12 != 0) {
            db.b(i12 > 0);
            V[] vArr = this.f385938b;
            int i13 = this.f385939c;
            V v13 = vArr[i13];
            vArr[i13] = null;
            this.f385939c = (i13 + 1) % vArr.length;
            this.f385940d--;
            v12 = v13;
        }
        return v12;
    }

    public final synchronized int d() {
        return this.f385940d;
    }

    public h91(int i12) {
        this.f385937a = new long[10];
        this.f385938b = (V[]) b();
    }

    @j.P
    public final synchronized V a(long j12) {
        V v12;
        long j13 = Long.MAX_VALUE;
        v12 = null;
        while (true) {
            int i12 = this.f385940d;
            if (i12 <= 0) {
                break;
            }
            long j14 = j12 - this.f385937a[this.f385939c];
            if (j14 < 0 && (-j14) >= j13) {
                break;
            }
            db.b(i12 > 0);
            V[] vArr = this.f385938b;
            int i13 = this.f385939c;
            V v13 = vArr[i13];
            vArr[i13] = null;
            this.f385939c = (i13 + 1) % vArr.length;
            this.f385940d--;
            v12 = v13;
            j13 = j14;
        }
        return v12;
    }

    private static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j12) {
        try {
            if (this.f385940d > 0) {
                if (j12 <= this.f385937a[((this.f385939c + r0) - 1) % this.f385938b.length]) {
                    a();
                }
            }
            int length = this.f385938b.length;
            if (this.f385940d >= length) {
                int i12 = length * 2;
                long[] jArr = new long[i12];
                V[] vArr = (V[]) new Object[i12];
                int i13 = this.f385939c;
                int i14 = length - i13;
                System.arraycopy(this.f385937a, i13, jArr, 0, i14);
                System.arraycopy(this.f385938b, this.f385939c, vArr, 0, i14);
                int i15 = this.f385939c;
                if (i15 > 0) {
                    System.arraycopy(this.f385937a, 0, jArr, i14, i15);
                    System.arraycopy(this.f385938b, 0, vArr, i14, this.f385939c);
                }
                this.f385937a = jArr;
                this.f385938b = vArr;
                this.f385939c = 0;
            }
            int i16 = this.f385939c;
            int i17 = this.f385940d;
            Object[] objArr = (V[]) this.f385938b;
            int length2 = (i16 + i17) % objArr.length;
            this.f385937a[length2] = j12;
            objArr[length2] = obj;
            this.f385940d = i17 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
