package androidx.compose.ui.focus;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.T0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusTargetModifierNode.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class h0 extends kotlin.jvm.internal.H implements Y41.l<FocusTargetNode, G0> {
    public final void f(FocusTargetNode focusTargetNode) {
        ((q0) this.receiver).getClass();
        InterfaceC22419k interfaceC22419k = focusTargetNode.f42880b;
        T0 t02 = interfaceC22419k instanceof T0 ? (T0) interfaceC22419k : null;
        if (t02 != null) {
            C22421l.g(t02).Z();
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(FocusTargetNode focusTargetNode) {
        f(focusTargetNode);
        return G0.f406611a;
    }
}
