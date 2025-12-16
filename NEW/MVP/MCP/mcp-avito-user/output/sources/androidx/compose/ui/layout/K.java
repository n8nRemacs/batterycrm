package androidx.compose.ui.layout;

import androidx.compose.runtime.J2;
import androidx.compose.runtime.R3;
import androidx.compose.ui.node.InterfaceC22413h;
import kotlin.Metadata;

/* compiled from: Layout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/J2;", "Landroidx/compose/ui/node/h;", "Lkotlin/G0;", "invoke-Deg8D_g", "(Landroidx/compose/runtime/A;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class K extends kotlin.jvm.internal.N implements Y41.q<J2<InterfaceC22413h>, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f40344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(androidx.compose.ui.v vVar) {
        super(3);
        this.f40344l = vVar;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(J2<InterfaceC22413h> j22, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = j22.f37995a;
        androidx.compose.runtime.A a14 = a12;
        num.intValue();
        int f37888q = a14.getF37888Q();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a14, this.f40344l);
        a13.I(509942095);
        InterfaceC22413h.f40789C1.getClass();
        R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
        Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
            androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
        }
        a13.O();
        return kotlin.G0.f406611a;
    }
}
