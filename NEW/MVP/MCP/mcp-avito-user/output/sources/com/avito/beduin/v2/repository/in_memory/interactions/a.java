package com.avito.beduin.v2.repository.in_memory.interactions;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.d;
import kotlin.Metadata;
import nV0.C44341b;

/* compiled from: InMemoryRepositoryGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d;", "a", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends com.avito.beduin.v2.interaction.repository.flow.d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f338280d;

    /* compiled from: InMemoryRepositoryGetInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/in_memory/interactions/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "<init>", "()V", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.repository.in_memory.interactions.a$a, reason: collision with other inner class name */
    public static final class C10482a extends d.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C10482a f338281b = new C10482a();

        public C10482a() {
            super("InMemory", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.d.a
        @k
        public final com.avito.beduin.v2.interaction.repository.flow.d c(@k z zVar, @k m mVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
            return new a(C44341b.a(zVar, mVar).f415166a, lVar, lVar2, aVar);
        }
    }

    public a(@k String str, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @k l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
        super(aVar, lVar, lVar2);
        this.f338280d = str;
    }
}
