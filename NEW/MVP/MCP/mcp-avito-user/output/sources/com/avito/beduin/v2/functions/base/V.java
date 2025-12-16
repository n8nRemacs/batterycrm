package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: InvokeFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/V;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class V extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final V f337017a = new V();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337018b = "Invoke";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        Object objO;
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "func");
        if (xVarV == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "args");
        if (aX2 == null) {
            aX2 = new com.avito.beduin.v2.engine.field.entity.A(null, null, 3, null);
        }
        boolean zF2 = zVar.F();
        List listU = C42745f0.U(xVarV, aX2);
        com.avito.beduin.v2.engine.field.m mVar2 = aX2.f336778b;
        if (zF2) {
            InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@result", listU);
            if (!interfaceC36252bK.getF336616h()) {
                try {
                    interfaceC36252bK.l(xVarV.o(interfaceC36252bK.g(), com.avito.beduin.v2.engine.field.entity.n.b(mVar2.f336870a)));
                } catch (Throwable th2) {
                    interfaceC36252bK.l(null);
                    throw th2;
                }
            }
            objO = interfaceC36252bK.getF336702c();
        } else {
            objO = xVarV.o(zVar, com.avito.beduin.v2.engine.field.entity.n.b(mVar2.f336870a));
        }
        return (com.avito.beduin.v2.engine.field.d) objO;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337018b;
    }
}
