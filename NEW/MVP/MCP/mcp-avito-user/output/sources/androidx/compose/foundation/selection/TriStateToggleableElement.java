package androidx.compose.foundation.selection;

import androidx.appcompat.app.r;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.v;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/selection/n;", "Landroidx/compose/ui/state/ToggleableState;", VoiceInfo.STATE, "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class TriStateToggleableElement extends AbstractC22430p0<n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ToggleableState f30114b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f30115c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC21084v1 f30116d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30117e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.semantics.i f30118f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f30119g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(ToggleableState toggleableState, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z12, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        this.f30114b = toggleableState;
        this.f30115c = mVar;
        this.f30116d = interfaceC21084v1;
        this.f30117e = z12;
        this.f30118f = iVar;
        this.f30119g = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new n(this.f30114b, this.f30115c, this.f30116d, this.f30117e, this.f30118f, this.f30119g, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        n nVar = (n) dVar;
        ToggleableState toggleableState = nVar.f30146I;
        ToggleableState toggleableState2 = this.f30114b;
        if (toggleableState != toggleableState2) {
            nVar.f30146I = toggleableState2;
            C22421l.g(nVar).Z();
        }
        nVar.u2(this.f30115c, this.f30116d, this.f30117e, null, this.f30118f, this.f30119g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f30114b == triStateToggleableElement.f30114b && L.f(this.f30115c, triStateToggleableElement.f30115c) && L.f(this.f30116d, triStateToggleableElement.f30116d) && this.f30117e == triStateToggleableElement.f30117e && L.f(this.f30118f, triStateToggleableElement.f30118f) && this.f30119g == triStateToggleableElement.f30119g;
    }

    public final int hashCode() {
        int iHashCode = this.f30114b.hashCode() * 31;
        androidx.compose.foundation.interaction.m mVar = this.f30115c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        InterfaceC21084v1 interfaceC21084v1 = this.f30116d;
        int i12 = r.i((iHashCode2 + (interfaceC21084v1 != null ? interfaceC21084v1.hashCode() : 0)) * 31, 31, this.f30117e);
        androidx.compose.ui.semantics.i iVar = this.f30118f;
        return this.f30119g.hashCode() + ((i12 + (iVar != null ? Integer.hashCode(iVar.f41753a) : 0)) * 31);
    }
}
