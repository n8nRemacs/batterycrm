package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: SnapshotDoubleIndexHeap.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/q;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22172q {

    /* renamed from: a, reason: collision with root package name */
    public int f38728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public long[] f38729b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public int[] f38730c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public int[] f38731d;

    /* renamed from: e, reason: collision with root package name */
    public int f38732e;

    public C22172q() {
        int[] iArr = new int[16];
        int i12 = 0;
        while (i12 < 16) {
            int i13 = i12 + 1;
            iArr[i12] = i13;
            i12 = i13;
        }
        this.f38731d = iArr;
    }

    public final int a(long j12) {
        int i12 = this.f38728a + 1;
        long[] jArr = this.f38729b;
        int length = jArr.length;
        if (i12 > length) {
            int i13 = length * 2;
            long[] jArr2 = new long[i13];
            int[] iArr = new int[i13];
            C42756l.r(jArr, jArr2, 0);
            C42756l.p(0, 0, 14, this.f38730c, iArr);
            this.f38729b = jArr2;
            this.f38730c = iArr;
        }
        int i14 = this.f38728a;
        this.f38728a = i14 + 1;
        int length2 = this.f38731d.length;
        if (this.f38732e >= length2) {
            int i15 = length2 * 2;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                iArr2[i16] = i17;
                i16 = i17;
            }
            C42756l.p(0, 0, 14, this.f38731d, iArr2);
            this.f38731d = iArr2;
        }
        int i18 = this.f38732e;
        int[] iArr3 = this.f38731d;
        this.f38732e = iArr3[i18];
        long[] jArr3 = this.f38729b;
        jArr3[i14] = j12;
        this.f38730c[i14] = i18;
        iArr3[i18] = i14;
        while (i14 > 0) {
            int i19 = ((i14 + 1) >> 1) - 1;
            if (jArr3[i19] <= j12) {
                break;
            }
            b(i19, i14);
            i14 = i19;
        }
        return i18;
    }

    public final void b(int i12, int i13) {
        long[] jArr = this.f38729b;
        int[] iArr = this.f38730c;
        int[] iArr2 = this.f38731d;
        long j12 = jArr[i12];
        jArr[i12] = jArr[i13];
        jArr[i13] = j12;
        int i14 = iArr[i12];
        int i15 = iArr[i13];
        iArr[i12] = i15;
        iArr[i13] = i14;
        iArr2[i15] = i12;
        iArr2[i14] = i13;
    }
}
