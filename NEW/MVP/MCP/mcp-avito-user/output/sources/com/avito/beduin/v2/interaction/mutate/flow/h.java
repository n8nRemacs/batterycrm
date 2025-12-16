package com.avito.beduin.v2.interaction.mutate.flow;

import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MutateEachnteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/h;", "LdU0/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f337481a;

    /* compiled from: MutateEachnteraction.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/mutate/flow/h$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337482b = new a();

        public a() {
            super("MutateEach");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
        @Override // dU0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final dU0.b b(com.avito.beduin.v2.engine.core.z r9, com.avito.beduin.v2.engine.field.m r10) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
            /*
                r8 = this;
                java.lang.String r0 = "baseFormat"
                com.avito.beduin.v2.engine.field.d r1 = r10.c(r0)     // Catch: java.lang.Exception -> L14
                r2 = 0
                if (r1 == 0) goto L24
                com.avito.beduin.v2.engine.field.entity.v r1 = r1.q(r9)     // Catch: java.lang.Exception -> L14
                if (r1 == 0) goto L17
                java.lang.String r1 = r1.getF336843b()     // Catch: java.lang.Exception -> L14
                goto L18
            L14:
                r9 = move-exception
                goto L84
            L17:
                r1 = r2
            L18:
                if (r1 == 0) goto L24
                com.avito.beduin.v2.engine.field.entity.r$a r3 = com.avito.beduin.v2.engine.field.entity.r.f336823a     // Catch: java.lang.Exception -> L14
                r3.getClass()     // Catch: java.lang.Exception -> L14
                com.avito.beduin.v2.engine.field.entity.r r0 = com.avito.beduin.v2.engine.field.entity.r.a.a(r1)     // Catch: java.lang.Exception -> L14
                goto L25
            L24:
                r0 = r2
            L25:
                if (r0 != 0) goto L29
                com.avito.beduin.v2.engine.field.entity.r$c r0 = com.avito.beduin.v2.engine.field.entity.r.c.f336827b
            L29:
                java.lang.String r1 = "mutations"
                com.avito.beduin.v2.engine.field.entity.a r10 = r10.d(r9, r1)
                java.util.List<com.avito.beduin.v2.engine.field.d> r10 = r10.f336782b
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r10 = r10.iterator()
                r3 = 0
            L3d:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto L79
                java.lang.Object r4 = r10.next()
                int r5 = r3 + 1
                if (r3 < 0) goto L75
                com.avito.beduin.v2.engine.field.d r4 = (com.avito.beduin.v2.engine.field.d) r4
                java.lang.String r6 = "mutations["
                r7 = 93
                java.lang.String r3 = androidx.appcompat.app.r.p(r6, r3, r7)
                com.avito.beduin.v2.engine.field.entity.A r4 = r4.a(r9)     // Catch: java.lang.Exception -> L65
                if (r4 == 0) goto L67
                com.avito.beduin.v2.interaction.mutate.flow.m$a r6 = com.avito.beduin.v2.interaction.mutate.flow.m.f337490c     // Catch: java.lang.Exception -> L65
                r6.getClass()     // Catch: java.lang.Exception -> L65
                com.avito.beduin.v2.interaction.mutate.flow.m r3 = com.avito.beduin.v2.interaction.mutate.flow.m.a.a(r9, r4, r0)     // Catch: java.lang.Exception -> L65
                goto L68
            L65:
                r9 = move-exception
                goto L6f
            L67:
                r3 = r2
            L68:
                if (r3 == 0) goto L6d
                r1.add(r3)
            L6d:
                r3 = r5
                goto L3d
            L6f:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r10.<init>(r3, r9)
                throw r10
            L75:
                kotlin.collections.C42745f0.H0()
                throw r2
            L79:
                com.avito.beduin.v2.interaction.mutate.flow.h r9 = new com.avito.beduin.v2.interaction.mutate.flow.h
                com.avito.beduin.v2.interaction.mutate.flow.g r10 = new com.avito.beduin.v2.interaction.mutate.flow.g
                r10.<init>(r1)
                r9.<init>(r10)
                return r9
            L84:
                com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
                r10.<init>(r0, r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.mutate.flow.h.a.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
        }
    }

    public h(@Y61.k Y41.a<G0> aVar) {
        this.f337481a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f337481a, ((h) obj).f337481a);
    }

    public final int hashCode() {
        return this.f337481a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return r.v(new StringBuilder("MutateEachnteraction(apply="), this.f337481a, ')');
    }
}
