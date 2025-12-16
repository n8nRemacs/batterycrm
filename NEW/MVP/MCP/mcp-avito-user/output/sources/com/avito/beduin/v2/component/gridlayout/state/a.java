package com.avito.beduin.v2.component.gridlayout.state;

import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.component.gridlayout.state.t;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoGridStateFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/a;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36250j {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f335838c = new a();

    public a() {
        super(b.f335839c.f336560a, false, 2, null);
    }

    @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
    public final Object a(AbstractC36250j.b bVar, String str) {
        b.f335839c.getClass();
        c cVar = (c) E.b(bVar, bVar.f336563b, new q(bVar, com.avito.beduin.v2.component.common.utils.h.a(bVar)));
        Arrangement arrangement = Arrangement.f335646d;
        t cVar2 = cVar.f335845f;
        if (!(cVar2 instanceof t.c)) {
            cVar2 = null;
        }
        if (cVar2 == null) {
            cVar2 = new t.c(12);
        }
        Y41.a<G0> aVar = cVar.f335849j;
        Y41.a<G0> aVar2 = cVar.f335850k;
        return new c(cVar.f335840a, cVar.f335841b, false, arrangement, cVar.f335844e, cVar2, cVar.f335846g, cVar.f335847h, cVar.f335848i, aVar, aVar2, cVar.f335851l, cVar.f335852m);
    }
}
