package androidx.compose.ui.focus;

import androidx.compose.ui.layout.I0;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusRestorer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/e0;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/focus/N;", "Landroidx/compose/ui/focus/X;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 extends v.d implements InterfaceC22415i, N, X {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public I0.a f39173p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC22221f, G0> f39174q = new d0(this);

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC22221f, G0> f39175r = new c0(this);

    @Override // androidx.compose.ui.focus.N
    public final void E0(@Y61.k J j12) {
        j12.c(this.f39175r);
        j12.b(this.f39174q);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        I0.a aVar = this.f39173p;
        if (aVar != null) {
            aVar.release();
        }
        this.f39173p = null;
    }
}
