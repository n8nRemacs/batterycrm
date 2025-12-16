package com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.q;
import kotlin.Metadata;

/* compiled from: BeduinV1InMemoryRepositoryRemoveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/f;", "Lcom/avito/beduin/v2/interaction/repository/flow/q;", "a", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f338127d;

    /* compiled from: BeduinV1InMemoryRepositoryRemoveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/interactions/f$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/q$a;", "<init>", "()V", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f338128b = new a();

        public a() {
            super("BeduinV1InMemory", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.q.a
        public final q c(z zVar, m mVar, Y41.a aVar, l lVar, Y41.a aVar2) {
            return new f(VU0.b.a(zVar, mVar, false).f17177a, aVar, lVar, aVar2);
        }
    }

    public f(@k String str, @k Y41.a<dU0.f> aVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f338127d = str;
    }
}
