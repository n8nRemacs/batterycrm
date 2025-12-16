package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: RepositoryRemoveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class q implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337778a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337779b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337780c;

    /* compiled from: RepositoryRemoveInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q$a;", "LdU0/c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends dU0.c {
        public /* synthetic */ a(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? "Remove" : str2);
        }

        @Override // dU0.c
        public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) {
            return c(zVar, mVar, new o(zVar, mVar.t(zVar, "onComplete")), new p(zVar, mVar.t(zVar, "onError")), com.avito.beduin.v2.handler.flow.actions.c.a(zVar, mVar));
        }

        @Y61.k
        public abstract q c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2);

        public a(@Y61.k String str, @Y61.k String str2) {
            super(C43066x.m(str) + "Repository" + C43066x.m(str2));
        }
    }

    public q(@Y61.k Y41.a aVar, @Y61.l Y41.a aVar2, @Y61.k Y41.l lVar) {
        this.f337778a = aVar;
        this.f337779b = lVar;
        this.f337780c = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337780c;
    }
}
