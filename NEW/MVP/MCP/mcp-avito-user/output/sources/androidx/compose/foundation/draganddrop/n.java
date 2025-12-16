package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.AbstractC22425n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DragAndDropTarget.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/draganddrop/n;", "Landroidx/compose/ui/node/n;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends AbstractC22425n {

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.draganddrop.p f27106r;

    public n() {
        throw null;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        androidx.compose.ui.draganddrop.e eVarA = androidx.compose.ui.draganddrop.l.a(new m(this), null);
        k2(eVarA);
        this.f27106r = eVarA;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        l2(this.f27106r);
    }
}
