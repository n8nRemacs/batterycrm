package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: MergeStructsFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/e0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36284e0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36284e0 f337067a = new C36284e0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337068b = "MergeStructs";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "patch");
        if (aX2 == null) {
            aX2 = new com.avito.beduin.v2.engine.field.entity.A(null, null, 3, null);
        }
        com.avito.beduin.v2.engine.field.entity.A aX3 = mVar.x(zVar, "base");
        return aX3 == null ? aX2 : new com.avito.beduin.v2.engine.field.entity.A(new com.avito.beduin.v2.engine.field.m(kotlin.collections.P0.k(aX3.f336778b.f336870a, aX2.f336778b.f336870a)), null, 2, null);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337068b;
    }
}
