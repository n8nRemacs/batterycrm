package com.avito.beduin.v2.functions.base;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.field.entity.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MetaFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/f0;", "LcU0/b;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36286f0 implements InterfaceC27104b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36286f0 f337071a = new C36286f0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337072b = "Meta";

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.h hVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        Object objV;
        Object iVar;
        Object objE;
        InterfaceC36252b interfaceC36252bE;
        Object iVar2;
        Object objE2;
        if (zVar.F()) {
            interfaceC36252bE = zVar.E(zVar.getF336594a(), "@functionType", str);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.c()) {
                try {
                    interfaceC36252bE.l(interfaceC36252bE.g().v(str));
                } finally {
                    interfaceC36252bE.l(null);
                }
            }
            objV = interfaceC36252bE.a();
        } else {
            objV = zVar.v(str);
        }
        C27107e c27107e = (C27107e) objV;
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(c27107e, hVar, com.avito.beduin.v2.engine.field.a.a(map));
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@result", listU);
            if (!interfaceC36252bK.c()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
                try {
                    try {
                        boolean zF3 = zVarG.F();
                        List listU2 = C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(map));
                        if (zF3) {
                            interfaceC36252bE = zVarG.E(zVarG.getF336594a(), "@externalParams", listU2);
                            zVarG.w(interfaceC36252bE);
                            if (!interfaceC36252bE.c()) {
                                com.avito.beduin.v2.engine.core.z zVarG2 = interfaceC36252bE.g();
                                try {
                                    interfaceC36252bE.l((zVarG2.a().f336480g || zVarG2.a().f336488o) ? hVar.e(zVarG2, map, jVar.c()) : hVar.g(zVarG2, map, jVar.c()));
                                } finally {
                                }
                            }
                            objE2 = interfaceC36252bE.a();
                        } else {
                            com.avito.beduin.v2.engine.core.z zVarX = zVarG.x("@externalParams", zF3);
                            objE2 = (zVarX.a().f336480g || zVarX.a().f336488o) ? hVar.e(zVarX, map, jVar.c()) : hVar.g(zVarX, map, jVar.c());
                        }
                        iVar2 = com.avito.beduin.v2.engine.z.a(zVarG, (com.avito.beduin.v2.engine.field.m) objE2, c27107e.f57906a, c27107e.f57907b, "result");
                        if (iVar2 instanceof com.avito.beduin.v2.engine.field.entity.i) {
                            i.a aVar = com.avito.beduin.v2.engine.field.entity.i.f336803c;
                            EngineBeduinException.BeduinMetaFunctionException beduinMetaFunctionException = new EngineBeduinException.BeduinMetaFunctionException(str, ((com.avito.beduin.v2.engine.field.entity.i) iVar2).f336804b);
                            aVar.getClass();
                            iVar2 = new com.avito.beduin.v2.engine.field.entity.i(beduinMetaFunctionException);
                        }
                    } catch (Exception e12) {
                        i.a aVar2 = com.avito.beduin.v2.engine.field.entity.i.f336803c;
                        EngineBeduinException.BeduinMetaFunctionException beduinMetaFunctionException2 = new EngineBeduinException.BeduinMetaFunctionException(str, e12);
                        aVar2.getClass();
                        iVar2 = new com.avito.beduin.v2.engine.field.entity.i(beduinMetaFunctionException2);
                    }
                    interfaceC36252bK.l(iVar2);
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            iVar = interfaceC36252bK.a();
        } else {
            try {
                boolean zF4 = zVar.F();
                List listU3 = C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(map));
                if (zF4) {
                    interfaceC36252bE = zVar.E(zVar.getF336594a(), "@externalParams", listU3);
                    zVar.w(interfaceC36252bE);
                    if (!interfaceC36252bE.c()) {
                        com.avito.beduin.v2.engine.core.z zVarG3 = interfaceC36252bE.g();
                        try {
                            interfaceC36252bE.l((zVarG3.a().f336480g || zVarG3.a().f336488o) ? hVar.e(zVarG3, map, jVar.c()) : hVar.g(zVarG3, map, jVar.c()));
                        } finally {
                        }
                    }
                    objE = interfaceC36252bE.a();
                } else {
                    com.avito.beduin.v2.engine.core.z zVarX2 = zVar.x("@externalParams", zF4);
                    objE = (zVarX2.a().f336480g || zVarX2.a().f336488o) ? hVar.e(zVarX2, map, jVar.c()) : hVar.g(zVarX2, map, jVar.c());
                }
                iVar = com.avito.beduin.v2.engine.z.a(zVar, (com.avito.beduin.v2.engine.field.m) objE, c27107e.f57906a, c27107e.f57907b, "result");
                if (iVar instanceof com.avito.beduin.v2.engine.field.entity.i) {
                    i.a aVar3 = com.avito.beduin.v2.engine.field.entity.i.f336803c;
                    EngineBeduinException.BeduinMetaFunctionException beduinMetaFunctionException3 = new EngineBeduinException.BeduinMetaFunctionException(str, ((com.avito.beduin.v2.engine.field.entity.i) iVar).f336804b);
                    aVar3.getClass();
                    iVar = new com.avito.beduin.v2.engine.field.entity.i(beduinMetaFunctionException3);
                }
            } catch (Exception e13) {
                i.a aVar4 = com.avito.beduin.v2.engine.field.entity.i.f336803c;
                EngineBeduinException.BeduinMetaFunctionException beduinMetaFunctionException4 = new EngineBeduinException.BeduinMetaFunctionException(str, e13);
                aVar4.getClass();
                iVar = new com.avito.beduin.v2.engine.field.entity.i(beduinMetaFunctionException4);
            }
        }
        return (com.avito.beduin.v2.engine.field.d) iVar;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337072b;
    }
}
