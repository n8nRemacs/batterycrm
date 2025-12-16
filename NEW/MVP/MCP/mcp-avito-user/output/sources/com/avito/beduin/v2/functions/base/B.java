package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ConditionFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/B;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final B f336931a = new B();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336932b = "Condition";

    @Override // cU0.AbstractC27103a, cU0.InterfaceC27104b
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objA;
        if (!zVar.a().f336480g) {
            if (zVar.F()) {
                InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), "@wrapToRaw", hVar);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336616h()) {
                    interfaceC36252bE.g();
                    try {
                        interfaceC36252bE.l(C.a(hVar));
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bE.getF336702c();
            } else {
                objA = C.a(hVar);
            }
            hVar = (com.avito.beduin.v2.engine.field.h) objA;
        }
        return super.a(zVar, jVar, str, hVar, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:13:0x0041, B:20:0x0060, B:18:0x0053), top: B:37:0x003d }] */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z r6, @Y61.k com.avito.beduin.v2.engine.field.j r7, @Y61.k com.avito.beduin.v2.engine.field.m r8) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r5 = this;
            java.lang.String r7 = "value"
            java.lang.Boolean r7 = r8.o(r6, r7)
            if (r7 == 0) goto Ld
            boolean r7 = r7.booleanValue()
            goto Le
        Ld:
            r7 = 0
        Le:
            java.lang.String r0 = "trueResult"
            com.avito.beduin.v2.engine.field.entity.x r0 = r8.y(r6, r0)
            java.lang.String r1 = "falseResult"
            com.avito.beduin.v2.engine.field.entity.x r8 = r8.y(r6, r1)
            boolean r1 = r6.F()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0, r8}
            java.util.List r2 = kotlin.collections.C42745f0.U(r2)
            r3 = 0
            java.lang.String r4 = "@result"
            if (r1 == 0) goto L6f
            com.avito.beduin.v2.engine.core.b r6 = com.avito.android.messenger.blacklist.mvi.C31685o.k(r6, r4, r2)
            boolean r1 = r6.getF336616h()
            if (r1 != 0) goto L6a
            com.avito.beduin.v2.engine.core.z r1 = r6.g()
            if (r7 == 0) goto L51
            if (r0 == 0) goto L4f
            com.avito.beduin.v2.engine.field.m$a r7 = com.avito.beduin.v2.engine.field.m.f336868b     // Catch: java.lang.Throwable -> L4d
            r7.getClass()     // Catch: java.lang.Throwable -> L4d
            com.avito.beduin.v2.engine.field.m r7 = com.avito.beduin.v2.engine.field.m.f336869c     // Catch: java.lang.Throwable -> L4d
            com.avito.beduin.v2.engine.field.d r7 = r0.o(r1, r7)     // Catch: java.lang.Throwable -> L4d
            goto L5e
        L4d:
            r7 = move-exception
            goto L63
        L4f:
            r7 = r3
            goto L5e
        L51:
            if (r8 == 0) goto L4f
            com.avito.beduin.v2.engine.field.m$a r7 = com.avito.beduin.v2.engine.field.m.f336868b     // Catch: java.lang.Throwable -> L4d
            r7.getClass()     // Catch: java.lang.Throwable -> L4d
            com.avito.beduin.v2.engine.field.m r7 = com.avito.beduin.v2.engine.field.m.f336869c     // Catch: java.lang.Throwable -> L4d
            com.avito.beduin.v2.engine.field.d r7 = r8.o(r1, r7)     // Catch: java.lang.Throwable -> L4d
        L5e:
            if (r7 != 0) goto L67
            com.avito.beduin.v2.engine.field.entity.f r7 = com.avito.beduin.v2.engine.field.entity.f.f336800b     // Catch: java.lang.Throwable -> L4d
            goto L67
        L63:
            r6.l(r3)
            throw r7
        L67:
            r6.l(r7)
        L6a:
            java.lang.Object r6 = r6.getF336702c()
            goto L96
        L6f:
            com.avito.beduin.v2.engine.core.z r6 = r6.x(r4, r1)
            if (r7 == 0) goto L83
            if (r0 == 0) goto L90
            com.avito.beduin.v2.engine.field.m$a r7 = com.avito.beduin.v2.engine.field.m.f336868b
            r7.getClass()
            com.avito.beduin.v2.engine.field.m r7 = com.avito.beduin.v2.engine.field.m.f336869c
            com.avito.beduin.v2.engine.field.d r3 = r0.o(r6, r7)
            goto L90
        L83:
            if (r8 == 0) goto L90
            com.avito.beduin.v2.engine.field.m$a r7 = com.avito.beduin.v2.engine.field.m.f336868b
            r7.getClass()
            com.avito.beduin.v2.engine.field.m r7 = com.avito.beduin.v2.engine.field.m.f336869c
            com.avito.beduin.v2.engine.field.d r3 = r8.o(r6, r7)
        L90:
            if (r3 != 0) goto L95
            com.avito.beduin.v2.engine.field.entity.f r6 = com.avito.beduin.v2.engine.field.entity.f.f336800b
            goto L96
        L95:
            r6 = r3
        L96:
            com.avito.beduin.v2.engine.field.d r6 = (com.avito.beduin.v2.engine.field.d) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.functions.base.B.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336932b;
    }
}
