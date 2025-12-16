package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: StructureGet.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/I0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class I0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final I0 f336967a = new I0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336968b = "StructureGet";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.v vVarQ;
        com.avito.beduin.v2.engine.field.d dVarM = mVar.m(zVar, "structure");
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("key");
            String f336843b = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                f336843b = vVarQ.getF336843b();
            }
            if (f336843b == null) {
                throw new IllegalArgumentException("Property key is mandatory");
            }
            List listE0 = C43066x.e0(f336843b, new char[]{'.'});
            kotlin.ranges.k it = C42745f0.I(listE0).iterator();
            while (it.f406910d) {
                int iA2 = it.a();
                com.avito.beduin.v2.engine.field.entity.A a12 = dVarM.a(zVar);
                if (a12 != null) {
                    String str = (String) listE0.get(iA2);
                    try {
                        dVarM = a12.f336778b.c(str);
                        if (dVarM != null) {
                        }
                    } catch (Exception e12) {
                        throw new BeduinPropertyException(str, e12);
                    }
                }
                dVarM = com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            return dVarM;
        } catch (Exception e13) {
            throw new BeduinPropertyException("key", e13);
        }
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336968b;
    }
}
