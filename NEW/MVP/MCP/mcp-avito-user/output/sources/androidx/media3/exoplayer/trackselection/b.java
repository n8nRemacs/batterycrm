package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C23108t;
import androidx.media3.common.Q;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import j.P;
import java.util.Arrays;

/* compiled from: BaseTrackSelection.java */
@J
/* loaded from: classes.dex */
public abstract class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Q f49893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49894b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f49895c;

    /* renamed from: d, reason: collision with root package name */
    public final C23108t[] f49896d;

    /* renamed from: e, reason: collision with root package name */
    public int f49897e;

    public b(Q q12, int[] iArr) {
        C23108t[] c23108tArr;
        C23110a.g(iArr.length > 0);
        q12.getClass();
        this.f49893a = q12;
        int length = iArr.length;
        this.f49894b = length;
        this.f49896d = new C23108t[length];
        int i12 = 0;
        while (true) {
            int length2 = iArr.length;
            c23108tArr = q12.f47442e;
            if (i12 >= length2) {
                break;
            }
            this.f49896d[i12] = c23108tArr[iArr[i12]];
            i12++;
        }
        Arrays.sort(this.f49896d, new d(5));
        this.f49895c = new int[this.f49894b];
        int i13 = 0;
        while (true) {
            int i14 = this.f49894b;
            if (i13 >= i14) {
                long[] jArr = new long[i14];
                return;
            }
            int[] iArr2 = this.f49895c;
            C23108t c23108t = this.f49896d[i13];
            int i15 = 0;
            while (true) {
                if (i15 >= c23108tArr.length) {
                    i15 = -1;
                    break;
                } else if (c23108t == c23108tArr[i15]) {
                    break;
                } else {
                    i15++;
                }
            }
            iArr2[i13] = i15;
            i13++;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.o
    public final int b(int i12) {
        return this.f49895c[i12];
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public final C23108t c() {
        return this.f49896d[a()];
    }

    @Override // androidx.media3.exoplayer.trackselection.o
    public final C23108t d(int i12) {
        return this.f49896d[i12];
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f49893a == bVar.f49893a && Arrays.equals(this.f49895c, bVar.f49895c);
    }

    @Override // androidx.media3.exoplayer.trackselection.o
    public final int h(int i12) {
        for (int i13 = 0; i13 < this.f49894b; i13++) {
            if (this.f49895c[i13] == i12) {
                return i13;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f49897e == 0) {
            this.f49897e = Arrays.hashCode(this.f49895c) + (System.identityHashCode(this.f49893a) * 31);
        }
        return this.f49897e;
    }

    @Override // androidx.media3.exoplayer.trackselection.o
    public final Q i() {
        return this.f49893a;
    }

    @Override // androidx.media3.exoplayer.trackselection.o
    public final int length() {
        return this.f49895c.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public void N() {
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public void j() {
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public void e(float f12) {
    }
}
