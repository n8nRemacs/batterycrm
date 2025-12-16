package com.avito.beduin.v2.avito.component.surface.state;

import Y41.l;
import com.avito.beduin.v2.avito.component.common.i;
import com.avito.beduin.v2.avito.component.common.m;
import com.avito.beduin.v2.avito.component.common.n;
import com.avito.beduin.v2.component.box.state.f;
import com.avito.beduin.v2.engine.component.G;
import com.avito.beduin.v2.theme.h;
import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.s;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoSurfaceStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/surface/state/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/surface/state/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements l<G, a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f335222l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final a invoke(G g12) {
        G g13 = g12;
        f.f335586c.getClass();
        com.avito.beduin.v2.component.box.state.b bVarB = f.b(g13);
        r rVarB = t.f338374a.b(s.b(g13, "highlightedBackgroundColor"));
        m mVar = m.f334140a;
        i iVar = (i) h.b(g13, "upperShadow", mVar).a();
        com.avito.beduin.v2.avito.component.common.h hVar = iVar != null ? new com.avito.beduin.v2.avito.component.common.h(iVar) : null;
        i iVar2 = (i) h.b(g13, "bottomShadow", mVar).a();
        com.avito.beduin.v2.avito.component.common.h hVar2 = iVar2 != null ? new com.avito.beduin.v2.avito.component.common.h(iVar2) : null;
        n nVar = (n) g13.f(b.f335220l, "shape", "shape");
        com.avito.beduin.v2.avito.component.common.b bVar = (com.avito.beduin.v2.avito.component.common.b) h.b(g13, "border", com.avito.beduin.v2.avito.component.common.d.f334121a).a();
        return new a(bVarB, rVarB, (com.avito.beduin.v2.avito.component.gradient.content.b) g13.f(c.f335221l, "gradient", "gradient"), hVar, hVar2, nVar, bVar != null ? new com.avito.beduin.v2.avito.component.common.a(bVar) : null);
    }
}
