package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.U;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22436t;
import androidx.compose.ui.platform.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/Y;", "Landroidx/compose/ui/input/pointer/h;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y extends AbstractC22330h {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final String f40197t;

    public /* synthetic */ Y(InterfaceC22345x interfaceC22345x, boolean z12, C22436t c22436t, int i12, C42822w c42822w) {
        this(interfaceC22345x, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : c22436t);
    }

    @Override // androidx.compose.ui.input.pointer.AbstractC22330h
    public final void l2(@Y61.l InterfaceC22345x interfaceC22345x) {
        InterfaceC22347z interfaceC22347z = (InterfaceC22347z) C22417j.a(this, Q0.f41212u);
        if (interfaceC22347z != null) {
            interfaceC22347z.a(interfaceC22345x);
        }
    }

    @Override // androidx.compose.ui.input.pointer.AbstractC22330h
    public final boolean n2(int i12) {
        U.a aVar = U.f40189b;
        aVar.getClass();
        if (!U.a(i12, U.f40192e)) {
            aVar.getClass();
            if (!U.a(i12, U.f40193f)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: o0 */
    public final Object getF39003r() {
        return this.f40197t;
    }

    public Y(@Y61.k InterfaceC22345x interfaceC22345x, boolean z12, @Y61.l C22436t c22436t) {
        super(interfaceC22345x, z12, c22436t);
        this.f40197t = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
