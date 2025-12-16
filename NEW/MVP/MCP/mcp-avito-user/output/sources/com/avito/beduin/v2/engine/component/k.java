package com.avito.beduin.v2.engine.component;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: ComponentStateFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {
    public static com.avito.beduin.v2.engine.field.entity.c a(com.avito.beduin.v2.engine.core.z zVar, String str, Throwable th2, String str2, String str3, int i12) {
        EngineBeduinException.ComponentException createComponentException;
        EngineBeduinException.ComponentException componentPropertyException;
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        String str4 = (i12 & 16) != 0 ? null : str3;
        if (th2 instanceof EngineBeduinException.CreateComponentException) {
            componentPropertyException = (EngineBeduinException.ComponentException) th2;
        } else {
            boolean z12 = th2 instanceof BeduinPropertyException;
            if (z12) {
                BeduinPropertyException beduinPropertyException = (BeduinPropertyException) th2;
                createComponentException = new EngineBeduinException.ComponentPropertyException(str, beduinPropertyException.f336863b, str4, beduinPropertyException.f336864c);
            } else if (str2 != null) {
                componentPropertyException = new EngineBeduinException.ComponentPropertyException(str, str2, str4, th2);
            } else {
                EngineBeduinException.CreateComponentException.f336726i.getClass();
                if (z12) {
                    BeduinPropertyException beduinPropertyException2 = (BeduinPropertyException) th2;
                    createComponentException = new EngineBeduinException.CreateComponentException(str, beduinPropertyException2.f336863b, str4, beduinPropertyException2.f336864c, null);
                } else {
                    createComponentException = new EngineBeduinException.CreateComponentException(str, null, str4, th2, null);
                }
            }
            componentPropertyException = createComponentException;
        }
        InterfaceC36274k f336594a = zVar.getF336696a();
        com.avito.beduin.v2.engine.utils.e.b(componentPropertyException, "ComponentStateFactory", null);
        f336594a.y(componentPropertyException);
        com.avito.beduin.v2.engine.field.e eVar = com.avito.beduin.v2.engine.field.e.f336775a;
        com.avito.beduin.v2.engine.field.h hVarB = com.avito.beduin.v2.engine.utils.e.d(zVar, componentPropertyException.f336724g, componentPropertyException.f336725h, componentPropertyException).B();
        com.avito.beduin.v2.engine.field.m.f336868b.getClass();
        com.avito.beduin.v2.engine.field.m mVar = com.avito.beduin.v2.engine.field.m.f336869c;
        com.avito.beduin.v2.engine.field.a.f336767b.getClass();
        return new com.avito.beduin.v2.engine.field.entity.c(eVar, "StateException", mVar, hVarB, com.avito.beduin.v2.engine.field.a.f336768c, null);
    }
}
