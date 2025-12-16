package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ArraySetAtFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/p;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36305p extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36305p f337107a = new C36305p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337108b = "ArraySetAt";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        C36268a c36268aL;
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("newItem");
        if (dVarC == null) {
            dVarC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.d dVarC2 = mVar.c("array");
        if (dVarC2 == null || (c36268aL = dVarC2.l(zVar)) == null) {
            return com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.d dVarC3 = mVar.c("position");
        if (dVarC3 == null) {
            return c36268aL;
        }
        com.avito.beduin.v2.engine.field.entity.v vVarQ = dVarC3.q(zVar);
        Integer numValueOf = vVarQ != null ? Integer.valueOf(vVarQ.j()) : null;
        if (numValueOf == null) {
            return c36268aL;
        }
        int iIntValue = numValueOf.intValue();
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.addAll(c36268aL.f336782b);
        bVarT.set(iIntValue, dVarC);
        return new C36268a(C42745f0.p(bVarT));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337108b;
    }
}
