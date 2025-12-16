package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: UnwrapFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/c1;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c1 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c1 f337056a = new c1();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337057b = "Unwrap";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.d dVarP = mVar.p(zVar, "value");
        if (dVarP instanceof com.avito.beduin.v2.engine.field.entity.p) {
            dVarP = ((com.avito.beduin.v2.engine.field.entity.p) dVarP).f336818b.k(zVar);
        }
        return dVarP == null ? com.avito.beduin.v2.engine.field.entity.f.f336800b : dVarP;
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337057b;
    }
}
