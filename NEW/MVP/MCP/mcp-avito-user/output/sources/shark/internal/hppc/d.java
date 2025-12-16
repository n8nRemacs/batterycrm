package shark.internal.hppc;

import androidx.compose.foundation.text.selection.C21030p;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;
import kotlin.sequences.C43018a;
import kotlin.sequences.C43033p;

/* compiled from: LongLongScatterMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/hppc/d;", "", "a", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long[] f438530a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f438531b;

    /* renamed from: c, reason: collision with root package name */
    public int f438532c;

    /* renamed from: d, reason: collision with root package name */
    public int f438533d;

    /* renamed from: e, reason: collision with root package name */
    public int f438534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f438535f;

    /* renamed from: g, reason: collision with root package name */
    public final double f438536g;

    /* compiled from: LongLongScatterMap.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/hppc/d$a;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public interface a {
    }

    public d() {
        this(0, 1, null);
    }

    public final void a(int i12) {
        long[] jArr = this.f438530a;
        long[] jArr2 = this.f438531b;
        int i13 = i12 + 1;
        try {
            this.f438530a = new long[i13];
            this.f438531b = new long[i13];
            shark.internal.hppc.a aVar = shark.internal.hppc.a.f438525a;
            double d12 = this.f438536g;
            aVar.getClass();
            int i14 = i12 - 1;
            this.f438534e = Math.min(i14, (int) Math.ceil(i12 * d12));
            this.f438533d = i14;
        } catch (OutOfMemoryError e12) {
            this.f438530a = jArr;
            this.f438531b = jArr2;
            u0 u0Var = u0.f406856a;
            throw new RuntimeException(String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %d -> %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f438533d + 1), Integer.valueOf(i12)}, 2)), e12);
        }
    }

    @Y61.k
    public final C43018a b() {
        int i12 = this.f438533d + 1;
        l0.f fVar = new l0.f();
        fVar.f406840b = -1;
        return C43033p.s(new e(this, fVar, i12));
    }

    public final long c(long j12) {
        int iD2 = d(j12);
        if (iD2 != -1) {
            return this.f438531b[iD2];
        }
        throw new IllegalArgumentException(C21030p.a(j12, "Unknown key ").toString());
    }

    public final int d(long j12) {
        if (j12 == 0) {
            if (this.f438535f) {
                return this.f438533d + 1;
            }
            return -1;
        }
        long[] jArr = this.f438530a;
        int i12 = this.f438533d;
        shark.internal.hppc.a.f438525a.getClass();
        int iB2 = shark.internal.hppc.a.b(j12) & i12;
        long j13 = jArr[iB2];
        while (j13 != 0) {
            if (j13 == j12) {
                return iB2;
            }
            iB2 = (iB2 + 1) & i12;
            j13 = jArr[iB2];
        }
        return -1;
    }

    public final void e(long[] jArr, long[] jArr2) {
        int i12;
        long[] jArr3 = this.f438530a;
        long[] jArr4 = this.f438531b;
        int i13 = this.f438533d;
        int length = jArr.length - 1;
        jArr3[jArr3.length - 1] = jArr[length];
        jArr4[jArr4.length - 1] = jArr2[length];
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j12 = jArr[length];
            if (j12 != 0) {
                shark.internal.hppc.a.f438525a.getClass();
                int iB2 = shark.internal.hppc.a.b(j12);
                while (true) {
                    i12 = iB2 & i13;
                    if (jArr3[i12] == 0) {
                        break;
                    } else {
                        iB2 = i12 + 1;
                    }
                }
                jArr3[i12] = j12;
                jArr4[i12] = jArr2[length];
            }
        }
    }

    public final void f(long j12, long j13) {
        int i12 = this.f438533d;
        if (j12 == 0) {
            this.f438535f = true;
            long[] jArr = this.f438531b;
            int i13 = i12 + 1;
            long j14 = jArr[i13];
            jArr[i13] = j13;
            return;
        }
        long[] jArr2 = this.f438530a;
        shark.internal.hppc.a.f438525a.getClass();
        int iB2 = shark.internal.hppc.a.b(j12) & i12;
        long j15 = jArr2[iB2];
        while (j15 != 0) {
            if (j15 == j12) {
                long[] jArr3 = this.f438531b;
                long j16 = jArr3[iB2];
                jArr3[iB2] = j13;
                return;
            }
            iB2 = (iB2 + 1) & i12;
            j15 = jArr2[iB2];
        }
        int i14 = this.f438532c;
        if (i14 == this.f438534e) {
            long[] jArr4 = this.f438530a;
            long[] jArr5 = this.f438531b;
            shark.internal.hppc.a aVar = shark.internal.hppc.a.f438525a;
            int i15 = this.f438533d + 1;
            int i16 = i14 + (this.f438535f ? 1 : 0);
            double d12 = this.f438536g;
            aVar.getClass();
            a(shark.internal.hppc.a.c(i15, i16, d12));
            jArr4[iB2] = j12;
            jArr5[iB2] = j13;
            e(jArr4, jArr5);
        } else {
            jArr2[iB2] = j12;
            this.f438531b[iB2] = j13;
        }
        this.f438532c++;
    }

    public d(int i12) {
        long[] jArr = new long[0];
        this.f438530a = jArr;
        long[] jArr2 = new long[0];
        this.f438531b = jArr2;
        this.f438536g = 0.75d;
        if (i12 > this.f438534e) {
            shark.internal.hppc.a.f438525a.getClass();
            a(shark.internal.hppc.a.a(0.75d, i12));
            if (this.f438532c + (this.f438535f ? 1 : 0) == 0) {
                return;
            }
            e(jArr, jArr2);
        }
    }

    public /* synthetic */ d(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 4 : i12);
    }
}
