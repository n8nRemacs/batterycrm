package com.avito.beduin.v2.repository.in_memory.interactions;

import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.l;
import kotlin.Metadata;
import nV0.C44341b;

/* compiled from: InMemoryRepositoryObserveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/c;", "Lcom/avito/beduin/v2/interaction/repository/flow/l;", "a", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f338283e;

    /* compiled from: InMemoryRepositoryObserveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/c$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/l$a;", "<init>", "()V", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends l.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338284b = new a();

        public a() {
            super("InMemory", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.l.a
        @k
        public final l c(@k z zVar, @k m mVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
            return new c(C44341b.a(zVar, mVar).f415166a, lVar, aVar, lVar2, aVar2);
        }
    }

    public c(@k String str, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
        super(lVar, aVar, lVar2, aVar2);
        this.f338283e = str;
    }
}
