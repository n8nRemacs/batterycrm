package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/u1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierElement extends AbstractC22430p0<C21081u1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.k f26736b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC21084v1 f26737c;

    public IndicationModifierElement(@Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.k InterfaceC21084v1 interfaceC21084v1) {
        this.f26736b = kVar;
        this.f26737c = interfaceC21084v1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        InterfaceC22419k interfaceC22419kA = this.f26737c.a(this.f26736b);
        C21081u1 c21081u1 = new C21081u1();
        c21081u1.f32286r = interfaceC22419kA;
        c21081u1.k2(interfaceC22419kA);
        return c21081u1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C21081u1 c21081u1 = (C21081u1) dVar;
        InterfaceC22419k interfaceC22419kA = this.f26737c.a(this.f26736b);
        c21081u1.l2(c21081u1.f32286r);
        c21081u1.f32286r = interfaceC22419kA;
        c21081u1.k2(interfaceC22419kA);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return kotlin.jvm.internal.L.f(this.f26736b, indicationModifierElement.f26736b) && kotlin.jvm.internal.L.f(this.f26737c, indicationModifierElement.f26737c);
    }

    public final int hashCode() {
        return this.f26737c.hashCode() + (this.f26736b.hashCode() * 31);
    }
}
