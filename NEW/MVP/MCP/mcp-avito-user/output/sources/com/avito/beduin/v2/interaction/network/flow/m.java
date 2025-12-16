package com.avito.beduin.v2.interaction.network.flow;

import androidx.appcompat.app.r;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkResponseParserInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/m;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337681a;

    /* compiled from: NetworkResponseParserInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/flow/m$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337682b = new a();

        /* compiled from: NetworkResponseParserInteraction.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdU0/f;", "invoke", "()LdU0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.m$a$a, reason: collision with other inner class name */
        public static final class C10467a extends N implements Y41.a<dU0.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.l f337683l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ z f337684m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ A f337685n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10467a(com.avito.beduin.v2.engine.field.entity.l lVar, z zVar, A a12) {
                super(0);
                this.f337683l = lVar;
                this.f337684m = zVar;
                this.f337685n = a12;
            }

            @Override // Y41.a
            public final dU0.f invoke() {
                return this.f337683l.t(this.f337684m.getF336594a().i(), new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", this.f337685n)}));
            }
        }

        public a() {
            super("NetworkResponseParser");
        }

        @Override // dU0.c
        @Y61.k
        public final dU0.b b(@Y61.k z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
            v vVarQ;
            com.avito.beduin.v2.engine.field.entity.l lVarI = mVar.i(zVar, "onSuccess");
            com.avito.beduin.v2.engine.field.entity.l lVarI2 = mVar.i(zVar, "onError");
            A aM2 = mVar.m(zVar, "targetArgs");
            com.avito.beduin.v2.engine.field.m mVar2 = aM2.f336778b;
            try {
                com.avito.beduin.v2.engine.field.d dVarC = mVar2.c("isSuccess");
                boolean zF2 = L.f((dVarC == null || (vVarQ = dVarC.q(zVar)) == null) ? null : Boolean.valueOf(vVarQ.getF336837b()), Boolean.TRUE);
                if (!zF2) {
                    lVarI = lVarI2;
                }
                if (!zF2 && mVar2.c("error") == null) {
                    kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
                    com.avito.beduin.v2.engine.field.d dVarC2 = mVar2.c("httpStatusCode");
                    if (dVarC2 != null) {
                    }
                    com.avito.beduin.v2.engine.field.d dVarC3 = mVar2.c("result");
                    if (dVarC3 != null) {
                        dVar.put("error", dVarC3);
                    }
                    aM2 = A.t(aM2, new com.avito.beduin.v2.engine.field.m(dVar.b()), null, 2);
                } else if (zF2 && mVar2.c("result") == null) {
                    kotlin.collections.builders.d dVar2 = new kotlin.collections.builders.d();
                    com.avito.beduin.v2.engine.field.d dVarC4 = mVar2.c("httpStatusCode");
                    if (dVarC4 != null) {
                    }
                    com.avito.beduin.v2.engine.field.d dVarC5 = mVar2.c("error");
                    if (dVarC5 != null) {
                        dVar2.put("result", dVarC5);
                    }
                    aM2 = A.t(aM2, new com.avito.beduin.v2.engine.field.m(dVar2.b()), null, 2);
                }
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (1 >= RU0.b.f14469c) {
                    RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkResponseParserInteraction"), "NetworkParser args: " + aM2);
                }
                return new m(new C10467a(lVarI, zVar, aM2));
            } catch (Exception e12) {
                throw new BeduinPropertyException("isSuccess", e12);
            }
        }
    }

    public m(@Y61.k Y41.a<dU0.f> aVar) {
        this.f337681a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f337681a, ((m) obj).f337681a);
    }

    public final int hashCode() {
        return this.f337681a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return r.v(new StringBuilder("NetworkResponseParserInteraction(nextInteraction="), this.f337681a, ')');
    }
}
