package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: RepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/d;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class d implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337729c;

    /* compiled from: RepositoryGetInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "LdU0/c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends dU0.c {
        public a(String str, String str2, int i12, C42822w c42822w) {
            super(C43066x.m(str) + "Repository" + C43066x.m((i12 & 2) != 0 ? "Get" : str2));
        }

        @Override // dU0.c
        public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) {
            return c(zVar, mVar, new C36329b(zVar, mVar.i(zVar, "onComplete")), new C36330c(zVar, mVar.t(zVar, "onError")), com.avito.beduin.v2.handler.flow.actions.c.a(zVar, mVar));
        }

        @Y61.k
        public abstract d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar);
    }

    public d(@Y61.l Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f337727a = lVar;
        this.f337728b = lVar2;
        this.f337729c = aVar;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337729c;
    }
}
