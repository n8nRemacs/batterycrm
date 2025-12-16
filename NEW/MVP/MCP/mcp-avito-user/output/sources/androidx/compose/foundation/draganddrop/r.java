package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.W0;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.F;
import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LegacyDragAndDropSource.android.kt */
@W0
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/r;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/F;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends AbstractC22425n implements F {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> f27110r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Y41.p<? super j, ? super Continuation<? super G0>, ? extends Object> f27111s;

    /* compiled from: LegacyDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements PointerInputEventHandler {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.draganddrop.d f27113c;

        /* compiled from: LegacyDragAndDropSource.android.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/draganddrop/r$a$a", "Landroidx/compose/foundation/draganddrop/j;", "Landroidx/compose/ui/input/pointer/K;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.draganddrop.r$a$a, reason: collision with other inner class name */
        public static final class C1566a implements j, K {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f27114b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.draganddrop.d f27115c;

            public C1566a(K k12, androidx.compose.ui.draganddrop.d dVar) {
                this.f27115c = dVar;
                this.f27114b = k12;
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float A0(long j12) {
                return this.f27114b.A0(j12);
            }

            @Override // androidx.compose.ui.unit.n
            @F3
            public final float E(long j12) {
                return this.f27114b.E(j12);
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final void F1() {
                this.f27114b.F1();
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float J(int i12) {
                return this.f27114b.J(i12);
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float K(float f12) {
                return this.f27114b.K(f12);
            }

            @Override // androidx.compose.ui.unit.n
            /* renamed from: K0 */
            public final float getF40390d() {
                return this.f27114b.getF40390d();
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long L(long j12) {
                return this.f27114b.L(j12);
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final float M0(float f12) {
                return this.f27114b.M0(f12);
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final <R> Object N0(Y41.p<? super InterfaceC22325c, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
                return this.f27114b.N0(pVar, continuation);
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final int O0(long j12) {
                return this.f27114b.O0(j12);
            }

            @Override // androidx.compose.ui.unit.d
            /* renamed from: getDensity */
            public final float getF40389c() {
                return this.f27114b.getF40389c();
            }

            @Override // androidx.compose.ui.input.pointer.K
            public final InterfaceC22544x2 getViewConfiguration() {
                return this.f27114b.getViewConfiguration();
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long n(long j12) {
                return this.f27114b.n(j12);
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final long o(float f12) {
                return this.f27114b.o(f12);
            }

            @Override // androidx.compose.ui.unit.n
            @F3
            public final long s(float f12) {
                return this.f27114b.s(f12);
            }

            @Override // androidx.compose.ui.unit.d
            @F3
            public final int y0(float f12) {
                return this.f27114b.y0(f12);
            }
        }

        public a(androidx.compose.ui.draganddrop.d dVar) {
            this.f27113c = dVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(K k12, Continuation<? super G0> continuation) {
            Object objInvoke = ((t) r.this.f27111s).invoke(new C1566a(k12, this.f27113c), continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }
    }

    public r(@Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar, @Y61.k Y41.p<? super j, ? super Continuation<? super G0>, ? extends Object> pVar) {
        this.f27110r = lVar;
        this.f27111s = pVar;
        androidx.compose.ui.unit.u.f42871b.getClass();
        androidx.compose.ui.draganddrop.e eVar = new androidx.compose.ui.draganddrop.e(null, null, 2, null);
        k2(eVar);
        k2(Z.b(new a(eVar)));
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
    }
}
