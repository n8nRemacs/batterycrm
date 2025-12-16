package com.avito.beduin.v2.engine;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MetaValue.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z {
    @Y61.k
    public static final <T extends com.avito.beduin.v2.engine.field.d> T a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.l com.avito.beduin.v2.engine.field.m mVar, @Y61.l com.avito.beduin.v2.engine.field.h hVar, @Y61.k com.avito.beduin.v2.engine.field.f<? extends T> fVar, @Y61.k String str) {
        Map mapF;
        Object objA;
        Object objA2;
        InterfaceC36252b interfaceC36252bK;
        Map mapF2;
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(hVar, mVar);
        if (zF2) {
            interfaceC36252bK = C31685o.k(zVar, "@params", listU);
            if (!interfaceC36252bK.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    if (hVar != null) {
                        com.avito.beduin.v2.engine.field.h hVarD = hVar.d(zVarG, mVar);
                        com.avito.beduin.v2.engine.field.a.f336767b.getClass();
                        mapF2 = hVarD.f(zVarG, com.avito.beduin.v2.engine.field.a.f336768c, "params", true);
                    } else {
                        com.avito.beduin.v2.engine.field.a.f336767b.getClass();
                        mapF2 = com.avito.beduin.v2.engine.field.a.f336768c;
                    }
                    interfaceC36252bK.l(com.avito.beduin.v2.engine.field.a.a(mapF2));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objA = interfaceC36252bK.getF336702c();
        } else {
            com.avito.beduin.v2.engine.core.z zVarX = zVar.x("@params", zF2);
            if (hVar != null) {
                com.avito.beduin.v2.engine.field.h hVarD2 = hVar.d(zVarX, mVar);
                com.avito.beduin.v2.engine.field.a.f336767b.getClass();
                mapF = hVarD2.f(zVarX, com.avito.beduin.v2.engine.field.a.f336768c, "params", true);
            } else {
                com.avito.beduin.v2.engine.field.a.f336767b.getClass();
                mapF = com.avito.beduin.v2.engine.field.a.f336768c;
            }
            objA = com.avito.beduin.v2.engine.field.a.a(mapF);
        }
        Map<com.avito.beduin.v2.engine.field.q, com.avito.beduin.v2.engine.core.K<com.avito.beduin.v2.engine.field.d>> map = ((com.avito.beduin.v2.engine.field.a) objA).f336769a;
        boolean f336874d = fVar.getF336794b().getF336874d();
        if (!f336874d) {
            fVar = fVar.l(fVar.getF336794b().b(str));
        }
        boolean zF3 = zVar.F();
        List listU2 = C42745f0.U(fVar, com.avito.beduin.v2.engine.field.a.a(map), Boolean.valueOf(f336874d));
        if (zF3) {
            interfaceC36252bK = C31685o.k(zVar, "@result", listU2);
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    Object objA3 = fVar.a(interfaceC36252bK.g(), map);
                    if (!f336874d && (objA3 instanceof com.avito.beduin.v2.engine.field.entity.A)) {
                        objA3 = com.avito.beduin.v2.engine.field.entity.A.t((com.avito.beduin.v2.engine.field.entity.A) objA3, null, null, 1);
                    }
                    interfaceC36252bK.l(objA3);
                } finally {
                    interfaceC36252bK.l(null);
                }
            }
            objA2 = interfaceC36252bK.getF336702c();
        } else {
            objA2 = fVar.a(zVar.x("@result", zF3), map);
            if (!f336874d && (objA2 instanceof com.avito.beduin.v2.engine.field.entity.A)) {
                objA2 = com.avito.beduin.v2.engine.field.entity.A.t((com.avito.beduin.v2.engine.field.entity.A) objA2, null, null, 1);
            }
        }
        return (T) objA2;
    }
}
