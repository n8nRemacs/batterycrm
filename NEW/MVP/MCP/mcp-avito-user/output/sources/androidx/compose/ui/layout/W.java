package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/W;", "Landroidx/compose/ui/layout/K0$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class W extends K0.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.node.X f40421b;

    public W(@Y61.k androidx.compose.ui.node.X x12) {
        this.f40421b = x12;
    }

    @Override // androidx.compose.ui.layout.K0.a
    @Y61.l
    public final A b() {
        androidx.compose.ui.node.X x12 = this.f40421b;
        A aV02 = x12.f40705i ? null : x12.v0();
        if (aV02 == null) {
            x12.getF40909n().f40616J.b();
        }
        return aV02;
    }

    @Override // androidx.compose.ui.layout.K0.a
    @Y61.k
    /* renamed from: c */
    public final LayoutDirection getF40413c() {
        return this.f40421b.getF40449b();
    }

    @Override // androidx.compose.ui.layout.K0.a
    /* renamed from: d */
    public final int getF40412b() {
        return this.f40421b.g0();
    }
}
