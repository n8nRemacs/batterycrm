package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotThreadLocal.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/Q;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f38443a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final long[] f38444b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object[] f38445c;

    public Q(int i12, @Y61.k long[] jArr, @Y61.k Object[] objArr) {
        this.f38443a = i12;
        this.f38444b = jArr;
        this.f38445c = objArr;
    }

    public final int a(long j12) {
        int i12 = this.f38443a - 1;
        if (i12 == -1) {
            return -1;
        }
        long[] jArr = this.f38444b;
        int i13 = 0;
        if (i12 == 0) {
            long j13 = jArr[0];
            if (j13 == j12) {
                return 0;
            }
            return j13 > j12 ? -2 : -1;
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j14 = jArr[i14] - j12;
            if (j14 < 0) {
                i13 = i14 + 1;
            } else {
                if (j14 <= 0) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    @Y61.k
    public final Q b(long j12, @Y61.l Object obj) {
        long[] jArr;
        int i12;
        Object[] objArr = this.f38445c;
        int i13 = 0;
        int i14 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i14++;
            }
        }
        int i15 = i14 + 1;
        long[] jArr2 = new long[i15];
        Object[] objArr2 = new Object[i15];
        if (i15 > 1) {
            int i16 = 0;
            while (true) {
                jArr = this.f38444b;
                i12 = this.f38443a;
                if (i13 >= i15 || i16 >= i12) {
                    break;
                }
                long j13 = jArr[i16];
                Object obj3 = objArr[i16];
                if (j13 > j12) {
                    jArr2[i13] = j12;
                    objArr2[i13] = obj;
                    i13++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i13] = j13;
                    objArr2[i13] = obj3;
                    i13++;
                }
                i16++;
            }
            if (i16 == i12) {
                jArr2[i14] = j12;
                objArr2[i14] = obj;
            } else {
                while (i13 < i15) {
                    long j14 = jArr[i16];
                    Object obj4 = objArr[i16];
                    if (obj4 != null) {
                        jArr2[i13] = j14;
                        objArr2[i13] = obj4;
                        i13++;
                    }
                    i16++;
                }
            }
        } else {
            jArr2[0] = j12;
            objArr2[0] = obj;
        }
        return new Q(i15, jArr2, objArr2);
    }
}
