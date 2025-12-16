package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: CheckEqualsFunction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/t;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36312t extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36312t f337124a = new C36312t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337125b = "CheckEquals";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        com.avito.beduin.v2.engine.field.d dVarQ = mVar.q("value1");
        if (dVarQ == null) {
            dVarQ = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.d dVarQ2 = mVar.q("value2");
        if (dVarQ2 == null) {
            dVarQ2 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        return C36273j.f(zVar, dVarQ.b(zVar, dVarQ2));
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337125b;
    }
}
