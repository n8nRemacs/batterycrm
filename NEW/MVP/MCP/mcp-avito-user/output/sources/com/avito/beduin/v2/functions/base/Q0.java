package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SumOfFloatFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/Q0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Q0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Q0 f336999a = new Q0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337000b = "SumOfFloat";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.x xVarK = mVar.k(zVar, "selector");
        List<com.avito.beduin.v2.engine.field.d> list = mVar.d(zVar, "items").f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.d) it.next()).c(zVar));
        }
        Double dR2 = mVar.r(zVar, "default");
        double dDoubleValue = dR2 != null ? dR2.doubleValue() : 0.0d;
        C36279c c36279c = new C36279c(xVarK, "it");
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        double dDoubleValue2 = 0.0d;
        while (it2.hasNext()) {
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) it2.next();
            C36279c.b bVar = c36279c.new b();
            if (c36279c.f337049c.contains("it")) {
                bVar.f337052a.put("it", dVar);
            }
            C36279c.a aVarA = bVar.a();
            int i13 = i12 + 1;
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336616h()) {
                com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bE.g();
                try {
                    com.avito.beduin.v2.engine.field.entity.v vVarQ = xVarK.o(zVarG, aVarA.a()).q(zVarG);
                    Double dValueOf = vVarQ != null ? Double.valueOf(vVarQ.getF336838b()) : null;
                    interfaceC36252bE.l(Double.valueOf(dValueOf != null ? dValueOf.doubleValue() : 0.0d));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            dDoubleValue2 += ((Number) interfaceC36252bE.getF336702c()).doubleValue();
            i12 = i13;
        }
        return C36273j.b(zVar, dDoubleValue + dDoubleValue2);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337000b;
    }
}
