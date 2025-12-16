package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
/* loaded from: classes6.dex */
public final class N<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f348095a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public V[] f348096b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f348097c;

    /* renamed from: d, reason: collision with root package name */
    public int f348098d;

    public final synchronized void a(long j12, V v12) {
        if (this.f348098d > 0) {
            if (j12 <= this.f348095a[((this.f348097c + r0) - 1) % this.f348096b.length]) {
                b();
            }
        }
        c();
        int i12 = this.f348097c;
        int i13 = this.f348098d;
        V[] vArr = this.f348096b;
        int length = (i12 + i13) % vArr.length;
        this.f348095a[length] = j12;
        vArr[length] = v12;
        this.f348098d = i13 + 1;
    }

    public final synchronized void b() {
        this.f348097c = 0;
        this.f348098d = 0;
        Arrays.fill(this.f348096b, (Object) null);
    }

    public final void c() {
        int length = this.f348096b.length;
        if (this.f348098d < length) {
            return;
        }
        int i12 = length * 2;
        long[] jArr = new long[i12];
        V[] vArr = (V[]) new Object[i12];
        int i13 = this.f348097c;
        int i14 = length - i13;
        System.arraycopy(this.f348095a, i13, jArr, 0, i14);
        System.arraycopy(this.f348096b, this.f348097c, vArr, 0, i14);
        int i15 = this.f348097c;
        if (i15 > 0) {
            System.arraycopy(this.f348095a, 0, jArr, i14, i15);
            System.arraycopy(this.f348096b, 0, vArr, i14, this.f348097c);
        }
        this.f348095a = jArr;
        this.f348096b = vArr;
        this.f348097c = 0;
    }

    @j.P
    public final V d(long j12, boolean z12) {
        V vE2 = null;
        long j13 = Long.MAX_VALUE;
        while (this.f348098d > 0) {
            long j14 = j12 - this.f348095a[this.f348097c];
            if (j14 < 0 && (z12 || (-j14) >= j13)) {
                break;
            }
            vE2 = e();
            j13 = j14;
        }
        return vE2;
    }

    @j.P
    public final V e() {
        C36585a.d(this.f348098d > 0);
        V[] vArr = this.f348096b;
        int i12 = this.f348097c;
        V v12 = vArr[i12];
        vArr[i12] = null;
        this.f348097c = (i12 + 1) % vArr.length;
        this.f348098d--;
        return v12;
    }
}
