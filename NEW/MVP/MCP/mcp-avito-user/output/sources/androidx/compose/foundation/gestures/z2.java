package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.node.InterfaceC22415i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Transformable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/z2;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/node/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class z2 extends AbstractC22425n implements androidx.compose.ui.node.P0, InterfaceC22415i {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.l<l0.g, Boolean> f28102r = new B2(this);

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C43108m f28103s = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public InterfaceC20524z1 f28104t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.pointer.b0 f28105u;

    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements PointerInputEventHandler {
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            throw null;
        }
    }

    public z2() {
        androidx.compose.ui.input.pointer.g0 g0VarB = androidx.compose.ui.input.pointer.Z.b(new A2(this));
        k2(g0VarB);
        this.f28105u = g0VarB;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        new D(ViewConfiguration.get(C22423m.a(this).getContext()));
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        this.f28105u.p1();
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        this.f28105u.r0(c22340s, pointerEventPass, j12);
    }
}
