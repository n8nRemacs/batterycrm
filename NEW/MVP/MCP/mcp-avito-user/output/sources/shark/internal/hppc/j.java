package shark.internal.hppc;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;
import kotlin.sequences.C43018a;
import kotlin.sequences.C43033p;

/* compiled from: LongScatterSet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/hppc/j;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public long[] f438554a;

    /* renamed from: b, reason: collision with root package name */
    public int f438555b;

    /* renamed from: c, reason: collision with root package name */
    public int f438556c;

    /* renamed from: d, reason: collision with root package name */
    public int f438557d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438558e;

    /* renamed from: f, reason: collision with root package name */
    public final double f438559f;

    public j() {
        this(0, 1, null);
    }

    public final boolean a(long j12) {
        if (j12 == 0) {
            boolean z12 = !this.f438558e;
            this.f438558e = true;
            return z12;
        }
        long[] jArr = this.f438554a;
        int i12 = this.f438556c;
        a.f438525a.getClass();
        int iB2 = a.b(j12) & i12;
        long j13 = jArr[iB2];
        while (j13 != 0) {
            if (j13 == j12) {
                return false;
            }
            iB2 = (iB2 + 1) & i12;
            j13 = jArr[iB2];
        }
        int i13 = this.f438555b;
        if (i13 == this.f438557d) {
            long[] jArr2 = this.f438554a;
            a aVar = a.f438525a;
            int i14 = this.f438556c + 1;
            int i15 = i13 + (this.f438558e ? 1 : 0);
            aVar.getClass();
            b(a.c(i14, i15, this.f438559f));
            jArr2[iB2] = j12;
            e(jArr2);
        } else {
            jArr[iB2] = j12;
        }
        this.f438555b++;
        return true;
    }

    public final void b(int i12) {
        long[] jArr = this.f438554a;
        try {
            this.f438554a = new long[i12 + 1];
            a.f438525a.getClass();
            int i13 = i12 - 1;
            this.f438557d = Math.min(i13, (int) Math.ceil(i12 * this.f438559f));
            this.f438556c = i13;
        } catch (OutOfMemoryError e12) {
            this.f438554a = jArr;
            u0 u0Var = u0.f406856a;
            throw new RuntimeException(String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %d -> %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f438555b + (this.f438558e ? 1 : 0)), Integer.valueOf(i12)}, 2)), e12);
        }
    }

    public final boolean c(long j12) {
        if (j12 == 0) {
            return this.f438558e;
        }
        long[] jArr = this.f438554a;
        int i12 = this.f438556c;
        a.f438525a.getClass();
        int iB2 = a.b(j12) & i12;
        long j13 = jArr[iB2];
        while (j13 != 0) {
            if (j13 == j12) {
                return true;
            }
            iB2 = (iB2 + 1) & i12;
            j13 = jArr[iB2];
        }
        return false;
    }

    @Y61.k
    public final C43018a d() {
        int i12 = this.f438556c + 1;
        l0.f fVar = new l0.f();
        fVar.f406840b = -1;
        return C43033p.s(new i(this, fVar, i12));
    }

    public final void e(long[] jArr) {
        int i12;
        long[] jArr2 = this.f438554a;
        int i13 = this.f438556c;
        int length = jArr.length - 1;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j12 = jArr[length];
            if (j12 != 0) {
                a.f438525a.getClass();
                int iB2 = a.b(j12);
                while (true) {
                    i12 = iB2 & i13;
                    if (jArr2[i12] == 0) {
                        break;
                    } else {
                        iB2 = i12 + 1;
                    }
                }
                jArr2[i12] = j12;
            }
        }
    }

    public final void f(long j12) {
        int i12;
        long j13;
        if (j12 == 0) {
            this.f438558e = false;
            return;
        }
        long[] jArr = this.f438554a;
        int i13 = this.f438556c;
        a.f438525a.getClass();
        int iB2 = a.b(j12) & i13;
        long j14 = jArr[iB2];
        while (j14 != 0) {
            if (j14 == j12) {
                long[] jArr2 = this.f438554a;
                int i14 = this.f438556c;
                while (true) {
                    int i15 = 0;
                    do {
                        i15++;
                        i12 = (iB2 + i15) & i14;
                        j13 = jArr2[i12];
                        if (j13 == 0) {
                            jArr2[iB2] = 0;
                            this.f438555b--;
                            return;
                        }
                        a.f438525a.getClass();
                    } while (((i12 - a.b(j13)) & i14) < i15);
                    jArr2[iB2] = j13;
                    iB2 = i12;
                }
            } else {
                iB2 = (iB2 + 1) & i13;
                j14 = jArr[iB2];
            }
        }
    }

    public j(int i12) {
        long[] jArr = new long[0];
        this.f438554a = jArr;
        this.f438559f = 0.75d;
        if (i12 > this.f438557d) {
            a.f438525a.getClass();
            b(a.a(0.75d, i12));
            if (this.f438555b + (this.f438558e ? 1 : 0) != 0) {
                e(jArr);
            }
        }
    }

    public /* synthetic */ j(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 4 : i12);
    }
}
