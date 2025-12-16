package shark.internal;

import kotlin.Metadata;
import kotlin.collections.C42770s0;

/* compiled from: SortedBytesMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/H0;", "", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f438356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438358c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438360e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f438361f;

    public H0(int i12, @Y61.k byte[] bArr, boolean z12) {
        this.f438359d = z12;
        this.f438360e = i12;
        this.f438361f = bArr;
        int i13 = z12 ? 8 : 4;
        this.f438356a = i13;
        int i14 = i13 + i12;
        this.f438357b = i14;
        this.f438358c = bArr.length / i14;
    }

    public final int a(long j12) {
        int i12 = this.f438358c - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long jB2 = this.f438359d ? C48297u.b(this.f438357b * i14, this.f438361f) : C48297u.a(r3, r4);
            if (jB2 < j12) {
                i13 = i14 + 1;
            } else {
                if (jB2 <= j12) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    @Y61.k
    public final kotlin.sequences.o0 b() {
        return new kotlin.sequences.o0(new C42770s0(kotlin.ranges.s.r(0, this.f438358c)), new G0(this));
    }

    @Y61.k
    public final C48296t c(int i12) {
        return new C48296t(this.f438361f, (i12 * this.f438357b) + this.f438356a, this.f438360e, this.f438359d);
    }
}
