package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AndFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/a;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36275a extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36275a f337039a = new C36275a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337040b = "And";

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
                        interfaceC36252bE.l(C36277b.a(hVar));
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bE.getF336702c();
            } else {
                objA = C36277b.a(hVar);
            }
            hVar = (com.avito.beduin.v2.engine.field.h) objA;
        }
        return super.a(zVar, jVar, str, hVar, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // cU0.AbstractC27103a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z r7, @Y61.k com.avito.beduin.v2.engine.field.j r8, @Y61.k com.avito.beduin.v2.engine.field.m r9) throws com.avito.beduin.v2.engine.field.exception.BeduinPropertyException {
        /*
            r6 = this;
            java.lang.String r8 = "value1"
            com.avito.beduin.v2.engine.field.entity.x r8 = r9.y(r7, r8)
            java.lang.String r0 = "value2"
            com.avito.beduin.v2.engine.field.entity.x r9 = r9.y(r7, r0)
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L81
            boolean r3 = r7.F()
            java.lang.String r4 = "@value1"
            if (r3 == 0) goto L59
            com.avito.beduin.v2.engine.k r3 = r7.getF336696a()
            com.avito.beduin.v2.engine.core.b r3 = r7.E(r3, r4, r0)
            r7.w(r3)
            boolean r4 = r3.getF336616h()
            if (r4 != 0) goto L54
            com.avito.beduin.v2.engine.core.z r4 = r3.g()
            com.avito.beduin.v2.engine.field.m$a r5 = com.avito.beduin.v2.engine.field.m.f336868b     // Catch: java.lang.Throwable -> L49
            r5.getClass()     // Catch: java.lang.Throwable -> L49
            com.avito.beduin.v2.engine.field.m r5 = com.avito.beduin.v2.engine.field.m.f336869c     // Catch: java.lang.Throwable -> L49
            com.avito.beduin.v2.engine.field.d r8 = r8.o(r4, r5)     // Catch: java.lang.Throwable -> L49
            com.avito.beduin.v2.engine.field.entity.v r8 = r8.q(r4)     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L4b
            boolean r8 = r8.getF336837b()     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r7 = move-exception
            goto L50
        L4b:
            r8 = r2
        L4c:
            r3.l(r8)
            goto L54
        L50:
            r3.l(r2)
            throw r7
        L54:
            java.lang.Object r8 = r3.getF336702c()
            goto L78
        L59:
            com.avito.beduin.v2.engine.core.z r3 = r7.x(r4, r3)
            com.avito.beduin.v2.engine.field.m$a r4 = com.avito.beduin.v2.engine.field.m.f336868b
            r4.getClass()
            com.avito.beduin.v2.engine.field.m r4 = com.avito.beduin.v2.engine.field.m.f336869c
            com.avito.beduin.v2.engine.field.d r8 = r8.o(r3, r4)
            com.avito.beduin.v2.engine.field.entity.v r8 = r8.q(r3)
            if (r8 == 0) goto L77
            boolean r8 = r8.getF336837b()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L78
        L77:
            r8 = r2
        L78:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L81
            boolean r8 = r8.booleanValue()
            goto L82
        L81:
            r8 = r1
        L82:
            if (r8 != 0) goto L89
            com.avito.beduin.v2.engine.field.entity.v r7 = com.avito.beduin.v2.engine.C36273j.f(r7, r1)
            return r7
        L89:
            if (r9 == 0) goto Lf7
            boolean r8 = r7.F()
            java.lang.String r3 = "@value2"
            if (r8 == 0) goto Ld1
            com.avito.beduin.v2.engine.k r8 = r7.getF336696a()
            com.avito.beduin.v2.engine.core.b r8 = r7.E(r8, r3, r0)
            r7.w(r8)
            boolean r0 = r8.getF336616h()
            if (r0 != 0) goto Lcc
            com.avito.beduin.v2.engine.core.z r0 = r8.g()
            com.avito.beduin.v2.engine.field.m$a r3 = com.avito.beduin.v2.engine.field.m.f336868b     // Catch: java.lang.Throwable -> Lc2
            r3.getClass()     // Catch: java.lang.Throwable -> Lc2
            com.avito.beduin.v2.engine.field.m r3 = com.avito.beduin.v2.engine.field.m.f336869c     // Catch: java.lang.Throwable -> Lc2
            com.avito.beduin.v2.engine.field.d r9 = r9.o(r0, r3)     // Catch: java.lang.Throwable -> Lc2
            com.avito.beduin.v2.engine.field.entity.v r9 = r9.q(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r9 == 0) goto Lc4
            boolean r9 = r9.getF336837b()     // Catch: java.lang.Throwable -> Lc2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lc2
            goto Lc4
        Lc2:
            r7 = move-exception
            goto Lc8
        Lc4:
            r8.l(r2)
            goto Lcc
        Lc8:
            r8.l(r2)
            throw r7
        Lcc:
            java.lang.Object r8 = r8.getF336702c()
            goto Lef
        Ld1:
            com.avito.beduin.v2.engine.core.z r8 = r7.x(r3, r8)
            com.avito.beduin.v2.engine.field.m$a r0 = com.avito.beduin.v2.engine.field.m.f336868b
            r0.getClass()
            com.avito.beduin.v2.engine.field.m r0 = com.avito.beduin.v2.engine.field.m.f336869c
            com.avito.beduin.v2.engine.field.d r9 = r9.o(r8, r0)
            com.avito.beduin.v2.engine.field.entity.v r8 = r9.q(r8)
            if (r8 == 0) goto Lee
            boolean r8 = r8.getF336837b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
        Lee:
            r8 = r2
        Lef:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto Lf7
            boolean r1 = r8.booleanValue()
        Lf7:
            com.avito.beduin.v2.engine.field.entity.v r7 = com.avito.beduin.v2.engine.C36273j.f(r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.functions.base.C36275a.c(com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.field.j, com.avito.beduin.v2.engine.field.m):com.avito.beduin.v2.engine.field.d");
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337040b;
    }
}
