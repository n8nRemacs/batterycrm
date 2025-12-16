package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l0.g;

/* compiled from: Pager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/a;", "Landroidx/compose/ui/input/nestedscroll/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20807a implements androidx.compose.ui.input.nestedscroll.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m0 f29886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Orientation f29887c;

    public C20807a(@Y61.k m0 m0Var, @Y61.k Orientation orientation) {
        this.f29886b = m0Var;
        this.f29887c = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object U0(long j12, long j13, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        return androidx.compose.ui.unit.B.a(this.f29887c == Orientation.f27425b ? androidx.compose.ui.unit.B.b(0.0f, 0.0f, 2, j13) : androidx.compose.ui.unit.B.b(0.0f, 0.0f, 1, j13));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40106c)) {
            m0 m0Var = this.f29886b;
            if (Math.abs(m0Var.k()) > 1.0E-6d) {
                float fK2 = m0Var.k() * m0Var.n();
                float f29868c = ((m0Var.l().getF29868c() + m0Var.l().getF29867b()) * (-Math.signum(m0Var.k()))) + fK2;
                if (m0Var.k() > 0.0f) {
                    f29868c = fK2;
                    fK2 = f29868c;
                }
                Orientation orientation = Orientation.f27426c;
                Orientation orientation2 = this.f29887c;
                float fIntBitsToFloat = -m0Var.f29974k.c(-kotlin.ranges.s.f(Float.intBitsToFloat((int) (orientation2 == orientation ? j12 >> 32 : j12 & 4294967295L)), fK2, f29868c));
                float fIntBitsToFloat2 = orientation2 == orientation ? fIntBitsToFloat : Float.intBitsToFloat((int) (j12 >> 32));
                if (orientation2 != Orientation.f27425b) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L));
                }
                g.a aVar = l0.g.f413384b;
                return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
        if (androidx.compose.ui.input.nestedscroll.i.a(i12, androidx.compose.ui.input.nestedscroll.i.f40107d)) {
            if (Float.intBitsToFloat((int) (this.f29887c == Orientation.f27426c ? j13 >> 32 : 4294967295L & j13)) != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }
}
