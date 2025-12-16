package com.avito.beduin.v2.interaction.repository.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: RepositoryObserveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class l implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337753a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> f337755c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<dU0.f> f337756d;

    /* compiled from: RepositoryObserveInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l$a;", "LdU0/c;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends dU0.c {
        public a(String str, String str2, int i12, C42822w c42822w) {
            super(C43066x.m(str) + "Repository" + C43066x.m((i12 & 2) != 0 ? "Observe" : str2));
        }

        @Override // dU0.c
        public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) {
            if (mVar.f336870a.containsKey("interactionGroup")) {
                return c(zVar, mVar, new j(zVar, mVar.i(zVar, "onEach")), new i(zVar, mVar.t(zVar, "onComplete")), new k(zVar, mVar.t(zVar, "onError")), com.avito.beduin.v2.handler.flow.actions.c.a(zVar, mVar));
            }
            throw new IllegalArgumentException("interactionGroup must be set for observable repositories");
        }

        @Y61.k
        public abstract l c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
        this.f337753a = lVar;
        this.f337754b = aVar;
        this.f337755c = lVar2;
        this.f337756d = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.l
    public final Y41.a<dU0.f> c() {
        return this.f337756d;
    }
}
