package com.avito.beduin.v2.component.gridlayout.state;

import com.avito.beduin.v2.component.gridlayout.state.t;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridLayoutStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/gridlayout/state/t;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/gridlayout/state/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n extends N implements Y41.l<G, t> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f335873l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final t invoke(G g12) {
        G g13 = g12;
        t.b bVar = t.f335879a;
        t tVar = g13.contains("fixed") ? (t) g13.f(d.f335863l, "fixed", "fixed") : g13.contains("fixedSize") ? (t) g13.f(e.f335864l, "fixedSize", "fixedSize") : g13.contains("adaptive") ? (t) g13.f(f.f335865l, "adaptive", "adaptive") : null;
        if (tVar != null) {
            return tVar;
        }
        bVar.getClass();
        return t.f335880b;
    }
}
