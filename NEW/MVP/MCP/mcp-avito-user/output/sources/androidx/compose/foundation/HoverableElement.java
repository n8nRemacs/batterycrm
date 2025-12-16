package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/o1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class HoverableElement extends AbstractC22430p0<C20803o1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f26724b;

    public HoverableElement(@Y61.k androidx.compose.foundation.interaction.m mVar) {
        this.f26724b = mVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20803o1 c20803o1 = new C20803o1();
        c20803o1.f29783p = this.f26724b;
        return c20803o1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20803o1 c20803o1 = (C20803o1) dVar;
        androidx.compose.foundation.interaction.m mVar = c20803o1.f29783p;
        androidx.compose.foundation.interaction.m mVar2 = this.f26724b;
        if (kotlin.jvm.internal.L.f(mVar, mVar2)) {
            return;
        }
        c20803o1.m2();
        c20803o1.f29783p = mVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && kotlin.jvm.internal.L.f(((HoverableElement) obj).f26724b, this.f26724b);
    }

    public final int hashCode() {
        return this.f26724b.hashCode() * 31;
    }
}
