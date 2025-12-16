package com.avito.beduin.v2.interaction.mutate.flow;

import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MutateAllInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/b;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f337472a;

    /* compiled from: MutateAllInteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/b$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337473b = new a();

        public a() {
            super("MutateAll");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        @Override // dU0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(com.avito.beduin.v2.engine.core.z r6, com.avito.beduin.v2.engine.field.m r7) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                r5 = this;
                java.lang.String r0 = "to"
                com.avito.beduin.v2.engine.field.entity.a r0 = r7.d(r6, r0)
                java.util.List<com.avito.beduin.v2.engine.field.d> r0 = r0.f336782b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L29
                java.lang.Object r2 = r0.next()
                com.avito.beduin.v2.engine.field.d r2 = (com.avito.beduin.v2.engine.field.d) r2
                com.avito.beduin.v2.engine.field.entity.p r2 = r2.k(r6)
                if (r2 == 0) goto L13
                r1.add(r2)
                goto L13
            L29:
                java.lang.String r0 = "format"
                com.avito.beduin.v2.engine.field.d r2 = r7.c(r0)     // Catch: java.lang.Exception -> L3d
                r3 = 0
                if (r2 == 0) goto L4c
                com.avito.beduin.v2.engine.field.entity.v r2 = r2.q(r6)     // Catch: java.lang.Exception -> L3d
                if (r2 == 0) goto L3f
                java.lang.String r2 = r2.getF336843b()     // Catch: java.lang.Exception -> L3d
                goto L40
            L3d:
                r6 = move-exception
                goto La6
            L3f:
                r2 = r3
            L40:
                if (r2 == 0) goto L4c
                com.avito.beduin.v2.engine.field.entity.r$a r4 = com.avito.beduin.v2.engine.field.entity.r.f336823a     // Catch: java.lang.Exception -> L3d
                r4.getClass()     // Catch: java.lang.Exception -> L3d
                com.avito.beduin.v2.engine.field.entity.r r0 = com.avito.beduin.v2.engine.field.entity.r.a.a(r2)     // Catch: java.lang.Exception -> L3d
                goto L4d
            L4c:
                r0 = r3
            L4d:
                if (r0 != 0) goto L51
                com.avito.beduin.v2.engine.field.entity.r$c r0 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
            L51:
                com.avito.beduin.v2.engine.field.entity.r$c r2 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
                boolean r2 = kotlin.jvm.internal.L.f(r0, r2)
                java.lang.String r4 = "from"
                if (r2 == 0) goto L60
                com.avito.beduin.v2.engine.field.d r3 = r7.q(r4)
                goto L8b
            L60:
                com.avito.beduin.v2.engine.field.entity.r$b r2 = com.avito.beduin.v2.engine.field.entity.r.b.f336825b
                boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
                if (r0 == 0) goto La0
                com.avito.beduin.v2.engine.field.d r7 = r7.c(r4)     // Catch: java.lang.Exception -> L73
                if (r7 == 0) goto L75
                com.avito.beduin.v2.engine.field.f r7 = r7.m(r6)     // Catch: java.lang.Exception -> L73
                goto L76
            L73:
                r6 = move-exception
                goto L9a
            L75:
                r7 = r3
            L76:
                if (r7 == 0) goto L8b
                com.avito.beduin.v2.engine.k r6 = r6.getF336594a()
                com.avito.beduin.v2.engine.core.z r6 = r6.i()
                com.avito.beduin.v2.engine.field.a$a r0 = com.avito.beduin.v2.engine.field.a.f336767b
                r0.getClass()
                java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> r0 = com.avito.beduin.v2.engine.field.a.f336768c
                com.avito.beduin.v2.engine.field.d r3 = r7.a(r6, r0)
            L8b:
                if (r3 != 0) goto L8f
                com.avito.beduin.v2.engine.field.entity.f r3 = com.avito.beduin.v2.engine.field.entity.f.f336800b
            L8f:
                com.avito.beduin.v2.interaction.mutate.flow.b r6 = new com.avito.beduin.v2.interaction.mutate.flow.b
                com.avito.beduin.v2.interaction.mutate.flow.a r7 = new com.avito.beduin.v2.interaction.mutate.flow.a
                r7.<init>(r1, r3)
                r6.<init>(r7)
                return r6
            L9a:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r7.<init>(r4, r6)
                throw r7
            La0:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            La6:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r7 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r7.<init>(r0, r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.mutate.flow.b.a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    public b(@Y61.k Y41.a<G0> aVar) {
        this.f337472a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f337472a, ((b) obj).f337472a);
    }

    public final int hashCode() {
        return this.f337472a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return r.v(new StringBuilder("MutateAllInteraction(apply="), this.f337472a, ')');
    }
}
