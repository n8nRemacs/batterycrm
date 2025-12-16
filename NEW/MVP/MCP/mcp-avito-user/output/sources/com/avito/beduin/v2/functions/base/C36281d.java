package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.functions.base.C36279c;
import com.avito.beduin.v2.functions.base.C36279c.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ArrayDistinctByFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/d;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36281d extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36281d f337058a = new C36281d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337059b = "ArrayDistinctBy";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.x xVarV = mVar.v(zVar, "selector");
        if (xVarV == null) {
            return new C36268a(C42784z0.f406748b);
        }
        C36268a c36268aN = mVar.n(zVar, "array");
        if (c36268aN == null) {
            return new C36268a(C42784z0.f406748b);
        }
        C36279c c36279c = new C36279c(xVarV, "it");
        List<com.avito.beduin.v2.engine.field.d> list = c36268aN.f336782b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
            C36279c.b bVar = c36279c.new b();
            if (c36279c.f337049c.contains("it")) {
                bVar.f337052a.put("it", dVar);
            }
            C36279c.a aVarA = bVar.a();
            int i13 = i12 + 1;
            InterfaceC36252b interfaceC36252bE = zVar.E(zVar.getF336696a(), String.valueOf(i12), aVarA);
            zVar.w(interfaceC36252bE);
            if (!interfaceC36252bE.getF336701b()) {
                try {
                    interfaceC36252bE.l(xVarV.o(interfaceC36252bE.g(), aVarA.a()));
                } catch (Throwable th2) {
                    interfaceC36252bE.l(null);
                    throw th2;
                }
            }
            if (hashSet.add((com.avito.beduin.v2.engine.field.d) interfaceC36252bE.getF336702c())) {
                arrayList.add(obj);
            }
            i12 = i13;
        }
        return new C36268a(arrayList);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414537c() {
        return f337059b;
    }
}
