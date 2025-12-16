package cU0;

import Y61.k;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.field.entity.i;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.engine.field.h;
import com.avito.beduin.v2.engine.field.j;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.engine.field.q;
import java.util.List;
import java.util.Map;
import kotlin.G;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Function.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcU0/a;", "LcU0/b;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cU0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27103a implements InterfaceC27104b {
    @Override // cU0.InterfaceC27104b
    @k
    public com.avito.beduin.v2.engine.field.d a(@k z zVar, @k j jVar, @k String str, @k h hVar, @k Map<q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        EngineBeduinException.BeduinFunctionException beduinFunctionException;
        Object objE;
        try {
            boolean zF2 = zVar.F();
            List listU = C42745f0.U(hVar, com.avito.beduin.v2.engine.field.a.a(map));
            if (zF2) {
                InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336594a(), "@params", listU);
                zVar.w(interfaceC36252bE);
                if (!interfaceC36252bE.getF336701b()) {
                    try {
                        interfaceC36252bE.l(hVar.e(interfaceC36252bE.g(), map, jVar.c()));
                    } catch (Throwable th2) {
                        interfaceC36252bE.l(null);
                        throw th2;
                    }
                }
                objE = interfaceC36252bE.getF336702c();
            } else {
                objE = hVar.e(zVar.x("@params", zF2), map, jVar.c());
            }
            return c(zVar, jVar, (m) objE);
        } catch (Exception e12) {
            i.f336803c.getClass();
            EngineBeduinException.BeduinFunctionException.f336723g.getClass();
            if (e12 instanceof BeduinPropertyException) {
                BeduinPropertyException beduinPropertyException = (BeduinPropertyException) e12;
                beduinFunctionException = new EngineBeduinException.BeduinFunctionException(str, beduinPropertyException.f336864c, beduinPropertyException.f336863b, null);
            } else {
                beduinFunctionException = new EngineBeduinException.BeduinFunctionException(str, e12, null, 4, null);
            }
            return new i(beduinFunctionException);
        }
    }

    @k
    public com.avito.beduin.v2.engine.field.d b(@k z zVar, @k j jVar, @k m mVar) {
        throw new G(null, 1, null);
    }

    @k
    public com.avito.beduin.v2.engine.field.d c(@k z zVar, @k j jVar, @k m mVar) {
        return b(zVar, jVar, mVar);
    }

    @k
    public final String toString() {
        return "Function(type=" + getType() + ')';
    }
}
