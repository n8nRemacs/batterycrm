package com.avito.beduin.v2.interaction.scroll_to.flow;

import Y61.k;
import com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollToPositionInteraction.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/scroll_to/flow/b;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends dU0.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f337825b = new b();

    /* compiled from: ScrollToPositionInteraction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ScrollToPositionInteraction.Alignment> f337826a = kotlin.enums.c.a(ScrollToPositionInteraction.Alignment.values());
    }

    public b() {
        super("ScrollToPosition");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // dU0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dU0.b b(com.avito.beduin.v2.engine.core.z r9, com.avito.beduin.v2.engine.field.m r10) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r8 = this;
            java.lang.String r0 = "position"
            java.lang.Integer r0 = r10.s(r9, r0)
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = r0.intValue()
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = "animate"
            java.lang.Boolean r2 = r10.o(r9, r2)
            if (r2 == 0) goto L1b
            boolean r1 = r2.booleanValue()
        L1b:
            java.lang.String r2 = "alignment"
            com.avito.beduin.v2.engine.field.d r3 = r10.c(r2)     // Catch: java.lang.Exception -> L2f
            r4 = 0
            if (r3 == 0) goto L57
            com.avito.beduin.v2.engine.field.entity.v r3 = r3.q(r9)     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.getF336843b()     // Catch: java.lang.Exception -> L2f
            goto L33
        L2f:
            r9 = move-exception
            goto La3
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L57
            kotlin.enums.a<com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction$Alignment> r5 = com.avito.beduin.v2.interaction.scroll_to.flow.b.a.f337826a     // Catch: java.lang.Exception -> L2f
            kotlin.collections.c r5 = (kotlin.collections.AbstractC42738c) r5     // Catch: java.lang.Exception -> L2f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L2f
        L3d:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L2f
            r7 = r6
            com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction$Alignment r7 = (com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction.Alignment) r7     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = r7.f337824b     // Catch: java.lang.Exception -> L2f
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L2f
            if (r7 == 0) goto L3d
            goto L54
        L53:
            r6 = r4
        L54:
            com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction$Alignment r6 = (com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction.Alignment) r6     // Catch: java.lang.Exception -> L2f
            goto L58
        L57:
            r6 = r4
        L58:
            if (r6 != 0) goto L5c
            com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction$Alignment r6 = com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction.Alignment.f337821c
        L5c:
            java.lang.String r2 = "receiver"
            com.avito.beduin.v2.engine.field.d r10 = r10.c(r2)     // Catch: java.lang.Exception -> L69
            if (r10 == 0) goto L6b
            com.avito.beduin.v2.engine.field.entity.A r4 = r10.a(r9)     // Catch: java.lang.Exception -> L69
            goto L6b
        L69:
            r9 = move-exception
            goto L9d
        L6b:
            if (r4 == 0) goto L7d
            com.avito.beduin.v2.engine.field.m r10 = r4.f336778b     // Catch: java.lang.Exception -> L69
            com.avito.beduin.v2.interaction.scroll_to.flow.c r3 = com.avito.beduin.v2.interaction.scroll_to.flow.c.f337827l     // Catch: java.lang.Exception -> L69
            java.lang.Object r9 = com.avito.beduin.v2.engine.component.E.b(r9, r10, r3)     // Catch: java.lang.Exception -> L69
            fU0.a r9 = (fU0.AbstractC40338a) r9     // Catch: java.lang.Exception -> L69
            com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction r10 = new com.avito.beduin.v2.interaction.scroll_to.api.ScrollToPositionInteraction
            r10.<init>(r0, r1, r6, r9)
            return r10
        L7d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r9.<init>()     // Catch: java.lang.Exception -> L69
            java.lang.String r10 = "Property "
            r9.append(r10)     // Catch: java.lang.Exception -> L69
            r9.append(r2)     // Catch: java.lang.Exception -> L69
            java.lang.String r10 = " is mandatory"
            r9.append(r10)     // Catch: java.lang.Exception -> L69
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L69
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L69
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L69
            r10.<init>(r9)     // Catch: java.lang.Exception -> L69
            throw r10     // Catch: java.lang.Exception -> L69
        L9d:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r10.<init>(r2, r9)
            throw r10
        La3:
            com.avito.beduin.v2.engine.field.exception.BeduinPropertyException r10 = new com.avito.beduin.v2.engine.field.exception.BeduinPropertyException
            r10.<init>(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.scroll_to.flow.b.b(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.m):dU0.b");
    }
}
