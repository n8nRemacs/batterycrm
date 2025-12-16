package FU;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.B;
import androidx.core.view.C22823h0;
import androidx.core.view.H;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: NestedScroll.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFU/a;", "Landroidx/compose/ui/input/nestedscroll/a;", "_design-modules_compose_shared_nested-scroll"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f4717b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final H f4718c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final int[] f4719d;

    public a(@k View view) {
        this.f4717b = view;
        H h12 = new H(view);
        h12.g(true);
        this.f4718c = h12;
        this.f4719d = new int[2];
        C22823h0.J(view, true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @l
    public final Object U0(long j12, long j13, @k Continuation<? super B> continuation) {
        float fC2 = B.c(j13) * (-1.0f);
        float fD2 = B.d(j13) * (-1.0f);
        H h12 = this.f4718c;
        if (!h12.a(fC2, fD2, true)) {
            B.f42836b.getClass();
            j13 = 0;
        }
        if (h12.f(0)) {
            h12.i(0);
        }
        if (h12.f(1)) {
            h12.i(1);
        }
        return B.a(j13);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        if (!this.f4718c.h(b.a(j12), b.c(i12))) {
            g.f413384b.getClass();
            return 0L;
        }
        int[] iArr = this.f4719d;
        C42756l.z(iArr, 0, 0, 6);
        this.f4718c.c(b.d(Float.intBitsToFloat((int) (j12 >> 32))), b.d(Float.intBitsToFloat((int) (4294967295L & j12))), b.c(i12), this.f4719d, null);
        return b.b(iArr, j12);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        if (!this.f4718c.h(b.a(j13), b.c(i12))) {
            g.f413384b.getClass();
            return 0L;
        }
        int[] iArr = this.f4719d;
        C42756l.z(iArr, 0, 0, 6);
        this.f4718c.d(b.d(Float.intBitsToFloat((int) (j12 >> 32))), b.d(Float.intBitsToFloat((int) (j12 & 4294967295L))), b.d(Float.intBitsToFloat((int) (j13 >> 32))), b.d(Float.intBitsToFloat((int) (4294967295L & j13))), null, b.c(i12), this.f4719d);
        return b.b(iArr, j13);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @l
    public final Object k0(long j12, @k Continuation<? super B> continuation) {
        float fC2 = B.c(j12) * (-1.0f);
        float fD2 = B.d(j12) * (-1.0f);
        H h12 = this.f4718c;
        if (!h12.b(fC2, fD2)) {
            B.f42836b.getClass();
            j12 = 0;
        }
        if (h12.f(0)) {
            h12.i(0);
        }
        if (h12.f(1)) {
            h12.i(1);
        }
        return B.a(j12);
    }
}
