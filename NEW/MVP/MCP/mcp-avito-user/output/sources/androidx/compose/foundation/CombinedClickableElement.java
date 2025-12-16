package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/L0;", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "<init>", "(Landroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;LY41/a;Ljava/lang/String;LY41/a;LY41/a;ZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedClickableElement extends AbstractC22430p0<L0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f26681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC21084v1 f26682c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26683d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f26684e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.semantics.i f26685f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f26686g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f26687h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<kotlin.G0> f26688i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<kotlin.G0> f26689j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26690k;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a aVar, String str2, Y41.a aVar2, Y41.a aVar3, boolean z13, C42822w c42822w) {
        this.f26681b = mVar;
        this.f26682c = interfaceC21084v1;
        this.f26683d = z12;
        this.f26684e = str;
        this.f26685f = iVar;
        this.f26686g = aVar;
        this.f26687h = str2;
        this.f26688i = aVar2;
        this.f26689j = aVar3;
        this.f26690k = z13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new L0(this.f26686g, this.f26687h, this.f26688i, this.f26689j, this.f26690k, this.f26681b, this.f26682c, this.f26683d, this.f26684e, this.f26685f, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        boolean z12;
        androidx.compose.ui.input.pointer.b0 b0Var;
        L0 l02 = (L0) dVar;
        l02.f26757L = this.f26690k;
        String str = l02.f26754I;
        String str2 = this.f26687h;
        if (!kotlin.jvm.internal.L.f(str, str2)) {
            l02.f26754I = str2;
            C22421l.g(l02).Z();
        }
        boolean z13 = l02.f26755J == null;
        Y41.a<kotlin.G0> aVar = this.f26688i;
        if (z13 != (aVar == null)) {
            l02.p2();
            C22421l.g(l02).Z();
            z12 = true;
        } else {
            z12 = false;
        }
        l02.f26755J = aVar;
        boolean z14 = l02.f26756K == null;
        Y41.a<kotlin.G0> aVar2 = this.f26689j;
        if (z14 != (aVar2 == null)) {
            z12 = true;
        }
        l02.f26756K = aVar2;
        boolean z15 = l02.f26919v;
        boolean z16 = this.f26683d;
        boolean z17 = z15 != z16 ? true : z12;
        l02.u2(this.f26681b, this.f26682c, z16, this.f26684e, this.f26685f, this.f26686g);
        if (!z17 || (b0Var = l02.f26922y) == null) {
            return;
        }
        b0Var.B0();
        kotlin.G0 g02 = kotlin.G0.f406611a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return kotlin.jvm.internal.L.f(this.f26681b, combinedClickableElement.f26681b) && kotlin.jvm.internal.L.f(this.f26682c, combinedClickableElement.f26682c) && this.f26683d == combinedClickableElement.f26683d && kotlin.jvm.internal.L.f(this.f26684e, combinedClickableElement.f26684e) && kotlin.jvm.internal.L.f(this.f26685f, combinedClickableElement.f26685f) && this.f26686g == combinedClickableElement.f26686g && kotlin.jvm.internal.L.f(this.f26687h, combinedClickableElement.f26687h) && this.f26688i == combinedClickableElement.f26688i && this.f26689j == combinedClickableElement.f26689j && this.f26690k == combinedClickableElement.f26690k;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.m mVar = this.f26681b;
        int iHashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        InterfaceC21084v1 interfaceC21084v1 = this.f26682c;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (interfaceC21084v1 != null ? interfaceC21084v1.hashCode() : 0)) * 31, 31, this.f26683d);
        String str = this.f26684e;
        int iHashCode2 = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.f26685f;
        int iH2 = androidx.appcompat.app.r.h((iHashCode2 + (iVar != null ? Integer.hashCode(iVar.f41753a) : 0)) * 31, 31, this.f26686g);
        String str2 = this.f26687h;
        int iHashCode3 = (iH2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Y41.a<kotlin.G0> aVar = this.f26688i;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Y41.a<kotlin.G0> aVar2 = this.f26689j;
        return Boolean.hashCode(this.f26690k) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }
}
