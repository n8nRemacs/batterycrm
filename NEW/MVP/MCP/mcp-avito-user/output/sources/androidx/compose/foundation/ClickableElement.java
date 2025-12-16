package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/I0;", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends AbstractC22430p0<I0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f26675b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC21084v1 f26676c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26677d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f26678e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.semantics.i f26679f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f26680g;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        this.f26675b = mVar;
        this.f26676c = interfaceC21084v1;
        this.f26677d = z12;
        this.f26678e = str;
        this.f26679f = iVar;
        this.f26680g = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new I0(this.f26675b, this.f26676c, this.f26677d, this.f26678e, this.f26679f, this.f26680g, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((I0) dVar).u2(this.f26675b, this.f26676c, this.f26677d, this.f26678e, this.f26679f, this.f26680g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return kotlin.jvm.internal.L.f(this.f26675b, clickableElement.f26675b) && kotlin.jvm.internal.L.f(this.f26676c, clickableElement.f26676c) && this.f26677d == clickableElement.f26677d && kotlin.jvm.internal.L.f(this.f26678e, clickableElement.f26678e) && kotlin.jvm.internal.L.f(this.f26679f, clickableElement.f26679f) && this.f26680g == clickableElement.f26680g;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.m mVar = this.f26675b;
        int iHashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        InterfaceC21084v1 interfaceC21084v1 = this.f26676c;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (interfaceC21084v1 != null ? interfaceC21084v1.hashCode() : 0)) * 31, 31, this.f26677d);
        String str = this.f26678e;
        int iHashCode2 = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.f26679f;
        return this.f26680g.hashCode() + ((iHashCode2 + (iVar != null ? Integer.hashCode(iVar.f41753a) : 0)) * 31);
    }
}
