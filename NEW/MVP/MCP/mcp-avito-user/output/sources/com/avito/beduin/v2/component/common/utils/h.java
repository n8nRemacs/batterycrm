package com.avito.beduin.v2.component.common.utils;

import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CommonBaseStateReader.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* compiled from: CommonBaseStateReader.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/common/utils/a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/common/utils/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, com.avito.beduin.v2.component.common.utils.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f335714l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.beduin.v2.component.common.utils.a invoke(G g12) {
            G g13 = g12;
            String string = g13.getString("tag");
            Boolean boolC = g13.c("visible");
            return new com.avito.beduin.v2.component.common.utils.a(string, boolC != null ? boolC.booleanValue() : true, (Y41.a) g13.d(c.f335709l, "onShow", "onShow"), (Y41.a) g13.d(e.f335711l, "onHide", "onHide"), new com.avito.beduin.v2.engine.utils.c(C42745f0.C(g13.g("markers", "markers", g.f335713l)).toArray(new AbstractC40338a[0])));
        }
    }

    @Y61.k
    public static final com.avito.beduin.v2.component.common.utils.a a(@Y61.k AbstractC36250j.b bVar) {
        return (com.avito.beduin.v2.component.common.utils.a) E.b(bVar, bVar.f336563b, a.f335714l);
    }
}
