package com.avito.beduin.v2.interaction.navigation.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CloseInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/g;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final g f337526b = new g();

    public g() {
        super("Close");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    @Override // dU0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dU0.b b(com.avito.beduin.v2.engine.core.z r8, com.avito.beduin.v2.engine.field.m r9) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r7 = this;
            java.lang.String r0 = "status"
            com.avito.beduin.v2.interaction.navigation.flow.ResultStatus$a r1 = com.avito.beduin.v2.interaction.navigation.flow.ResultStatus.f337498c
            com.avito.beduin.v2.engine.field.d r2 = r9.c(r0)     // Catch: java.lang.Exception -> L16
            r3 = 0
            if (r2 == 0) goto L24
            com.avito.beduin.v2.engine.field.entity.v r2 = r2.q(r8)     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.getF336843b()     // Catch: java.lang.Exception -> L16
            goto L1a
        L16:
            r8 = move-exception
            goto L9d
        L19:
            r2 = r3
        L1a:
            if (r2 == 0) goto L24
            r1.getClass()     // Catch: java.lang.Exception -> L16
            com.avito.beduin.v2.interaction.navigation.flow.ResultStatus r0 = com.avito.beduin.v2.interaction.navigation.flow.ResultStatus.a.a(r2)     // Catch: java.lang.Exception -> L16
            goto L25
        L24:
            r0 = r3
        L25:
            java.lang.String r1 = "params"
            com.avito.beduin.v2.engine.field.d r9 = r9.c(r1)     // Catch: java.lang.Exception -> L6d
            if (r9 == 0) goto L7c
            com.avito.beduin.v2.engine.field.entity.A r9 = r9.a(r8)     // Catch: java.lang.Exception -> L6d
            if (r9 == 0) goto L7c
            com.avito.beduin.v2.engine.field.m r9 = r9.f336778b     // Catch: java.lang.Exception -> L6d
            java.util.Map<java.lang.String, com.avito.beduin.v2.engine.field.d> r9 = r9.f336870a     // Catch: java.lang.Exception -> L6d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6d
            int r4 = r9.size()     // Catch: java.lang.Exception -> L6d
            r2.<init>(r4)     // Catch: java.lang.Exception -> L6d
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Exception -> L6d
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L6d
        L48:
            boolean r4 = r9.hasNext()     // Catch: java.lang.Exception -> L6d
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r9.next()     // Catch: java.lang.Exception -> L6d
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> L6d
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L6d
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L6d
            com.avito.beduin.v2.engine.field.d r4 = (com.avito.beduin.v2.engine.field.d) r4     // Catch: java.lang.Exception -> L6d
            com.avito.beduin.v2.interaction.navigation.flow.r r6 = new com.avito.beduin.v2.interaction.navigation.flow.r     // Catch: java.lang.Exception -> L6d
            com.avito.beduin.v2.engine.field.entity.v r4 = r4.q(r8)     // Catch: java.lang.Exception -> L6d
            if (r4 == 0) goto L6f
            java.lang.String r4 = r4.getF336843b()     // Catch: java.lang.Exception -> L6d
            goto L70
        L6d:
            r8 = move-exception
            goto L97
        L6f:
            r4 = r3
        L70:
            if (r4 != 0) goto L74
            java.lang.String r4 = ""
        L74:
            r6.<init>(r5, r4)     // Catch: java.lang.Exception -> L6d
            r2.add(r6)     // Catch: java.lang.Exception -> L6d
            goto L48
        L7b:
            r3 = r2
        L7c:
            r8 = 0
            if (r3 == 0) goto L8a
            com.avito.beduin.v2.interaction.navigation.flow.r[] r9 = new com.avito.beduin.v2.interaction.navigation.flow.r[r8]
            java.lang.Object[] r9 = r3.toArray(r9)
            com.avito.beduin.v2.interaction.navigation.flow.r[] r9 = (com.avito.beduin.v2.interaction.navigation.flow.r[]) r9
            if (r9 == 0) goto L8a
            goto L8c
        L8a:
            com.avito.beduin.v2.interaction.navigation.flow.r[] r9 = new com.avito.beduin.v2.interaction.navigation.flow.r[r8]
        L8c:
            com.avito.beduin.v2.interaction.navigation.flow.s r8 = new com.avito.beduin.v2.interaction.navigation.flow.s
            r8.<init>(r9)
            com.avito.beduin.v2.interaction.navigation.flow.f r9 = new com.avito.beduin.v2.interaction.navigation.flow.f
            r9.<init>(r0, r8)
            return r9
        L97:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r9 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r9.<init>(r1, r8)
            throw r9
        L9d:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r9 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r9.<init>(r0, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.navigation.flow.g.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
    }
}
