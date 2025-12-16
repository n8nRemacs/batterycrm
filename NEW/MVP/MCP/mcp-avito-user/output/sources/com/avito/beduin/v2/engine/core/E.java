package com.avito.beduin.v2.engine.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Scope.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E {
    @Y61.k
    public static final com.avito.beduin.v2.engine.field.j a(@Y61.k z zVar, @Y61.l String str) {
        return str == null ? zVar.A() : zVar.r(str);
    }

    @Y61.k
    public static final InterfaceC36254d b(@Y61.k z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k com.avito.beduin.v2.engine.component.y yVar) {
        Object objA;
        z j12 = new J(zVar, "@metaCalculationValue");
        boolean z12 = zVar.a().f336483j;
        List listU = C42745f0.U(mVar, yVar);
        com.avito.beduin.v2.engine.field.entity.d dVar = yVar.f336588b;
        com.avito.beduin.v2.engine.field.h hVar = yVar.f336587a;
        if (z12) {
            InterfaceC36252b interfaceC36252bE = j12.E(zVar.getF336696a(), "@componentData", listU);
            j12.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                z zVarG = interfaceC36252bE.g();
                try {
                    com.avito.beduin.v2.engine.field.t.f336888a.getClass();
                    String str = com.avito.beduin.v2.engine.field.t.f336890c;
                    com.avito.beduin.v2.engine.field.b bVar = (com.avito.beduin.v2.engine.field.b) com.avito.beduin.v2.engine.z.a(zVarG, mVar, hVar, dVar, str);
                    if (bVar == null) {
                        throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
                    }
                    interfaceC36252bE.l(bVar);
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            objA = interfaceC36252bE.getF336702c();
        } else {
            z zVarX = j12.x("@componentData", z12);
            com.avito.beduin.v2.engine.field.t.f336888a.getClass();
            String str2 = com.avito.beduin.v2.engine.field.t.f336890c;
            objA = (com.avito.beduin.v2.engine.field.b) com.avito.beduin.v2.engine.z.a(zVarX, mVar, hVar, dVar, str2);
            if (objA == null) {
                throw new IllegalArgumentException(AK.c.k("Property ", str2, " is mandatory").toString());
            }
        }
        com.avito.beduin.v2.engine.field.m.f336868b.getClass();
        InterfaceC36254d interfaceC36254dO = j12.n(zVar.getF336696a(), "@calculationValue").o((com.avito.beduin.v2.engine.field.b) objA, com.avito.beduin.v2.engine.field.m.f336869c, null);
        interfaceC36254dO.k(j12);
        return interfaceC36254dO;
    }
}
