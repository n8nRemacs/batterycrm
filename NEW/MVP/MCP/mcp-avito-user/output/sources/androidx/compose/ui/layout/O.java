package androidx.compose.ui.layout;

import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/O;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.q<? super InterfaceC22369k0, ? super InterfaceC22363h0, ? super C22712b, ? extends InterfaceC22367j0> f40357p;

    public O() {
        throw null;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        return this.f40357p.invoke(interfaceC22369k0, interfaceC22363h0, C22712b.a(j12));
    }

    @Y61.k
    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f40357p + ')';
    }
}
