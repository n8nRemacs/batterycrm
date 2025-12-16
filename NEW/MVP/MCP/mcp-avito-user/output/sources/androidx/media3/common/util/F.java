package androidx.media3.common.util;

import j.P;
import java.util.Arrays;

/* compiled from: TimedValueQueue.java */
@J
/* loaded from: classes.dex */
public final class F<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f47878a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    public V[] f47879b = (V[]) new Object[10];

    /* renamed from: c, reason: collision with root package name */
    public int f47880c;

    /* renamed from: d, reason: collision with root package name */
    public int f47881d;

    public final synchronized void a(long j12, V v12) {
        if (this.f47881d > 0) {
            if (j12 <= this.f47878a[((this.f47880c + r0) - 1) % this.f47879b.length]) {
                b();
            }
        }
        c();
        int i12 = this.f47880c;
        int i13 = this.f47881d;
        V[] vArr = this.f47879b;
        int length = (i12 + i13) % vArr.length;
        this.f47878a[length] = j12;
        vArr[length] = v12;
        this.f47881d = i13 + 1;
    }

    public final synchronized void b() {
        this.f47880c = 0;
        this.f47881d = 0;
        Arrays.fill(this.f47879b, (Object) null);
    }

    public final void c() {
        int length = this.f47879b.length;
        if (this.f47881d < length) {
            return;
        }
        int i12 = length * 2;
        long[] jArr = new long[i12];
        V[] vArr = (V[]) new Object[i12];
        int i13 = this.f47880c;
        int i14 = length - i13;
        System.arraycopy(this.f47878a, i13, jArr, 0, i14);
        System.arraycopy(this.f47879b, this.f47880c, vArr, 0, i14);
        int i15 = this.f47880c;
        if (i15 > 0) {
            System.arraycopy(this.f47878a, 0, jArr, i14, i15);
            System.arraycopy(this.f47879b, 0, vArr, i14, this.f47880c);
        }
        this.f47878a = jArr;
        this.f47879b = vArr;
        this.f47880c = 0;
    }

    @P
    public final V d() {
        C23110a.g(this.f47881d > 0);
        V[] vArr = this.f47879b;
        int i12 = this.f47880c;
        V v12 = vArr[i12];
        vArr[i12] = null;
        this.f47880c = (i12 + 1) % vArr.length;
        this.f47881d--;
        return v12;
    }
}
