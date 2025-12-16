package com.avito.beduin.v2.interaction.mutate.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MutateEachnteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/m;", "", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f337490c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.entity.p f337491a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d f337492b;

    /* compiled from: MutateEachnteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/m$a;", "", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.avito.beduin.v2.interaction.mutate.flow.m a(@Y61.k com.avito.beduin.v2.engine.core.z r5, @Y61.k com.avito.beduin.v2.engine.field.entity.A r6, @Y61.k com.avito.beduin.v2.engine.field.entity.r r7) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                com.avito.beduin.v2.engine.field.m r6 = r6.f336778b
                java.lang.String r0 = "to"
                com.avito.beduin.v2.engine.field.d r1 = r6.c(r0)     // Catch: java.lang.Exception -> L10
                r2 = 0
                if (r1 == 0) goto L13
                com.avito.beduin.v2.engine.field.entity.p r0 = r1.k(r5)     // Catch: java.lang.Exception -> L10
                goto L14
            L10:
                r5 = move-exception
                goto L9e
            L13:
                r0 = r2
            L14:
                if (r0 != 0) goto L18
                goto L8b
            L18:
                java.lang.String r1 = "baseFormat"
                com.avito.beduin.v2.engine.field.d r3 = r6.c(r1)     // Catch: java.lang.Exception -> L2b
                if (r3 == 0) goto L3b
                com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r5)     // Catch: java.lang.Exception -> L2b
                if (r3 == 0) goto L2e
                java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L2b
                goto L2f
            L2b:
                r5 = move-exception
                goto L98
            L2e:
                r3 = r2
            L2f:
                if (r3 == 0) goto L3b
                com.avito.beduin.v2.engine.field.entity.r$a r4 = com.avito.beduin.v2.engine.field.entity.r.f336823a     // Catch: java.lang.Exception -> L2b
                r4.getClass()     // Catch: java.lang.Exception -> L2b
                com.avito.beduin.v2.engine.field.entity.r r1 = com.avito.beduin.v2.engine.field.entity.r.a.a(r3)     // Catch: java.lang.Exception -> L2b
                goto L3c
            L3b:
                r1 = r2
            L3c:
                if (r1 != 0) goto L3f
                goto L40
            L3f:
                r7 = r1
            L40:
                com.avito.beduin.v2.engine.field.entity.r$c r1 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
                boolean r1 = r7.equals(r1)
                java.lang.String r3 = "from"
                if (r1 == 0) goto L56
                com.avito.beduin.v2.engine.field.d r2 = r6.c(r3)     // Catch: java.lang.Exception -> L4f
                goto L81
            L4f:
                r5 = move-exception
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r6 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r6.<init>(r3, r5)
                throw r6
            L56:
                com.avito.beduin.v2.engine.field.entity.r$b r1 = com.avito.beduin.v2.engine.field.entity.r.b.f336825b
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L92
                com.avito.beduin.v2.engine.field.d r6 = r6.c(r3)     // Catch: java.lang.Exception -> L69
                if (r6 == 0) goto L6b
                com.avito.beduin.v2.engine.field.f r6 = r6.m(r5)     // Catch: java.lang.Exception -> L69
                goto L6c
            L69:
                r5 = move-exception
                goto L8c
            L6b:
                r6 = r2
            L6c:
                if (r6 == 0) goto L81
                com.avito.beduin.v2.engine.k r5 = r5.getF336594a()
                com.avito.beduin.v2.engine.core.z r5 = r5.i()
                com.avito.beduin.v2.engine.field.a$a r7 = com.avito.beduin.v2.engine.field.a.f336767b
                r7.getClass()
                java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> r7 = com.avito.beduin.v2.engine.field.a.f336768c
                com.avito.beduin.v2.engine.field.d r2 = r6.a(r5, r7)
            L81:
                if (r2 != 0) goto L85
                com.avito.beduin.v2.engine.field.entity.f r2 = com.avito.beduin.v2.engine.field.entity.f.f336800b
            L85:
                com.avito.beduin.v2.interaction.mutate.flow.m r5 = new com.avito.beduin.v2.interaction.mutate.flow.m
                r5.<init>(r0, r2)
                r2 = r5
            L8b:
                return r2
            L8c:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r6 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r6.<init>(r3, r5)
                throw r6
            L92:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L98:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r6 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r6.<init>(r1, r5)
                throw r6
            L9e:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r6 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r6.<init>(r0, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.mutate.flow.m.a.a(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.entity.A, com.avito.beduin.v2.engine.field.entity.r):com.avito.beduin.v2.interaction.mutate.flow.m");
        }

        public a() {
        }
    }

    public m(@Y61.k com.avito.beduin.v2.engine.field.entity.p pVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        this.f337491a = pVar;
        this.f337492b = dVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f337491a, mVar.f337491a) && L.f(this.f337492b, mVar.f337492b);
    }

    public final int hashCode() {
        return this.f337492b.hashCode() + (this.f337491a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Mutation(to=" + this.f337491a + ", from=" + this.f337492b + ')';
    }
}
