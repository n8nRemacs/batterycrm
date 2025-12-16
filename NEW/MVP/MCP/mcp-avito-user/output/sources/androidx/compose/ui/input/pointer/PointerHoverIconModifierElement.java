package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/pointer/w;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends AbstractC22430p0<C22344w> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22345x f40178b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40179c;

    public /* synthetic */ PointerHoverIconModifierElement(InterfaceC22345x interfaceC22345x, boolean z12, int i12, C42822w c42822w) {
        this(interfaceC22345x, (i12 & 2) != 0 ? false : z12);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C22344w(this.f40178b, this.f40179c);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C22344w c22344w = (C22344w) dVar;
        InterfaceC22345x interfaceC22345x = c22344w.f40251q;
        InterfaceC22345x interfaceC22345x2 = this.f40178b;
        if (!kotlin.jvm.internal.L.f(interfaceC22345x, interfaceC22345x2)) {
            c22344w.f40251q = interfaceC22345x2;
            if (c22344w.f40253s) {
                c22344w.m2();
            }
        }
        c22344w.p2(this.f40179c);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return kotlin.jvm.internal.L.f(this.f40178b, pointerHoverIconModifierElement.f40178b) && this.f40179c == pointerHoverIconModifierElement.f40179c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40179c) + (this.f40178b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f40178b);
        sb2.append(", overrideDescendants=");
        return androidx.appcompat.app.r.x(sb2, this.f40179c, ')');
    }

    public PointerHoverIconModifierElement(@Y61.k InterfaceC22345x interfaceC22345x, boolean z12) {
        this.f40178b = interfaceC22345x;
        this.f40179c = z12;
    }
}
