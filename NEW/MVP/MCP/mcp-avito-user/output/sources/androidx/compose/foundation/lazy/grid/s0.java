package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridMeasuredLine.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/s0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29226a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20691p0[] f29227b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E0 f29228c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f29229d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29230e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29231f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29232g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29233h;

    public s0(int i12, @Y61.k C20691p0[] c20691p0Arr, @Y61.k E0 e02, @Y61.k List<C20664c> list, boolean z12, int i13) {
        this.f29226a = i12;
        this.f29227b = c20691p0Arr;
        this.f29228c = e02;
        this.f29229d = list;
        this.f29230e = z12;
        this.f29231f = i13;
        int iMax = 0;
        for (C20691p0 c20691p0 : c20691p0Arr) {
            iMax = Math.max(iMax, c20691p0.f29213p);
        }
        this.f29232g = iMax;
        int i14 = iMax + this.f29231f;
        this.f29233h = i14 >= 0 ? i14 : 0;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Y61.k
    public final C20691p0[] a(int i12, int i13, int i14) {
        C20691p0[] c20691p0Arr = this.f29227b;
        int length = c20691p0Arr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            C20691p0 c20691p0 = c20691p0Arr[i15];
            int i18 = i16 + 1;
            int i19 = (int) ((C20664c) this.f29229d.get(i16)).f29104a;
            int i22 = this.f29228c.f28988b[i17];
            int i23 = this.f29226a;
            boolean z12 = this.f29230e;
            c20691p0.r(i12, i22, i13, i14, z12 ? i23 : i17, z12 ? i17 : i23);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            i17 += i19;
            i15++;
            i16 = i18;
        }
        return c20691p0Arr;
    }
}
