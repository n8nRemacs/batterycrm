package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.input.pointer.g0;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.F;
import androidx.compose.ui.node.P0;
import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: DragAndDropSource.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/i;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/F;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends AbstractC22425n implements F {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> f27101r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.draganddrop.m f27102s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public P0 f27103t;

    /* compiled from: DragAndDropSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements PointerInputEventHandler {

        /* compiled from: DragAndDropSource.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/draganddrop/i$a$a", "Landroidx/compose/foundation/draganddrop/k;", "Landroidx/compose/ui/input/pointer/K;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.draganddrop.i$a$a, reason: collision with other inner class name */
        public static final class C1565a implements k, K {
            @Override // androidx.compose.ui.unit.d
            @F3
            public final float A0(long j12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.n
            @F3
            public final float E(long j12) {
                throw null;
            }

            @Override // androidx.compose.foundation.draganddrop.k
            public final void F(long j12) {
                throw null;
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final void F1() {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float J(int i12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float K(float f12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.n
            /* renamed from: K0 */
            public final float getF42847c() {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long L(long j12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float M0(float f12) {
                throw null;
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final <R> Object N0(Y41.p<? super InterfaceC22325c, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final int O0(long j12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            /* renamed from: getDensity */
            public final float getF42846b() {
                throw null;
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final InterfaceC22544x2 getViewConfiguration() {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long n(long j12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long o(float f12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.n
            @F3
            public final long s(float f12) {
                throw null;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final int y0(float f12) {
                throw null;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(K k12, Continuation<? super G0> continuation) {
            i.this.getClass();
            throw null;
        }
    }

    public i(@Y61.k Y41.l lVar) {
        this.f27101r = lVar;
        androidx.compose.ui.unit.u.f42871b.getClass();
        androidx.compose.ui.draganddrop.e eVar = new androidx.compose.ui.draganddrop.e(new h(this), null, 2, null);
        k2(eVar);
        this.f27102s = eVar;
    }

    @Override // androidx.compose.ui.node.F
    public final void D(@Y61.k A a12) {
        this.f27102s.D(a12);
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        this.f27102s.M(j12);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        if (this.f27102s.v0()) {
            g0 g0VarB = Z.b(new a());
            k2(g0VarB);
            this.f27103t = g0VarB;
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        P0 p02 = this.f27103t;
        if (p02 != null) {
            l2(p02);
        }
    }
}
