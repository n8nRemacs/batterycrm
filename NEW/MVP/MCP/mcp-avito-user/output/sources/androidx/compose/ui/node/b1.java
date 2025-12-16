package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractC22031b;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: UiApplier.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/b1;", "Landroidx/compose/runtime/b;", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b1 extends AbstractC22031b<LayoutNode> {
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void b() {
        AndroidComposeView androidComposeView = this.f38174a.f40641q;
        if (androidComposeView != null) {
            androidComposeView.z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void c() {
        ((LayoutNode) this.f38176c).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void d(int i12, Object obj) {
        ((LayoutNode) this.f38176c).V(i12, (LayoutNode) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void f(int i12, int i13) {
        ((LayoutNode) this.f38176c).j0(i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void g(int i12, int i13, int i14) {
        ((LayoutNode) this.f38176c).d0(i12, i13, i14);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final /* bridge */ /* synthetic */ void h(int i12, Object obj) {
    }

    @Override // androidx.compose.runtime.AbstractC22031b
    public final void k() {
        this.f38174a.i0();
    }
}
