package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import kotlin.Metadata;

/* compiled from: CreateInteractionGroupFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/G;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G f336957a = new G();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336958b = "CreateInteractionGroup";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("groupId", C36273j.e(zVar, com.avito.beduin.v2.engine.utils.f.a()));
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("interactionScope");
        if (dVarC != null) {
        }
        com.avito.beduin.v2.engine.field.d dVarC2 = mVar.c("strategy");
        if (dVarC2 != null) {
        }
        com.avito.beduin.v2.engine.field.d dVarC3 = mVar.c("params");
        if (dVarC3 != null) {
            dVar.put("params", dVarC3);
        }
        return new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m(dVar.b()), null, 2, null);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF415156b() {
        return f336958b;
    }
}
