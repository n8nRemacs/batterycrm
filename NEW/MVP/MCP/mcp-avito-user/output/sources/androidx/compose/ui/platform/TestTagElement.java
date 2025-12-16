package androidx.compose.ui.platform;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TestTag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/platform/n2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class TestTagElement extends AbstractC22430p0<C22505n2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f41278b;

    public TestTagElement(@Y61.k String str) {
        this.f41278b = str;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C22505n2 c22505n2 = new C22505n2();
        c22505n2.f41518p = this.f41278b;
        return c22505n2;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C22505n2) dVar).f41518p = this.f41278b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f41278b, ((TestTagElement) obj).f41278b);
    }

    public final int hashCode() {
        return this.f41278b.hashCode();
    }
}
