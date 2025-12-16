package androidx.compose.ui.platform;

import android.view.View;
import androidx.core.view.C22823h0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;

/* compiled from: NestedScrollInteropConnection.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/I1;", "Landroidx/compose/ui/input/nestedscroll/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I1 implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f41146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.core.view.H f41147c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final int[] f41148d;

    public I1(@Y61.k View view) {
        this.f41146b = view;
        androidx.core.view.H h12 = new androidx.core.view.H(view);
        h12.g(true);
        this.f41147c = h12;
        this.f41148d = new int[2];
        C22823h0.J(view, true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object U0(long j12, long j13, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        float fC2 = androidx.compose.ui.unit.B.c(j13) * (-1.0f);
        float fD2 = androidx.compose.ui.unit.B.d(j13) * (-1.0f);
        androidx.core.view.H h12 = this.f41147c;
        if (!h12.a(fC2, fD2, true)) {
            androidx.compose.ui.unit.B.f42836b.getClass();
            j13 = 0;
        }
        if (h12.f(0)) {
            h12.i(0);
        }
        if (h12.f(1)) {
            h12.i(1);
        }
        return androidx.compose.ui.unit.B.a(j13);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        if (!this.f41147c.h(J1.a(j12), J1.c(i12))) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        int[] iArr = this.f41148d;
        C42756l.z(iArr, 0, 0, 6);
        this.f41147c.c(J1.d(Float.intBitsToFloat((int) (j12 >> 32))), J1.d(Float.intBitsToFloat((int) (4294967295L & j12))), J1.c(i12), this.f41148d, null);
        return J1.b(iArr, j12);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        if (!this.f41147c.h(J1.a(j13), J1.c(i12))) {
            l0.g.f413384b.getClass();
            return 0L;
        }
        int[] iArr = this.f41148d;
        C42756l.z(iArr, 0, 0, 6);
        this.f41147c.d(J1.d(Float.intBitsToFloat((int) (j12 >> 32))), J1.d(Float.intBitsToFloat((int) (j12 & 4294967295L))), J1.d(Float.intBitsToFloat((int) (j13 >> 32))), J1.d(Float.intBitsToFloat((int) (4294967295L & j13))), null, J1.c(i12), this.f41148d);
        return J1.b(iArr, j13);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object k0(long j12, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        float fC2 = androidx.compose.ui.unit.B.c(j12) * (-1.0f);
        float fD2 = androidx.compose.ui.unit.B.d(j12) * (-1.0f);
        androidx.core.view.H h12 = this.f41147c;
        if (!h12.b(fC2, fD2)) {
            androidx.compose.ui.unit.B.f42836b.getClass();
            j12 = 0;
        }
        if (h12.f(0)) {
            h12.i(0);
        }
        if (h12.f(1)) {
            h12.i(1);
        }
        return androidx.compose.ui.unit.B.a(j12);
    }
}
