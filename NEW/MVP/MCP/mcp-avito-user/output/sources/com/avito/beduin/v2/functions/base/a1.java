package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ToStructureFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/a1;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a1 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a1 f337041a = new a1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337042b = "ToStructure";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        kotlin.Q q12;
        C36268a c36268aN = mVar.n(zVar, "entities");
        if (c36268aN == null) {
            return new com.avito.beduin.v2.engine.field.entity.A(null, null, 3, null);
        }
        List<com.avito.beduin.v2.engine.field.d> list = c36268aN.f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) obj;
            String strP = androidx.appcompat.app.r.p("entities[", i12, ']');
            try {
                com.avito.beduin.v2.engine.field.entity.A a12 = dVar.a(zVar);
                if (a12 == null) {
                    a12 = new com.avito.beduin.v2.engine.field.entity.A(null, null, 3, null);
                }
                String strC = com.avito.beduin.v2.engine.utils.g.c(a12, zVar, "key");
                if (strC == null) {
                    q12 = null;
                } else {
                    com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c("value");
                    if (dVarC == null) {
                        dVarC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
                    }
                    q12 = new kotlin.Q(strC, dVarC);
                }
                arrayList.add(q12);
                i12 = i13;
            } catch (Exception e12) {
                throw new BeduinPropertyException(strP, e12);
            }
        }
        return new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) kotlin.collections.P0.p(C42745f0.C(arrayList))), null, 2, null);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337042b;
    }
}
