package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Scroll.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/b2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends AbstractC22430p0<b2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2 f26852b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26853c;

    public ScrollingLayoutElement(@Y61.k d2 d2Var, boolean z12) {
        this.f26852b = d2Var;
        this.f26853c = z12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        b2 b2Var = new b2();
        b2Var.f26956p = this.f26852b;
        b2Var.f26957q = this.f26853c;
        return b2Var;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        b2 b2Var = (b2) dVar;
        b2Var.f26956p = this.f26852b;
        b2Var.f26957q = this.f26853c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return kotlin.jvm.internal.L.f(this.f26852b, scrollingLayoutElement.f26852b) && this.f26853c == scrollingLayoutElement.f26853c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26853c) + androidx.appcompat.app.r.i(this.f26852b.hashCode() * 31, 31, false);
    }
}
