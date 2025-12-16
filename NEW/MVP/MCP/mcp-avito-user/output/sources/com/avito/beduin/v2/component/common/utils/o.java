package com.avito.beduin.v2.component.common.utils;

import Y41.q;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScrollBaseStateReader.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o {

    /* compiled from: ScrollBaseStateReader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/component/common/utils/i;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/component/common/utils/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G, i> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC36250j.b f335723l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36250j.b bVar) {
            super(1);
            this.f335723l = bVar;
        }

        @Override // Y41.l
        public final i invoke(G g12) {
            G g13 = g12;
            AbstractC36250j.b bVar = this.f335723l;
            return new i((Y41.l) g13.d(new l(bVar), "onScrollStart", "onScrollStart"), (q) g13.d(new n(bVar), "onScrollEnd", "onScrollEnd"));
        }
    }

    @Y61.k
    public static final i a(@Y61.k AbstractC36250j.b bVar) {
        return (i) E.b(bVar, bVar.f336563b, new a(bVar));
    }
}
