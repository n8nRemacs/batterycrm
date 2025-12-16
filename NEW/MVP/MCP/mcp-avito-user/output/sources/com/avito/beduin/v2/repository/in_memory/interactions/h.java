package com.avito.beduin.v2.repository.in_memory.interactions;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.x;
import kotlin.Metadata;
import nV0.C44341b;
import nV0.C44342c;

/* compiled from: InMemoryRepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/h;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "a", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends x {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f338295d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.engine.field.d f338296e;

    /* compiled from: InMemoryRepositoryUpdateInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/h$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/x$a;", "<init>", "()V", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends x.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338297b = new a();

        public a() {
            super("InMemory", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.x.a
        @k
        public final x c(@k z zVar, @k m mVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) throws BeduinPropertyException {
            C44342c c44342cA = C44341b.a(zVar, mVar);
            return new h(c44342cA.f415166a, c44342cA.f415167b, aVar, lVar, aVar2);
        }
    }

    public h(@k String str, @l com.avito.beduin.v2.engine.field.d dVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f338295d = str;
        this.f338296e = dVar;
    }
}
