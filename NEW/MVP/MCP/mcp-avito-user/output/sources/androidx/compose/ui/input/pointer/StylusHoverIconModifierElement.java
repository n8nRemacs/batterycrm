package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22436t;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/pointer/Y;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StylusHoverIconModifierElement extends AbstractC22430p0<Y> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22345x f40181b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40182c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C22436t f40183d;

    public /* synthetic */ StylusHoverIconModifierElement(InterfaceC22345x interfaceC22345x, boolean z12, C22436t c22436t, int i12, C42822w c42822w) {
        this(interfaceC22345x, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : c22436t);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new Y(this.f40181b, this.f40182c, this.f40183d);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        Y y12 = (Y) dVar;
        InterfaceC22345x interfaceC22345x = y12.f40251q;
        InterfaceC22345x interfaceC22345x2 = this.f40181b;
        if (!kotlin.jvm.internal.L.f(interfaceC22345x, interfaceC22345x2)) {
            y12.f40251q = interfaceC22345x2;
            if (y12.f40253s) {
                y12.m2();
            }
        }
        y12.p2(this.f40182c);
        y12.f40250p = this.f40183d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return kotlin.jvm.internal.L.f(this.f40181b, stylusHoverIconModifierElement.f40181b) && this.f40182c == stylusHoverIconModifierElement.f40182c && kotlin.jvm.internal.L.f(this.f40183d, stylusHoverIconModifierElement.f40183d);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.f40181b.hashCode() * 31, 31, this.f40182c);
        C22436t c22436t = this.f40183d;
        return i12 + (c22436t == null ? 0 : c22436t.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f40181b + ", overrideDescendants=" + this.f40182c + ", touchBoundsExpansion=" + this.f40183d + ')';
    }

    public StylusHoverIconModifierElement(@Y61.k InterfaceC22345x interfaceC22345x, boolean z12, @Y61.l C22436t c22436t) {
        this.f40181b = interfaceC22345x;
        this.f40182c = z12;
        this.f40183d = c22436t;
    }
}
