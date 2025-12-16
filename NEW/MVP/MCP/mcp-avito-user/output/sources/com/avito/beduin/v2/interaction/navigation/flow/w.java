package com.avito.beduin.v2.interaction.navigation.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SetResultInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/w;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final w f337555b = new w();

    public w() {
        super("SetResult");
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
            java.lang.String r0 = "status"
            com.avito.beduin.v2.engine.field.d r1 = r10.c(r0)     // Catch: java.lang.Exception -> L14
            r2 = 0
            if (r1 == 0) goto L24
            com.avito.beduin.v2.engine.field.entity.v r1 = r1.q(r9)     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.getF336843b()     // Catch: java.lang.Exception -> L14
            goto L18
        L14:
            r9 = move-exception
            goto L9e
        L17:
            r1 = r2
        L18:
            if (r1 == 0) goto L24
            com.avito.beduin.v2.interaction.navigation.flow.ResultStatus$a r3 = com.avito.beduin.v2.interaction.navigation.flow.ResultStatus.f337498c     // Catch: java.lang.Exception -> L14
            r3.getClass()     // Catch: java.lang.Exception -> L14
            com.avito.beduin.v2.interaction.navigation.flow.ResultStatus r0 = com.avito.beduin.v2.interaction.navigation.flow.ResultStatus.a.a(r1)     // Catch: java.lang.Exception -> L14
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 != 0) goto L29
            com.avito.beduin.v2.interaction.navigation.flow.ResultStatus r0 = com.avito.beduin.v2.interaction.navigation.flow.ResultStatus.f337499d
        L29:
            java.lang.String r1 = "params"
            com.avito.beduin.v2.engine.field.d r10 = r10.c(r1)     // Catch: java.lang.Exception -> L72
            r3 = 0
            if (r10 == 0) goto L89
            com.avito.beduin.v2.engine.field.entity.A r10 = r10.a(r9)     // Catch: java.lang.Exception -> L72
            if (r10 == 0) goto L89
            com.avito.beduin.v2.engine.field.m r10 = r10.f336778b     // Catch: java.lang.Exception -> L72
            java.util.Map<java.lang.String, com.avito.beduin.v2.engine.field.d> r10 = r10.f336870a     // Catch: java.lang.Exception -> L72
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L72
            int r5 = r10.size()     // Catch: java.lang.Exception -> L72
            r4.<init>(r5)     // Catch: java.lang.Exception -> L72
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Exception -> L72
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L72
        L4d:
            boolean r5 = r10.hasNext()     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L80
            java.lang.Object r5 = r10.next()     // Catch: java.lang.Exception -> L72
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> L72
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L72
            com.avito.beduin.v2.engine.field.d r5 = (com.avito.beduin.v2.engine.field.d) r5     // Catch: java.lang.Exception -> L72
            com.avito.beduin.v2.interaction.navigation.flow.r r7 = new com.avito.beduin.v2.interaction.navigation.flow.r     // Catch: java.lang.Exception -> L72
            com.avito.beduin.v2.engine.field.entity.v r5 = r5.q(r9)     // Catch: java.lang.Exception -> L72
            if (r5 == 0) goto L74
            java.lang.String r5 = r5.getF336843b()     // Catch: java.lang.Exception -> L72
            goto L75
        L72:
            r9 = move-exception
            goto L98
        L74:
            r5 = r2
        L75:
            if (r5 != 0) goto L79
            java.lang.String r5 = ""
        L79:
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> L72
            r4.add(r7)     // Catch: java.lang.Exception -> L72
            goto L4d
        L80:
            com.avito.beduin.v2.interaction.navigation.flow.r[] r9 = new com.avito.beduin.v2.interaction.navigation.flow.r[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Object[] r9 = r4.toArray(r9)     // Catch: java.lang.Exception -> L72
            r2 = r9
            com.avito.beduin.v2.interaction.navigation.flow.r[] r2 = (com.avito.beduin.v2.interaction.navigation.flow.r[]) r2     // Catch: java.lang.Exception -> L72
        L89:
            if (r2 != 0) goto L8d
            com.avito.beduin.v2.interaction.navigation.flow.r[] r2 = new com.avito.beduin.v2.interaction.navigation.flow.r[r3]
        L8d:
            com.avito.beduin.v2.interaction.navigation.flow.s r9 = new com.avito.beduin.v2.interaction.navigation.flow.s
            r9.<init>(r2)
            com.avito.beduin.v2.interaction.navigation.flow.v r10 = new com.avito.beduin.v2.interaction.navigation.flow.v
            r10.<init>(r0, r9)
            return r10
        L98:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r10.<init>(r1, r9)
            throw r10
        L9e:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.navigation.flow.w.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
    }
}
