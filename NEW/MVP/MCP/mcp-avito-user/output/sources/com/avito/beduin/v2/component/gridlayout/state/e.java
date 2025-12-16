package com.avito.beduin.v2.component.gridlayout.state;

import com.avito.beduin.v2.component.gridlayout.state.t;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridLayoutStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/gridlayout/state/t$d;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/gridlayout/state/t$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<G, t.d> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f335864l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final t.d invoke(G g12) {
        Integer numA = g12.a("spanSize");
        return new t.d(Math.max(0, numA != null ? numA.intValue() : 0));
    }
}
