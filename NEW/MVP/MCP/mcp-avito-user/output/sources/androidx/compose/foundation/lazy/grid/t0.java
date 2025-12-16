package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.H0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridMeasuredLineProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/t0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29234a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E0 f29235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29236c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29237d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C20665c0 f29238e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final H0 f29239f;

    public t0(boolean z12, @Y61.k E0 e02, int i12, int i13, @Y61.k C20665c0 c20665c0, @Y61.k H0 h02) {
        this.f29234a = z12;
        this.f29235b = e02;
        this.f29236c = i12;
        this.f29237d = i13;
        this.f29238e = c20665c0;
        this.f29239f = h02;
    }

    public final long a(int i12, int i13) {
        int i14;
        E0 e02 = this.f29235b;
        int[] iArr = e02.f28987a;
        if (i13 == 1) {
            i14 = iArr[i12];
        } else {
            int i15 = (i13 + i12) - 1;
            int[] iArr2 = e02.f28988b;
            i14 = (iArr2[i15] + iArr[i15]) - iArr2[i12];
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (this.f29234a) {
            C22712b.f42842b.getClass();
            return C22712b.a.e(i14);
        }
        C22712b.f42842b.getClass();
        return C22712b.a.d(i14);
    }

    @Y61.k
    public abstract s0 b(int i12, @Y61.k C20691p0[] c20691p0Arr, @Y61.k List<C20664c> list, int i13);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Y61.k
    public final s0 c(int i12) {
        H0.c cVarB = this.f29239f.b(i12);
        ?? r32 = cVarB.f29015b;
        int size = r32.size();
        int i13 = cVarB.f29014a;
        int i14 = (size == 0 || i13 + size == this.f29236c) ? 0 : this.f29237d;
        C20691p0[] c20691p0Arr = new C20691p0[size];
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            int i17 = (int) ((C20664c) r32.get(i16)).f29104a;
            C20691p0 c20691p0C = this.f29238e.c(i13 + i16, i15, i17, i14, a(i15, i17));
            i15 += i17;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            c20691p0Arr[i16] = c20691p0C;
        }
        return b(i12, c20691p0Arr, r32, i14);
    }
}
