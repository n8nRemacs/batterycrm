package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Overscroll.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/P1;", "Landroidx/compose/ui/node/n;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class P1 extends AbstractC22425n {

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public InterfaceC22419k f26816r;

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        InterfaceC22419k interfaceC22419k;
        v.d f42880b;
        InterfaceC22419k interfaceC22419k2 = this.f26816r;
        if (interfaceC22419k2 == null || (f42880b = interfaceC22419k2.getF42880b()) == null || f42880b.f42893o) {
            interfaceC22419k = null;
        } else {
            interfaceC22419k = this.f26816r;
            k2(interfaceC22419k);
        }
        this.f26816r = interfaceC22419k;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        InterfaceC22419k interfaceC22419k = this.f26816r;
        if (interfaceC22419k != null) {
            l2(interfaceC22419k);
        }
    }
}
