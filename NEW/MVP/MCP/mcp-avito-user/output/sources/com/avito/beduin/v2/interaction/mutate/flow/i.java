package com.avito.beduin.v2.interaction.mutate.flow;

import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MutateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/i;", "LdU0/b;", "b", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f337483a;

    /* compiled from: MutateInteraction.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f337484l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: MutateInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/i$b;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f337485b = new b();

        public b() {
            super("Mutate");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
        @Override // dU0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(com.avito.beduin.v2.engine.core.z r6, com.avito.beduin.v2.engine.field.m r7) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                r5 = this;
                java.lang.String r0 = "to"
                com.avito.beduin.v2.engine.field.d r1 = r7.c(r0)     // Catch: java.lang.Exception -> Le
                r2 = 0
                if (r1 == 0) goto L11
                com.avito.beduin.v2.engine.field.entity.p r0 = r1.k(r6)     // Catch: java.lang.Exception -> Le
                goto L12
            Le:
                r6 = move-exception
                goto L9e
            L11:
                r0 = r2
            L12:
                if (r0 != 0) goto L1c
                com.avito.beduin.v2.interaction.mutate.flow.i r6 = new com.avito.beduin.v2.interaction.mutate.flow.i
                r7 = 1
                r6.<init>(r2, r7, r2)
                goto L8b
            L1c:
                java.lang.String r1 = "format"
                com.avito.beduin.v2.engine.field.d r3 = r7.c(r1)     // Catch: java.lang.Exception -> L2f
                if (r3 == 0) goto L3e
                com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r6)     // Catch: java.lang.Exception -> L2f
                if (r3 == 0) goto L31
                java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L2f
                goto L32
            L2f:
                r6 = move-exception
                goto L98
            L31:
                r3 = r2
            L32:
                if (r3 == 0) goto L3e
                com.avito.beduin.v2.engine.field.entity.r$a r4 = com.avito.beduin.v2.engine.field.entity.r.f336823a     // Catch: java.lang.Exception -> L2f
                r4.getClass()     // Catch: java.lang.Exception -> L2f
                com.avito.beduin.v2.engine.field.entity.r r1 = com.avito.beduin.v2.engine.field.entity.r.a.a(r3)     // Catch: java.lang.Exception -> L2f
                goto L3f
            L3e:
                r1 = r2
            L3f:
                if (r1 != 0) goto L43
                com.avito.beduin.v2.engine.field.entity.r$c r1 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
            L43:
                com.avito.beduin.v2.engine.field.entity.r$c r3 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
                boolean r3 = kotlin.jvm.internal.L.f(r1, r3)
                java.lang.String r4 = "from"
                if (r3 == 0) goto L52
                com.avito.beduin.v2.engine.field.d r2 = r7.q(r4)
                goto L7d
            L52:
                com.avito.beduin.v2.engine.field.entity.r$b r3 = com.avito.beduin.v2.engine.field.entity.r.b.f336825b
                boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
                if (r1 == 0) goto L92
                com.avito.beduin.v2.engine.field.d r7 = r7.c(r4)     // Catch: java.lang.Exception -> L65
                if (r7 == 0) goto L67
                com.avito.beduin.v2.engine.field.f r7 = r7.m(r6)     // Catch: java.lang.Exception -> L65
                goto L68
            L65:
                r6 = move-exception
                goto L8c
            L67:
                r7 = r2
            L68:
                if (r7 == 0) goto L7d
                com.avito.beduin.v2.engine.k r6 = r6.getF336594a()
                com.avito.beduin.v2.engine.core.z r6 = r6.i()
                com.avito.beduin.v2.engine.field.a$a r1 = com.avito.beduin.v2.engine.field.a.f336767b
                r1.getClass()
                java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> r1 = com.avito.beduin.v2.engine.field.a.f336768c
                com.avito.beduin.v2.engine.field.d r2 = r7.a(r6, r1)
            L7d:
                if (r2 != 0) goto L81
                com.avito.beduin.v2.engine.field.entity.f r2 = com.avito.beduin.v2.engine.field.entity.f.f336800b
            L81:
                com.avito.beduin.v2.interaction.mutate.flow.i r6 = new com.avito.beduin.v2.interaction.mutate.flow.i
                com.avito.beduin.v2.interaction.mutate.flow.j r7 = new com.avito.beduin.v2.interaction.mutate.flow.j
                r7.<init>(r0, r2)
                r6.<init>(r7)
            L8b:
                return r6
            L8c:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r7.<init>(r4, r6)
                throw r7
            L92:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            L98:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r7.<init>(r1, r6)
                throw r7
            L9e:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r7.<init>(r0, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.mutate.flow.i.b.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && L.f(this.f337483a, ((i) obj).f337483a);
    }

    public final int hashCode() {
        return this.f337483a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return r.v(new StringBuilder("MutateInteraction(apply="), this.f337483a, ')');
    }

    public i(@Y61.k Y41.a<G0> aVar) {
        this.f337483a = aVar;
    }

    public /* synthetic */ i(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.f337484l : aVar);
    }
}
