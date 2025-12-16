package com.avito.beduin.v2.interaction.navigation.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowToastBarInteractionFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/navigation/flow/B;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final B f337497b = new B();

    public B() {
        super("ShowToastBar");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    @Override // dU0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dU0.b b(com.avito.beduin.v2.engine.core.z r10, com.avito.beduin.v2.engine.field.m r11) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r9 = this;
            java.lang.String r0 = "text"
            java.lang.String r1 = r11.w(r10, r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto Lc
            r4 = r2
            goto Ld
        Lc:
            r4 = r1
        Ld:
            java.lang.String r1 = "type"
            com.avito.beduin.v2.engine.field.d r3 = r11.c(r1)     // Catch: java.lang.Exception -> L21
            r5 = 0
            if (r3 == 0) goto L2c
            com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r10)     // Catch: java.lang.Exception -> L21
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L21
            goto L25
        L21:
            r10 = move-exception
            goto L95
        L24:
            r3 = r5
        L25:
            if (r3 == 0) goto L2c
            com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction$Type r1 = com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction.Type.valueOf(r3)     // Catch: java.lang.Exception -> L21
            goto L2d
        L2c:
            r1 = r5
        L2d:
            if (r1 != 0) goto L31
            com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction$Type r1 = com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction.Type.f337508b
        L31:
            java.lang.String r3 = "timeout"
            java.lang.Integer r6 = r11.s(r10, r3)
            java.lang.String r3 = "onDismiss"
            com.avito.beduin.v2.engine.field.entity.l r3 = r11.t(r10, r3)
            if (r3 == 0) goto L46
            com.avito.beduin.v2.interaction.navigation.flow.z r7 = new com.avito.beduin.v2.interaction.navigation.flow.z
            r7.<init>(r10, r3)
            r8 = r7
            goto L47
        L46:
            r8 = r5
        L47:
            java.lang.String r3 = "rightButton"
            com.avito.beduin.v2.engine.field.d r11 = r11.c(r3)     // Catch: java.lang.Exception -> L77
            if (r11 == 0) goto L86
            com.avito.beduin.v2.engine.field.entity.A r11 = r11.a(r10)     // Catch: java.lang.Exception -> L77
            if (r11 == 0) goto L86
            java.lang.String r0 = com.avito.beduin.v2.engine.utils.g.c(r11, r10, r0)     // Catch: java.lang.Exception -> L77
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r2 = r0
        L5d:
            java.lang.String r0 = "onClick"
            com.avito.beduin.v2.engine.field.m r11 = r11.f336778b     // Catch: java.lang.Exception -> L6c
            com.avito.beduin.v2.engine.field.d r11 = r11.c(r0)     // Catch: java.lang.Exception -> L6c
            if (r11 == 0) goto L6e
            com.avito.beduin.v2.engine.field.entity.l r11 = r11.e(r10)     // Catch: java.lang.Exception -> L6c
            goto L6f
        L6c:
            r10 = move-exception
            goto L80
        L6e:
            r11 = r5
        L6f:
            if (r11 == 0) goto L79
            com.avito.beduin.v2.interaction.navigation.flow.A r5 = new com.avito.beduin.v2.interaction.navigation.flow.A     // Catch: java.lang.Exception -> L77
            r5.<init>(r10, r11)     // Catch: java.lang.Exception -> L77
            goto L79
        L77:
            r10 = move-exception
            goto L8f
        L79:
            com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction$a r10 = new com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction$a     // Catch: java.lang.Exception -> L77
            r10.<init>(r2, r5)     // Catch: java.lang.Exception -> L77
            r7 = r10
            goto L87
        L80:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r11 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException     // Catch: java.lang.Exception -> L77
            r11.<init>(r0, r10)     // Catch: java.lang.Exception -> L77
            throw r11     // Catch: java.lang.Exception -> L77
        L86:
            r7 = r5
        L87:
            com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction r10 = new com.avito.beduin.v2.interaction.navigation.flow.ShowToastBarInteraction
            r3 = r10
            r5 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L8f:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r11 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r11.<init>(r3, r10)
            throw r11
        L95:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r11 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r11.<init>(r1, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.navigation.flow.B.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
    }
}
